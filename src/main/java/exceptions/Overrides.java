package exceptions;

import java.io.IOException;
import java.sql.SQLException;

interface Int {
  void doStuff() throws Exception;
}

class Base2 {
  void doBaseStuff() throws Throwable {
//    if (Math.random() < 0.5) throw new SQLException();
    System.out.println("doBaseStuff");
  }
}

class Sub2 extends Base2 {
  void doBaseStuff() throws Exception {
    System.out.println("doSubStuff");
  }
  void subSpecialMethod() {}
}

public class Overrides {
}
