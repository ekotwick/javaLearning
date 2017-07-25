/**
 * Created by ekotwick on 7/17/17.
 */
public class Penguin extends Bird {
  public Penguin(String name) {
    super(name);
  }

  @Override
  public void fly() {
    super.fly();
    System.out.println("Cannot fly");
  }
}
