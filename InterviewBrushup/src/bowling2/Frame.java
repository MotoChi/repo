package bowling2;

public class Frame {
  private int ball1PinsKnockedDown;
  private int ball2PinsKnockedDown;
  private int ball3PinsKnockedDown;
  private final int frameNumber;
  private Frame next;
  private final Frame previous;

  public Frame(int frameNumber, Frame previous) {
    this.frameNumber = frameNumber;
    this.previous = previous;
    if (previous != null) {
      previous.setNext(this);
    }
    rollBalls();
  }

  public void setNext(Frame next) {
    this.next = next;
  }

  private void rollBalls() {
    ball1PinsKnockedDown = PinsKnockedDown.getNumberPinsKnockedDown(10);
    if (ball1PinsKnockedDown != 10) {
      ball2PinsKnockedDown = PinsKnockedDown
          .getNumberPinsKnockedDown(10 - ball1PinsKnockedDown);
    } else if (frameNumber == 10 && ball1PinsKnockedDown == 10) {
      ball2PinsKnockedDown = PinsKnockedDown.getNumberPinsKnockedDown(10);
      if (ball2PinsKnockedDown == 10) {
        ball3PinsKnockedDown = PinsKnockedDown.getNumberPinsKnockedDown(10);
      } else {
        ball3PinsKnockedDown = PinsKnockedDown
            .getNumberPinsKnockedDown(10 - ball2PinsKnockedDown);
      }
    }
    if (frameNumber == 10
        && (ball1PinsKnockedDown + ball2PinsKnockedDown) == 10) {
      ball3PinsKnockedDown = PinsKnockedDown.getNumberPinsKnockedDown(10);
    }
  }

  private int frameScore() {
    int bonus = 0;
    if (ball1PinsKnockedDown == 10 && next != null) {
      if (next.ball1PinsKnockedDown == 10 && next.next != null) {
        bonus = next.ball1PinsKnockedDown + next.next.ball1PinsKnockedDown;
      } else {
        bonus = next.ball1PinsKnockedDown + next.ball2PinsKnockedDown;
      }
    }
    if (ball1PinsKnockedDown != 10
        && (ball1PinsKnockedDown + ball2PinsKnockedDown == 10) && next != null) {
      bonus = next.ball1PinsKnockedDown;
    }
    return ball1PinsKnockedDown + ball2PinsKnockedDown + ball3PinsKnockedDown
        + bonus;
  }

  public int gameScore() {
    if (previous == null) {
      return frameScore();
    }
    return previous.gameScore() + frameScore();
  }

  public String toString() {
    if (frameNumber == 10) {
      if (ball1PinsKnockedDown == 10) {
        return String
            .format(
                "Frame: %d   Ball1: %d   Ball2: %d   Ball3: %d   FrameScore: %d   GameScore: %d",
                frameNumber, ball1PinsKnockedDown, ball2PinsKnockedDown,
                ball3PinsKnockedDown, frameScore(), gameScore());
      } else if ((ball1PinsKnockedDown + ball2PinsKnockedDown) == 10) {
        return String
            .format(
                "Frame: %d   Ball1: %d   Ball2: %d   Ball3: %d   FrameScore: %d   GameScore: %d",
                frameNumber, ball1PinsKnockedDown, ball2PinsKnockedDown,
                ball3PinsKnockedDown, frameScore(), gameScore());
      } else {
        return String
            .format(
                "Frame: %d   Ball1: %d   Ball2: %d   FrameScore: %d   GameScore: %d",
                frameNumber, ball1PinsKnockedDown, ball2PinsKnockedDown,
                frameScore(), gameScore());
      }
    } else
      return String.format(
          "Frame: %d   Ball1: %d   Ball2: %d   FrameScore: %d   GameScore: %d",
          frameNumber, ball1PinsKnockedDown, ball2PinsKnockedDown,
          frameScore(), gameScore());
  }

  public static void main(String[] args) {
    Frame previousFrame = null;
    for (int i = 1; i <= 10; ++i) {
      Frame frame;
      if (previousFrame == null) {
        frame = new Frame(i, null);
      } else {
        frame = new Frame(i, previousFrame);
      }
      previousFrame = frame;
      System.out.println(frame.toString());
    }
  }
}
