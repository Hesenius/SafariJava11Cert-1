package controlstructs;

public class Ex1 {
  public static void main(String[] args) {
    // must have parens around a boolean / Boolean expression
    // NO TRUTHY/FALSY concept
//    while (true)// statement follows, block is a statement
//      ; // continues until test is false

    // do while always executes at least once
    // MUST HAVE trailing semicolon
//    do ; while (true);

    System.out.println("x");
    ;
    ;

//    for (int x = 3, y[] = {}, z/*, new String()*/;
////    for ( new String(), LocalDate.now(), System.out.println("y") ;
//         true;
//         x++, System.out.println("really"), new String())
//      ;

//    List.copyOf... If the arg list is unmodifiable, return it unchanged
    // otherwise, create a new, unmodifiable list containing the same
    // elements

//    List<String> ls = List.of("Fred", "Jim");
//    for (String s : ls) {
//      System.out.println(s);
//    }

banana:
    System.out.println("Hello");

//    outer: for (int i = 0; i < 10; i++) {
//      inner: for (int y = 0; y < i; y++) {
//        System.out.println(i + ", " + y);
//      }
//    }
outer:
    for (int i = 0; i < 10; i++) {
inner:
      for (int y = 0; y < 10; y++) {
//        if (y == i) break outer;

//        if (y == i) break inner;
        if (y == i) continue outer;
        System.out.println(i + ", " + y);
      }
      // NOTHING HERE
    }

    aGoto: {
      System.out.println("Hello");
      if (Math.random() > -1) break aGoto;
      // continue is ONLY permitted in loop statements
//      if (Math.random() > -1) continue aGoto;
      System.out.println("don't get here");
    }

    stupid: break stupid;
  }
}
