import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by ekotwick on 7/16/17.
 */
public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
    placesToVisit.add("Sydney");
    placesToVisit.add("Melbourne");
    placesToVisit.add("Brisbane");
    placesToVisit.add("Perth");
    placesToVisit.add("Canberra");
    placesToVisit.add("Adelaide");
    placesToVisit.add("Darwin");

    printList(placesToVisit);
    /*
      Now visiting Sydney
      Now visiting Melbourne
      Now visiting Brisbane
      Now visiting Perth
      Now visiting Canberra
      Now visiting Adelaide
      Now visiting Darwin
    */

    placesToVisit.add(1, "Alice Springs");
    printList(placesToVisit);
    /*
      Now visiting Sydney
      Now visiting Alice Springs
      Now visiting Melbourne
      Now visiting Brisbane
      Now visiting Perth
      Now visiting Canberra
      Now visiting Adelaide
      Now visiting Darwin
     */
    // so we see that "Alice Springs" has been set into the second position

    placesToVisit.remove(4);
    printList(placesToVisit);
    /*
      Now visiting Sydney
      Now visiting Alice Springs
      Now visiting Melbourne
      Now visiting Brisbane
      Now visiting Canberra
      Now visiting Adelaide
      Now visiting Darwin
     */
    // notice that Perth has now been removed

    visit(placesToVisit);

  }

  // notice the use of `next()` in what comes below; we need to use this, because the iterator is not automatically set up to be looking at the first item in the list; so we need to use the `next` to actually begin looking at the first entry
  private static void printList(LinkedList<String> linkedList) {
    Iterator<String> i = linkedList.iterator(); // this is another way of writing a forloop with java, but it's useful for linkedLists with Java
    while(i.hasNext()) { // a way to see that the current node does not point to null
      System.out.println("Now visiting " + i.next()); // `i.next()` is the next value of the current node.
    }
    System.out.println("=================");
  }

  // this method is for adding cities in alphabetical order. so we will use a comnparison method to see which of two strings comes before the other in the alphabet. If the newCity appears before the current city in the alphabet, then we will add the newCity there.
  // NOTICE:
  // this code modifies the object it takes as an argument and returns the modified object. Generally, this is not a good idea. It would be better to clone the linkedList, modify the clone, and return the clone than modify the original.
  private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
    // whereas above we used an Iterator, here we are going to use a ListIterator, which allows for more flexibility
    ListIterator<String> stringListIterator = linkedList.listIterator();

    while(stringListIterator.hasNext()) {
      int comparison = stringListIterator.next().compareTo(newCity);
      // the above `comparison` int is a way to see whether the next value in the list is equal to the city we are looking for. the `compareTo` method will return an integer; 0 indicates that we have an equality.
      if(comparison == 0) {
        // equal, do not add
        System.out.println(newCity + " is already included as a destination");
        return false; // meaning: it was not added;
      } else if (comparison > 0) {
        // newCity should appear before the current one
        stringListIterator.previous(); // notice above we went to the next value; in order to insert *before* this value, we need to go to the previous value, which we do here
        stringListIterator.add(newCity);
        return true; // we return true
      } else if (comparison < 0) {
        // here is the case where the city is in correct order, so we go to the next city.
      }

    }
    stringListIterator.add(newCity); // if we go through the whole thing
    return true;
  }

  private static void visit(LinkedList cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true; // this is to help prevent us from getting into infinite loops. Look up the "tourtoise and hare algorithm"; it's useful for finding out whether we can at all go in the direction that we want to go in.
    ListIterator<String> listIterator = cities.listIterator();

    if(cities.isEmpty()) {
      System.out.println("No cities in itenerary");
    } else {
      System.out.println("Now visiting " + listIterator.next());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch(action) {
        case 0:
          System.out.println("Holiday over");
          quit = true;
          break;
        case 1:
          if(listIterator.hasNext()){
            System.out.println("Now visiting " + listIterator.next());
          } else {
            System.out.println("Reached the end of the list");
          }
          break;
        case 2:
          if(listIterator.hasPrevious()){
            System.out.println("Now visiting " + listIterator.previous());
          } else {
            System.out.println("We are at the start of the list");
          }
          break;
        case 3:
          printMenu();
          break;
      }

    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\n press " );
    System.out.println("0 - to quit \n" +
                      "1 - go to next city\n" +
                      "2 - go to previous cirty\n" +
                      "3 - print menu options");
  }
}
