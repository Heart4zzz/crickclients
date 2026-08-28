package rw.core;

import KDFzREm.NjL;

public class C0914 {
   public Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0914() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m12000() {
      f5000 = new Object[f2000[1]];
   }

   public NjL m14000() {
      return (NjL)this.f1000[f3000[5]];
   }

   public static C0914 m18000(NjL var0, NjL var1) {
      ((C0914)f5000[f3000[0]]).f1000[f3000[1]] = var0;
      ((C0914)f5000[f3000[2]]).f1000[f3000[3]] = var1;
      return (C0914)f5000[f3000[4]];
   }

   public NjL m22000() {
      return (NjL)this.f1000[f3000[6]];
   }

   private static void m24000() {
      short[] var128 = new short[7];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((0 | -0) >>> 31);
      f3000[6] = (short)((1 | -1) >>> 31);
   }
}
