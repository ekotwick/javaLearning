/*So, we have created the following classes:
1) Monitor
2) Motherboard
3) Case 
4) Resolution 
5) Dimensions 

the monitor HAS-A resolution;
the case HAS-A dimenion;

now we can create another class that has all of these together in one way or another: THE PC CLASS. We do that now.*/

public class PC {
  private Case theCase; // `case` is a reserved keyword
  private Monitor monitor;
  private Motherboard motherboard;

  public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
    this.theCase = theCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public Case getTheCase() {
    return theCase;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }
}

// so this is composition! We have created a class that HAS other classes. 
// so here we have a great advantage over inheritance: you can only inherit from one class at a time, but here we were able to compose from several different classes.