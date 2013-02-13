package duck;

import junit.framework.TestCase;

public class FrameTest extends TestCase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  public void testRegularRoll() {
    Ball ball1 = new Ball(5);
    Ball ball2 = new Ball(2);
    Frame frame = new Frame(ball1, ball2);
    assertEquals(ball1.getPins() + ball2.getPins(), frame.getScore());
    assertFalse(frame.isSpare());
    assertFalse(frame.isStrike());
  }

  public void testSpare() {
    Ball ball1 = new Ball(7);
    Ball ball2 = new Ball(3);
    Frame frame = new Frame(ball1, ball2);
    assertEquals(10, frame.getScore());
    assertFalse(frame.isStrike());
    assertTrue(frame.isSpare());
  }

  public void testStrike() {
    Ball ball1 = new Ball(10);
    Frame frame = new Frame(ball1);
    assertEquals(10, frame.getScore());
    assertTrue(frame.isStrike());
    assertFalse(frame.isSpare());
    assertNull(frame.getBall2());
  }

  public void testRegularRollNulls() {
    Ball ball1 = null;
    Ball ball2 = new Ball(5);
    Frame frame = new Frame(ball1, ball2);
    assertNull(frame.getBall1());
    assertNull(frame.getBall2());
    ball1 = new Ball(2);
    ball2 = null;
    frame = new Frame(ball1, ball2);
    assertNull(frame.getBall1());
    assertNull(frame.getBall2());
  }

  public void testStrikeNull() {
    Ball ball1 = null;
    Frame frame = new Frame(ball1);
    assertFalse(frame.isStrike());
    assertNull(frame.getBall1());
  }

  public void testStrikeInvalid() {
    Ball ball1 = new Ball(5);
    Frame frame = new Frame(ball1);
    assertFalse(frame.isStrike());
    assertNull(frame.getBall1());
  }

  public void testRegularRollStrike() {
    Ball ball1 = new Ball(10);
    Ball ball2 = new Ball(0);
    Frame frame = new Frame(ball1, ball2);
    assertFalse(frame.isStrike());
    assertNull(frame.getBall1());
    assertNull(frame.getBall2());
  }

  public void testRegularRollInvalidBalls() {
    Ball ball1 = new Ball(7);
    Ball ball2 = new Ball(8);
    Frame frame = new Frame(ball1, ball2);
    assertFalse(frame.isStrike());
    assertNull(frame.getBall1());
    assertNull(frame.getBall2());
  }
}
