/**
 * Created by ekotwick on 7/16/17.
 */
public class Song {
  private String title;
  private Double duration;

  public Song(String title, Double duration) {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  // we also implement a toString method

  @Override
  public String toString() {
    return this.title + ": " + this.duration;
  }
}
