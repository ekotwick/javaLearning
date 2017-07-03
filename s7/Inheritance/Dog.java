// we want Dog to inherit from Animal. How do we do this?? With the `extends` keyword!

/*public class Dog extends Animal {

}*/

// the above is a good guess, but it's erroring. we need to be able to call the constructor class of Animal here in order for it to do anything.; we do that with `super` inside of a Dog constructor
// `super` calls the constructor of the class from which we are inheriting. 
// 

public class Dog extends Animal {

  // these are the unique characteristics that distinguish the dog from the animal
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

/*  public Dog (String name, int brain, int body, int size, int weight) {
    super(name, brain, body, size, weight);
    // the super initializes the animal properties; we need to initialize also the dog properties. 

    // but how should we do this? We need to add all the properties to the constructor parameters, which can make for very long parameters. A way around this is to remove the parameters from the `super` class and provide values for them directly, like the following:
  }*/

  public Dog(String name, int size, int weight, int eyes, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight); // notice the digits here; we removed the variable delcarations from the constructor and put in place values in the super (constructor); hence the super will initialize with these values and we do not need to initialize with values we pass directly to the dog constructor
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  private void chew() {
    System.out.println("Dog.chew() called");
  }

  // here we override the eat() method
  @Override
  public void eat() {
    System.out.println("Dog.eat() is called");
    // the `super.eat()` isn't necessary for overriding a method; it is called here only to compare the output for `dog.eat()` with `animal.eat()`.
    super.eat();
  }

  // now let do something with the move method; dogs have different ways of moving, and one way of distinguishing them is the speed with which the animal is moving.
  public void walk() {
    System.out.println("Dog.walk() called");
    move(5); // if we call `super.move()` here, we are calling the method on the _Animal_ class; what we want, and what we do here, is called the method on the _DOG_ class; hence we have no `super` keyword.
  }

  public void run() {
    System.out.println("Dog.run() called");
    super.move(10); // notice that we use super.move() here: this means: "do not use the move() method used in this class; instead go up to the super class and call the move() method that you find there";
  }

  private void moveLegs(int speed) {
    System.out.println("Dog.moveLegs() called");
  }

  @Override 
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }


}