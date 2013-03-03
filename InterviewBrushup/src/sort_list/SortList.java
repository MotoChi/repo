package sort_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SortList {

  public static void main(String[] args) {
    String[] array = { "Shadow", "Christian", "Kim", "David", "Bob", "Kay" };
    List<String> listUnsorted = Arrays.asList(array);
    System.out.println(String.format("List unsorted: %s",
        StringUtils.join(listUnsorted, ", ")));
    List<String> listSorted = new ArrayList<String>(listUnsorted);
    Collections.sort(listSorted);
    System.out.println(String.format("List sorted: %s",
        StringUtils.join(listSorted, ", ")));
    System.out.print("First 3 letters of each item sorted: ");
    int i = 0;
    for (String item : listSorted) {
      System.out.print(item.substring(0, 3));
      if (i < listSorted.size() - 1) {
        System.out.print(", ");
      }
      ++i;
    }
    System.out.println();
    System.out.print("Last 3 letters of each item sorted: ");
    i = 0;
    for (String item : listSorted) {
      System.out.print(item.substring(item.length() - 3));
      if (i < listSorted.size() - 1) {
        System.out.print(", ");
      }
      ++i;
    }
    System.out.println();
  }
}
