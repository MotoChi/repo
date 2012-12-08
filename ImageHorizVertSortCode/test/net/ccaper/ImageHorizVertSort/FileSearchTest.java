package net.ccaper.ImageHorizVertSort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.ccaper.ImageHorizVertSort.Exceptions.FileSearchException;
import net.ccaper.ImageHorizVertSort.utils.Pair;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileSearchTest {
  private final List<File> dirStructure = new ArrayList<File>();
  private final String imageFilename = "test_data" + File.separator
      + "eclipse_update_120.jpg";

  @Before
  public void setUp() throws Exception {
    createDirsAndFiles();
  }

  @After
  public void tearDown() throws Exception {
    for (File file : dirStructure) {
      file.deleteOnExit();
    }
  }

  private void createDirsAndFiles() throws Exception {
    File base = new File("temp");
    base.mkdir();
    dirStructure.add(base);
    File file1 = new File(base.getAbsolutePath() + File.separator + "file1.jpg");
    file1.createNewFile();
    dirStructure.add(file1);
    File dir1 = new File(base.getAbsolutePath() + File.separator + "dir1");
    dir1.mkdir();
    dirStructure.add(dir1);
    File file2 = new File(dir1.getAbsolutePath() + File.separator + "file2.jpg");
    file2.createNewFile();
    dirStructure.add(file2);
    File file3 = new File(dir1.getAbsolutePath() + File.separator
        + "file3.jpeg");
    file3.createNewFile();
    dirStructure.add(file3);
    File dir2 = new File(dir1.getAbsolutePath() + File.separator + "dir2");
    dir2.mkdir();
    dirStructure.add(dir2);
    File dir3 = new File(dir1.getAbsolutePath() + File.separator + "dir3");
    dir3.mkdir();
    dirStructure.add(dir3);
    File file4 = new File(dir2.getAbsolutePath() + File.separator + "file4.JPG");
    file4.createNewFile();
    dirStructure.add(file4);
    File file5 = new File(dir2.getAbsolutePath() + File.separator
        + "file5.JPEG");
    file5.createNewFile();
    dirStructure.add(file5);
    File file6 = new File(dir3.getAbsolutePath() + File.separator + "file6.jpg");
    file6.createNewFile();
    dirStructure.add(file6);
    File file7 = new File(dir3.getAbsolutePath() + File.separator + "file7.jpg");
    file7.createNewFile();
    dirStructure.add(file7);
    File dir4 = new File(dir3.getAbsolutePath() + File.separator + "dir4");
    dir4.mkdir();
    dirStructure.add(dir4);
    File file8 = new File(dir4.getAbsolutePath() + File.separator + "file8.jpg");
    file8.createNewFile();
    dirStructure.add(file8);
    File file9 = new File(dir4.getAbsolutePath() + File.separator + "file9.jpg");
    file9.createNewFile();
    dirStructure.add(file9);
    File file10 = new File(dir4.getAbsolutePath() + File.separator
        + "file10.png");
    file10.createNewFile();
    dirStructure.add(file10);
  }

  @Test
  public void testFileSearch() {
    try {
      new ImageHorizVertSort("blah", "blah2", "blah3", "blah4");
      fail();
    } catch (FileSearchException e) {
      // expected
    }
    try {
      new ImageHorizVertSort(new File("blah"), new File("blah"),
          new ArrayList<File>(), new ArrayList<File>());
      fail();
    } catch (FileSearchException e) {
      // expected
    }
    try {
      new ImageHorizVertSort(".", "blah", "blah2", "blah3");
    } catch (FileSearchException e) {
      fail();
    }
    try {
      new ImageHorizVertSort(new File("."), new File("blah"),
          new ArrayList<File>(), new ArrayList<File>());
    } catch (FileSearchException e) {
      fail();
    }
  }

  @Test
  public void testGetTopDir() throws Exception {
    String start = "/home/ccaper";
    ImageHorizVertSort fileSearch = new ImageHorizVertSort(start, "blah",
        "blah2", "blah3");
    assertEquals(start, fileSearch.getStartDir().getAbsolutePath());
    fileSearch = new ImageHorizVertSort(new File(start), new File("blah"),
        new ArrayList<File>(), new ArrayList<File>());
    assertEquals(start, fileSearch.getStartDir().getAbsolutePath());
  }

  @Test
  public void testGetDestDir() throws Exception {
    String destDir = "destDir";
    ImageHorizVertSort fileSearch = new ImageHorizVertSort(imageFilename,
        destDir, "blah", "blah2");
    assertEquals(destDir, fileSearch.getDestDir().getName());
  }

  @Test
  public void testGetDirFilesHappyPath() throws Exception {
    ImageHorizVertSort fileSearch = new ImageHorizVertSort("temp", "blah",
        "blah2", "blah3");
    List<File> filesToSort = fileSearch.getDirFiles(fileSearch.getStartDir());
    assertEquals(9, filesToSort.size());
  }

  @Test
  public void testGetDirFilesSadPath() throws Exception {
    ImageHorizVertSort fileSearch = new ImageHorizVertSort("temp", "blah",
        "temp" + File.separator + "dir1" + File.separator + "dir3", "temp"
            + File.separator + "file1.jpg");
    List<File> filesToSort = fileSearch.getDirFiles(fileSearch.getStartDir());
    assertEquals(6, filesToSort.size());
  }

  @Test
  public void testDimensions() throws Exception {
    assertEquals(ImageHorizVertSort.dimensions.HEIGHT,
        ImageHorizVertSort.determineLargerDimension(new Pair<Integer, Integer>(
            10, 5)));
    assertEquals(ImageHorizVertSort.dimensions.WIDTH,
        ImageHorizVertSort.determineLargerDimension(new Pair<Integer, Integer>(
            5, 10)));
    assertEquals(ImageHorizVertSort.dimensions.EQUAL,
        ImageHorizVertSort.determineLargerDimension(new Pair<Integer, Integer>(
            10, 10)));
  }

  @Test
  public void testValidImageTypes() throws Exception {
    String prefix = "test.";
    for (String type : ImageHorizVertSort.IMAGE_TYPES) {
      assertTrue(ImageHorizVertSort.doesFileMatchImageType(prefix + type));
    }
    assertTrue(ImageHorizVertSort.doesFileMatchImageType(prefix
        + ImageHorizVertSort.IMAGE_TYPES[0].toUpperCase()));
    assertFalse(ImageHorizVertSort.doesFileMatchImageType(prefix + "txt"));
  }

  @Test
  public void testGetImageWidthHeight() throws Exception {
    Pair<Integer, Integer> pair = ImageHorizVertSort
        .getImageWidthHeight(new File(imageFilename));
    assertEquals(120, (int) pair.getFirst());
    assertEquals(120, (int) pair.getSecond());
  }

  @Test
  public void testParseDirsStringHappyPath() throws Exception {
    ImageHorizVertSort fs = new ImageHorizVertSort("temp", "blah",
        makeIgnoreDirsString(), "blah2");
    assertEquals(5, fs.getIgnoreDirs().size());
    String[] dirsArray = makeIgnoreDirsString().split(";");
    for (String dir : dirsArray) {
      File file = new File(dir);
      assertTrue(fs.getIgnoreDirs().contains(file));
    }
  }

  @Test
  public void testParseDirsStringSadPath() throws Exception {
    String ignoreDirsString = makeIgnoreDirsString()
        + ";thisDirDoesNotExist;temp" + File.separator + "file1.jpg";
    ImageHorizVertSort fs = new ImageHorizVertSort("temp", "blah",
        ignoreDirsString, "blah2");
    assertEquals(5, fs.getIgnoreDirs().size());
    String[] dirsArray = makeIgnoreDirsString().split(";");
    for (String dir : dirsArray) {
      File file = new File(dir);
      assertTrue(fs.getIgnoreDirs().contains(file));
    }
  }

  private String makeIgnoreDirsString() {
    String dirsString = "";
    for (File file : dirStructure) {
      if (file.isDirectory()) {
        dirsString += file.getAbsoluteFile() + ";";
      }
    }
    return dirsString.substring(0, dirsString.length() - 1);
  }

  @Test
  public void testParseFilesStringHappyPath() throws Exception {
    ImageHorizVertSort fs = new ImageHorizVertSort("temp", "blah", "blah2",
        makeIgnoreFilesString());
    assertEquals(10, fs.getIgnoreFiles().size());
    String[] dirsArray = makeIgnoreFilesString().split(";");
    for (String dir : dirsArray) {
      File file = new File(dir);
      assertTrue(fs.getIgnoreFiles().contains(file));
    }
  }

  @Test
  public void testParseFilesStringSadPath() throws Exception {
    String ignoreFilesString = makeIgnoreFilesString()
        + ";thisDirDoesNotExist;temp" + File.separator + "dir1";
    ImageHorizVertSort fs = new ImageHorizVertSort("temp", "blah", "blah2",
        ignoreFilesString);
    assertEquals(10, fs.getIgnoreFiles().size());
    String[] dirsArray = makeIgnoreFilesString().split(";");
    for (String dir : dirsArray) {
      File file = new File(dir);
      assertTrue(fs.getIgnoreFiles().contains(file));
    }
  }

  private String makeIgnoreFilesString() {
    String dirsString = "";
    for (File file : dirStructure) {
      if (file.isFile()) {
        dirsString += file.getAbsoluteFile() + ";";
      }
    }
    return dirsString.substring(0, dirsString.length() - 1);
  }
}
