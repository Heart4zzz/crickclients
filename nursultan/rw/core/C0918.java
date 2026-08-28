package rw.core;

import KDFzREm.NSS;

public class C0918 {
   public Object[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;

   private static void m4000() {
      f2000 = new Object[f4000[2]];
   }

   public C0918() {
      this.m12000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[1]];
         Object[] var1 = this.f1000;
      }
   }

   public NSS m14000() {
      return (NSS)this.f1000[f3000[3]];
   }

   public static C0918 m16000(NSS var0) {
      ((C0918)f2000[f3000[0]]).f1000[f3000[1]] = var0;
      return (C0918)f2000[f3000[2]];
   }
}
