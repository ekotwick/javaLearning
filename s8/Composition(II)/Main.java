/*        // composition is another component of OOP;

        // the relationship underlying inheritance is the IS-A  relationship

        // composition focuses on another underlying relationship: HAS-A

        // let's now start making instances:

public class Main {

  public static void main(String[] args) {
    Dimensions dismensions = new Dimensions(20,20,5);
    Case theCase = new Case("220B", "Dell", "240", dismensions);

    Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BF-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);

            // so with this we built all the things that we needed to build in order to build a PC. But now we have the question: how do we access the methods that belonged to each class in the PC class? As we don't have any `super` class, we don't have anything to inherit from. 
            // HERE IS ONE WAY:
    thePC.getMonitor().drawPixelAt(1500, 1200, "red");
    thePC.getMotherboard().loadProgram("Windows 1.0");
    thePC.getTheCase().pressPowerButton();
            // how does this work? Look to `thePC` class. You see that it has as an attribute a `monitor`. That, of course, is a class. So we can call the `getMonitor()` getter on our `PC` class, which returns that class, and then call the `drawPixelAt` function that belongs to the `Monitor` class. Same with the second example:
  }
}*/


// The above code gave the main component a lot of access to the methods of the different components. In this excerise we introduce a fair amount of data privacy to the scenario. We do that by modifying the code from `Composition(I)`.

public class Main {

  public static void main(String[] args) {
    Dimensions dismensions = new Dimensions(20,20,5);
    Case theCase = new Case("220B", "Dell", "240", dismensions);

    Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BF-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);

    thePC.powerUp();
    //-> Power button pressed
    //-> Drawing pixel at 1200,50 in color yellow
    // if you go through the code, you see how all these things are taking place.
  }
}

// AS A RULE, LOOK AT COMPOSITION BEFORE YOU LOOK AT INHERITANCE;