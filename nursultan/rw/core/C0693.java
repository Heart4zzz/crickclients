package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NQo;

public class C0693 {
   public Object[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   public static Object[] f6000;
   private static boolean[] f7000;

   public int m2000() {
      return (Integer)this.f1000[f5000[2]];
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = 2;
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = 3;
      f4000[5] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[4];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 2;
      f5000[3] = 3;
   }

   public C0693() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
   }

   private static void m10000() {
      f6000 = new Object[f7000[3]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[4];
      f7000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[2] = (boolean)((0 | -0) >>> 31);
      f7000[3] = (boolean)((1 | -1) >>> 31);
   }

   public NNBK m14000() {
      return (NNBK)this.f1000[f5000[0]];
   }

   public NQo m20000() {
      return (NQo)this.f1000[f5000[1]];
   }

   public static C0693 m24000(NNBK var0, NQo var1, int var2, int var3) {
      ((C0693)f6000[f2000[0]]).f1000[f2000[1]] = var0;
      ((C0693)f6000[f2000[2]]).f1000[f4000[0]] = var1;
      C0693 var10000 = (C0693)f6000[f4000[1]];
      Integer var10 = var2;
      var10000.f1000[f4000[2]] = var10;
      var10000 = (C0693)f6000[f4000[3]];
      Integer var11 = var3;
      var10000.f1000[f4000[4]] = var11;
      return (C0693)f6000[f4000[5]];
   }

   public int m26000() {
      return (Integer)this.f1000[f5000[3]];
   }

   private void m28000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
         var1[f3000[1]] = Integer.valueOf(f7000[1]);
         var1[f3000[2]] = Integer.valueOf(f7000[2]);
      }
   }
}
