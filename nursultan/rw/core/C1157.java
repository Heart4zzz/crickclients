package rw.core;

import KDFzREm.NjL;

public class C1157 {
   private static short[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static byte[] f7000;
   public static Object[] f8000;

   public boolean m4000() {
      return (Boolean)this.f6000[f4000[1]];
   }

   private static void m6000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[2];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = 2;
   }

   public C1157() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[2];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = 2;
   }

   private void m10000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f7000[0]];
         Object[] var1 = this.f6000;
         var1[f7000[1]] = f3000[1];
      }
   }

   private static void m14000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   public NjL m16000() {
      return (NjL)this.f6000[f1000[3]];
   }

   public C1157 m20000(C0983 var1) {
      this.f6000[f4000[3]] = var1;
      return this;
   }

   public static C1157 m22000(NjL var0, C0983 var1, boolean var2) {
      ((C1157)f8000[f5000[0]]).f6000[f5000[1]] = var0;
      ((C1157)f8000[f2000[0]]).f6000[f2000[1]] = var1;
      C1157 var10000 = (C1157)f8000[f1000[0]];
      Boolean var9 = var2;
      var10000.f6000[f1000[1]] = var9;
      return (C1157)f8000[f1000[2]];
   }

   public C0983 m24000() {
      return (C0983)this.f6000[f4000[0]];
   }

   public C1157 m28000(boolean var1) {
      Boolean var6 = var1;
      this.f6000[f4000[4]] = var6;
      return this;
   }

   public C1157 m30000(NjL var1) {
      this.f6000[f4000[2]] = var1;
      return this;
   }

   private static void m32000() {
      f8000 = new Object[f3000[2]];
   }
}
