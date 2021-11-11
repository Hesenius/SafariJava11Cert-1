package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Closures {
  public static Predicate<String> getOne(/*final*/ int x) {
//    x++;
    return new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() >= x;
      }
    };
  }

//  public static Predicate<String> getOne(int x) {
//    return s -> s.length() >= ++x;
//  }

  public static Predicate<String> getOne(final int [] x) {
//    x = {0};
    return s -> s.length() >= ++x[0];
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));
    boolean res = list.removeIf(getOne(4));
    System.out.println(res);
    System.out.println(list);

    // Classnames are not "first class" elements of Java syntax
//    doStuff(String);
  }
}
