// here we deal with floating point numbers; 
// float is single precision
// and double has double precision

// we should default to using doubles, because Java defaults to it.
// 3 reasons to use it:
//  1) it's faster
//  2) in-built java functions use it
//  3) it's more precise  

public class Main {

  public static void main(String[] args) {
    int myIntValue = 5;
    float myFloatValue = 5f; // this is a single precision number; 

    // either of these are acceptable ways to declare a double; the second one,  commented out, will automatically be evaluated to a float value;
    double myDoubleValue = 5d;
    // double myDoubleValue = 5.25;

    // how to convert something to a float;
    // float myNewFloat = (float) 5.25;
    // float myNewFLoat = 5.4f; 
    // either is acceptable;

    System.out.println("myIntValue = " + myIntValue);
    //-> 5
    System.out.println("myFloatValue = " + myFloatValue);
    //-> 5.0
    System.out.println("myDoubleValue = " + myDoubleValue);
    //-> 5.0

    int myNewInt = 5/2;
    System.out.println("myNewInt = " + myNewInt);
    //-> 2
    // this doesn't take into account the remainders
    float myNewFloat = 5f / 2f;
    double myNewDouble = 5d / 2d;
    System.out.println(myNewFloat);
    //-> 2.5
    System.out.println(myNewDouble);
    //-> 2.5

    float mySecondFloat = 5f / 3f;
    double mySecondDouble = 5d / 3d;
    System.out.println(mySecondFloat);
    //-> 1.6666666
    System.out.println(mySecondDouble);
    //-> 1.6666666666666667
    // hence the differnce in precision;

    // conver pounds to kilos

    double numPounds = 200d;
    double convertedKilos = numPounds * 0.45359237d;
    System.out.println("Kilos = " + convertedKilos);

    // we can use underscores for doubles as the other numbers:
    double pi = 3.14_59_27d;
    System.out.println(pi);
  }
}