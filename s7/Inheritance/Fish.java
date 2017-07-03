public class Fish extends Animal {

  private int gills;
  private int eyes;
  private int fins;

  public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

    super(name, 1, 1, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }
// remember, something said to be private is accessible ONLY BY THIS CLASS! These can't be access in Main.class!
  private void rest () {

  }

  private void moveMuscles() {
    System.out.println("moveMuscles called");
  }

  private void moveBackFine() {
    System.out.println("moveBackFin called");
  }

  public void swim(int speed) {
    moveMuscles();
    moveBackFine();
    super.move(speed);
  }
}