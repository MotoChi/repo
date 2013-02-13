package duck;

import duck.Ball;
import junit.framework.TestCase;

public class BallTest extends TestCase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  public void testHappy() {
    int pins = 5;
    Ball ball = new Ball(pins);
    assertEquals(pins, (int) ball.getPins());
  }

  public void testHappyZero() {
    int pins = 0;
    Ball ball = new Ball(pins);
    assertEquals(pins, (int) ball.getPins());
  }

  public void testSadHigh() {
    int pins = 50;
    Ball ball = new Ball(pins);
    assertNull(ball.getPins());
  }

  public void testSadLow() {
    int pins = -5;
    Ball ball = new Ball(pins);
    assertNull(ball.getPins());
  }

  public void testSadNotSameZero() {
    Ball ball_0 = new Ball(0);
    Ball ball_bad = new Ball(50);
    assertFalse(ball_0.getPins() == ball_bad.getPins());
  }
}
