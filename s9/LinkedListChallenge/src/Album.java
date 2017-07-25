import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ekotwick on 7/16/17.
 */
public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<Song>();
  }

  public boolean addSong(String title, double duration) {
    if(findSong(title) == null) {
      this.songs.add(new Song(title, duration));
      return true;
    }

    return false; // this is an example of validation;
  }

  private Song findSong(String title) {
    for(Song checkedSong: this.songs) { // this is the forEach command in Java; this creates a variable for each entry and calls it `checkedSong`, and we can use it as we would normally use it.
      if(checkedSong.getTitle().equals(title)){
        return checkedSong;
      }
    }
    return null;
  }

  // how do we add songs to a playlist? The condition for creating a playlist is that the songs already be on an album. So what we will do is add a method to the Album class that will be able to add songs to a playlist. We will pass our playlist to this method as an argument;
  public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
    int index = trackNumber - 1;
    if (index > 0 && index<= this.songs.size()) {
      playlist.add(this.songs.get(index));
      return true;
    }
    System.out.println("This album does not have a track " + trackNumber);
    return false;
  }

  // we can overload the above method where we can use the title of a track rather tahn the track number to add songs to a playlist
  public boolean addToPlayList(String title, LinkedList<Song> playlist) {
    Song checkedSong = findSong(title); // here we use the method we used above;
    if(checkedSong != null) { // notice that we cannot simple write `if(checkedSong)`; this is because Java has strongly typed variables. It does check for truthiness like JS, but it's checking for truthiness cannot be done short-hand like that.
      playlist.add(checkedSong);
      return true;
    }
    System.out.println("This album does not have a track called " + title);
    return false;
  }
}
