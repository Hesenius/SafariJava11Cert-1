package usingvar;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex3 {
  public static void main(String[] args) throws Throwable {

    for (var x = 0; x < 3; x++)
      System.out.println(x);

    try (var in = new FileReader("");
         var out = new FileWriter("")) {
    }
    // keywords cannot be used as identifiers
//    int goto = 99;

    int module;
//    int var = 0;
    var var = "var";
  }
}

//class var {}