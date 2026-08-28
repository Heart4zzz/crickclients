package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import rw.defs.Enum0027;

public record Rec0036() {
   private final String f1000;
   private final float f2000;
   private final Enum0027 f3000;
   public static final Rec0036 f4000;

   public Enum0027 m2000() {
      return this.f3000;
   }

   public Rec0036(String var1, float var2, Enum0027 var3) {
      var1 = m10000(var1);
      var2 = m12000(var2);
      var3 = var3 == null ? Enum0027.f1000 : var3;
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public Rec0036(String var1, float var2) {
      this(var1, var2, Enum0027.f1000);
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0036,"family;weight;slant",Rec0036::f1000,Rec0036::f2000,Rec0036::f3000>(this, var1);
   }

   public float m6000() {
      return this.f2000;
   }

   public String m8000() {
      return this.f1000;
   }

   private static String m10000(String var0) {
      return var0 != null && !var0.isBlank() ? var0.trim().toLowerCase(Locale.ROOT) : "default";
   }

   private static float m12000(float var0) {
      if (var0 < 1.0F) {
         return 400.0F;
      } else {
         return var0 < 100.0F ? 100.0F : Math.min(var0, 900.0F);
      }
   }
}
