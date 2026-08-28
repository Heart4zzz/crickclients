package rw.module;

import rw.Module;

public class AimAssist extends Module {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   public static Object[] f6000;
   private static double[] f7000;

   public double m4000() {
      this.m28000();
      return (Double)this.f2000[f1000[3]];
   }

   private static void m6000() {
      double[] var128 = new double[2];
      f7000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f7000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
   }

   public AimAssist() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   private static void m10000() {
      f6000 = new Object[f4000[3]];
   }

   private static void m2000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      short[] var128 = new short[3];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
   }

   public double m18000() {
      this.m28000();
      return (Double)this.f2000[f1000[2]];
   }

   public AimAssist m20000(double var1) {
      this.m28000();
      Double var7 = var1;
      this.f2000[f1000[5]] = var7;
      return this;
   }

   public AimAssist m22000(double var1) {
      this.m28000();
      Double var7 = var1;
      this.f2000[f1000[4]] = var7;
      return this;
   }

   public static AimAssist m26000(double var0, double var2) {
      AimAssist var10000 = (AimAssist)f6000[f5000[0]];
      Double var8 = var0;
      var10000.f2000[f5000[1]] = var8;
      var10000 = (AimAssist)f6000[f5000[2]];
      Double var9 = var2;
      var10000.f2000[f1000[0]] = var9;
      return (AimAssist)f6000[f1000[1]];
   }

   private void m28000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
         var1[f4000[1]] = f7000[0];
         var1[f4000[2]] = f7000[1];
      }
   }
}
