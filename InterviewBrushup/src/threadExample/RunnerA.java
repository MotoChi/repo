package threadExample;

public class RunnerA implements Runnable {
  public void run() {
    synchronized(this) {
      for (int i=0; i<=50; i+=10) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println("RunnerA crossed " + i + " yard line.");
      }
      System.out.println("RunnerA handing off baton.");
      notify();
    }
  }
}
