package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0876;

public record Rec0033() {
   public float f1000;
   public int f2000;
   public float f3000;
   private static float[] f4000;
   public float f5000;
   public static Object[] f6000;

   public float m4000() {
      return this.f1000;
   }

   private static void m8000() {
      f4000 = new float[]{0.001F, 0.001F, 0.0F, 1.0F, 0.0F, 1.0F, 0.001F};
   }

   public Rec0033(float var1, float var2, float var3, int var4) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f5000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0033,"deltaH;ratioS;ratioL;alpha",Rec0033::f1000,Rec0033::f3000,Rec0033::f5000,Rec0033::f2000>(this, var1);
   }

   private static void m14000() {
      f6000 = new Object[]{0.001F};
   }

   public float m24000() {
      return this.f5000;
   }

   public int m26000() {
      return this.f2000;
   }

   public int m30000(int var1) {
      float[] var2 = C0876.m6000(var1);
      float var3 = var2[0] + this.f1000;
      float var4 = Math.clamp(var2[1] * this.f3000, f4000[2], f4000[3]);
      float var5 = Math.clamp(var2[2] * this.f5000, f4000[4], f4000[5]);
      int var6 = C0876.m42000(var3, var4, var5);
      return this.f2000 << 24 | var6 & 16777215;
   }

   public static Rec0033 m32000(int var0, int var1) {
      float[] var2 = C0876.m6000(var0);
      float[] var3 = C0876.m6000(var1);
      float var4 = var3[0] - var2[0];
      float var5 = var2[1] > f4000[0] ? var3[1] / var2[1] : var3[1];
      float var6 = var2[2] > f4000[1] ? var3[2] / var2[2] : var3[2];
      int var7 = var1 >>> 24 & 0xFF;
      return new Rec0033(var4, var5, var6, var7);
   }

   public float m34000() {
      return this.f3000;
   }
}
