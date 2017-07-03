public class Vehicle {
  private String name;
  private int size;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle() {
    this("Unknown",1);
  }

  public Vehicle(String name, int size) {
    this.name = name;
    this.size = size;

    this.currentDirection = 0;
    this.currentVelocity = 0;
  }

  public void steer(int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
  }

  public void move(int velocity, int direction) {
    currentVelocity = velocity;
    currentDirection = direction;
    System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection + " degrees.");
  }

  public void stop() {
    this.currentVelocity = 0;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public int getDirection() {
    return currentDirection;
  }

  public int getVelocity() {
    return currentVelocity;
  }

}