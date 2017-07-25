// POLYMORPHISM:
// the method/mechanism that allows actions to act differently based on the object that the action is being performed on.

// this is best illustrated, and the illustration requires creating a number of classes:
// the illustration will create several classes within the same Main java class; you can do this for classes that are small and won't be reused; it's being used to save time.

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return name;
  }
}

// so we have created one base class here; now we're going to create 5 subclasses that inherit from the above class

class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }

  // notice that we are overriding the super property.
  public String plot() {
    return "A shark eats lots of people";
  }
}

class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  public String plot() {
    return "Aliens attempt to take over planet earth";
  }
}

class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  public String plot() {
    return "Kids try and escape a maze";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  public String plot() {
    return "Imperial Forces try to take over the universe";
  }
}

// this one is a little different;

class Forgettable extends Movie {
  public Forgettable() {
    super("Forgetabl");
  }

  // no plot method is being overrided here; we do this to explain and illustrate polymorphism.
}

// now we create a method that will return a random movie; it is part of the main class

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
    } // the `movie.plot()` is the crucial line for how polymorphism works.
    // when we run this code, we will see various different things logged, and it all comes from `movie.plot()`: we will see different kinds of functionality depending on the kind of object that we're working on——for instance, when we come to `Forgetable Movie`, we have our no plot logged; but in other cases we have the plot method working that belongs uniquely to the object in question.
  }

  public static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 5)  + 1;// the (int) is a casting of a random number to an integer; this will return a random number between 1 and 5
    System.out.println("Random number generated was: " + randomNumber);
    // now we use the switch statement to create random movies:
    switch(randomNumber) {
      case 1: 
        return new Jaws();
      case 2: 
        return new IndependenceDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new Forgettable();
    }

    return null; // this is for catching defaults; it's unnecessary, or at least should be.
    // so, everytime we call this method, we should be getting a new object in return;
  }
}

// polymorphism is used often, because it allows you to write rather generic code.