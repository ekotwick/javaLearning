// the term `public` is an access modify that determines what access we want to give others to the class that we are creating. `public` means "unrestricted access to the class". Other modifiers include: `private` and `protected`: the former means no other class can access it; the latter means that classes inside this package can access it. 

/*
public class Car {

}*/

// above there are no variables. we need to give it variables. the variables we declare inside the blocks are accessible to that class alone. they are known as "class" or "member" variables, or commonly called "fields". 
// when you delcare a variable, you need to give an access modifier as done for classes. 
// as a general rule, when you declare variables: we use the `private` access modifier.

// the reason we do this has to do with __encapsulation__. In Java, encapsulation hides variables and methods from those outside the object's definition. So only objects have access to the data and methods:

public class Car {

  // these variables are the STATE components of the object
  // we are defining the state as fields, in this case 5.
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;
  // the default state for state and fields is `null`. 
  // what's very interesting about these fields is that they are also classes in their own right. so `Car` is a class with classes inside of it.

  // so now we need to create an object from this blueprint. 
  // to do this, we need to go back to Main.java and the main method of it.
  // in that file we create a new object: Car porsche = new Car();

  // now that we have done that, we want to give the object in Main access to the state we have defined here. One way to do that would be to change all the `private` keywords above to `public` keywords; But that is bad practice and violates encapsulation. Instead we do the following: we create a method, which become attached to all objects.

  // we want methods to update the model:
  // we use the `public` keyword so that other classes can access the method (e.g., the main class); we use the `void` keyword because we don't want our method to return anything; and we use the `this` keyword to distinguish the `model` field from the `model` parameter.

  // public void setModel(String model) {
  //   this.model = model;
  // }

  // ^^ that's a `setter`
  // let's create a `getter` vv:
  public String getModel() {
    return this.model;
  }

  // now why use getters and setters? The advantage is that we can do some validation., like below:
  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if(validModel.equals("carrera") || validModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }
  }

  // in other words, by not allowed other objects access to the data in our objects, we can protect the data from changes and ensure that we do not make any new objects that are invalid. We build in our validations. 
}

// in the next video we discuss constructors, which are used when the `new` keyword shows up.