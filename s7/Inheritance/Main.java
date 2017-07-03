// certain kinds of objects have things in common with each other. phones and computers have common features. however they have unique features that distinguish them from each other. 
// so while objects can share characteristics, they also have unique elements. 
// what OOP allows us to do is create objects that draw from the behavior of other objects and share them. 
// we start with actual code.

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal("Animal", 1,1,5,5);
    //now lets make a dog:

    Dog dog = new Dog("Y",8,20,2,4,1,"long");
    dog.eat();
    //-> Dog.eat() is called
    //-> Animal ate something
    // the method was defined on the Animal class, but the Dog was able to do something with it.
    // Further, we were able to override the method. hence the output.

    dog.move(20);
    //-> Animal is moving at speed 20
    // ^^^ before method was overriden
    dog.walk();
    //-> Dog.walk() called
    //-> Animal is moving at speed 5
    dog.run();
    //-> Dog.run() called
    //-> Animal is moving at speed 10

    Fish fish = new Fish("fish",4,4,4,2,2);
    fish.swim(400);
  }
}