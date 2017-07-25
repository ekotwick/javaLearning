public class Monitor {
  private String model;
  private String manufacturer;
  private int size;
  private Resolution nativeResolution; // note that this is a class!! so we need another class. So let's define the class. // this is also an example of composition!
  // the class is part of the class. it is a component

  public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getSize() {
    return size;
  }

  public Resolution getResolution() {
    return nativeResolution;
  }
}