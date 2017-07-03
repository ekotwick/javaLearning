/* public class Main {

  public static void main (String[] args) {
    // a method allows us to create code once and use it again and again and again.

    // but notice already where we are: `main` is already a method in Java. And everytime the method 'main' is called, the code inside of its blocks will be run.
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    calculateScore();

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    // here's the flow: the code is run lines 7 - 10, then it gtets to 12, jumps down to 22 and executes all the code up to 35; once it finishes there it goes to 14 and resumes the remainder of the code in this method.
  }

  // here we make a new method: it must be within a class but it cannot be within another method
  public static void calculateScore() {
    // 'public static and void' are all keywords; their meaning will be discussed later;

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    if(gameOver) {
      int finalScore = score + (levelCompleted + bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }
}
*/
// BUT THE ABOVE DOESN'T PASS INFORMATION TO THE METHODS; WE CAN REDESIGN THE CODE SUCH THAT IT DOES EXACTLY THAT

public class Main {

  public static void main(String[] args) {
/*    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;*/
    // this ^^ code is unnecessary, as all the work it does——the declaring of variables——is already handled in our method `calculateScore` 

    printScore(true, 800, 5, 100);
    printScore(true, 10000,8,200);

    // here we assign 
    int highScore = calculateScore(true, 800, 5, 100);
    System.out.println("Your high score was " + highScore);

    // calculateHighSchorePositoin is sending back an int; so what we need to do is ensure that we store it in a datatype suitable to what the method will return. hence the int here;
    int a = calculateHighScorePosition(1500);
    displayHighScorePosition("a", a);
    
    int b = calculateHighScorePosition(900);
    displayHighScorePosition("b", b);
    
    int c = calculateHighScorePosition(400);
    displayHighScorePosition("c", c);
    
    int d = calculateHighScorePosition(50);
    displayHighScorePosition("d", d);


  }

  // in the brackets here we pass in the parameters that our code needs in order to run
  // the parameters you pass are only the datatype and the name of the variable:
  // and what we have done is defined what the method needs to run, so we need to pass it those things;
  // these need to match entirely, otherwise we hit an error
  public static void printScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
    }
  }

/*  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
      return finalScore;
    }*/

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("Your final score was " + finalScore);
      return finalScore;
    } else {
      return -1;
    }
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " managed to get into position " + position);
  }

  public static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500 && score < 1000) {
      return 2;
    } else if (score >= 100 && score < 500) {
      return 3;
    } else {
      return 4;
    }
  }
}

// BUT NOTICE that our `printScore` method doesn't return any value. It simply prints to the console. This was by design, of course. the __void__ in the method declaration means, "Do not return any values".
// if we DO want to send data back, then we need to change the `void` keywork to something else. The keyword we change it to is the datatype of the thing that we want to change back. 

// when returning values from a method, we have to be sure that we __always__ return __something__. Notice the method on line 67. It returns something only when `gameOver` is truthy. Hence there will be an error: "missing return statement"; we fix that in the method defined at line 75.