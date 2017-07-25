import java.util.Scanner;

/**
 * Created by ekotwick on 7/17/17.
 */
public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static Button btnPrint = new Button("Print");

  public static void main(String[] args) {
    // in our example, our `Gear` class is a member of the `Gearbox` class and so needs to be instantiated with it.

    // ILLUSTRATION OF NESTED CLASS
    Gearbox mcLaren = new Gearbox(6);
    mcLaren.addGear(1,5.3);
    mcLaren.addGear(2, 10.6);
    mcLaren.addGear(3, 15.9);
    mcLaren.operateClutch(true);
    mcLaren.changeGear(1);
    mcLaren.operateClutch(false);
    System.out.println(mcLaren.wheelSpeed(1000));
    mcLaren.changeGear(2);
    System.out.println(mcLaren.wheelSpeed(4000));

    // ILLUSTRATION OF LOCAL CLASS
    class ClickListener implements Button.OnClickListener {
      public ClickListener() {
        System.out.println("I've been attached");
      }

      @Override
      public void onClick(String title) {
        System.out.println(title + " was clicked");
      }
    }

    btnPrint.setOnClickListener(new ClickListener());
    // so what we have done here is create an instance of a class here inside this code block and then assigned that class to the button class using a method written for the method class that does nothing else but assign other classes to it.
    listen();

    // ILLUSTRATION OF AN ANONYMOUS CLASS
    btnPrint.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick(String title) {
        System.out.println(title + " was clicked anonymous");
      }
    });
    listen();
  }

  private static void listen() {
    boolean quit = false;
    while(!quit) {
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
        case 0:
          quit = true;
          break;
        case 1:
          btnPrint.onClick();
      }
    }
  }

}
