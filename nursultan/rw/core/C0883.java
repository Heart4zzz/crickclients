package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNBK;
import KDFzREm.NNNG;
import KDFzREm.NNda;
import KDFzREm.NNdc;
import KDFzREm.XD;

public class C0883 extends NNdc {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static byte[] f4000;
   private static boolean[] f5000;
   private static float[] f6000;

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
   }

   public C0883(int var1, int var2, int var3, int var4, NNNG var5, int var6, int var7, NNda var8) {
      super(var1, var2, var3, var4, NAN.i(), var8, field_40754);
      this.m22000();
      this.f3000[f2000[0]] = var5;
      Integer var14 = var6;
      this.f3000[f2000[1]] = var14;
      Integer var15 = var7;
      this.f3000[f2000[2]] = var15;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = 2;
      short[] var129 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = 2;
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = 2;
   }

   private static void m12000() {
      float[] var128 = new float[2];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m14000() {
      byte[] var128 = new byte[7];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 2;
      f4000[3] = 2;
      f4000[4] = -1;
      f4000[5] = 3;
      f4000[6] = 2;
   }

   private void m22000() {
      this.f3000 = new Object[f4000[5]];
      this.f3000[f5000[(0 | -0) >>> 31]] = Integer.valueOf(f5000[1]);
      this.f3000[f4000[6]] = Integer.valueOf(f5000[2]);
   }

   public void method_75752(NNBK var1, int var2, int var3, float var4) {
      this.m22000();
      this.method_75794(var1);
      int var5 = (Integer)this.f3000[f2000[3]] / f4000[0];
      int var6 = (Integer)this.f3000[f2000[4]] / f4000[1];
      int var7 = this.method_46426() + (this.field_22758 - var5) / f4000[2];
      int var8 = this.method_46427() + (this.field_22759 - var6) / f4000[3];
      var1.N(
         XD.Na,
         (NNNG)this.f3000[f1000[0]],
         var7,
         var8,
         f6000[0],
         f6000[1],
         var5,
         var6,
         (Integer)this.f3000[f1000[1]],
         (Integer)this.f3000[f1000[2]],
         (Integer)this.f3000[f1000[3]],
         (Integer)this.f3000[f1000[4]],
         f4000[4]
      );
   }
}
