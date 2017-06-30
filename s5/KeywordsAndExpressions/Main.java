public class Main {

  public static void main(String[] args) {
    // java has 53 reserved keywords reserved for the operation of java;
    // here's a list of them all:
    // https://en.wikipedia.org/wiki/List_of_Java_keywords

    // expressions are building blocks of all java programs. they are built with values, variables, and operators. 

    // so lets have an expression to convert miles to kilometers.

    double kilos = (100 * 1.609344);
    // the expression is the thing on the right side of the assignment operator + the name to which the value is being assigned; with the addition of the `double` keyword on the left side, we have a valid Java statement.
    int highScore = 50;
    if (highScore == 50) { // the thing in the brackets is an expression
      System.out.println("This is an expression");
    }

    // notice that the keyword and the semi-colon are not part of the expression; essentially, whatever forms part of the grammer of the statement is not part of the expression.

  }
}