import java.util.ArrayList;

/**
 * Created by ekotwick on 7/4/17.
 */
public class GroceryList {
  private int[] myNumbers;
  // we need to tell Java what kind of object we put into our arrays list; we do that by putting the things in the brackets;
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addGroceryItem(String item) {
    // not we want to save the item to the ArrayList;
    // how do we do that?  We call a method that's part of the ArrayList class:
    groceryList.add(item);
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items in your grocery list");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println((i+1) + ". " + groceryList.get(i));
    }
  }

  public ArrayList<String> getGroceryList() {
    return groceryList;
  }

  public void modifyGroceryItem(String newItem) {
    int position = findItem(newItem);
    if (position >= 0) {
      modifyGroceryItem(position, newItem);
    }
  }

  // now let's update the list:
  private void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position, newItem);
    System.out.println("Grocery item " + (position + 1) + " has been modified");
  }

  public void removeGroceryItem(String item) {
    int position = findItem(newItem);
    if (position >= 0) {
      removeGroceryItem(position);
    }
  }

  private void removeGroceryItem(int position) {
    String theItem = groceryList.get(position);
    groceryList.remove(position);
  }

  public int findItem(String searchItem) {
    return groceryList.indexOf(searchItem);
//    // this will give us a bool; which we can't use to return the item
//    boolean exists = groceryList.contains(searchItem);
//    // this code allows us to return the item we want to return
//    int position = groceryList.indexOf(searchItem);
//    if (position > 0) {
//      return groceryList.get(position);
//    }
//    return null;
  }
}
