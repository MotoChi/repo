package JacksonExample;

public class Address {
  private String streetAddress;
  private String city;
  private String state;
  private String postalCode;

  public Address() {
  }

  public Address(String streetAddress, String city, String state, String postalCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  @Override
  public String toString() {
    return "Address [streetAddress=" + streetAddress + ", city=" + city
        + ", state=" + state + ", postalCode=" + postalCode + "]";
  }
}
