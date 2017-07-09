// LET'S TALK ABOUT THE CLASSES THAT ALL CLASSES INHERIT FROM!

// all classes inherit from `java.lang.Object`: all classes automatically extend this one;
// all things extend Object:
// e.g., `public class Main extends Object {}`

public class Main {

  public static void main(String[] args) {

    Mazda m = new Mazda(36);

    m.accelerate(30);
    //-> Car.setCurrentGear(): Changed to 3 gear.
    //-> Vehicle.move(): Moving at 30 in direction 0 degrees.
    //-> Car.changeVelocity(): Velcity 30 direction 0.
  }
}

/// the next subject is composition. this is something that can be used with or in place of inheritance.

// in s8 we look at the remaining three parts of OOP: compositoin, polymorphism, and encapsulation