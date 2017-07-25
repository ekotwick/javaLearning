package com.company;

import java.util.ArrayList;

/**
 * Created by ekotwick on 7/9/17.
 */
public class MobilePhone {
  private String myNumber; // this is for the number of the phon
  private ArrayList<Contact> myContacts; // this is for all the contacts

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    // the phone does not come with contacts; but that doesn't mean we should initialize our arrayList, to which we can always later add items.
    this.myContacts = new ArrayList<Contact>;
  }

  public boolean addNewContact(Contact contact) { // we are sending a contact object created outside this method
    if(findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  public void updateContact(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found");
      return false;
    }
    this.myContacts.set(foundPosition, newContact); // this is the updating functionlaity
    System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
    return true;
  }

  private int findContact(contact){
    return this.myContacts.indexOf(contact);
  }

  public boolean removeContact(Contact contact) {
    int foundPosition = findContact(contact);
    if (foundPosition < 0) {
      System.out.println(contact.getName() + ", was not found");
      return false;
    }
    this.myContacts.remove(FoundPosition);
    System.out.println(contact.getName() + ", was deleted.");
    return true;
  }

  private int findContact(String contactName) {
    for(int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);
      if(contact.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

  // our findContacts methods are returning integers, which refer to our array; we don't want to expose this method publicly, because then information about our array is exposed publicly. We want to keep our data structure hidden.
  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public Contact queryContact(String name) {
    int position = findContact(name);
    if(position >= 0) {
      return this.myContacts.get(position);
    }
    return null;
  }

  public void printContacts() {
    System.out.println("Contact list");
    for(int i = 0; i < this.myContacts.size(); i++) {
      System.out.println((i+1) + "." +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
    }
  }


}
