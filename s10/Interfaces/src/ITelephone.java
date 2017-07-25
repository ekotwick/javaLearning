/**
 * Created by ekotwick on 7/17/17.
 */
public interface ITelephone {
  // here our only concern is to list all the methods that the class that implements this interface must implement
  // all we write are (1) the name, (2) the arguments it receives, and (3) the data type it returns
  void powerOn();

  void dial(int phoneNumber);

  void answer();

  boolean callPhone(int phoneNumber);

  boolean isRinging();
}

// notice that we did not inlcude the `access modifier`——these are the terms like 'public' and 'private'. We did not include them here, because they are redundant here. It's valid to leave them in, if we want to. The reason that it's redundant, is because the actual code——and the access modifiers included——is in the class that implements this interface.