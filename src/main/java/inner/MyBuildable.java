package inner;

public class MyBuildable {
  private String name;
  private int count;

  // this is a TERRIBLE implementation of the builder pattern
  // if the builder object persists after build, the caller
  // can mutate the buildable!!!!
  class MyBuilder { // instance type is called "inner"
    public MyBuilder name(String n) {
//      MyBuildable.this.name = n;
      name = n;
      return this;
    }

    public MyBuilder count(int count) {
      MyBuildable.this.count = count;
      return this;
    }

    public MyBuildable build() {
      // validate arguments....
      return MyBuildable.this;
      // MyBuildable.this = null // CANT DO THIS
    }
  }

  public static MyBuilder builder() {
//    return new MyBuilder(); // implicit attempt at this.new...
//    return this.new MyBuilder(); // static method has no this!!!
    return new MyBuildable().new MyBuilder();
  }

  @Override
  public String toString() {
    return "MyBuildable{" +
        "name='" + name + '\'' +
        ", count=" + count +
        '}';
  }

  public static void main(String[] args) {
    MyBuildable mb = MyBuildable.builder()
        .name("Fred")
        .count(99)
        .build();
    System.out.println(mb);
  }
}
