package duck;

import junit.framework.TestCase;

public class GameTest extends TestCase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  public void testNoSparesNoStrikes() {
    Game game = new Game(populateFramesNoStrikesNoSpares());
    assertNotNull(game.getFrames());
    assertEquals(57, game.getScore());
  }

  public void testNoSparesOneStrike() {
    Game game = new Game(populateFramesOneStrikeNoSpares());
    assertEquals(67, game.getScore());
  }

  public void testNoSparesDoubleStrikes() {
    Game game = new Game(populateFramesDoubleStrikesNoSpares());
    assertEquals(79, game.getScore());
  }

  public void testOneSpareNoStrikes() {
    Game game = new Game(populateFramesNoStrikesOneSpare());
    assertEquals(65, game.getScore());
  }

  public void testTenthFrameStrikeNoSpares() {
    Game game = new Game(populateTenthFrameStrikeNoSpares());
    assertEquals(78, game.getScore());
  }

  public void testPerfectGame() {
    Game game = new Game(populateAllStrikes());
    assertEquals(300, game.getScore());
  }

  public void testAllSpares() {
    Game game = new Game(populateFramesAllSpares());
    assertEquals(150, game.getScore());
  }

  private Frame[] populateFramesNoStrikesNoSpares() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(5), new Ball(4)); // 9
    frames[1] = new Frame(new Ball(7), new Ball(2)); // 9
    frames[2] = new Frame(new Ball(3), new Ball(4)); // 7
    frames[3] = new Frame(new Ball(5), new Ball(0)); // 5
    frames[4] = new Frame(new Ball(0), new Ball(6)); // 6
    frames[5] = new Frame(new Ball(0), new Ball(9)); // 9
    frames[6] = new Frame(new Ball(4), new Ball(3)); // 7
    frames[7] = new Frame(new Ball(2), new Ball(1)); // 3
    frames[8] = new Frame(new Ball(1), new Ball(1)); // 2
    frames[9] = new Frame(new Ball(0), new Ball(0)); // 0
    // total 57
    return frames;
  }

  private Frame[] populateFramesOneStrikeNoSpares() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(10));             // 10 + 7 + 2 = 19
    frames[1] = new Frame(new Ball(7), new Ball(2)); // 9
    frames[2] = new Frame(new Ball(3), new Ball(4)); // 7
    frames[3] = new Frame(new Ball(5), new Ball(0)); // 5
    frames[4] = new Frame(new Ball(0), new Ball(6)); // 6
    frames[5] = new Frame(new Ball(0), new Ball(9)); // 9
    frames[6] = new Frame(new Ball(4), new Ball(3)); // 7
    frames[7] = new Frame(new Ball(2), new Ball(1)); // 3
    frames[8] = new Frame(new Ball(1), new Ball(1)); // 2
    frames[9] = new Frame(new Ball(0), new Ball(0)); // 0
    // total 67
    return frames;
  }

  private Frame[] populateFramesDoubleStrikesNoSpares() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(10));             // 10 + 10 + 3 = 23
    frames[1] = new Frame(new Ball(10));             // 10 + 3 + 4 = 17
    frames[2] = new Frame(new Ball(3), new Ball(4)); // 7
    frames[3] = new Frame(new Ball(5), new Ball(0)); // 5
    frames[4] = new Frame(new Ball(0), new Ball(6)); // 6
    frames[5] = new Frame(new Ball(0), new Ball(9)); // 9
    frames[6] = new Frame(new Ball(4), new Ball(3)); // 7
    frames[7] = new Frame(new Ball(2), new Ball(1)); // 3
    frames[8] = new Frame(new Ball(1), new Ball(1)); // 2
    frames[9] = new Frame(new Ball(0), new Ball(0)); // 0
    // total 79
    return frames;
  }

  private Frame[] populateFramesNoStrikesOneSpare() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(5), new Ball(5)); // 10 + 7 = 17
    frames[1] = new Frame(new Ball(7), new Ball(2)); // 9
    frames[2] = new Frame(new Ball(3), new Ball(4)); // 7
    frames[3] = new Frame(new Ball(5), new Ball(0)); // 5
    frames[4] = new Frame(new Ball(0), new Ball(6)); // 6
    frames[5] = new Frame(new Ball(0), new Ball(9)); // 9
    frames[6] = new Frame(new Ball(4), new Ball(3)); // 7
    frames[7] = new Frame(new Ball(2), new Ball(1)); // 3
    frames[8] = new Frame(new Ball(1), new Ball(1)); // 2
    frames[9] = new Frame(new Ball(0), new Ball(0)); // 0
    // total 65
    return frames;
  }

  private Frame[] populateTenthFrameStrikeNoSpares() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(5), new Ball(4)); // 9
    frames[1] = new Frame(new Ball(7), new Ball(2)); // 9
    frames[2] = new Frame(new Ball(3), new Ball(4)); // 7
    frames[3] = new Frame(new Ball(5), new Ball(0)); // 5
    frames[4] = new Frame(new Ball(0), new Ball(6)); // 6
    frames[5] = new Frame(new Ball(0), new Ball(9)); // 9
    frames[6] = new Frame(new Ball(4), new Ball(3)); // 7
    frames[7] = new Frame(new Ball(2), new Ball(1)); // 3
    frames[8] = new Frame(new Ball(1), new Ball(1)); // 2
    frames[9] = new Frame(new Ball(10), new Ball(5), new Ball(6)); // 21
    // total 78
    return frames;
  }

  private Frame[] populateAllStrikes() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(10));
    frames[1] = new Frame(new Ball(10));
    frames[2] = new Frame(new Ball(10));
    frames[3] = new Frame(new Ball(10));
    frames[4] = new Frame(new Ball(10));
    frames[5] = new Frame(new Ball(10));
    frames[6] = new Frame(new Ball(10));
    frames[7] = new Frame(new Ball(10));
    frames[8] = new Frame(new Ball(10));
    frames[9] = new Frame(new Ball(10), new Ball(10), new Ball(10));
    // total 300
    return frames;
  }

  private Frame[] populateFramesAllSpares() {
    Frame frames[] = new Frame[10];
    frames[0] = new Frame(new Ball(5), new Ball(5));
    frames[1] = new Frame(new Ball(5), new Ball(5));
    frames[2] = new Frame(new Ball(5), new Ball(5));
    frames[3] = new Frame(new Ball(5), new Ball(5));
    frames[4] = new Frame(new Ball(5), new Ball(5));
    frames[5] = new Frame(new Ball(5), new Ball(5));
    frames[6] = new Frame(new Ball(5), new Ball(5));
    frames[7] = new Frame(new Ball(5), new Ball(5));
    frames[8] = new Frame(new Ball(5), new Ball(5));
    frames[9] = new Frame(new Ball(5), new Ball(5), new Ball(5));
    // total 65
    return frames;
  }
}