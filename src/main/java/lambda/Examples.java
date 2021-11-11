package lambda;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

//@FunctionalInterface
//interface NotFunctional {
//  boolean equals(Object o);
//}

@FunctionalInterface
interface StringCriterion {
  boolean test(String s);
}
public class Examples {
  public static void doStuff(StringCriterion sc) {}

  public static StringCriterion getOne() {
    return (String s) -> {
      // loops, exceptions, whatever
      return true;
    };
  }

  public static void main(String[] args) {
//    Comparator<String> cs = (String s, String t) -> { return 1; };
    // NOT PERMITTED, inferred types are "all or nothing"
//    Comparator<String> bad = (s, String t) -> { return 1; };
    // this is OK
//    Comparator<String> cs = (s, t) -> { return 1; };
    // can use var IF you can infer all arg types, and use it for ALL of them
//    Comparator<String> cs = (@Deprecated var s, var t) -> { return 1; };
    // These ARE NOT LEGAL
//    Comparator<String> bad = (String s, var t) -> { return 1; };
//    Comparator<String> bad = (s, var t) -> { return 1; };

    Comparator<String> cs = (@Deprecated var s, var t) -> { return 1; };

//    StringCriterion sc = (String s) -> { return true; };
//    StringCriterion sc = (s) -> { return true; };
    // remove parens ONLY FOR single argument with no type indicator
    // zero arg lambda MUST HAVE parens -> {} not permitted, () -> {} ok
//    StringCriterion sc = s -> { return true; };
    // IFF method body contains ONLY one statement which is
    // "return <expr>" then we can replace with <expr>
//    StringCriterion sc = s -> { return true; };
    // NOTE trailing semi completes the initialization
    StringCriterion sc = s -> true ;

    doStuff(sc);

    Object obj = (StringCriterion & Serializable)((String s) -> { return true; });
  }
}
