package JacksonExample;

import java.util.Arrays;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private Address address;
  private PhoneNumber[] phoneNumbers;

  public Person() {
  }

  public Person(String firstName, String lastName, int age, Address address, PhoneNumber[] phoneNumbers) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
    this.phoneNumbers = phoneNumbers;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setPhoneNumbers(PhoneNumber[] phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", lastName=" + lastName
        + ", age=" + age + ", address=" + address + ", phoneNumbers="
        + Arrays.toString(phoneNumbers) + "]";
  }
}
