package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
  private List<Integer> fibinacciSeries;
  private int maxNumberOfItemsInSeries;

  public Fibonacci(int maxNumberOfItemsInSeries) {
    if (maxNumberOfItemsInSeries < 1) {
      throw new IllegalArgumentException(
          "Series must have more than 0 elements.");
    }
    this.maxNumberOfItemsInSeries = maxNumberOfItemsInSeries;
    fibinacciSeries = new ArrayList<Integer>(maxNumberOfItemsInSeries);
  }

  public List<Integer> computeFibinacciSeries() {
    fibinacciSeries.clear();
    if (maxNumberOfItemsInSeries == 1) {
      fibinacciSeries.add(new Integer(0));
    } else if (maxNumberOfItemsInSeries == 2) {
      fibinacciSeries.add(new Integer(0));
      fibinacciSeries.add(1);
    } else {
      fibinacciSeries.add(new Integer(0));
      fibinacciSeries.add(new Integer(1));
      for (int i = 2; i < maxNumberOfItemsInSeries; ++i) {
        fibinacciSeries.add(new Integer(fibinacciSeries.get(i - 2)
            + fibinacciSeries.get(i - 1)));
      }
    }
    return fibinacciSeries;
  }

  public static void main(String[] args) {
  }
}
