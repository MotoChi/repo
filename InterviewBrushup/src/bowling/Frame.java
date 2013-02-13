package bowling;

public class Frame {
  private int ball1;
  private int ball2;
  private int ball3;
  private int rollCount;
  private Frame next;
  private final Frame previous;

  public Frame(Frame previous) {
    this.previous = previous;
    if (previous != null) {
      previous.setNext(this);
    }
  }

  public void rollBall(int pins) {
    if (rollCount == 0 && pins >= 0 && pins <= 10) {
      ball1 = pins;
    } else if (rollCount == 1 && pins >= 0 && pins <= 10) {
      if (getFrameNumber() == 10 && ball1 == 10 && (ball1 + pins <= 20)) {
        ball2 = pins;
      } else if (ball1 != 10 && (ball1 + pins <= 10)) {
        ball2 = pins;
      }
    } else if (rollCount == 2 && getFrameNumber() == 10 && pins >= 0 && pins <= 10
        && (ball1 == 10 || (ball1 + ball2 == 10)) && (ball1 + ball2 + pins <= 30)) {
      ball3 = pins;
    } else {
      return;
    }
    ++rollCount;
  }

  public int frameScore() {
    int bonus = 0;
    if (ball1 == 10 && next != null) {
      if (next.ball1 == 10 && next.next != null) {
        bonus = next.ball1 + next.next.ball1;
      } else {
        bonus = next.ball1 + next.ball2;
      }
    }
    if (ball1 != 10 && (ball1 + ball2 == 10) && next != null) {
      bonus = next.ball1;
    }
    return ball1 + ball2 + ball3 + bonus;
  }

  public int gameScore() {
    if (previous == null) {
      return frameScore();
    }
    return previous.gameScore() + frameScore();
  }

  public void setNext(Frame next) {
    this.next = next;
  }

  public int getFrameNumber() {
    int count = 1;
    Frame tail = previous;
    while (tail != null) {
      tail = tail.previous;
      ++count;
    }
    return count;
  }
}
