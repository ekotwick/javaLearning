/**
 * Created by ekotwick on 7/17/17.
 */
public abstract class Bird extends Animal implements CanFly {
  public Bird(String name) {
    super(name);
  }

  // this and the following method define how a bird will breathe and eat, which are required by the abstract animal class
  @Override
  public void eat() {
    System.out.println(getName() + " is pecking");
  }

  @Override
  public void breathe() {
    System.out.println("Breathe in/out");
  }
  // this method will require all bird subclasses to implement a fly method, but different extensions of the bird abstract class can implement it differently.

  // we eliminate the method below, because it can happen that other animals that do not relate to birds will want to have a fly method; if we define the fly method here, then we will have to define it in all other classes that want to have a fly method also; so instead we create an interface and then have this class implement the interface
  //  public abstract void fly();

  @Override
  public void fly() {
    System.out.println("Flitting from branch to branch");
  }
}
