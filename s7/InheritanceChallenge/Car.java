public class Car extends Vehicle {

  private int wheels;
  private int doors;
  private int gears;
  private boolean isManual;

  private int currentGear;

  public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.isManual = isManual;
    this.currentGear = currentGear;
    this.currentGear = 1; // because all cars begin in first gear;
  }

  public void setCurrentGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
  }

  public void changeVelocity(int speed, int direction) {
    move(speed, direction);
    System.out.println("Car.changeVelocity(): Velcity " + speed + " direction " + direction + ".");
  }

  // the vehicle class has a stop method, but we want to override that method in the specific car class;
}