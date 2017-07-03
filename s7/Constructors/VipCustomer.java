public class VipCustomer {
  private String name;
  private int creditLimit;
  private String email;

  public VipCustomer() {
    this("Dork",10_000,"d@d.com");
  }

  public VipCustomer(String name, String email) {
    this(name, 5_000, email);
  }

  public VipCustomer(String name, int creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public int getCreditLimit() {
    return this.creditLimit;
  }

  public String getEmail() {
    return this.email;
  }
}