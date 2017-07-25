package com.company;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");


  public static void main(String[] args) {
// write your code here
    boolean quit = false;
    startPhone();
    printActions();
    while(!quit) {
      System.out.println("\nEnter action: (6 to show available actions)");
      int action = scanner.nextInt();

      switch(action) {
        case 0:
          System.out.println("\nShutting down");
          quit = true;
          break;

        case 1:
          princtContacts();
          break;

        case 2:
          addNewContact();
          break;

        case 3:
          updateContact();
          break;

        case 4:
          removeContact();
          break;

        case 5:
          queryContact();
          break;

        case 6:
          printActions();
          break;
      }
    }
  }

  private static void updateContact() {
    System.out.println("Enter existing contact name: " );
    String name = scanner.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if (existingContactRecord == null) {
      System.out.println("Contact not found." );
      return;
    }

    System.out.println("Enter new contact name: ");
    String newName = scanner.nextLine();
    System.out.print("Enter new contact phone number: ");
    String newNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newName, newNumber);
    if(mobilePhone.updateContact(existingContactRecord, newContact)) {
    System.out.println("Successfully updated record");
    } else {
      System.out.println("Error updating record.");
    }

  }

  private static void addNewContact() {
    System.out.println("Enter new contact name: ");
    String name = scanner.nextLine();
    System.out.println("Enter phone nmber: ");
    String phone = scanner.nextLine();
    // in this line we use a factory method or convenience method——the 'static' means that it belongs to the class; hence we can call this method on the class itself rather than on any instances. "Static" allows us to do this.
    Contact newContact = Contact.createContact(name, phone);
    if(mobilePhone.addNewContact(newContact)) {
      System.out.println("New contact added: " + new + ", phone = " + phone)
    } else {
      System.out.println("Cannot add, " + name + " already on file");
    }
  }

  private static void printContacts() {
    mobilePhone.printContacts();
    // all we need to know here is a mechanism to print out contacts; we don't need to know about the implementation
  }

  private static void startPhone() {
    System.out.println("Starting phone...");
  }

  private static void printActions() {
    System.out.println("\nAvailable actions:\npress");
    System.out.println("0 - shut down\n" +
                       "1 - print contacts\n" +
                       "2 - add new contact\n" +
                       "3 - update existing contact\n" +
                       "4 - remove contact\n" +
                       "5 - query existing contact\n" +
                       "6 - print list of available actions");
    System.out.println("Choose your action: ");
  }


}
