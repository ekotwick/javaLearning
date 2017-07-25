/**
 * Created by ekotwick on 7/17/17.
 */
public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog("dog");
    dog.breathe();
    dog.eat();

    Parrot parrot = new Parrot("parrot");
    parrot.breathe();
    parrot.eat();
    parrot.fly();


    Penguin penguin = new Penguin("penguin");
    penguin.breathe();
    penguin.eat();
    penguin.fly();
  }
}
