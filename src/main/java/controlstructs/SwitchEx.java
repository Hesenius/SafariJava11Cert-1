package controlstructs;

public class SwitchEx {
  public static void main(String[] args) {
    var x = 99; // switch on byte-> int. Not floating,
    // nor boolean. String is OK, enum are ok
    // switch (null) is a NPE
    switch (x) {
      case 99:
        System.out.println("it's 99, surprise");
    }

    enum Day {
      MONDAY, TUESDAY, WEDNESDAY;
    }
    var d = Day.MONDAY;
    switch (d) {
//      case Day.MONDAY:
      case MONDAY: // case targets MUST BE unqualified
        System.out.println("It's monday");
    }

    char c = 65535;
    switch (c) {
      case 65534:
//      case 65536: // ERROR, not a valid char type!
        System.out.println("oops");
    }

    final int a = 45;
    int v = 45;
    switch (v) {
      case a: // this must be a "constant expression"
        // COMPILER evaluates
        System.out.println("it's 45");
    }
  }
}
