package net.ccaper.ImageExample.exif;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.lang.GeoLocation;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDirectory;

public class ReadExif {

  public static void main(String[] args) {
    try {
      String[] fileNames = { "data/4052_Monticello_Garage.jpg",
          "data/IMAG0008.jpg", "data/IMAG0009.jpg", "data/IMAG0010.jpg",
      "data/IMAG0011.jpg" };
      for (String fileName : fileNames) {
        Metadata metadata = ImageMetadataReader
            .readMetadata(new File(fileName));
        System.out.println(fileName);
        GpsDirectory gpsDirectory = metadata.getDirectory(GpsDirectory.class);
        if (gpsDirectory != null) {
          GeoLocation geoLocation = gpsDirectory.getGeoLocation();
          if (geoLocation != null) {
            System.out.println(String.format("Lat: %f Long: %f",
                geoLocation.getLatitude(), geoLocation.getLongitude()));
          }
        }
        ExifSubIFDDirectory exifSubIFDDirectory = metadata
            .getDirectory(ExifSubIFDDirectory.class);
        Date date = exifSubIFDDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
        if (date != null) {
          System.out.println("Date: " + date);
        }
        for (Directory directory : metadata.getDirectories()) {
          System.out.print(String.format("%s :", directory));
          for (Tag tag : directory.getTags()) {
            System.out.print(String.format(" '%s'", tag));
          }
          System.out.println();
        }
        System.out.println();
      }
    } catch (ImageProcessingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
