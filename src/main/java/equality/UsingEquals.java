package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsingEquals {
  public static void main(String[] args) {
//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s == t);

//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s.equals(t));

//    StringBuilder s = new StringBuilder("Hello");
//    StringBuilder t = new StringBuilder("He");
//    t.append("llo");
//    System.out.println(s.equals(t));
//    System.out.println(s.toString().equals(t.toString()));

//    List<String> ls = List.of("Fred", "Jim");
//    List<String> ls2 = new ArrayList<>(ls);
//    System.out.println("class of List.of is " + ls.getClass());
//    System.out.println("class of ArrayList is " + ls2.getClass());
//    System.out.println(ls.equals(ls2));

    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));
  }
}
