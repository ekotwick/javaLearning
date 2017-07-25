// here is a challenge that embraces all the skills of OOP that we've learned so far

public class Main {

  public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.5, "White");
    double price = hamburger.itemizedHamburger();
    hamburger.addHamburgerAddition1("Tomato", 0.33);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese", 1.12);
    price = hamburger.itemizedHamburger();
    System.out.println(price);

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addHamburgerAddition1("Egg", 5.43);
    healthyBurger.addHealthAddition1("Lentils", 3.41);
    double healthyPrice = healthyBurger.itemizedHamburger();
    System.out.println(healthyPrice);

    DeluxeBurger db = new DeluxeBurger();
    db.addHamburgerAddition1("Tomato", 0.33);
    db.addHamburgerAddition2("Lettuce", 0.75);
    double deluxePrice = db.itemizedHamburger();
    System.out.println(deluxePrice);
  }
}