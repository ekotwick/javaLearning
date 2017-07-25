/**
 * Created by ekotwick on 7/18/17.
 */
public class Main {

  public static void main(String[] args) {
    FootballPlayer joe = new FootballPlayer("Joe");
    BaseballPlayer pat = new BaseballPlayer("Pat");
    SoccerPlayer tim = new SoccerPlayer("Tim");

    Team adelaideCrows = new Team("Adelaide Crows");
    adelaideCrows.addPlayer(joe);
    adelaideCrows.addPlayer(pat);
    adelaideCrows.addPlayer(tim);
    // we have added different kinds of atheletes to the same team; what can we do to avoid encountering this problem? We avoid it by creating a generics class;

    Team<FootballPlayer> lions = new Team("Lions");
    // now this team will only accept football players
    lions.addPlayer(joe);
  }
}
