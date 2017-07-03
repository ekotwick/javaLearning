// here we begin learning about object oriented programming

// real-world objects have two main things: STATE and BEHAVIOR

// in computing: STATE might be RAM, OS running, harddrive size
// behavior: booting up, moving mouse around, etc. 

// SOFTWARE OBJECTS:
// state is stored in fields (like variables) and control their behavior with methods
// A CLASS: a template for creating objects (a blueprint for making objects);
// `public class Main` is a statement that creates objects in Java
// what benefit to classes give us? there's only so much that can be done with primitives; a class is a kind of datatype: it's a user-defined type, which is way more powerful than a primitive type

public class Main {

  public static void main(String[] args) {
    // here we build an object based on car:
    // we begin by typing a local variable:
    Car porsche = new Car(); // here we created a new car object of the type "porsche";
    // what we did ^^ is create a new data type called "porsche", which is of the type car
    Car holden = new Car(); // now a second car;

    // automatically, these objects `porsche` and `holden` have inherited methods from a more embracing class. 

    // in the other file we have created a method for setting the values of objects created here. now we can do the following:
    porsche.setModel("Carrera");
/*    System.out.println(porsche.model);
    //-> "error: model has private access in Car"
    // so this won't print out as is, because the field is private. to print something out, we need to give our Car class the ability to print something out.*/
    System.out.println(porsche.getModel());
    //-> "Carrera"

  }
}

// `public class Car` is the statement to create an object. 
/*public class Car {
  public static void car(String[] args){

  }
}*/

// note that the above errors: the error is: "class Car is public. It should be delcared in a file named Car.java", so we're going to a new file now...