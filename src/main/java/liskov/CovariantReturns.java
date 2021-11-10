package liskov;

class Parent {
  CharSequence doStuff() {
    return null;
  }
}
class Child extends Parent {
  @Override
  String doStuff() {
    return null;
  }
}

/*
Overrides:
method declared in a subtype
with exactly the same basic name
and exactly the same sequence of argument types
To succeed:
must not be less accessible
must not declare checked exceptions not declared by the parent
must conform to return type expectations
 - primitives must be an exact match
 - Object returns must be assignment compatible
 */
public class CovariantReturns {
}
