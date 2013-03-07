package linkedList;

public class Node {
  private Node next;
  private Node previous;
  private String data;
  
  public Node(String data) {
    this.data = data;
  }
  
  public String getData() {
    return data;
  }
  
  public Node getPrevious() {
    return previous;
  }
  
  public Node getNext() {
    return next;
  }
  
  public void setNext(Node element) {
    next = element;
  }
  
  public void setPrevious(Node element) {
    previous = element;
  }
}
