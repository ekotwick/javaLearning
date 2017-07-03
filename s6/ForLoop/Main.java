public class Main {

  public static void main(String[] args) {
    System.out.println("10,000 at 2% interests is " + calculateInterest(10000, 2));

/*    for (init; termination; incremet) {

    }
    this is the basic structure of Java's for loop
    */

    for (int i=0; i<9; i++) {
      System.out.println("10,000 at " + i + "% interests is " + calculateInterest(10000, i));
    }
    // NOTE: this variable exists only in this code block;

    for (int i=0; i<9; i++) {
      System.out.println("10,000 at " + i + "% interests is " + calculateInterest(10000, (double) i));
    }
    // notice what is happening at the method invocation on line 19: we are casting the variable, declared on line 17 to be an integer, to be a double.

    // notice also that for both of these loops, we are getting this for the 7% interest rate: "10,000 at 7% interests is 700.0000000000001"; we can fix that with the following method:

    for (int i=0; i<9; i++) {
      System.out.println("10,000 at " + i + "% interests is " + String.format("%.2f",calculateInterest(10000, (double) i))); // what this does is set the output format to have two decimal values. the command, in other words, says to convert the format.
    }

    for (int i = 8; i >= 0; i--) {
      System.out.println("10,000 at " + i + "% interests is " + String.format("%.2f",calculateInterest(10000, (double) i)));
    }


    int count = 0;
    for (int i = 0; i < 100; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        count++;
      }
      if (count >= 3) {
        break;
      }
    }
  }

  // first create a new method
  public static double calculateInterest(double amount, double interestRate) {
    return(amount * (interestRate / 100));
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }

    for (int i = 2; i < n/2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}