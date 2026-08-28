package rw.core;

import KDFzREm.NbK;

public class C0923 {
   private static short[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;

   private static void m2000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public C0923() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[1]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f2000 = new Object[f3000[2]];
   }

   public NbK m14000() {
      return (NbK)this.f4000[f1000[3]];
   }

   public static C0923 m18000(NbK var0) {
      ((C0923)f2000[f1000[0]]).f4000[f1000[1]] = var0;
      return (C0923)f2000[f1000[2]];
   }
}
