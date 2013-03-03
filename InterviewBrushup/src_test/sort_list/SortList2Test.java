package sort_list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortList2Test {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testNull() throws Exception {
    assertEquals(null, SortList2.sortList_minimalConditions(null));
    assertEquals(null, SortList2.sortList(null));
  }
  
  @Test
  public void testEmpty() throws Exception {
    List<String> list = new ArrayList<String>(0);
    assertTrue(SortList2.sortList_minimalConditions(list).equals(list));
    assertTrue(SortList2.sortList(list).equals(list));
  }
  
  @Test
  public void test1Element() throws Exception {
    List<String> list = new ArrayList<String>(1);
    list.add("blah");
    assertTrue(SortList2.sortList_minimalConditions(list).equals(list));
    assertTrue(SortList2.sortList(list).equals(list));
  }
  
  @Test
  public void test2Elements() throws Exception {
    List<String> list = new ArrayList<String>(2);
    list.add("blah1");
    list.add("blah2");
    try {
      assertTrue(SortList2.sortList_minimalConditions(list).equals(list));
      fail();
    } catch (IllegalArgumentException e) {
      // expected
    }
  }
  
  @Test
  public void testSort() throws Exception {
    String[] arrayUnsorted = { "Shadow", "Christian", "Kim", "David", "Bob", "Kay" };
    List<String> listUnsorted = Arrays.asList(arrayUnsorted);
    assertFalse(SortList2.sortList(listUnsorted).equals(listUnsorted));
    List<String> listSorted = new ArrayList<String>(listUnsorted);
    Collections.sort(listSorted);
    assertTrue(SortList2.sortList(listUnsorted).equals(listSorted));
  }
}
