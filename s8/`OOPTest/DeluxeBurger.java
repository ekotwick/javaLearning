// this burger comes with a drink and chips but no additional sides are allowed. So how do we do that here??

public class DeluxeBurger extends Hamburger {
  // we have no extra fields, because there is nothing to add for this burger;
  // so we go right on to the constructor
  public DeluxeBurger() {
    super("Deluxe", "Sausage & Bacon", 14.54, "White"); // these are hard-coded

    // but what do we do about the sides? We could add extra methods for this; however, if the item comes automatically with those extras, then we could just invoke the addExtra methods directly in the constructor, which then creates a fully loaded option direcly out of the gate;
    super.addHamburgerAddition1("Chips", 2.75);
    super.addHamburgerAddition2("Drink", 1.81);
  }

  // now, how do we eliminate the addition methods of the super class. how do we prevent the methods being called?
  // easy: we simply override the methods, which instead of returning a value print out a statement that the operation cannot be done;

  @Override
  public void addHamburgerAddition1(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }

  @Override
  public void addHamburgerAddition4(String name, double price) {
    System.out.println("Cannot add additional items to deluxe burger");
  }
}