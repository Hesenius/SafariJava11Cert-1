package annotations;

//@interface Annot {}

//  @ interface Annot {
//    String value() = "";
//  }

//  @interface Annot {
//    StringBuilder text();
//  }

//@interface Annot {
//  Class value();
//}

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface Annot {}

//@Annot(value=String.class)
public class Ex1 {

}
