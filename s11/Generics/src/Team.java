import java.util.ArrayList;

/**
 * Created by ekotwick on 7/18/17.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{ // the <T> here indicates that our class accepts a type parameter; whenever we instantiate this class, the type will be provided; when we do this, we need to cast the  type in the addPlayer method below to be a Player type, otherwise the Java compiler doesn't know to run the `getName` method. BUT: the casting in the methods below only need to be done with we do not have bounded-type parameters
  private String name;
  int played = 0;
  int won = 0;
  int lost = 0;
  int tied = 0;

  private ArrayList<T> members = new ArrayList<T>();

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean addPlayer(T player) {
    if(members.contains(player)) {
      System.out.println(((Player) player).getName() + " is already on this team");
      return false; // no players added
    } else {
      members.add(player);
      System.out.println(((Player) player).getName() + " picked for team " + this.name);
      return true;
    }
  }

  public int numPlayers() {
    return this.members.size();
  }

  public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
    if(ourScore > theirScore) {
      won++;
    } else if (ourScore < theirScore) {
      lost++;
    } else {
      tied++;
    }
    played++;
    // the following code is made to update the two teams at the same time; the method passes null to the method, so that we don't wind up in an infinite loop.
    if(opponent != null) {
      opponent.matchResult(null, theirScore, ourScore);
    }
  }

  public int ranking() {
    return (won * 2) + tied;
  }

  @Override
  public int compareTo(Team<T> team) {
    if(this.ranking() > team.ranking()){
      return -1;
    } else if (this.ranking() < team.ranking()) {
      return 1;
    } else {
      return 0;
    }
  }
}
