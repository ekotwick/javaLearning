/**
 * Created by ekotwick on 7/18/17.
 */
public class Node extends ListItem {

  public Node(Object Value) {
    super(Value);
  }

  // notice that we will not override the `getValue` method; instead, this is inherited from the super class, and this class, which extends the superclass, can simply call it

  @Override
  ListItem next() {
    return this.rightLink;
  }

  @Override
  ListItem setNext(ListItem item) {
    this.rightLink = item;
    return this.rightLink;
  }

  @Override
  ListItem previous() {
    return this.leftLink;
  }

  @Override
  ListItem setPrevious(ListItem item) {
    this.leftLink = item;
    return this;
  }

  @Override
  int compareTo(ListItem item) {
    if(item != null) {
      // why do we we cast to string? Because in our abstract class our `getValue()` method returned an `Object`. We did this in order to have the greatest degree of compatibility. We cast the Object here to a String for the present purposes; for instance, the String class had a built in `compareTo` method, which we take advantage of;
      return ((String) super.getValue()).compareTo((String) item.getValue());
    } else {
      return -1;
    }
  }
}
