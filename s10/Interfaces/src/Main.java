/**
 * Created by ekotwick on 7/17/17.
 */
public class Main {
  public static void main(String[] args) {
    // here in the main class we need to have an instance of the interface. So we declare a new object of the interface type, and we later set it equal to a class that implements the interface.
    ITelephone myPhone; // NOTE: You CANNOT do the straight identification we used earlier, as in: `ITelephone myPhone = new DeskPhone(123456)`, because what this will do is create a new implementation and override all the functions. Interfaces are abstract, and so they must be declared in the abstract and only later assigned specified implementations.
    myPhone = new DeskPhone(123456);
    myPhone.powerOn();
    myPhone.callPhone(123456);
    myPhone.answer();

    myPhone = new MobilePhone(8888);
    myPhone.powerOn();
    myPhone.callPhone(8888);
    myPhone.answer();
  }
}
