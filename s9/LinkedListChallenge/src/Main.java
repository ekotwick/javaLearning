import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ekotwick on 7/16/17.
 */
// challenge:
  // create a program that implements a playlist for songs
  // the Album class contains a list of songs in an ArrayList
  // Songs from different albums can be added to the playlist and will appear in the order in which they are added
  // the Playlist list has the following options: quit, skip forwards, skip backwards, repeat current song;
  // A song must exist in an album before it can be added to the playlist.
public class Main {

  private static ArrayList<Album> albums = new ArrayList<Album>();

  public static void main(String[] args) {
    Album album = new Album("Storebringer", "Deep Purple");
    album.addSong("Stormbringer", 4.6);
    album.addSong("Love don't mean a thing", 5.4);
    album.addSong("Holy Man", 2.1);
    album.addSong("Hold On", 3.4);
    album.addSong("Lady Double Dealer", 3.6);
    album.addSong("You can't do it right", 3.5);
    album.addSong("High ball shooter", 5.3);
    album.addSong("The gypsy", 6.1);
    album.addSong("Soldier of fortune", 1.2);
    albums.add(album);

    album = new Album("For those about to rock", "AC/DC?");
    album.addSong("For those about to rock", 5.44);
    album.addSong("I put the finger on you", 4.4);
    album.addSong("Let's go", 5.1);
    album.addSong("Inject the venom", 6.5);
    album.addSong("Snowballed", 1.43);
    album.addSong("Evil walks", 7.6);
    albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(0).addToPlayList("You can't do it right", playList);
    albums.get(0).addToPlayList("Holy man", playList);
    albums.get(0).addToPlayList("Speed king", playList);
    albums.get(0).addToPlaylist(9, playList);
    albums.get(0).addToPlaylist(24, playList);

    play(playList);
  }

  private static void play(LinkedList<Song> playlist) {
    ListIterator<Song> listIterator = playlist.listIterator();
    if(playlist.size() == 0) {
      System.out.println("NO songs in playlist");
      return;
    } else {
      System.out.println("Now playing " + listIterator.next().toString());
    }
  }
}
