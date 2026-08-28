package rw.core;

import KDFzREm.NNNG;
import KDFzREm.Yc;

public class C0697 {
   public static Object[] f1000;
   private static byte[] f2000;
   public Object[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;

   private static void m2000() {
      f1000 = new Object[f5000[1]];
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
   }

   public C0697() {
      this.m32000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public NNNG m14000() {
      return (NNNG)this.f3000[f4000[2]];
   }

   public Yc m18000() {
      return (Yc)this.f3000[f4000[1]];
   }

   public static C0697 m22000(Yc var0, NNNG var1) {
      ((C0697)f1000[f6000[0]]).f3000[f6000[1]] = var0;
      ((C0697)f1000[f6000[2]]).f3000[f6000[3]] = var1;
      return (C0697)f1000[f4000[0]];
   }

   public C0697 m24000(NNNG var1) {
      this.f3000[f4000[4]] = var1;
      return this;
   }

   public C0697 m26000(Yc var1) {
      this.f3000[f4000[3]] = var1;
      return this;
   }

   private void m32000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }
}
