package rw.module;

import rw.Module;

public class FreeCamera extends Module {
   private static boolean[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   public static Object[] f7000;
   private static double[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public Object[] f11000;

   public FreeCamera m4000(double var1) {
      this.m20000();
      Double var7 = var1;
      this.f11000[f3000[4]] = var7;
      return this;
   }

   public double m6000() {
      this.m20000();
      return (Double)this.f11000[f3000[0]];
   }

   public float m8000() {
      this.m20000();
      return (Float)this.f11000[f6000[5]];
   }

   public FreeCamera() {
      this.m20000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      short[] var128 = new short[2];
      f10000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[3];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[2];
      f9000[(0 | -0) >>> 31] = 2;
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[7];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = 4;
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      f6000[6] = 2;
      short[] var132 = new short[7];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = 2;
      f3000[5] = 3;
      f3000[6] = 4;
   }

   public float m16000() {
      this.m20000();
      return (Float)this.f11000[f6000[4]];
   }

   private static void m18000() {
      float[] var128 = new float[2];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private void m20000() {
      if (this.f11000 == null) {
         this.f11000 = new Object[f5000[0]];
         Object[] var1 = this.f11000;
         var1[f1000[1]] = f2000[0];
         var1[f1000[2]] = f2000[1];
         var1[f5000[1]] = f8000[0];
         var1[f5000[2]] = f8000[1];
         var1[f5000[3]] = f8000[2];
      }
   }

   private static void m22000() {
      byte[] var128 = new byte[4];
      f5000[(0 | -0) >>> 31] = 5;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
      f5000[3] = 4;
   }

   public double m24000() {
      this.m20000();
      return (Double)this.f11000[f3000[1]];
   }

   public FreeCamera m28000(float var1) {
      this.m20000();
      Float var6 = var1;
      this.f11000[f3000[3]] = var6;
      return this;
   }

   public FreeCamera m30000(double var1) {
      this.m20000();
      Double var7 = var1;
      this.f11000[f3000[5]] = var7;
      return this;
   }

   private static void m32000() {
      f7000 = new Object[f1000[3]];
   }

   public FreeCamera m34000(float var1) {
      this.m20000();
      Float var6 = var1;
      this.f11000[f3000[2]] = var6;
      return this;
   }

   public FreeCamera m36000(double var1) {
      this.m20000();
      Double var7 = var1;
      this.f11000[f3000[6]] = var7;
      return this;
   }

   public static FreeCamera m40000(float var0, float var1, double var2, double var4, double var6) {
      FreeCamera var10000 = (FreeCamera)f7000[f10000[0]];
      Float var12 = var0;
      var10000.f11000[f10000[1]] = var12;
      var10000 = (FreeCamera)f7000[f4000[0]];
      Float var13 = var1;
      var10000.f11000[f4000[1]] = var13;
      var10000 = (FreeCamera)f7000[f4000[2]];
      Double var14 = var2;
      var10000.f11000[f9000[0]] = var14;
      var10000 = (FreeCamera)f7000[f9000[1]];
      Double var15 = var4;
      var10000.f11000[f6000[0]] = var15;
      var10000 = (FreeCamera)f7000[f6000[1]];
      Double var16 = var6;
      var10000.f11000[f6000[2]] = var16;
      return (FreeCamera)f7000[f6000[3]];
   }

   private static void m42000() {
      double[] var128 = new double[3];
      f8000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f8000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f8000[2] = Double.longBitsToDouble(0L);
   }

   public double m46000() {
      this.m20000();
      return (Double)this.f11000[f6000[6]];
   }
}
