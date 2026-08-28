package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NbK;

public class C0714 {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public C0714() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m12000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((1 | -1) >>> 31);
      f1000[7] = (short)((0 | -0) >>> 31);
   }

   public NbK m14000() {
      return (NbK)this.f2000[f1000[6]];
   }

   public static C0714 m18000(NbK var0) {
      ((C0714)f4000[f1000[0]]).f2000[f1000[1]] = var0;
      C0714 var10000 = (C0714)f4000[f1000[2]];
      Object var6 = null;
      var10000.f2000[f1000[3]] = var6;
      return (C0714)f4000[f1000[4]];
   }

   public C0714 m20000(NNNG var1) {
      this.f2000[f1000[7]] = var1;
      return this;
   }

   public NNNG m22000() {
      return (NNNG)this.f2000[f1000[5]];
   }

   private static void m26000() {
      f4000 = new Object[f5000[1]];
   }
}
