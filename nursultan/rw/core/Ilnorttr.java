package rw.core;

import KDFzREm.NbK;

public class Ilnorttr {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   public static Object[] f4000;

   private static void m2000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   public Ilnorttr() {
      this.m12000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m8000() {
      f4000 = new Object[f1000[2]];
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[1]];
         Object[] var1 = this.f2000;
      }
   }

   public NbK m14000() {
      return (NbK)this.f2000[f3000[3]];
   }

   public static Ilnorttr m16000(NbK var0) {
      ((Ilnorttr)f4000[f3000[0]]).f2000[f3000[1]] = var0;
      return (Ilnorttr)f4000[f3000[2]];
   }
}
