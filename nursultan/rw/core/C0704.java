package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNNNEg;

public class C0704 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   public Object[] f6000;

   private void m2000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f5000[0]];
         Object[] var1 = this.f6000;
      }
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0704() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
   }

   private static void m12000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   public NNNNEg m14000() {
      return (NNNNEg)this.f6000[f4000[2]];
   }

   public static C0704 m18000(NNBK var0, NNNNEg var1) {
      ((C0704)f2000[f3000[0]]).f6000[f3000[1]] = var0;
      ((C0704)f2000[f3000[2]]).f6000[f3000[3]] = var1;
      return (C0704)f2000[f4000[0]];
   }

   public C0704 m22000(NNNNEg var1) {
      this.f6000[f4000[4]] = var1;
      return this;
   }

   public C0704 m24000(NNBK var1) {
      this.f6000[f4000[3]] = var1;
      return this;
   }

   public NNBK m26000() {
      return (NNBK)this.f6000[f4000[1]];
   }

   private static void m30000() {
      f2000 = new Object[f1000[1]];
   }
}
