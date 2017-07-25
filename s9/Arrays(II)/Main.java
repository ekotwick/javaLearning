public class Main {

  public static void main(String[] args) {
    int[] arr = {106,26,81,5,15}; 
    int[] sorted = sortIntegers(arr);
    printArray(sorted);
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + " contents " + array[i]);
    }
  }

  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      sortedArray[i] = array[i];
    }
// there are easier ways to sort the array than the one we looked at just now; for instances:
    
    // int[] sortedArray = Arrays.copyOf(array, array.length);
    boolean flag = true;
    int temp;
    while(flag) {
      flag = false;
      for(int i = 0; i < sortedArray.length - 1; i++) {
        // we are sorting in descending order, so the largest should be first; so first we check to see if the first element is LESS than the next; if so, they are out of order; if so, we need to move them around;
        if(sortedArray[i] < sortedArray[i+1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = temp;
          flag = true; // we encountered a step where there was something out of order, so we changed the order; we need now to reevaluate things to see if anything else is out of order; so we set the flag to true (== UNSORTED) and go one more time
        }
      }
    }

    return sortedArray;
  }
}

// TO SORT: we want to do the following:
// 1) create a result array --> line 14;
// 2) copy the contents of our array into the result array; we do this with the for statement
// 3) create the sorting algorithm; we begin by assuming that the while loop is UNSORTED: hence the flag is true; inside the while loop we will go through a for loop; if the forloop succeeds in sorting, we set the flag to false; else we reset it to true and continue with the while loop