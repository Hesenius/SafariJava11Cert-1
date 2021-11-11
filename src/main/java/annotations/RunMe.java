package annotations;

// annotations DO NOT HAVE behavior (hence "interface-like")
//public @ interface RunMe {

import java.lang.annotation.*;

//@Target({ElementType.METHOD, ElementType.TYPE})
// oddly, a single element in an array of values for
// an annotation element, does not require curlies!?!?
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ManyRunMe.class)
public @interface RunMe {
  String name() default "Unknown";
  int value() default -1;
  // 1) do not use names that map to Object methods!
  // 2) Types of data are tightly restricted!!!!
  //    - primitives (NOT wrapper types, e.g. Integer)
  //    - String
  //    - java.lang.Class
  //    - Annotation types (but NOT CIRCULAR REFERENCES!!!
  //    -- and arrays OF THE ABOVE (NOT arrays of arrays)
}
// Retention cannot be less than the contained type
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface ManyRunMe {
  RunMe [] value();
}