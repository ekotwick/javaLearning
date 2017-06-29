public class Main {

  public static void main(String[] args) {
    int myMinValue = -2_147_483_648; // the smallest number that can fit in an integer
    int myMaxValue = 2_147_483_647; // the largest number that can fit in an integer
    // use underscores to make the integer more readable: 2_147_483_647
    // the numbers here are known as "literals". literals because they are not variables.

    int myTotal = myMinValue/2; // no problems here.
    System.out.println("myTotal = " + myTotal);

    byte myByteMin = -128; // byte values is allocated much smaller amount of space; 
    byte myByteMax = 127; // this is more efficienct, because it takes about 1/4 of the space for a byte. the computer is simply allocated less space for bytes than for integers

     // This will error! Why? Because expressions are defaulted to ints, yet I am telling the computer to evaluate the expression to a byte. This is bad and a problem, so the thing on the right *is not an int*. Check the linter to see that an error will occur when trying to execute this line.
    // byte myNewByteValue = (myByteMin/2);

    // to make java treat the above as a byte, we need to do something called CASTING:
    byte myNewByteValue = (byte) (myByteMin/2);
    System.out.println("myNewByteValue = " + myNewByteValue);
    

    short myShortMin = -32768;
    short myShortMax = 32767; // a short gets about 2x the space of a byte and about half the space of an int;

    long myLongValue = 100L; // the "L" is necessary at the end to make it clear that it's a long; we can store a value that's 2^63;

    byte t1 = 20;
    short t2 = 30_000;
    int t3 = 3_000_000;
    // long t4 = (long) 5000 + 10 * (t1 + t2 + t3); don't forget the "L"s!
    long t4 = 5000L + 10L * (t1 + t2 + t3);
    // the lesson here is that it's not necessary to cast upwards to longs, which will accept integer values 
    // and if we were to cast expressions, we need to place the whole expressions into brackets:
    short t5 = (short) (1 + 10 * ((t1 / 2) + (t2 / 10) + (t3 / 1000000)));
    System.out.println(t4);
    System.out.println(t5);
  }
}

// int:   has a width of 32
// byte:  has a width of 8
// short: has a width of 16
// long:  has a width of 64

// these are the four data types in Java that deal with numbers. 

// generally, you will choose int by default.