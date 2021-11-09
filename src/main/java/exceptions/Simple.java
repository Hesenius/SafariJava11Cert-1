package exceptions;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Simple {
  public static void doStuff()
      // are allowed to declare exceptions that do not actually arise
      throws IOException, SQLException, IllegalAccessError/*, RuntimeException */{
//  public static void doStuff() throws Exception {
    FileReader fr = new FileReader("bad.txt");
    if (Math.random() > 0.5) throw new SQLException();
    if (Math.random() > 0.5) throw new RuntimeException();
  }
  public static void main(String[] args) {

  }
}
