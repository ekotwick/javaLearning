public class Main {

  public static void main(String[] args) {
    int value = 4;

    switch(value) {
      case 1:
        System.out.println("Valuew as 1");
        break;

      case 2:
        System.out.println("Valuew as 2");
        break;

      // this is for testing multiple values
      case 3:case 4:case 5:
        System.out.println("Valuew as 3 or 4 or 5");
        break;

      default:
        System.out.println("Was not 1 or 2");
        break; //(this break is useful just for precision; it is not necessary to use)
        // the break keyword is important; if you do not use it, you arrive with unpredictable results;
    }

    char cVal = 'f';

    switch(cVal) {
      case 'a':
        System.out.println("Value is a");
        break;
      case 'b':
        System.out.println("Value is b");
        break;
      case 'c':
        System.out.println("Value is c");
        break;
      case 'd':
        System.out.println("Value is d");
        break;
      default:
        System.out.println("Value is neither a nor b nor c nor d");
        break;
    }

    String month = "JANURAY";
    System.out.println(month.toLowerCase());
    System.out.println(month);
  }
  // switch is good where you're testing one variable and differences in that variable; it is not used for testing across multiple variables
}

// NOTE: the switch statement can be used with BYTE SHORT CHAR and INT and STRING