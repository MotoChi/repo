package threadExample;

public class RunnerB implements Runnable {
  private final RunnerA object;

  public RunnerB(RunnerA object) {
    this.object = object;
  }

  public void run() {
    synchronized(object) {
      try {
        System.out.println("RunnerB waiting for baton.");
        object.wait();
        System.out.println("RunnerB has baton.");
        for (int i=60; i<=100; i+=10) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e2) {
          }
          System.out.println("RunnerB crossed " + i + " yard line.");
        }
      } catch (InterruptedException e) {
      }
    }
  }
}
