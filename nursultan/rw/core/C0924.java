package rw.core;

import KDFzREm.NXi;

public class C0924 {
   private static boolean[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static float[] f6000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   private static void m6000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   public C0924() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
         var1[f1000[1]] = f6000[0];
      }
   }

   private static void m14000() {
      f5000 = new Object[f1000[2]];
   }

   public float m20000() {
      return (Float)this.f2000[f4000[5]];
   }

   public NXi m22000() {
      return (NXi)this.f2000[f4000[6]];
   }

   public static C0924 m24000(float var0, NXi var1) {
      C0924 var10000 = (C0924)f5000[f4000[0]];
      Float var6 = var0;
      var10000.f2000[f4000[1]] = var6;
      ((C0924)f5000[f4000[2]]).f2000[f4000[3]] = var1;
      return (C0924)f5000[f4000[4]];
   }

   private static void m28000() {
      short[] var128 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
   }
}
