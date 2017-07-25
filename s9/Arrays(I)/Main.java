// now we will talk about holding values of the same type, which can be done with Arrays.
// it's a DS that allows you to hold a sequence of values of all the same time.


/*// #####################################################

public class Main {

  public static void main(String[] args) {
    int[] myVariable; // this is the standard definition: the square brackets indicates that we will be building an array here; note that the following syntax is not allowed:
    //    int[] myVariable = 50;
    // 
    // this is because that is not an array! 

    myVariable = new int[10]; // to create a variable of an array, we need to say how many spaces we want our array to have; we do that by passing into the brackets the number of items that we want our array to hold.

    // an alternative would be this:
    int[] intArr = new int[10]; // this makes an array with 10 slots;

    // to access the values:
    intArr[5] = 50; // this saves the value '50' to the 6th position (we start from 0);
    System.out.println(intArr[1]); // -> 0; notice that Java will default to null, but the falsely evuivalent for a given data type;

    char[] charArr = new char[2];
    charArr[0] = 'a';
    System.out.println(charArr[0]); //-> 'a'
    System.out.println(charArr[1]); //-> NUL

    // of course there can be different types.
    double[] dubArr = new double[10];
    System.out.println(dubArr[1]); //-> 0.0

    // here is another way of assigning values to our array, but it works only when we initialize the array:
    int[] intArr2 = {1,2,3,4,5,6,7,8,9};
    System.out.println(intArr2[2]); //-> 3

    // there's even a third way to initailize: a for loop;
    int[] loopArr = new int[10];
    for (int i = 0; i < loopArr.length; i++) {
      loopArr[i] = i*10;
    }
    // we can turn this into a method:
    // for (int i = 0; i < loopArr.length; i++) {
    //   System.out.println("Element " + i + ", value is " + loopArr[i]);
    // }
    printArray(loopArr);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + ", value is " + array[i]);
    }
  }
}

// #####################################################*/

public class Main {

  private static Scanner scanner = new Scanner(System.in); // this is a Java thing; my system cannot find this thing.

  public static void main(String[] args) {
    int[] integers = getIntegers(5);
    for (int i = 0; i < integers.length; i++) {
      System.out.println("Element " + i + ", typed values was " + integers[i]);
    }
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " interger values.\r");
    int[] values = new int[number];

    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }

    return values;
  }

  public static double getAverage(int[] array) {
    int sum = 0;
    for(int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return (double) sum / (double) array.length;
  }
}