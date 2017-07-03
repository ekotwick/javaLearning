public class Main {

  public static void main(String[] args) {
    // an statement:
    int myVar = 50;
    // the expression is "myVar = 50";
    myVar++; // another expression, not a complete statement.
    System.out.println("This is a statement");

    // statements do not need to be on one line:

    System.out.println("This is" + 
            " another" + 
            " statement");
    // what __terminates__ the statement is a semicolon; it is NOT a function of the line
    int anotherVar = 50;anotherVar--; // you can do this, but it is not good practices.

    //white space is deleted down to one space; spaces are used to clarify the meaning of things; we do not need to put spaces between names, assignment operators, and values; but it is necessary between the declarator keyword and the value.

    if (myVar == 51) {
      System.out.println("code blocks");
    }
  }
}
/*
//-> 
This is a statement
This is another statement
code blocks
[Finished in 0.9s]
*/