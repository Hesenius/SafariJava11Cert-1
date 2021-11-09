package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionFlow {
  public static void main(String[] args) throws Exception {
    double x = Math.random();

    try {
      System.out.println("regular code 1");
      FileReader fr = new FileReader("");
      if (x > 0.5) throw new SQLException();
      System.out.println("regular code 2");
    } catch (SQLException se) {
      System.out.println("got SQLException");
    } catch (Exception e) {
      System.out.println("got Exception");
    } finally {
      System.out.println("always");
    }

    try (FileReader fr = new FileReader("");
        FileWriter fw = new FileWriter("");) {
      if (x > 0.5) throw new SQLException();
    } catch (FileNotFoundException ioe) {}
    // auto-generated finally--closes resources in reverse order of opening
//    finally {
//      System.out.println("my own finally");
//    }
  }
}
