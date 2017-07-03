public class Main {

  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    if (score == 5000) {
      System.out.println("Your score was 5000");
    }

    if (score == 5000)
      System.out.println("Your score was 5000");

    // so we see two alternative ways of writing the thing. 
    // however, without the braces, it is necessary to have the code only one line directly beneath the if statement (so it's like JS, the difference being that in JS the code comes immediately after the if statement)

    if (score < 5000) {
      System.out.println("Your score was 5000");
    } else {
      System.out.println("Got here");
    }

    if (score < 5000) {
      System.out.println("Your score less than 5000");
    } else if (score > 5000) {
      System.out.println("Your score greater than 5000");
    } else {
      System.out.println("Your score was 5000");
    }

    // SCOPE:

    if(gameOver == true) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your score was " + finalScore);
    }
    /*notice that we can declare variables inside of code blocks;
    notice also that we can access values in a larger, embracing code block*/

    // int savedFinalScore = finalScore;
/*     but this code fails, and for this reason: once a code block finishes executing, the code inside the block is deleted, so any variables decalred inside the block are lost.*/

    if(gameOver) { // a shortcut, and it tests to see if the value is truthy
      System.out.println("Your score was 5000");
    }

    // a method is used to reduce duplication. what it does is take the idea of a code block to the next level. 
  }
}