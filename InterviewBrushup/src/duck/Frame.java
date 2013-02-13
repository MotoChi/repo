package duck;

public class Frame {
  private Ball ball1 = null;
  private Ball ball2 = null;
  private Ball ball3 = null;
  private final int totalPins = 10;
  private boolean strike = false;
  private boolean spare = false;

  public Frame(Ball ball1, Ball ball2) {
    if (ball1 != null && ball2 != null && ball1.getPins() != null && ball2.getPins() != null) {
      if ((ball1.getPins() != 10) && (ball1.getPins() + ball2.getPins() <= totalPins)) {
        this.ball1 = ball1;
        this.ball2 = ball2;
        if (ball1.getPins() + ball2.getPins() == totalPins) {
          this.spare = true;
        }
      }
    }
  }

  // strike!
  public Frame(Ball ball1) {
    if (ball1 != null && ball1.getPins() != null && ball1.getPins() == 10) {
      this.ball1 = ball1;
      this.ball2 = null;
      this.strike = true;
    }
  }

  // 10th Frame Strike
  public Frame(Ball ball1, Ball ball2, Ball ball3) {
    if (ball1 != null && ball1.getPins() != null && ball1.getPins() == 10) {
      if (ball2 != null && ball2.getPins() != null) {
        if (ball3 != null && ball3.getPins() != null) {
          this.ball1 = ball1;
          this.ball2 = ball2;
          this.ball3 = ball3;
        }
      }
    } else if (ball1 != null && ball1.getPins() != null && ball2 != null && ball2.getPins() != null && (ball1.getPins() + ball2.getPins() == 10)) {
      if (ball3 != null && ball3.getPins() != null) {
        this.ball1 = ball1;
        this.ball2 = ball2;
        this.ball3 = ball3;
      }
    }
  }

  public Ball getBall1() {
    return ball1;
  }

  public Ball getBall2() {
    return ball2;
  }

  public boolean isStrike() {
    return strike;
  }

  public boolean isSpare() {
    return spare;
  }

  public int getScore() {
    int score = 0;
    if (ball1 != null && ball1.getPins() != null) {
      score += ball1.getPins();
    }
    if (ball2 != null && ball2.getPins() != null) {
      score += ball2.getPins();
    }
    if (ball3 != null && ball3.getPins() != null) {
      score += ball3.getPins();
    }
    return score;
  }
}
