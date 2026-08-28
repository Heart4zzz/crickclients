package rw.core;

import KDFzREm.gB;

public class OltqiIqs {
   public static Object[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   public OltqiIqs() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[f3000[2]];
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[1]];
         Object[] var1 = this.f2000;
      }
   }

   public OltqiIqs m10000(gB var1) {
      this.f2000[f4000[4]] = var1;
      return this;
   }

   private static void m12000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
   }

   public gB m16000() {
      return (gB)this.f2000[f4000[3]];
   }

   public static OltqiIqs m18000(gB var0) {
      ((OltqiIqs)f1000[f4000[0]]).f2000[f4000[1]] = var0;
      return (OltqiIqs)f1000[f4000[2]];
   }
}
