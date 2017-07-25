
class Car {
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.wheels = 4;
    this.engine = true;
  }

  public String startEngine() {
    return "Car -> startEngine()";
  }

  public String accelerate() {
    return "Car -> accelerate()";
  }

  public String brake() {
    return "Car -> brake()";
  }

  public boolean getEngine() {
    return engine;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public int getWheels() {
    return wheels;
  }
}

class M extends Car {
  public M(int cylinders, String name) {
    super(cylinders, name); // we inherit from the above values, which have been set to default values;
  }

  @Override
  public String startEngine() {
    return "M -> startEngine()";
  }

  @Override
  public String accelerate() {
    return "M -> accelerate()";
  }

  @Override
  public String brake() {
    return "M -> brake()";
  }
}

class Ford extends Car {
  public Ford(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return "Ford -> startEngine()";
  }

  @Override
  public String accelerate() {
    return "Ford -> accelerate()";
  }

  @Override
  public String brake() {
    return "Ford -> brake()";
  }
}

// this shows another way of printing things out: we are getting the class and then getting the name of the class; this way we don't have to do everything manually.
class Porsche extends Car {
  public Porsche(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate()";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> brake()";
  }
}

public class Main {

  public static void main(String[] args) {
    Car car = new Car(8, "Base car");
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    M m = new M(6, "Outlander");
    System.out.println(m.startEngine());
    System.out.println(m.accelerate());
    System.out.println(m.brake());

    Ford ford = new Ford(6, "Aerostar");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());

    Porsche porsche = new Porsche(6, "Carerra");
    System.out.println(porsche.startEngine());
    System.out.println(porsche.accelerate());
    System.out.println(porsche.brake());
  }
}