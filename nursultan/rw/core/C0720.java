package rw.core;

import KDFzREm.NNBU;

public class C0720 {
   private static boolean[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static short[] f4000;

   private static void m2000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
   }

   public C0720() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[1]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   public C0720 m10000(NNBU var1) {
      this.f2000[f4000[4]] = var1;
      return this;
   }

   private static void m12000() {
      f3000 = new Object[f1000[2]];
   }

   public NNBU m18000() {
      return (NNBU)this.f2000[f4000[3]];
   }

   public static C0720 m20000(NNBU var0) {
      ((C0720)f3000[f4000[0]]).f2000[f4000[1]] = var0;
      return (C0720)f3000[f4000[2]];
   }
}
