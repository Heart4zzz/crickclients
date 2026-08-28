package rw.core;

import KDFzREm.NNNZA;

public class C0705 {
   private static boolean[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   public Object[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   public C0705() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new Object[f1000[2]];
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[1]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m10000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
   }

   public static C0705 m14000(NNNZA var0) {
      ((C0705)f3000[f2000[0]]).f4000[f2000[1]] = var0;
      return (C0705)f3000[f2000[2]];
   }

   public NNNZA m16000() {
      return (NNNZA)this.f4000[f2000[3]];
   }
}
