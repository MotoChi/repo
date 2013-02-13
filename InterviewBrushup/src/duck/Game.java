package duck;

public class Game {
  private Frame frames[];

  public Game() {
    frames = new Frame[10];
  }

  public Game(Frame frames[]) {
    if (frames.length == 10) {
      boolean allNotNull = true;
      for (Frame frame : frames) {
        if (frame == null || frame.getBall1() == null || frame.getBall1().getPins() == null) {
          allNotNull = false;
        }
      }
      if (allNotNull) {
        this.frames = frames;
      }
    }
  }

  public Frame[] getFrames() {
    return frames;
  }

  public int getScore() {
    int score = 0;
    for (int i=0; i<frames.length; ++i) {
      if (frames[i] != null) {
        score += frames[i].getScore();
      }
      if (i < (frames.length - 1)) {
        if (frames[i].isStrike()) {
          int ball1 = frames[i+1].getBall1().getPins();
          int ball2;
          if (frames[i+1].isStrike()) {
            ball2 = frames[i+2].getBall1().getPins();
          } else {
            ball2 = frames[i+1].getBall2().getPins();
          }
          score += ball1 + ball2;
        } else if (frames[i].isSpare()) {
          score += frames[i+1].getBall1().getPins();
        }
      }
    }
    return score;
  }
}
