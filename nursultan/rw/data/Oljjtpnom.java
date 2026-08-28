package rw.data;

import java.lang.runtime.ObjectMethods;

public record Oljjtpnom() {
   public float f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   public float f4000;
   public int f5000;
   private static float[] f6000;
   public float f7000;
   private static byte[] f8000;
   public float f9000;

   public boolean m4000() {
      return this.f5000 >= 0 ? f2000[0] : f2000[1];
   }

   private static void m6000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
   }

   public Oljjtpnom(int var1, float var2, float var3, float var4, float var5) {
      this.f5000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f9000 = var4;
      this.f7000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Oljjtpnom,"index;u0;v0;u1;v1",Oljjtpnom::f5000,Oljjtpnom::f4000,Oljjtpnom::f1000,Oljjtpnom::f9000,Oljjtpnom::f7000>(
         this, var1
      );
   }

   private static void m10000() {
      f3000 = new Object[f2000[3]];
   }

   private static void m12000() {
      float[] var128 = new float[4];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f6000[2] = Float.intBitsToFloat(0);
      f6000[3] = Float.intBitsToFloat(0);
   }

   public float m14000() {
      return this.f7000;
   }

   private static void m16000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = -1;
   }

   public int m18000() {
      return this.f5000;
   }

   public float m22000() {
      return this.f4000;
   }

   public float m28000() {
      return this.f1000;
   }

   public float m30000() {
      return this.f9000;
   }
}
