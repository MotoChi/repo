package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursive {
  private List<Integer> fibinacciSeries;
  private int maxNumberOfItemsInSeries;

  public FibonacciRecursive(int maxNumberOfItemsInSeries) {
    if (maxNumberOfItemsInSeries < 1) {
      throw new IllegalArgumentException(
          "Series must have more than 0 elements.");
    }
    this.maxNumberOfItemsInSeries = maxNumberOfItemsInSeries;
    fibinacciSeries = new ArrayList<Integer>(maxNumberOfItemsInSeries);
  }

  public List<Integer> computeFibinacciSeries() {
    fibinacciSeries.clear();
    go(0);
    return fibinacciSeries;
  }
  
  private void go(int i) {
    if (i>=maxNumberOfItemsInSeries) {
      return;
    }
    if (i==0 && i<maxNumberOfItemsInSeries) {
      fibinacciSeries.add(new Integer(0));
    } else if (i==1 && i<maxNumberOfItemsInSeries) {
      fibinacciSeries.add(new Integer(1));
    } else if (i<maxNumberOfItemsInSeries) {
      fibinacciSeries.add(new Integer(fibinacciSeries.get(i - 2)
          + fibinacciSeries.get(i - 1)));
    }
    go(i+1);
  }

  public static void main(String[] args) {
  }
}
