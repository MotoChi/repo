package linkedList;

import org.apache.commons.lang3.StringUtils;

public class LinkedList {
  private final Node head = new Node("");
  private final Node tail = new Node("");
  private int size;

  public void addBegin(String data) {
    Node element = new Node(data);
    if (head.getNext() == null) {
      head.setNext(element);
      element.setPrevious(head);
    } else {
      element.setNext(head.getNext());
      element.getNext().setPrevious(element);
      element.setPrevious(head);
      head.setNext(element);
    }
    if (tail.getPrevious() == null) {
      tail.setPrevious(element);
      element.setNext(tail);
    }
    ++size;
  }

  public void addEnd(String data) {
    Node element = new Node(data);
    if (head.getNext() == null) {
      head.setNext(element);
      element.setPrevious(head);
    }
    if (tail.getPrevious() == null) {
      tail.setPrevious(element);
      element.setNext(tail);
    } else {
      element.setPrevious(tail.getPrevious());
      element.getPrevious().setNext(element);
      element.setNext(tail);
      tail.setPrevious(element);
    }
    ++size;
  }

  public void addAfter(int i, String data) {
    if (i > size) {
      throw new IllegalArgumentException(String.format(
          "%d is larger than size of linked list, %d", i, size));
    }
    Node element = new Node(data);
    Node temp = head;
    for (int j = 0; j < i; ++j) {
      temp = temp.getNext();
    }
    temp.getNext().getNext().setPrevious(element);
    element.setNext(temp.getNext().getNext());
    temp.getNext().setNext(element);
    element.setPrevious(temp.getNext());
    ++size;
  }

  public int getSize() {
    return size;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public String get(int i) {
    if (i > size || i < 0) {
      throw new IllegalArgumentException(String.format(
          "%d is larger than size of linked list, %d", i, size));
    }
    if (size / 2 > i) {
      Node temp = head.getNext();
      for (int j = 0; j < i; ++j) {
        temp = temp.getNext();
      }
      return temp.getData();
    } else {
      Node temp = tail.getPrevious();
      for (int j = size - 1; j > i; --j) {
        temp = temp.getPrevious();
      }
      return temp.getData();
    }
  }

  public static void main(String[] args) {
    String[] items = { "A", "B", "C", "D", "E" };
    System.out.println("Items : " + StringUtils.join(items, ", "));
    System.out.println("Add from begin.");
    LinkedList ll = new LinkedList();
    for (String item : items) {
      ll.addBegin(item);
    }
    for (int i = 0; i < ll.getSize(); ++i) {
      System.out.println("Item " + i + ": " + ll.get(i));
    }
    System.out.println("Add from end.");
    ll = new LinkedList();
    for (String item : items) {
      ll.addEnd(item);
    }
    for (int i = 0; i < ll.getSize(); ++i) {
      System.out.println("Item " + i + ": " + ll.get(i));
    }
    System.out.println("Add item after position 1.");
    ll.addAfter(1, "B2");
    for (int i = 0; i < ll.getSize(); ++i) {
      System.out.println("Item " + i + ": " + ll.get(i));
    }
    System.out.println("Add item after position 4.");
    ll.addAfter(4, "D2");
    for (int i = 0; i < ll.getSize(); ++i) {
      System.out.println("Item " + i + ": " + ll.get(i));
    }
  }
}
