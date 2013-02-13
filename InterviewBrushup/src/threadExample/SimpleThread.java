package threadExample;

public class SimpleThread implements Runnable {
  public void run() {
    for (int i=0; i<100; ++i) {
      if (i%10 == 0) {
        synchronized(this) {
          System.out.println(Thread.currentThread().getName() + " thread about to sleep, i=" + i + ".");
        }
        try {
          Thread.sleep(50);
        } catch (InterruptedException e) {
        }
      }
    }
  }

  public static void main(String[] args) {
    SimpleThread st = new SimpleThread();
    Thread t1 = new Thread(st);
    t1.setName("t1");
    Thread t2 = new Thread(st);
    t2.setName("t2");
    Thread t3 = new Thread(st);
    t3.setName("t3");
    t1.start();
    t2.start();
    t3.start();
  }
}
