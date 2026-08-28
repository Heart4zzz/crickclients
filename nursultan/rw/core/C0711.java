package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNNNEg;

public class C0711 {
   private static byte[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      f3000 = new Object[f5000[1]];
   }

   public C0711() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[0]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   public NNNNEg m14000() {
      return (NNNNEg)this.f4000[f6000[6]];
   }

   public static C0711 m18000(NNBK var0, NNNNEg var1) {
      ((C0711)f3000[f6000[0]]).f4000[f6000[1]] = var0;
      ((C0711)f3000[f6000[2]]).f4000[f6000[3]] = var1;
      return (C0711)f3000[f6000[4]];
   }

   public C0711 m20000(NNBK var1) {
      this.f4000[f6000[7]] = var1;
      return this;
   }

   public NNBK m22000() {
      return (NNBK)this.f4000[f6000[5]];
   }

   public C0711 m24000(NNNNEg var1) {
      this.f4000[f2000[0]] = var1;
      return this;
   }

   private static void m32000() {
      short[] var128 = new short[8];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = (short)((1 | -1) >>> 31);
      f6000[7] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
   }
}
