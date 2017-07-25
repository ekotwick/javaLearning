package com.company;

/**
 * Created by ekotwick on 7/9/17.
 */
public class Contact {
  private String name;
  private String phoneNumber;

  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  // the static here is important: it means we don't have to create a new instance of this object class to make new objects of this type
  public static Contact createContact(String name, String phoneNumber) {
    // what it does is call the constructor.
    return new Contact(name, phoneNumber);
  }
}
