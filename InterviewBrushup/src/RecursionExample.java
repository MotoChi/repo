

public class RecursionExample {

  public static void go(int value) {
    if (value <= 0) {
      System.out.println("Done!");
      return;
    }
    System.out.println("Count at " + value);
    go(--value);
  }

  public static void main(String[] args) {
    RecursionExample.go(10);
  }

}
