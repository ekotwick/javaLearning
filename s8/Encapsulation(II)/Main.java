public class Main {

  public static void main(String[] args) {

    Printer printer = new Printer(3,0,false);

    System.out.println(printer.getTonerLevel());
    printer.printPage();
    printer.printPage();
    printer.printPage();
    printer.printPage();
    printer.printPage();
    System.out.println(printer.getPagesPrinted());
    printer.fillToner(10);
    System.out.println(printer.getTonerLevel());
    printer.printPage();
    System.out.println(printer.getTonerLevel());
  }
}