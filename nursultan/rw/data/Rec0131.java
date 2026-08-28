package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0043;

public record Rec0131() {
   private final Enum0043 f1000;
   private final float f2000;
   public static final Rec0131 f3000;
   public static final Rec0131 f4000;

   public boolean m2000() {
      return this.f1000 == Enum0043.f1000;
   }

   public Rec0131(Enum0043 var1, float var2) {
      var1 = var1 == null ? Enum0043.f1000 : var1;
      var2 = var1 == Enum0043.f2000 ? 0.0F : m10000(var2);
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0131,"mode;value",Rec0131::f1000,Rec0131::f2000>(this, var1);
   }

   public Enum0043 m6000() {
      return this.f1000;
   }

   public float m8000() {
      return this.m2000() ? this.f2000 : 0.0F;
   }

   private static float m10000(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.max(0.0F, var0);
   }

   public boolean m12000() {
      return this.f1000 == Enum0043.f2000;
   }

   public static Rec0131 m14000() {
      return f4000;
   }

   public static Rec0131 m16000(float var0) {
      float var1 = m10000(var0);
      return var1 == 0.0F ? f3000 : new Rec0131(Enum0043.f1000, var1);
   }

   public float m18000() {
      return this.f2000;
   }
}
