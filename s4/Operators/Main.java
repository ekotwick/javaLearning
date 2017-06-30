public class Main {

  public static void main(String[] args) {
    // here we talk about operators. 
    // they are special symbols that operate on operands.
    // some are more frequent than others:

    int result = 1 + 2;
    // we have two operators here; 

    int previousResult = result;

    result = result - 1; //-> 2;

    previousResult = result;

    result = result * 10; // -> 20;

    // and so forth: here are operators:
    /*
      =     assignment
      +     addition
      -     subtraction
      *     multiplication
      /     division (whole numbers only)
      %     remainder
      ++    increment by one
      --    deduct by one
      +=    like JS
      -=    like JS
      *=    like JS
      /=    like JS
      ==    equality
      !=    non-equality
      >     greater than
      >=    greater than or equal to
      <     less than
      <=    less than or equal to
      &&    and
      ||    or
      ? :   terniary operator
    */

    // other operators:

      // http://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

      boolean isAlien = false;
      if (isAlien == true)
        System.out.println("It is not an alien");

      int topScore = 100;
      if (topScore == 100);
        System.out.println("You got the score");

      int secondTopScore = 60;
      if ((topScore > secondTopScore) && (topScore < 101))
        System.out.println("Greater than second and less than 101");
      // it's recommended to put brackets around your conditions in the if statement to make the code easier to reason about. 

      //here's an interesting case:
      boolean isChar = false;
      if (isChar = true)
        System.out.println("this shouldn't happen");
      //-> "this shouldn't happen"

      // why does that happen? Whenever you make an assignment, the return value is always the assigned thing, which is in this case a boolean equivalent to true.
      // in any case, the above isn't good; we should have assignemnts in our if conditional.

      boolean wasChar = isChar ? true : false;
      if (wasChar) 
        System.out.println(wasChar);
      //-> true


      // challenge:
      /*
      double dub1 = 20;
      double dub2 = 80;
      int sumAndMult = (dub1 + dub2) * 25;
      int div = sumAndMult % 40;
      if (div <= 20)
        System.out.println("Total was over the limit");
      
      This throws an error: "Main.java:77: error: incompatible types: possible lossy conversion from double to int
      int sumAndMult = (dub1 + dub2) * 25;"
        */
      double dub1 = 20d; // DO NOT FORGET THE D's!
      double dub2 = 80d;
      double sumAndMult = (dub1 + dub2) * 25;
      double div = sumAndMult % 40;
      System.out.println(div);
      if (div <= 20)
        System.out.println("Total was over the limit");

      // here's a useful resource: 
      // the precedence operator:
      // http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
  }
}