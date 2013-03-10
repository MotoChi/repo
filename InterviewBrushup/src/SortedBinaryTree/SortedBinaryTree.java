package SortedBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class SortedBinaryTree {
  private Node root = null;
  private int size = 0;

  public int getSize() {
    return size;
  }

  public void addElement(Integer data) {
    if (elementExists(data)) {
      return;
    }
    ++size;
    Node element = new Node();
    element.setData(data);
    if (root == null) {
      root = element;
      return;
    }
    Node iterator = root;
    while (true) {
      if (data < iterator.getData()) {
        if (iterator.getLeftChild() == null) {
          iterator.setLeftChild(element);
          return;
        } else {
          iterator = iterator.getLeftChild();
        }
      } else if (data > iterator.getData()) {
        if (iterator.getRightChild() == null) {
          iterator.setRightChild(element);
          return;
        } else {
          iterator = iterator.getRightChild();
        }
      }
    }
  }

  public boolean elementExists(Integer data) {
    Node iterator = root;
    while (true) {
      if (size == 0) {
        return false;
      }
      if (iterator.getData() == data) {
        return true;
      } else if (data < iterator.getData()) {
        if (iterator.getLeftChild() == null) {
          return false;
        }
        iterator = iterator.getLeftChild();
      } else if (data > iterator.getData()) {
        if (iterator.getRightChild() == null) {
          return false;
        }
        iterator = iterator.getRightChild();
      }
    }
  }
  
  public Integer[] getElements() {
    List<Integer> elements = new ArrayList<Integer>();
    elements = getSubTree(elements, root);
    return elements.toArray(new Integer[elements.size()]);
  }
  
  private List<Integer> getSubTree(List<Integer> elements, Node subTree) {
    if (subTree.getLeftChild() != null) {
      getSubTree(elements, subTree.getLeftChild());
    }
    elements.add(subTree.getData());
    if (subTree.getRightChild() != null) {
      getSubTree(elements, subTree.getRightChild());
    }
    return elements;
  }
}
