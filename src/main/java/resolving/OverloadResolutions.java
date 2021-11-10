package resolving;

public class OverloadResolutions {
//  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
//  void doStuff(Integer x, Integer y) {} // Method E

  void tryStuff() {
    doStuff(1, 2);
  }

  // autoboxing does NOT change underlying type of the value
  // and Integer is NOT a subclass of LONG
  void doStuff(Integer x, Long y) {} // not valid target for doStuff(1, 2)
  void doStuff(Number x, Number y) {} // but this IS!

}
