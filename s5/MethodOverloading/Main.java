// DEFINITION
// METHOD OVERLOADING
// we use the same method name, but with different parameters

public class Main {

  public static void main(String[] args) {
    int newScore = calculateScore("ME", 500);
    System.out.println("New score is " + newScore);
    calculateScore(75);

    System.out.println(calcFeetAndInchesToCentimeters(5, 12));
    System.out.println(calcFeetAndInchesToCentimeters(72));
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  // lets overload calculateScore:

  public static int calculateScore(int score) {
    System.out.println("Unnamed player scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("No player name, no player score.");
    return 0;
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || (inches < 0 || inches > 12)) {
      return -1;
    } else {
      double centimeters = ((feet * 12) + inches) * 2.54;
      return centimeters;
    }
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }
    return inches * 2.54;
  }
}
/*OUTPUT:
Player ME scored 500 points
New score is 500000
Unnamed player scored 75 points*/

// the main lesson: in order to have the same method names, we need to adjust the method signiture. 

// but the criticial thing is the number of parameters! You cannot change the return value; that is not sufficient. 

// method overloading is a very common technique in javaworld. 