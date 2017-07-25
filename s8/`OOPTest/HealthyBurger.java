public class HealthyBurger extends Hamburger {
  private String healthyExtra1Name;
  private double healthyExtra1Price;

  private String healthyExtra2Name;
  private double healthyExtra2Price;

  // for this burger, we know already what kind of bread there will be, so the user doesn't have the option of selecting the kind of bread; also, we have the name of the burger; so of the four items from the super constructor, only 2 will be used by the user; the rest will be hard-coded.

  // so notice what we do with the constructor: we hard code in the values.
  public HealthyBurger(String meat, double price) {
    super("Healthy", meat, price, "Brown rye");
  }

  public void addHealthAddition1(String name, double price) {
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
  }

  public void addHealthAddition2(String name, double price) {
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
  }

// now we need to do something about the `itemizedHamburger` class. The itemized hamburger method of the super class has a method like this, but it is designed for a generic hamburger; it does not call on information specific to the healthy hamburger implementation.

  @Override 
  public double itemizedHamburger() {
    double hamburgerPrice = super.itemizedHamburger();
    // what this line ^^ does is call the sum of the regular burger. so all we need to do now is ask for the remaining price for the specialty burger:
    if(this.healthyExtra1Name != null) {
      hamburgerPrice += this.healthyExtra1Price;
      System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }

    if(this.healthyExtra2Name != null) {
      hamburgerPrice += this.healthyExtra2Price;
      System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    return hamburgerPrice;
  }
}