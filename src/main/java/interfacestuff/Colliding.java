package interfacestuff;
interface IntA {
  default void doStuff() { System.out.println("IntA.doStuff()"); }
//  void doStuff();
}
interface IntB {
  default void doStuff() { System.out.println("IntB.doStuff()"); }
//  void doStuff();
}
class ClA implements IntA, IntB {
//  public void doStuff() { System.out.println("ClA.doStuff"); }
  public void doStuff() {
    IntA.super.doStuff();
    IntB.super.doStuff();
  }
}
public class Colliding {
  public static void main(String[] args) {
    new ClA().doStuff();
  }
}
