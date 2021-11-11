package nested;

public class MyBuildable {
  private String name;
  private int count;

  static class MyBuilder {
    private String name;
    private int count;

    public MyBuilder name(String name) {
      this.name = name;
      return this;
    }

    public MyBuilder count(int count) {
      this.count = count;
      return this;
    }

    public MyBuildable build() {
      // validate arguments....
      MyBuildable target = new MyBuildable();
      target.name = name;
      target.count = count;
      return target;
    }
  }

  public static MyBuilder builder() {
    return new MyBuilder();
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
