import java.util.ArrayList;

/**
 * Created by ekotwick on 7/15/17.
 */

// since this is the most basic class, it's good to start here; especially as all other code depends on this thing
public class Customer {
  private String name;
  private ArrayList<Double> transactions;

  public Customer(String name, double initialAmount) {
    this.name = name;
    // we need to initialze our ArrayList before we can add anything to it:
    this.transactions = new ArrayList<Double>();
    addTransaction(initialAmount);

  }

  public String getName() {
    return name;
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }

  public void addTransaction(double amount) {
    this.transactions.add(amount); // this converts from a primitive to an array list type
  }
}
