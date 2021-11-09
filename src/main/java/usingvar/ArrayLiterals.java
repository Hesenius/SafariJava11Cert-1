package usingvar;

public class ArrayLiterals {
  public static void doStuff(Object [] sa) {}

  public static void main(String[] args) {
    String [] sa = {""}; // type inferencing!!!
    doStuff(sa);
//    doStuff({""});// inferencing fails
    doStuff(new String[]{""});
  }
}
