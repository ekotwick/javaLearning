import java.util.ListIterator;

/**
 * Created by ekotwick on 7/18/17.
 */
public abstract class ListItem {
  protected ListItem rightLink = null;
  protected ListItem leftLink = null;

  protected Object value;

  // we include a constructor here, because any concrete class that inherites from this class will need a constructor, so it makes sense to put a constructor in this abstract class
  public ListItem(Object Value) {
    this.value = value;
  }

  abstract ListItem next();
  abstract ListItem setNext(ListItem item);
  abstract ListItem previous();
  abstract ListItem setPrevious(ListItem item);

  abstract int compareTo(ListItem item);// this method determines whether two items are the same;

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
