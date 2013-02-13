public class MyLinkedList2 {
  private final Node head;
  private int listCount;

  public MyLinkedList2() {
    head = new Node(null);
    listCount = 0;
  }

  private boolean hasNext(Node node) {
    if (node.getNext() != null) {
      return true;
    } else {
      return false;
    }
  }

  public int size() {
    return listCount;
  }

  public void add(Object data) {
    add(data, size() + 1);
  }

  public void add(Object data, int index) {
    if (index <= 0 || index >= listCount + 1) {
      return;
    }
    Node temp = new Node(data);
    Node current = head;
    for (int i=1; i<index && hasNext(current); ++i) {
      current = current.getNext();
    }
    temp = current.getNext();
    current.setNext(temp);
    ++listCount;
  }

  public void replace(Object data, int index) {
    if (index <= 0 || index >= listCount + 1) {
      return;
    }
    Node current = head;
    for (int i=1; i<index && hasNext(current); ++i) {
      current = current.getNext();
    }
    current.setData(data);
  }

  public Object get(int index) {
    if (index <= 0 || index > size()) {
      return null;
    }
    Node current = head;
    for (int i=1; i<index && hasNext(current); ++i) {
      current = current.getNext();
    }
    return current.getData();
  }

  public boolean remove(int index) {
    if (index <= 0 || index > size()) {
      return false;
    }
    Node current = head;
    for (int i=1; i<index && hasNext(current); ++i) {
      current = current.getNext();
    }
    current.setNext(current.getNext().getNext());
    --listCount;
    return true;
  }

  @Override
  public String toString() {
    Node current = head.getNext();
    String output = "";
    while (current != null) {
      output += "[" + current.getData().toString() + "]";
      current = current.getNext();
    }
    return output;
  }

  private class Node {
    private Node next;
    private Object data;

    public Node(Node next) {
      this.next = next;
    }

    public Node(Object data) {
      this.data = data;
    }

    public Node(Node next, Object data) {
      this.next = next;
      this.data = data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public Object getData() {
      return data;
    }

    public void setData(Object data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    MyLinkedList ll = new MyLinkedList();
    System.out.println("Size: " + ll.size());
    ll.add("1");
    ll.add("2");
    ll.add("3");
    System.out.println("Contents of list: " + ll.toString());
    ll.replace("10", 2);
    System.out.println("Contents of list: " + ll.toString());
    System.out.println("end: " + ll.get(4));
  }
}
