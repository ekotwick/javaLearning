public class Player {

  // noticed that we used public scope here;
  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    this.health -= damage;
    if (this.health <= 0) {
      System.out.println("Player knockec out");
      // reduce # lives remaining for player
    }
  }

  public int healthRemaining() {
    return this.health;
  }
}