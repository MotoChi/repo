package sort_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SortList2 {
  public static List<String> sortList(List<String> unsortedList) {
    if (unsortedList == null || unsortedList.isEmpty() || unsortedList.size() == 1) {
      return sortList_minimalConditions(unsortedList);
    }
    List<String> sortedList = new ArrayList<String>(unsortedList);
    for (int i=0; i<sortedList.size() - 1; ++i) {
      for (int j=i+1; j<sortedList.size(); ++j) {
        if (sortedList.get(i).compareTo(sortedList.get(j)) > 0) {
          String temp = sortedList.get(j);
          sortedList.set(j, sortedList.get(i));
          sortedList.set(i, temp);
        }
      }
    }
    return sortedList;
  }
  
  // visible for testing
  static List<String> sortList_minimalConditions(List<String> unsortedList) {
    if (unsortedList == null) {
      return null;
    }
    else if (unsortedList.isEmpty()) {
      return unsortedList;
    }
    if (unsortedList.size() == 1) {
      return unsortedList;
    }
    throw new IllegalArgumentException("List contains more than 1 item, not minimal condition.");
  }

  public static void main(String[] args) {
    String[] array = { "Shadow", "Christian", "Kim", "David", "Bob", "Kay" };
    List<String> listUnsorted = Arrays.asList(array);
    System.out.println(String.format("List unsorted: %s",
        StringUtils.join(listUnsorted, ", ")));
  }
}
