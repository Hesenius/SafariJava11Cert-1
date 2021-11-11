package annotations;

//@RunMe
public class MyUnitUnderTest {
//  @RunMe
  String name = "Fred";

  @RunMe(name="William"/*, value=99*/)
  public void tryThisExample() {
    System.out.println("tryThisExample()");
  }

  @RunMe(name="Albert", value=2)
  private void testSomething() {
    System.out.println("testSomething");
  }

  // ONLY FOR THE element called "value"
  // ONLY if value is the ONLY ELEMENT being specified
  @RunMe(2)
  private void dontTestThis() {
    System.out.println("dontTestThis");
  }

//  @ManyRunMe({
//      @RunMe(2),
//      @RunMe(2)
//  })
  @RunMe(2) // works with the "contaner" annotation automatically
  @RunMe(2) // since Java 7
  private void irrelevant() {  }

  @Override
  public String toString() {
    return "Look at me, I'm a MyUnitUnderTest class is: "
        + this.getClass();
  }
}
