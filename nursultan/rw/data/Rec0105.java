package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0105() {
   private final float f1000;
   private final Rec0097 f2000;
   private final Rec0089 f3000;
   private final boolean f4000;
   private static final float f5000 = 120.0F;
   private static final float f6000 = 1.0E-6F;

   public Rec0097 m2000() {
      return this.f2000;
   }

   public Rec0105(float var1, Rec0097 var2, Rec0089 var3, boolean var4) {
      var1 = m12000(var1);
      var2 = var2 == null ? Rec0097.m14000() : var2;
      var3 = var3 == null ? Rec0089.f3000 : var3;
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0105,"animationUpdateRateHz;inertialScroll;loggingOptions;debugOverlay",Rec0105::f1000,Rec0105::f2000,Rec0105::f3000,Rec0105::f4000>(
         this, var1
      );
   }

   public boolean m6000() {
      return this.f4000;
   }

   public Rec0089 m8000() {
      return this.f3000;
   }

   public float m10000() {
      return this.f1000;
   }

   private static float m12000(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) && !(var0 <= 1.0E-6F) ? var0 : 0.0F;
   }

   public Rec0105 m14000(Rec0089 var1) {
      return new Rec0105(this.f1000, this.f2000, var1, this.f4000);
   }

   public static Rec0105 m16000() {
      return new Rec0105(120.0F, Rec0097.m14000(), Rec0089.f3000, false);
   }

   public Rec0105 m18000(float var1) {
      return new Rec0105(var1, this.f2000, this.f3000, this.f4000);
   }

   public Rec0105 m20000(Rec0097 var1) {
      return new Rec0105(this.f1000, var1, this.f3000, this.f4000);
   }

   public Rec0105 m22000(boolean var1) {
      return new Rec0105(this.f1000, this.f2000, this.f3000, var1);
   }
}
