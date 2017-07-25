/**
 * Created by ekotwick on 7/17/17.
 */
public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(getName() + " is eating");
  }

  @Override
  public void breathe() {
    System.out.println("Breathe in/out");
  }
}
