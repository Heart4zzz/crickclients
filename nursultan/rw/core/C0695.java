package rw.core;

import KDFzREm.NNBK;

public class C0695 {
   private static boolean[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   public static Object[] f5000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      short[] var128 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
   }

   public C0695() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public NNBK m16000() {
      return (NNBK)this.f2000[f4000[5]];
   }

   public static C0695 m18000(NNBK var0, String var1) {
      ((C0695)f5000[f4000[0]]).f2000[f4000[1]] = var0;
      ((C0695)f5000[f4000[2]]).f2000[f4000[3]] = var1;
      return (C0695)f5000[f4000[4]];
   }

   public String m22000() {
      return (String)this.f2000[f4000[6]];
   }

   private static void m26000() {
      f5000 = new Object[f1000[1]];
   }
}
