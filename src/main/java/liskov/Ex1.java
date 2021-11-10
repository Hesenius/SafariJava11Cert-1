package liskov;

class Base2 {
  protected int x;
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
  @Override
  // default: accessible only in the same package
  // protected: everything default PLUS accessible in a sublclass using
  // a reference of the subclass type.
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
}

public class Ex1 {
}
