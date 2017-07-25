import java.util.ArrayList;

/**
 * Created by ekotwick on 7/15/17.
 */
// now that we have customers and branches, we can make our bank class
public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    // as before, we need to initialize the arraylist
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName) {
    if(findBranch(branchName) == null) {
      this.branches.add(new Branch(branchName)); // here we call the branch constructor, as usual
      return true;
    }

    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double initialAmount) {
    Branch branch = findBranch(branchName);
    if(branch != null) {
      // if the branch exists, we can proceed;
      return branch.newCustomer(customerName, initialAmount);
      // we didn't need to check whether the customer existed here, because that test is already contained in that class
      // this is one of the keys to OOP: validate specific things in the specific area; makes the code lighter and easier to follow
    }

    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
    // so again we test to see whether the branch exists
    Branch branch = findBranch(branchName);
    if(branch != null) {
      return branch.addCustomerTransaction(customerName, amount);
    }

    return false;
  }

  private Branch findBranch(String branchName) {
    for(int i = 0; i < this.branches.size(); i++) {
      Branch checkedBranch = this.branches.get(i);
      if(checkedBranch.getName().equals(branchName)) {
        return checkedBranch;
      }

      return null;
    }
  }

  // now we have a list of customers
  // the second argument here is a boolean, a switch, which determines whether we want to show the transactions & names, or just the transactions
  public boolean listCustomers(String branchName, boolean showTransactions) {
    Branch branch = findBranch(branchName);
    if(branch != null) {

      System.out.println("Customers for branch " + branch.getName());
      // now we need a list of customers that are part of the branch;
      ArrayList<Customer> branchCustomers = branch.getCustomers();
      for(int i = 0; i < branchCustomers.size(); i++) {
        Customer branchCustomer = branchCustomers.get(i);
        System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
        if (showTransactions) {
          System.out.println("Transactions");
          ArrayList<Double> transactions = branchCustomer.getTransactions();
          for(int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j+1) + "] Amount" + transactions.get(j)); // here's another instance of unboxing;
          }
        }
      }
    } else {
      return false;
    }

    return true;
  }
}
