import java.util.ArrayList;

/**
 * Created by ekotwick on 7/16/17.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello");
    Customer customer = new Customer("A", 54.96);
    Customer anotherCustomer;
    anotherCustomer = customer;
    anotherCustomer.setBalance(12.18);
    System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance()); //-> 12.18
    // how does it happen that the reassignment on line 10 affects what happens on line 12? We say that `anotherCustomer` and `customer` are the same——something happens in memory that affects this! What happens on line 10 is that we have assigned `anotherCustomer` to the memory position of `customer`; _no new class was created_ in that line. So, when we use the methods on `anotherCustomer`, we are using methods on `customer` also.

    ArrayList<Integer> intList = new ArrayList<Integer>();

    intList.add(1);
    intList.add(3);
    intList.add(4);

    for(int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }
    //->
    /*
      0: 1
      1: 3
      2: 4
     */

    intList.add(1, 2); // what this does is add the element 2 at index 1;

    for(int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }
    //->
    /*
      0: 1
      1: 2
      2: 3
      3: 4
     */

    // so what happens is that our `intList.add(1,2)` added a new item to the array rather than overwrote the element at an index. So we shifted all other items down.
    // enter the value of LinkedLists.
  }
}
