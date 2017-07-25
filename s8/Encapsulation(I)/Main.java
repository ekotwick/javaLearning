// encapsulation allows you to restrict access to certain components in the object that you're creating; in other words, you prevent classes or code outside of the class to access the inner working of the class. 
// this allows you to protect things and make changes to code without breaking things. (Class A access information in Class B through Class B's interface, rather than through it's implementation. This means that we can go into Class B and change how things are implemented without requiring any changes in how Class A access information in Class B. We can go get a whole new breaksystem for a car without having to change how actually to use the breaks, for example.)

// this lesson will proceed in two ways: 
// 1) create a class that doesn't use encapsulation
// 2) create a class that does and therefore show the superiority of the one over the other

public class Main {

  public static void main(String[] args) {
    Player player = new Player();
    // since there is no constructor, we set the values here:
    // and since these variables are public, we can access them here no problem
    player.name = "Tim";
    player.health = 20;
    player.weapon = "Sword";

    int damage = 10;
    player.loseHealth(damage);
    System.out.println("Remaining health: " + player.healthRemaining());

    damage = 11;
    player.loseHealth(damage);
    System.out.println("Remaining health: " + player.healthRemaining());
    // what is the problem with all this? Because we have access to the variables of Player here, we can actually change them here, as for instance with this code:
    player.health = 200;
    // suddenly the player is no longer knocked out.
    // we have taken control about players out of the player's class. Since we access the fields directly, the application can be accessed in ways that you never wanted it to.
    // one way of controlling has been through the constructor. 

    // but there are more issues. Let's say that we make an internal change to our Player class. Say, `public String fullname`. This will cause problems with line 14. 

    // and there's a third issue: we could forget to initialize our variables at all. The constructor ensures that we have a valid class with valid data. 

    // for all these reasons we have encapsulation. 

    // so now we have a proper class with proper encapsulation.

    EnhancedPlayer ePlayer = new EnhancedPlayer("Tim", 50, "Sword");
    System.out.println("Initial Health is " + ePlayer.getHealth()); // the getter here is the only way that we can access the variable from the outside.

    EnhancedPlayer tPlayer = new EnhancedPlayer("Test", 2000, "Sword");
    System.out.println("Initial Health is " + tPlayer.getHealth()); 
    //-> Initial health is 100; this is because have set a default value and validations.

    // by making our fields private, we have ensured that they are not accessible from the outside.

    // you always want to use encapsulation; never expose access of one class to another class.
  }
}