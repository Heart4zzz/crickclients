package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NQo;

public class C0691 {
   private static boolean[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   public Object[] f6000;
   private static short[] f7000;

   public int m4000() {
      return (Integer)this.f6000[f4000[3]];
   }

   private void m6000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f5000[0]];
         Object[] var1 = this.f6000;
         var1[f5000[1]] = Integer.valueOf(f1000[1]);
         var1[f5000[2]] = Integer.valueOf(f1000[2]);
      }
   }

   public C0691() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[f1000[3]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[4];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = 3;
      short[] var130 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = 2;
      f4000[4] = 3;
   }

   public NQo m14000() {
      return (NQo)this.f6000[f4000[2]];
   }

   public int m20000() {
      return (Integer)this.f6000[f4000[4]];
   }

   public NNBK m24000() {
      return (NNBK)this.f6000[f4000[1]];
   }

   public static C0691 m26000(NNBK var0, NQo var1, int var2, int var3) {
      ((C0691)f3000[f2000[0]]).f6000[f2000[1]] = var0;
      ((C0691)f3000[f2000[2]]).f6000[f2000[3]] = var1;
      C0691 var10000 = (C0691)f3000[f7000[0]];
      Integer var10 = var2;
      var10000.f6000[f7000[1]] = var10;
      var10000 = (C0691)f3000[f7000[2]];
      Integer var11 = var3;
      var10000.f6000[f7000[3]] = var11;
      return (C0691)f3000[f4000[0]];
   }

   private static void m32000() {
      byte[] var128 = new byte[3];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
   }
}
