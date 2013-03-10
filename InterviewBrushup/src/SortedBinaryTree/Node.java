package SortedBinaryTree;

public class Node {
  private Integer data;
  private Node leftChild;
  private Node rightChild;

  public Integer getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + data;
    result = prime * result + ((leftChild == null) ? 0 : leftChild.hashCode());
    result = prime * result
        + ((rightChild == null) ? 0 : rightChild.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Node other = (Node) obj;
    if (data != other.data)
      return false;
    if (leftChild == null) {
      if (other.leftChild != null)
        return false;
    } else if (!leftChild.equals(other.leftChild))
      return false;
    if (rightChild == null) {
      if (other.rightChild != null)
        return false;
    } else if (!rightChild.equals(other.rightChild))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Node [data=" + data + "]";
  }
}
