package threadExample;

public class BatonDash {
  public static void main(String[] args) {
    RunnerA rA = new RunnerA();
    Thread t1 = new Thread(rA);
    RunnerB rB = new RunnerB(rA);
    Thread t2 = new Thread(rB);
    t2.start();
    t1.start();
  }
}
