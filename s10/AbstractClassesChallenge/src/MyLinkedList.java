/**
 * Created by ekotwick on 7/18/17.
 */
public class MyLinkedList implements NodeList {

  private ListItem root = null;

  public MyLinkedList(ListItem root) {
    this.root = root;
  }

  @Override
  public ListItem getRoot() {
    return this.root;
  }

  @Override
  public boolean addItem(ListItem newItem) {
    if(this.root == null) {
      // list is empty
      this.root = newItem;
      return true;
    }
    ListItem currentItem = this.root;
    while(currentItem != null) {
      int comparison = (currentItem.compareTo(newItem));
      if (comparison < 0) {
        // newItem is greater; most right if possible
        if(currentItem.next() != null) {
          currentItem = currentItem.next();
        } else {
          // there is no next; insert at end
          currentItem.setNext(newItem);
          newItem.setPrevious(currentItem);
          return true;
        }
      } else if(comparison > 0) {
        // new Item is less, so insert before;
        if(currentItem.previous() != null) {
          currentItem.previous().setNext(newItem);
          newItem.setPrevious(currentItem.previous());
          newItem.setNext(currentItem);
          currentItem.setPrevious(newItem);
        } else {
          // the node with a previous is the root; we need to make the new item the new root
          newItem.setNext(this.root);
          this.root.setPrevious(newItem);
          this.root = newItem;
        }
        return true;
      } else {
        // they are equal
        System.out.println(newItem.getValue() + " is already present");
        return false;
      }
    }
    return false;
  }

  @Override
  public boolean removeItem(ListItem item) {
    if(item != null) {
      System.out.println("Deleting item " + item.getValue());
    }

    ListItem currentItem = this.root;
    while(currentItem != null) {
      int comparison = currentItem.compareTo(item);
      if(comparison == 0) {
        if(currentItem == this.root) {
          this.root = currentItem.next();
        } else {
          currentItem.previous().setNext(currentItem.next());
          if(currentItem.next() != null) {
            currentItem.next().setPrevious(currentItem.previous());
          }
        }
        return true;
      } else if (comparison < 0) {
        currentItem = currentItem.next();
      } else {
        // at an item greater than the one to be deleted, so the item is not in the list;
        return false;
      }
    }
    return false;
  }

  @Override
  public void traverse(ListItem root) {
    if(root == null) {
      System.out.println("The list is empty");
    } else {
      while(root != null) {
        System.out.println(root.getValue());
        root = root.next();
      }
    }
  }
}
