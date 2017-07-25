import java.util.ArrayList;

/**
 * Created by ekotwick on 7/17/17.
 */
public class Gearbox {
  private ArrayList<Gear> gears;
  private int maxGears;
  private int currentGear = 0;
  private boolean clutchIsIn;

  public Gearbox(int maxGears) {
    this.maxGears = maxGears;
    this.gears = new ArrayList<>();
    Gear neutral = new Gear(0,0.0);
    this.gears.add(neutral);
  }

  // now we create an inner class:
  // and why do we create a gear class? Because it doesn't make sense to talk about a gear except in the context of a gearbox. The gear is not useful enough in its own right to exist independently, so it exists internally to the gearbox class.
  // now, the Gear class has access to all the methods of the outer Gearbox class.
  // just mind the `this` keyword here. Avoid common names between fields in the enclosing class and nested class.

  public void operateClutch(boolean in) {
    this.clutchIsIn = in;
  }

  public void addGear(int number, double ratio) {
    if(number > 0 && number <= maxGears) {
      this.gears.add(new Gear(number, ratio));
    }
  }

  public void changeGear(int newGear) {
    if(newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
      this.currentGear = newGear;
      System.out.println("Gear " + newGear + " selected.");
    } else {
      System.out.println("Grind!");
      this.currentGear = 0;
    }
  }

  public double wheelSpeed(int revs) {
    if(clutchIsIn) {
      System.out.println("Scream!");
      return 0.0;
    }
    return revs * gears.get(currentGear).getRatio();
  }

  private class Gear {
    private int gearNumber;
    private double ratio;

    public Gear(int gearNumber, double ratio) {

      this.gearNumber = gearNumber;
      this.ratio = ratio;
    }

    public double getRatio() {
      return ratio;
    }

    public double driveSpeed(int revs) {
      return revs * (this.ratio);
    }
  }
}
