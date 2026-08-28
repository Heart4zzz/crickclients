package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0066() {
   private final float f1000;
   private final float f2000;
   public static final Rec0066 f3000;

   public float m2000(float var1) {
      return this.f1000 + this.f2000 * 0.01F * Math.max(0.0F, var1);
   }

   public float m4000() {
      return this.f2000;
   }

   public Rec0066(float var1, float var2) {
      var1 = m8000(var1);
      var2 = m8000(var2);
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0066,"pixels;percent",Rec0066::f1000,Rec0066::f2000>(this, var1);
   }

   private static float m8000(float var0) {
      return Float.isFinite(var0) ? var0 : 0.0F;
   }

   public float m10000() {
      return this.f1000;
   }

   public static Rec0066 m12000(float var0) {
      return new Rec0066(0.0F, var0);
   }

   public static Rec0066 m14000(float var0, float var1) {
      return new Rec0066(var0, var1);
   }

   public static Rec0066 m16000(float var0) {
      return new Rec0066(var0, 0.0F);
   }

   public boolean m18000() {
      return this.f1000 == 0.0F && this.f2000 == 0.0F;
   }
}
