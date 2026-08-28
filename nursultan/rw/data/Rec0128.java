package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0128() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   public static final Rec0128 f5000;

   public float m2000() {
      return this.f1000;
   }

   public Rec0128(float var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0128,"left;right;top;bottom",Rec0128::f1000,Rec0128::f2000,Rec0128::f3000,Rec0128::f4000>(this, var1);
   }

   public float m6000() {
      return this.f3000;
   }

   public float m8000() {
      return this.f2000;
   }

   public float m10000() {
      return Math.max(0.0F, this.f3000) + Math.max(0.0F, this.f4000);
   }

   public static Rec0128 m12000(float var0, float var1, float var2, float var3) {
      return new Rec0128(Math.max(0.0F, var0), Math.max(0.0F, var1), Math.max(0.0F, var2), Math.max(0.0F, var3));
   }

   public static Rec0128 m14000(float var0, float var1) {
      float var2 = Math.max(0.0F, var0);
      float var3 = Math.max(0.0F, var1);
      return new Rec0128(var2, var2, var3, var3);
   }

   public float m16000() {
      return Math.max(0.0F, this.f1000) + Math.max(0.0F, this.f2000);
   }

   public static Rec0128 m18000(float var0) {
      float var1 = Math.max(0.0F, var0);
      return new Rec0128(var1, var1, var1, var1);
   }

   public float m20000() {
      return this.f4000;
   }
}
