// this video talks about Chars and Booleans

public class Main {
  public static void main(String[] args) {
    char myChar = 'D'; // this is a character literal. you can put whatever you want in between the quotes, but you can only put ONE character; otherwise an error will be thrown.
    // you can also put unicode characters in there
    char myUnicode = '\u00A9';

    // http://unicode-table.com/en/#control-character

    System.out.println(myUnicode);

    boolean myTrue = true; 
    boolean myFalse = false;
  }
}