package rw.core;

import KDFzREm.NbK;

public class C0913 {
   public Object[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
   }

   public C0913() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new Object[f4000[2]];
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[1]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m12000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
   }

   public C0913 m14000(NbK var1) {
      this.f1000[f2000[4]] = var1;
      return this;
   }

   public static C0913 m18000(NbK var0) {
      ((C0913)f3000[f2000[0]]).f1000[f2000[1]] = var0;
      return (C0913)f3000[f2000[2]];
   }

   public NbK m20000() {
      return (NbK)this.f1000[f2000[3]];
   }
}
