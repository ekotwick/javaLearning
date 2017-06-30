public class Main {

  public static void main(String[] args) {
    // strings are not primitives, but they might as well be. a string is a sequence of characters.

    String myString = "This is a string"; // notice that we use double quotes for the string, but single quotes for the char.
    System.out.println(myString);
    //-> This is a string

    myString = myString + ", and this is more";
    System.out.println(myString);
    //-> This is a string, and this is more

    // so we can manipulate variables in ways like we can with JavaScript

    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println(lastString);
    //-> 1050;

    // So we see that we have type coersion in Java. The integer was coerced into a string. 

    // before we can get into detail about manipulating strings, we need to know more about classes.

    // strings are not primitives; they are CLASSES. 
  }
}

// the next video is about operators. 