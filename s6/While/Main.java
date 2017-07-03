public class Main {

  public static void main(String[] args) {
    int count = 0;
    while (count != 5) {
      System.out.println("Count value is " + count);
      count++;
    }

    // there's another way to write this:

    int secCount = 0;
    while(true) {
      if (secCount == 6){
        break;
      }
      System.out.println("secCount value is " + secCount);
      secCount++;
    }

    // the while true is designed to be infinite until it hits the break, at which point the code is exited. 

    // now, the while loop might not run if the initial condition is false; there's therefore a third while loop, the do-while loop, which will execute at least one time, depending on how it's defined:

    int doCount = 0;
    do {
      System.out.println("doCount value was " + doCount);
      doCount++;
    } while(doCount !=6);

/*    int testCount = 6;
    do {
      System.out.println("doCount value was " + testCount);
      testCount++;
    } while(testCount != 6);
  THIS WILL CAUSE AN INFINITE LOOP!
    */

    int testCount = 5;
    do {
      System.out.println("testCount value was " + testCount);
      testCount++;
    } while(testCount != 6);
    //-> "testCount value was 5";
    testCount = 3;
    do {
      System.out.println("testCount value was " + testCount);
      testCount++;
    } while(testCount != 6);
    //-> testCount value was 3
    //-> testCount value was 4
    //-> testCount value was 5

    int num = 1;
    int total = 0;
    while (total < 5) {
      if (isEvenNumber(num)) {
        System.out.println(num);
        total++;
      } 
      num++;
    }
  }

  public static boolean isEvenNumber(int n) {
    if (n % 2 == 0) {
      return true;
    }
    return false;
  }
}