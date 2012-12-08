package net.ccaper.ImageHorizVertSort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;

import net.ccaper.ImageHorizVertSort.Exceptions.FileSearchException;
import net.ccaper.ImageHorizVertSort.utils.Pair;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ImageHorizVertSort {
  public static Log LOG = LogFactory.getLog(ImageHorizVertSort.class);
  private List<File> filesToSort = new ArrayList<File>();
  private List<File> ignoreDirs = new ArrayList<File>();
  private List<File> ignoreFiles = new ArrayList<File>();
  private final File startDir;
  private final File destDir;
  private static final String PROPS_FILE = "ImageHorizVertSort";
  private static final String START_DIR = "start_directory";
  private static final String DEST_DIR = "destination_directory";
  private static final String IGNORE_DIRS = "ignore_directories";
  private static final String IGNORE_FILES = "ignore_files";
  private static final String HORIZONTAL_DIR = "Horizontal" + File.separator;
  private static final String VERTICAL_DIR = "Vertical" + File.separator;
  private static final String EQUAL_DIR = VERTICAL_DIR;
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
      .getBundle(PROPS_FILE);
  static final String[] IMAGE_TYPES = new String[] { "jpg", "jpeg" };
  private int numFilesToSort = 0;
  private int numFilesToIgnoreFiles = 0;
  private int numFilesToIgnoreDirs = 0;
  private int numFilesNotMatchingKnownImageTypes = 0;
  private int numFilesVertical = 0;
  private int numFilesHorizontal = 0;
  private int numFilesEqual = 0;
  private long startTime = 0;
  private long endTime = 0;

  enum dimensions {
    HEIGHT, WIDTH, EQUAL
  };

  public ImageHorizVertSort() throws FileSearchException {
    this(RESOURCE_BUNDLE.getString(START_DIR), RESOURCE_BUNDLE
        .getString(DEST_DIR), RESOURCE_BUNDLE.getString(IGNORE_DIRS),
        RESOURCE_BUNDLE.getString(IGNORE_FILES));
  }

  public ImageHorizVertSort(String topDir, String destDir,
      String ignoreDirsString, String ignoreFilesString)
      throws FileSearchException {
    this(new File(topDir), new File(destDir),
        parseDirsString(ignoreDirsString), parseFilesString(ignoreFilesString));
  }

  public ImageHorizVertSort(File startDir, File destDir, List<File> ignoreDirs,
      List<File> ignoreFiles) throws FileSearchException {
    startTime = new Date().getTime();
    LOG.info(String.format("Starting %s.", getClass().getName()));
    if (!startDir.exists()) {
      throw new FileSearchException(String.format(
          "The starting directory %s does not exist.",
          startDir.getAbsolutePath()));
    }
    if (!destDir.exists()) {
      throw new FileSearchException(String.format(
          "The destination directory %s does not exist.",
          destDir.getAbsolutePath()));
    }
    this.startDir = startDir;
    this.destDir = destDir;
    this.ignoreDirs = ignoreDirs;
    this.ignoreFiles = ignoreFiles;
  }

  private static List<File> parseDirsString(String dirsString) {
    String[] dirsArray = dirsString.split(";");
    List<File> dirs = new ArrayList<File>();
    for (String dirName : dirsArray) {
      File file = new File(dirName);
      if (file.exists()) {
        if (file.isDirectory()) {
          dirs.add(file);
        } else {
          LOG.info(String
              .format(
                  "While creating ignore directories list, the directory '%s' is not a directory.",
                  dirName));
        }
      } else {
        LOG.info(String
            .format(
                "While creating ignore directories list, the directory '%s' does not exist.",
                dirName));
      }
    }
    return dirs;
  }

  private static List<File> parseFilesString(String filesString) {
    String[] filesArray = filesString.split(";");
    List<File> files = new ArrayList<File>();
    for (String fileName : filesArray) {
      File file = new File(fileName);
      if (file.exists()) {
        if (file.isFile()) {
          files.add(file);
        } else {
          LOG.info(String.format(
              "While creating ignore files list, the file '%s' is not a file.",
              fileName));
        }
      } else {
        LOG.info(String.format(
            "While creating ignore files list, the file '%s' does not exist.",
            fileName));
      }
    }
    return files;
  }

  public void go() {
    LOG.info("Getting list of files to sort.");
    filesToSort = getDirFiles(startDir);
    logGetDirFilesData();
    LOG.info("Sorting and copying files.");
    sortFiles();
    logSortData();
    endTime = new Date().getTime();
    LOG.info(String.format("Ending %s. Total execution time: %f (s).",
        getClass().getName(), (float) (endTime - startTime) / 1000));
  }

  private void logGetDirFilesData() {
    LOG.info("Finished getting list of files to sort.");
    LOG.info(String
        .format(
            "Number of files found that did not match known list of image file type (%s): %s",
            StringUtils.join(IMAGE_TYPES, ", "),
            numFilesNotMatchingKnownImageTypes));
    LOG.info(String.format(
        "Number of files found that matched ignore directories: %s",
        numFilesToIgnoreDirs));
    LOG.info(String.format(
        "Number of files found that matched ignore files: %s",
        numFilesToIgnoreFiles));
    LOG.info(String.format("Number of files found to sort: %s", numFilesToSort));
  }

  private void logSortData() {
    LOG.info("Finished sorting and copying files.");
    LOG.info(String.format("Number of images horizontal: %s",
        numFilesHorizontal));
    LOG.info(String.format("Number of images vertical: %s", numFilesVertical));
    LOG.info(String.format("Number of images equal: %s", numFilesEqual));
  }

  private void sortFiles() {
    for (File file : filesToSort) {
      File destFile = null;
      if (ImageHorizVertSort.dimensions.HEIGHT == determineLargerDimension(getImageWidthHeight(file))) {
        ++numFilesVertical;
        file.getAbsolutePath().replaceFirst(startDir.getAbsolutePath(), "");
        destFile = new File(destDir
            + File.separator
            + VERTICAL_DIR
            + file.getAbsolutePath().replaceFirst(startDir.getAbsolutePath(),
                ""));
      } else if (ImageHorizVertSort.dimensions.WIDTH == determineLargerDimension(getImageWidthHeight(file))) {
        ++numFilesHorizontal;
        destFile = new File(destDir
            + File.separator
            + HORIZONTAL_DIR
            + file.getAbsolutePath().replaceFirst(startDir.getAbsolutePath(),
                ""));
      } else if (ImageHorizVertSort.dimensions.EQUAL == determineLargerDimension(getImageWidthHeight(file))) {
        ++numFilesEqual;
        destFile = new File(destDir
            + File.separator
            + EQUAL_DIR
            + file.getAbsolutePath().replaceFirst(startDir.getAbsolutePath(),
                ""));
      }
      try {
        FileUtils.copyFile(file, destFile);
      } catch (IOException e) {
        LOG.error(String.format("Error copying '%s' to '%s'.",
            file.getAbsolutePath(), destFile.getAbsolutePath()), e);
      }
    }
  }

  static Pair<Integer, Integer> getImageWidthHeight(File file) {
    int height = 0;
    int width = 0;
    String suffix = file.getName().substring(
        file.getName().lastIndexOf('.') + 1);
    Iterator<ImageReader> iter = ImageIO.getImageReadersBySuffix(suffix);
    if (iter.hasNext()) {
      ImageReader reader = iter.next();
      ImageInputStream stream = null;
      try {
        stream = new FileImageInputStream(file);
        reader.setInput(stream);
        width = reader.getWidth(reader.getMinIndex());
        height = reader.getHeight(reader.getMinIndex());
      } catch (IOException e) {
        LOG.error(
            String.format("IOException while reading %s.",
                file.getAbsoluteFile()), e);
      } finally {
        reader.dispose();
        try {
          stream.close();
        } catch (IOException e) {
          LOG.error(
              String.format("IOException while closing %s.",
                  file.getAbsoluteFile()), e);
        }
      }
    }
    return new Pair<Integer, Integer>(height, width);
  }

  static dimensions determineLargerDimension(Pair<Integer, Integer> dimension) {
    if (dimension.getFirst() > dimension.getSecond()) {
      return dimensions.HEIGHT;
    } else if (dimension.getFirst() < dimension.getSecond()) {
      return dimensions.WIDTH;
    } else {
      return dimensions.EQUAL;
    }
  }

  List<File> getDirFiles(File directory) {
    List<File> files = new ArrayList<File>();
    for (File file : directory.listFiles()) {
      if (file.isFile()) {
        if (doesFileMatchImageType(file.getName())) {
          if (!ignoreDirs.contains(new File(file.getParent()))) {
            if (!ignoreFiles.contains(file)) {
              ++numFilesToSort;
              files.add(file);
            } else {
              ++numFilesToIgnoreFiles;
              LOG.info(String.format(
                  "File '%s' is in ignore files list, ignoring.",
                  file.getAbsoluteFile()));
            }
          } else {
            ++numFilesToIgnoreDirs;
            LOG.info(String
                .format(
                    "The directory '%s' for file '%s' is in the ignore directories list, ignoring.",
                    file.getParent(), file.getAbsolutePath()));
          }
        } else {
          ++numFilesNotMatchingKnownImageTypes;
          LOG.info(String
              .format(
                  "The file '%s' did not match the known image file types. Known image types are %s.",
                  file.getAbsolutePath(), StringUtils.join(IMAGE_TYPES, ", ")));
        }
      } else if (file.isDirectory()) {
        files.addAll(getDirFiles(file));
      }
    }
    return files;
  }

  static boolean doesFileMatchImageType(String fileName) {
    for (String imageType : IMAGE_TYPES) {
      if (fileName.toLowerCase().endsWith("." + imageType)) {
        return true;
      }
    }
    return false;
  }

  public File getStartDir() {
    return startDir;
  }

  public File getDestDir() {
    return destDir;
  }

  public List<File> getFilesToSort() {
    return filesToSort;
  }

  public List<File> getIgnoreDirs() {
    return ignoreDirs;
  }

  public List<File> getIgnoreFiles() {
    return ignoreFiles;
  }

  public static void main(String[] args) throws Exception {
    ImageHorizVertSort sort = new ImageHorizVertSort();
    sort.go();
  }
}
