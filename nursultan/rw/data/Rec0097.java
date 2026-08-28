package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0097() {
   private final boolean f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private static final float f5000 = 1800.0F;
   private static final float f6000 = 14.0F;
   private static final float f7000 = 4.0F;

   public boolean m2000() {
      return this.f1000;
   }

   public Rec0097(boolean var1, float var2, float var3, float var4) {
      var2 = m12000(var2);
      var3 = m12000(var3);
      var4 = m12000(var4);
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0097,"enabled;impulse;friction;stopVelocity",Rec0097::f1000,Rec0097::f2000,Rec0097::f3000,Rec0097::f4000>(
         this, var1
      );
   }

   public float m6000() {
      return this.f3000;
   }

   public float m8000() {
      return this.f2000;
   }

   public static Rec0097 m10000() {
      return new Rec0097(false, 1800.0F, 14.0F, 4.0F);
   }

   private static float m12000(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) ? Math.max(0.0F, var0) : 0.0F;
   }

   public static Rec0097 m14000() {
      return new Rec0097(true, 1800.0F, 14.0F, 4.0F);
   }

   public float m16000() {
      return this.f4000;
   }
}
