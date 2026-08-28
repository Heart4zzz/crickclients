package rw.core;

import KDFzREm.NQo;

public class C0917 {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   public static Object[] f4000;

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public C0917() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[1]];
         Object[] var1 = this.f3000;
      }
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f4000 = new Object[f2000[2]];
   }

   public static C0917 m14000(NQo var0) {
      ((C0917)f4000[f1000[0]]).f3000[f1000[1]] = var0;
      return (C0917)f4000[f1000[2]];
   }

   public NQo m16000() {
      return (NQo)this.f3000[f1000[3]];
   }
}
