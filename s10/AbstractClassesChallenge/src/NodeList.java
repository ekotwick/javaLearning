/**
 * Created by ekotwick on 7/18/17.
 */
public interface NodeList {
  ListItem getRoot();
  boolean addItem(ListItem item);
  boolean removeItem(ListItem item);
  void traverse(ListItem root);
}
