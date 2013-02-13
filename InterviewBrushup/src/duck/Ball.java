package duck;

public class Ball {
  private Integer pins;

  public Ball(int pins) {
    if (0 <= pins && pins <= 10) {
      this.pins = pins;
    } else {
      this.pins = null;
    }
  }

  public Integer getPins() {
    return pins;
  }
}
