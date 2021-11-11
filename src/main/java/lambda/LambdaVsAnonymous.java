package lambda;

import java.util.function.ToIntFunction;

class StringLen implements ToIntFunction<String> {
  @Override
  public int applyAsInt(String value) {
    if (value.equals("")) return 0;
    else return 1 + this.applyAsInt(value.substring(1));
  }
}

public class LambdaVsAnonymous {
  public static void main(String[] args) {

    // int applyAsInt(String s);
    ToIntFunction<String> len = new StringLen();
    System.out.println("Length of Hello is "
        + len.applyAsInt("Hello"));


    // anonymous inner:
    // has "this" of its own
    // can implement many methods (both abstract, overrides, and new)
    // can subclass CLASSES, not just implement interfaces
    // can pass constructor arguments to the parent CLASS
    ToIntFunction<String> len1 = new ToIntFunction<String>() {
      @Override
      public int applyAsInt(String value) {
        if (value.equals("")) return 0;
        else return 1 + this.applyAsInt(value.substring(1));
      }
    };

    System.out.println("Length of Hello is "
        + len1.applyAsInt("Hello"));


    // There is NO THIS in a lambda
//    ToIntFunction<String> len2 = (String value) -> {
//        if (value.equals("")) return 0;
//        else return 1 + this.applyAsInt(value.substring(1));
//      };
  }

  public void doStuff() {
    // but a lambda might USE the "this" from the surrounding context
    // IFF it's appropriate
//    ToIntFunction<String> len2 = (String value) -> {
//      if (value.equals("")) return 0;
//      else return 1 + this.applyAsInt(value.substring(1));
//    };
  }
}
