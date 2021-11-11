package annotations;

import java.lang.reflect.Method;

public class TestHarness {
  public static void main(String[] args) throws Exception {
    String theClassName = "annotations.MyUnitUnderTest";

    Class<?> theClass = Class.forName(theClassName);
    Object target = theClass.getConstructor().newInstance();
    System.out.println("object is: " + target);

//    System.setSecurityManager(new SecurityManager());

//    Method[] methods = theClass.getMethods();
    Method[] methods = theClass.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println("found method: " + m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("**** Found annotation name is "
            + annot.name() + " value is " + annot.value());
        m.setAccessible(true);
        m.invoke(target);
      }
    }
  }
}
