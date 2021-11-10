package resolving;

class Parent {
  int y = 900;
}

public class Identifiers extends Parent {
  static int x = 99;
  int y = 200;
//  static int y = 200;

  // invoke with anInstance.doStuff()
  public void doStuff(/*@Deprecated*/ Identifiers this) {
//  public void doStuff() {
//    int y = 99;
    System.out.println(y);
    System.out.println(super.y); // super can only go "up one level"
//    System.out.println(Identifiers.y);
    System.out.println(this.y); // this is local and FINAL
  }

  // "unqualified" identifier looks for:
  // 1) a local meaning
  // 2a) if this exists, try the implicit this prefix
  // 2b) if that didn't work, try the implicit class prefix
  // 3) try 2, up the class hierarchy

  public static void doOtherStuff() {
//    System.out.println(y);
//    System.out.println(this.y);
//    System.out.println(Identifiers.y);
    System.out.println(new Identifiers().y);
  }
  public static void main(String[] args) {
    int x = 100;
    System.out.println(x);
    System.out.println(Identifiers.x);


  }
}
