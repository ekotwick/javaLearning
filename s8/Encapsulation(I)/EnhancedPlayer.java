public class EnhancedPlayer {
  private String name;
  private int health = 100; // here we define a default value for our health
  private String weapon;

  public EnhancedPlayer(String name, int health, String weapon) {
    this.name = name;
    if(health > 0 && health <= 100) { // here we have some validation; we won't create an object without the correct health;
      this.health = health;
    } 
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    this.health -= damage;
    if (this.health <= 0) {
      System.out.println("Player knockec out");
      // reduce # lives remaining for player
    }
  }

  public int getHealth() {
    return health;
  }
}