package rw.gui;

import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import rw.defs.Enum0024;

public record Rec0015() {
   private final Enum0024 f1000;
   public static final Rec0015 f2000;
   public static final Rec0015 f3000;

   public Enum0024 m2000() {
      return this.f1000;
   }

   public Rec0015(Enum0024 var1) {
      Objects.requireNonNull(var1, "exitAnimationPolicy");
      this.f1000 = var1;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0015,"exitAnimationPolicy",Rec0015::f1000>(this, var1);
   }

   public static Rec0015 m6000() {
      return f3000;
   }

   public static Rec0015 m8000() {
      return f2000;
   }
}
