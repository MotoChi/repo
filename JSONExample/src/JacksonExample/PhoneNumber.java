package JacksonExample;

public class PhoneNumber {
  private String type;
  private String number;

  public PhoneNumber() {
  }

  public PhoneNumber(String type, String number) {
    this.type = type;
    this.number = number;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "PhoneNumber [type=" + type + ", number=" + number + "]";
  }
}
