package SortedBinaryTree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortedBinaryTreeTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void emptyTree() throws Exception {
    SortedBinaryTree tree = new SortedBinaryTree();
    assertEquals(0, tree.getSize());
  }

  @Test
  public void addElement() throws Exception {
    SortedBinaryTree tree = new SortedBinaryTree();
    int initialSize = tree.getSize();
    Integer element = 10;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    assertFalse(tree.elementExists(5));
  }

  @Test
  public void addDupeElement() throws Exception {
    SortedBinaryTree tree = new SortedBinaryTree();
    int initialSize = tree.getSize();
    Integer element = 10;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    element = 10;
    tree.addElement(element);
    assertEquals(initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
  }

  @Test
  public void addElements() throws Exception {
    SortedBinaryTree tree = new SortedBinaryTree();
    int initialSize = tree.getSize();
    Integer element = 10;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    element = 15;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    element = 5;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    element = 7;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
    element = 12;
    tree.addElement(element);
    assertEquals(++initialSize, tree.getSize());
    assertTrue(tree.elementExists(element));
  }

  @Test
  public void getElements() throws Exception {
    Integer[] elements = { 10, 5, 15, 7, 12, 2, 13, 3 };
    SortedBinaryTree tree = new SortedBinaryTree();
    for (Integer element : elements) {
      tree.addElement(element);
    }
    assertEquals(elements.length, tree.getSize());
    Arrays.sort(elements);
    assertTrue(Arrays.equals(elements, tree.getElements()));
  }
}
