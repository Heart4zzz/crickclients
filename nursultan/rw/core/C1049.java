package rw.core;

import rw.api.Iface0204;
import rw.defs.StepStart;

public class C1049 implements Iface0204 {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;
   public Object[] f6000;

   float m4000() {
      return StepStart.f4000.m6000((Float)this.f6000[f2000[2]]);
   }

   private void m6000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f3000[0]];
         Object[] var1 = this.f6000;
         var1[f5000[3]] = f4000[3];
         var1[f5000[4]] = f4000[4];
      }
   }

   private C1049() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   float m8000() {
      return (Float)this.f6000[f2000[1]];
   }

   private static void m10000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((1 | -1) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[7];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((0 | -0) >>> 31);
   }

   private static void m14000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   private static void m18000() {
      float[] var128 = new float[5];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f4000[2] = Float.intBitsToFloat(1043878380);
      f4000[3] = Float.intBitsToFloat(0);
      f4000[4] = Float.intBitsToFloat(0);
   }

   void m20000(boolean var1) {
      Float var6 = var1 ? f4000[0] : f4000[1];
      this.f6000[f2000[0]] = var6;
   }

   public boolean m24000() {
      return this.f6000[f2000[3]] != this.f6000[f2000[4]] ? f5000[0] : f5000[1];
   }

   public boolean m26000(float var1) {
      float var2 = var1 / f4000[2];
      if ((Float)this.f6000[f2000[5]] < (Float)this.f6000[f1000[0]]) {
         Float var7 = Math.min((Float)this.f6000[f1000[1]], (Float)this.f6000[f1000[2]] + var2);
         this.f6000[f1000[3]] = var7;
      } else {
         Float var8 = Math.max((Float)this.f6000[f1000[4]], (Float)this.f6000[f1000[5]] - var2);
         this.f6000[f1000[6]] = var8;
      }

      return f5000[2];
   }

   private static void m28000() {
      boolean[] var128 = new boolean[5];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
   }
}
