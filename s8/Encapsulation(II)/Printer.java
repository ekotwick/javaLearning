public class Printer {
  private double tonerLevel = 100d;
  private int pagesPrinted = 0;
  private boolean isDuplex;

  public Printer(double tonerLevel, int pagesPrinted, boolean isDuplex) {
    if (tonerLevel >= 0 && tonerLevel <= 100d) {
      this.tonerLevel = tonerLevel;
    }
    if (pagesPrinted >= 0 && pagesPrinted % 1 == 0) {
      this.pagesPrinted = pagesPrinted;
    }
    this.isDuplex = isDuplex;
  }

  public void fillToner(double amount) {
    if (tonerLevel + amount > 100d) {
      tonerLevel = 100d;
    } else {
      tonerLevel += amount;
    }

    // in his code, he often does `return -1`, which is a way of showing that there has been an error created value. So this is a strategy that you can do.
  }

  public void printPage() {
    if (tonerLevel <= 0) {
      System.out.println("Printer out of ink");
    } else {
      pagesPrinted++;
      tonerLevel--;
      System.out.println("Page printed");
    }
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public double getTonerLevel() {
    return tonerLevel;
  }

  public boolean getIsDuplex() {
    return isDuplex;
  }
}