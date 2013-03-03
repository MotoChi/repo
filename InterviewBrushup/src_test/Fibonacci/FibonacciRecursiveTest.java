package Fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciRecursiveTest {
  private Integer[] fibSeriesArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
  private List<Integer> fibSeries = Arrays.asList(fibSeriesArray);

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSadPath() throws Exception {
    try {
      new FibonacciRecursive(0);
      fail();
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  @Test
  public void test1Element() throws Exception {
    FibonacciRecursive fib = new FibonacciRecursive(1);
    assertTrue(fib.computeFibinacciSeries().equals(fibSeries.subList(0, 1)));
  }
  
  @Test
  public void test2Elements() throws Exception {
    FibonacciRecursive fib = new FibonacciRecursive(2);
    assertTrue(fib.computeFibinacciSeries().equals(fibSeries.subList(0, 2)));
  }
  
  @Test
  public void test12Elements() throws Exception {
    FibonacciRecursive fib = new FibonacciRecursive(13);
    assertTrue(fib.computeFibinacciSeries().equals(fibSeries.subList(0, 13)));
  }
}
