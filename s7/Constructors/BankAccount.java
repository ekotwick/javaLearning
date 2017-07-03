public class BankAccount {

  private int accountNumber; // the 'account' here is redundant, because the class name already has 'account' in it; hence any fields with 'account' will be superfluous.
  private int balance;
  private String customerName;
  private String emailAddress;
  private int phoneNumber;

  // this is our own constructor method; it allows us initialize an object as we please; the method is called automatically when we create a new object, and the method is called only one time
  public BankAccount() {
    this(444, 0, "Dingus", "d@g.com", 123);
    // always ensure that the default setter is the first statement of this constructor; what `this` does is call another class.
    System.out.println("Empty constructor called");
  }
  // so, as of now, when we create a new object, the above line will be logged to the console. 
  // we can have other constructors as well——we can overload our methods, and our constructors as well!

  public BankAccount(int accountNumber, int balance, String customerName, String emailAddress, int phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;

    // it's considered best practice to set the values in this way rather than by invoking the class setters. The reason for this has to do with inheritance and subclasses: if we invoke the setting of the name with the setter, we can run into problems with subclasses. So set the values directly. 
    System.out.println("Non-empty  constructor called");
  }

  // lets add another constructor, but with fields between all and some

  public BankAccount(String customerName, String emailAddress, int phoneNumber) {
    this(1234,4,customerName,emailAddress,phoneNumber);
    // so this uses default fields for some, custom fields for others.
    System.out.println("Half-empty constructor called");
  }

  // since constructors can be overloaded, we can call one constructor from within another constructor. this is especially useful when we want to set some default values. We do this in the empty constructor above; just be sure that when you do that the `this()` is the FIRST statement in the constructor; errors result otherwise

  public void setAccountNumber(int number) {
    this.accountNumber = number;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setBalance(int number) {
    this.balance = number;
  }

  public int getBalance() {
    return this.balance;
  }

  public void setCustomerName(String name) {
    this.customerName = name;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void depositFund(int amount) {
    this.balance += amount;
    System.out.println(amount + " deposited into account " + this.accountNumber + ". New balance is " + this.balance);
  }

  public void withdrawFunds(int amount) {
    if (amount > this.balance) {
      System.out.println("Withdrawal not permitted; amount exceeds balance");
    } else {
      this.balance -= amount;
    System.out.println(amount + " withdrawn from account " + this.accountNumber + ". New balance is " + this.balance);
    }
  }
}