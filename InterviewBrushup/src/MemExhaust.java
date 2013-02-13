
public class MemExhaust {
  private final String string;

  public MemExhaust(String string, int number) {
    String temp = new String(string + number);
    this.string = temp;
    System.out.println(temp);
    ++number;
    new MemExhaust(string, number);
  }

  public static void main(String[] args) {
    MemExhaust me = new MemExhaust("test", 0);
  }
}
