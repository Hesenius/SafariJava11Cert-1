package exceptions;

class AC implements AutoCloseable {
  private String name;
  public AC(String name) { this.name = name; }
  @Override public void close() {
    System.out.println("Closing " + name);
  }
}

public class ResourceClose {
  public static void main(String[] args) {
    var ac0 = new AC("zero");
    var ac0Copy = ac0;
    try (var ac1 = new AC("one"); var ac2 = new AC("two"); ac0; ){ }
    ac0Copy = null;
  }
}
