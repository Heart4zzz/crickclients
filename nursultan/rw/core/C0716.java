package rw.core;

import KDFzREm.NbK;

public class C0716 {
   private static short[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;
   public Object[] f6000;

   private static void m2000() {
      boolean[] var128 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      short[] var128 = new short[8];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
      f4000[7] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
   }

   public C0716() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[f5000[3]];
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public boolean m14000() {
      return (Boolean)this.f6000[f4000[5]];
   }

   public static C0716 m18000(boolean var0, NbK var1) {
      C0716 var10000 = (C0716)f2000[f4000[0]];
      Boolean var6 = var0;
      var10000.f6000[f4000[1]] = var6;
      ((C0716)f2000[f4000[2]]).f6000[f4000[3]] = var1;
      return (C0716)f2000[f4000[4]];
   }

   public C0716 m20000(boolean var1) {
      Boolean var6 = var1;
      this.f6000[f4000[7]] = var6;
      return this;
   }

   public C0716 m22000(NbK var1) {
      this.f6000[f1000[0]] = var1;
      return this;
   }

   public NbK m24000() {
      return (NbK)this.f6000[f4000[6]];
   }

   private void m28000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f3000[0]];
         Object[] var1 = this.f6000;
         var1[f5000[1]] = f5000[2];
      }
   }
}
