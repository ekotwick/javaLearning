import java.util.ArrayList;

/**
 * Created by ekotwick on 7/15/17.
 */
// once we have created the customer, we can create the branc h
public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    // we need to initialize the array list
    this.customers = new ArrayList<Customer>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  // before we do anything with the customer, we need to see whether the customer exists
  public boolean newCustomer(String customerName, double initialAmount) {
    if(findCustomer(customerName) == null) { // if the customer does not exist, we create a new one;
      this.customers.add(new Customer(customerName, initialAmount));
      return true;
    }

    return false;
  }

  // now we need to add transactions of the customer
  public boolean addCustomerTransaction(String customerName, double amount) {
    Customer existingCustomer = findCustomer(customerName);
    if(findCustomer(customerName) != null) {
      // if the customer is on file:
      existingCustomer.addTransaction(amount); // here we call a method inside the customer class
      return true;
    }

    return false;
  }
  // this is a private method, used only internally to this class
  private Customer findCustomer(String customerName) {
    for(int i = 0; i < customers.size(); i++) {
      Customer checkedCustomer = this.customers.get(i)
      if(checkedCustomer.getName().equals(customerName)) {
        return checkedCustomer;
      }
    }

    return null;
  }
}
