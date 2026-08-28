package rw.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rw.defs.Enum0055;
import rw.defs.Enum0058;
import rw.gui.Enum0070;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDefault {
   String m2000();

   Enum0058 m4000() default Enum0058.DEFAULT;

   Enum0055 m6000();

   Enum0070 m8000();
}
