package bowling;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void game1() {
    Frame frame1 = new Frame(null);
    frame1.rollBall(7);
    frame1.rollBall(0);
    assertEquals(7, frame1.frameScore());
    assertEquals(7, frame1.gameScore());
    assertEquals(1, frame1.getFrameNumber());

    Frame frame2 = new Frame(frame1);
    frame2.rollBall(2);
    frame2.rollBall(8);
    assertEquals(10, frame2.frameScore());
    assertEquals(17, frame2.gameScore());
    assertEquals(2, frame2.getFrameNumber());

    Frame frame3 = new Frame(frame2);
    frame3.rollBall(0);
    frame3.rollBall(7);
    assertEquals(7, frame3.frameScore());
    assertEquals(24, frame3.gameScore());
    assertEquals(3, frame3.getFrameNumber());

    Frame frame4 = new Frame(frame3);
    frame4.rollBall(3);
    frame4.rollBall(7);
    assertEquals(10, frame4.frameScore());
    assertEquals(34, frame4.gameScore());
    assertEquals(4, frame4.getFrameNumber());

    Frame frame5 = new Frame(frame4);
    frame5.rollBall(4);
    frame5.rollBall(5);
    assertEquals(9, frame5.frameScore());
    assertEquals(47, frame5.gameScore());
    assertEquals(38, frame4.gameScore());
    assertEquals(5, frame5.getFrameNumber());

    Frame frame6 = new Frame(frame5);
    frame6.rollBall(10);
    assertEquals(10, frame6.frameScore());
    assertEquals(57, frame6.gameScore());
    assertEquals(6, frame6.getFrameNumber());

    Frame frame7 = new Frame(frame6);
    frame7.rollBall(2);
    frame7.rollBall(4);
    assertEquals(6, frame7.frameScore());
    assertEquals(69, frame7.gameScore());
    assertEquals(63, frame6.gameScore());
    assertEquals(7, frame7.getFrameNumber());

    Frame frame8 = new Frame(frame7);
    frame8.rollBall(10);
    assertEquals(10, frame8.frameScore());
    assertEquals(79, frame8.gameScore());
    assertEquals(8, frame8.getFrameNumber());

    Frame frame9 = new Frame(frame8);
    frame9.rollBall(10);
    assertEquals(10, frame9.frameScore());
    assertEquals(99, frame9.gameScore());
    assertEquals(89, frame8.gameScore());
    assertEquals(9, frame9.getFrameNumber());

    Frame frame10 = new Frame(frame9);
    frame10.rollBall(10);
    frame10.rollBall(2);
    frame10.rollBall(4);
    assertEquals(16, frame10.frameScore());
    assertEquals(137, frame10.gameScore());
    assertEquals(99, frame8.gameScore());
    assertEquals(121, frame9.gameScore());
    assertEquals(10, frame10.getFrameNumber());
  }

  @Test
  public void game2() {
    Frame frame1 = new Frame(null);
    frame1.rollBall(2);
    frame1.rollBall(8);
    assertEquals(10, frame1.frameScore());
    assertEquals(10, frame1.gameScore());

    Frame frame2 = new Frame(frame1);
    frame2.rollBall(3);
    frame2.rollBall(6);
    assertEquals(9, frame2.frameScore());
    assertEquals(22, frame2.gameScore());
    assertEquals(13, frame1.gameScore());

    Frame frame3 = new Frame(frame2);
    frame3.rollBall(4);
    frame3.rollBall(6);
    assertEquals(10, frame3.frameScore());
    assertEquals(32, frame3.gameScore());

    Frame frame4 = new Frame(frame3);
    frame4.rollBall(10);
    assertEquals(10, frame4.frameScore());
    assertEquals(52, frame4.gameScore());
    assertEquals(42, frame3.gameScore());

    Frame frame5 = new Frame(frame4);
    frame5.rollBall(10);
    assertEquals(10, frame5.frameScore());
    assertEquals(72, frame5.gameScore());
    assertEquals(62, frame4.gameScore());

    Frame frame6 = new Frame(frame5);
    frame6.rollBall(1);
    frame6.rollBall(1);
    assertEquals(2, frame6.frameScore());
    assertEquals(77, frame6.gameScore());
    assertEquals(75, frame5.gameScore());
    assertEquals(63, frame4.gameScore());

    Frame frame7 = new Frame(frame6);
    frame7.rollBall(10);
    assertEquals(10, frame7.frameScore());
    assertEquals(87, frame7.gameScore());

    Frame frame8 = new Frame(frame7);
    frame8.rollBall(4);
    frame8.rollBall(6);
    assertEquals(10, frame8.frameScore());
    assertEquals(107, frame8.gameScore());
    assertEquals(97, frame7.gameScore());

    Frame frame9 = new Frame(frame8);
    frame9.rollBall(8);
    frame9.rollBall(2);
    assertEquals(10, frame9.frameScore());
    assertEquals(125, frame9.gameScore());
    assertEquals(97, frame7.gameScore());
    assertEquals(115, frame8.gameScore());

    Frame frame10 = new Frame(frame9);
    frame10.rollBall(4);
    frame10.rollBall(5);
    assertEquals(9, frame10.frameScore());
    assertEquals(138, frame10.gameScore());
    assertEquals(129, frame9.gameScore());
  }

  @Test
  public void game3() {
    Frame frame1 = new Frame(null);
    frame1.rollBall(10);
    assertEquals(10, frame1.frameScore());
    assertEquals(10, frame1.gameScore());

    Frame frame2 = new Frame(frame1);
    frame2.rollBall(10);
    assertEquals(10, frame2.frameScore());
    assertEquals(30, frame2.gameScore());
    assertEquals(20, frame1.gameScore());

    Frame frame3 = new Frame(frame2);
    frame3.rollBall(2);
    frame3.rollBall(8);
    assertEquals(10, frame3.frameScore());
    assertEquals(52, frame3.gameScore());
    assertEquals(22, frame1.gameScore());
    assertEquals(42, frame2.gameScore());

    Frame frame4 = new Frame(frame3);
    frame4.rollBall(3);
    frame4.rollBall(7);
    assertEquals(10, frame4.frameScore());
    assertEquals(65, frame4.gameScore());
    assertEquals(55, frame3.gameScore());

    Frame frame5 = new Frame(frame4);
    frame5.rollBall(10);
    assertEquals(10, frame5.frameScore());
    assertEquals(85, frame5.gameScore());
    assertEquals(75, frame4.gameScore());

    Frame frame6 = new Frame(frame5);
    frame6.rollBall(4);
    frame6.rollBall(4);
    assertEquals(8, frame6.frameScore());
    assertEquals(101, frame6.gameScore());
    assertEquals(93, frame5.gameScore());

    Frame frame7 = new Frame(frame6);
    frame7.rollBall(10);
    assertEquals(10, frame7.frameScore());
    assertEquals(111, frame7.gameScore());

    Frame frame8 = new Frame(frame7);
    frame8.rollBall(6);
    frame8.rollBall(3);
    assertEquals(9, frame8.frameScore());
    assertEquals(129, frame8.gameScore());
    assertEquals(120, frame7.gameScore());

    Frame frame9 = new Frame(frame8);
    frame9.rollBall(8);
    frame9.rollBall(2);
    assertEquals(10, frame9.frameScore());
    assertEquals(139, frame9.gameScore());

    Frame frame10 = new Frame(frame9);
    frame10.rollBall(10);
    frame10.rollBall(10);
    frame10.rollBall(9);
    assertEquals(29, frame10.frameScore());
    assertEquals(178, frame10.gameScore());
    assertEquals(149, frame9.gameScore());
  }

  @Test
  public void sadPath() {
    Frame frame1 = new Frame(null);
    frame1.rollBall(10);
    frame1.rollBall(2);
    assertEquals(10, frame1.frameScore());

    frame1 = new Frame(null);
    frame1.rollBall(6);
    frame1.rollBall(7);
    assertEquals(6, frame1.frameScore());

    frame1 = new Frame(null);
    frame1.rollBall(10);
    frame1.rollBall(2);
    frame1.rollBall(5);
    assertEquals(10, frame1.frameScore());
  }
}
