public class Main {

  public static void main(String[] args) {
    BankAccount bill = new BankAccount();
    // bill.setAccountNumber(12345);
    // System.out.println(bill.getBalance());
    // bill.depositFund(400);
    // System.out.println(bill.getBalance());
    // bill.withdrawFunds(500);
    // System.out.println(bill.getBalance());
    // bill.depositFund(600);
    // System.out.println(bill.getBalance());
    // bill.withdrawFunds(500);
    // System.out.println(bill.getBalance());


    // now, if we wanted to set all the fields, given what we know already about these things, is have as many `setX`lines as there are fields. This leads to a lot of typing. We can shorten that by using constructors. 
    // to make a constructor, we need to go back to the BankAccount class and write a constructor method. We do that over there, and return this:

    BankAccount jill = new BankAccount(111,100,"Jill","j@g.com",123);
    System.out.println(jill.getCustomerName());
    //-> Empty constructor called
    //-> Non-empty constructor called
    //-> Jill

    // with a default values constructor:

    BankAccount d = new BankAccount();
    System.out.println(d.getCustomerName());
    //-> Non-empty  constructor called
    //-> Empty constructor called
    //-> Dingus

    // compare the two orders of the empty and non-empty constructors——this is because `this()` needs to be the first line of any default constructor setter.

    BankAccount e = new BankAccount("bob","b@gm.com",44);
    System.out.println(e.getCustomerName());
    //-> Non-empty  constructor called
    //-> Half-empty constructor called
    //-> bob

    VipCustomer a = new VipCustomer();
    System.out.println(a.getName());
    System.out.println(a.getCreditLimit());
    System.out.println(a.getEmail());
    /*Dork
    10000
    d@d.com*/
    VipCustomer b = new VipCustomer("B", "B@b.com");
    System.out.println(b.getName());
    System.out.println(b.getCreditLimit());
    System.out.println(b.getEmail());
    /*B
    5000
    B@b.com*/
    VipCustomer c = new VipCustomer("C", 4_000, "C@c.com");
    System.out.println(c.getName());
    System.out.println(c.getCreditLimit());
    System.out.println(c.getEmail());
    /*C
    4000
    C@c.com*/
  }
}