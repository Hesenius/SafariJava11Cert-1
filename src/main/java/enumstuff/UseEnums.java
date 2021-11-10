package enumstuff;

import java.util.Arrays;

// enums are all subclasses of Enum, but extends is PROHIBITED
enum DayOfWeek /*extends Enum<DayOfWeek> */
implements Runnable { // this is fine :)
  MONDAY(1), TUESDAY ; // these are public static final instances of DayOfWeek
  static {
    System.out.println("Initializing / loading the DayOfWeek");
  }
  int theValue;

  // default constructor is private DayOfWeek() { super(); }
  // any explicit constructor removes the default (as usual)
  /*private*/ DayOfWeek(int x){
    System.out.println("DayOfWeek(" + x + ")");
    theValue = x;
  }
  DayOfWeek(){
    System.out.println("DayOfWeek()");
  }

  public void run() {}
}

// also an enum cannot be the target of extends
//class X extends DayOfWeek {}

public class UseEnums {
  public static void main(String[] args) {
    System.out.println("about to assign");
    Object obj = DayOfWeek.MONDAY;
    System.out.println("Finished");

    System.out.println("DayOfWeek.values() " + Arrays.toString(DayOfWeek.values()));
    System.out.println("Monday(ordinal) is " + DayOfWeek.MONDAY.ordinal());
    System.out.println("Monday.theValue is " + DayOfWeek.MONDAY.theValue);
    System.out.println(DayOfWeek.MONDAY.name()); // name is final!!!
    // toString delegates to name() by default
    System.out.println(DayOfWeek.MONDAY.toString());
  }
}
