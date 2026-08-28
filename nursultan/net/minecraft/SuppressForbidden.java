package net.minecraft;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SuppressForbidden {
   String y() default "";

   String N();
}
