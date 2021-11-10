package protectedaccess.b;

import protectedaccess.a.Parent;

public class Child extends Parent {
  void doStuff(Child this) {
    System.out.println(this.protectedaccess);
    Parent p = this;
    // NOT PERMITTED to access through a reference
    // that is not of OUR type.
//    System.out.println(p.protectedaccess);

//    System.out.println(this.defaultaccess);
  }
}
