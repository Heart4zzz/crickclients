package rw.core;

import KDFzREm.NXi;
import rw.api.Iface0659;

public class C0741 {
   public Object[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;

   void m4000() {
      Integer var5 = (Integer)this.f1000[f6000[1]] + f5000[0];
      this.f1000[f6000[2]] = var5;
   }

   private static void m6000() {
      f3000 = new Object[f4000[4]];
      f3000[f5000[5]] = Integer.valueOf(f4000[5]);
      f3000[f5000[6]] = Integer.valueOf(f4000[6]);
   }

   C0741(NXi var1) {
      this.m10000();
      this.f1000[f6000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      float[] var128 = new float[2];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[3]];
         Object[] var1 = this.f1000;
         var1[f5000[3]] = Integer.valueOf(f5000[4]);
      }
   }

   private static void m14000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = 4;
   }

   private static void m20000() {
      byte[] var128 = new byte[7];
      f4000[(0 | -0) >>> 31] = 60;
      f4000[(1 | -1) >>> 31] = 60;
      f4000[2] = 30;
      f4000[3] = 2;
      f4000[4] = 2;
      f4000[5] = 60;
      f4000[6] = 30;
   }

   float m22000(float var1) {
      return f2000[0] - this.m30000(f4000[1], var1);
   }

   float m24000(float var1) {
      return this.m30000(f4000[2], var1);
   }

   boolean m28000() {
      return this.f1000[f6000[3]] >= f4000[0] ? f5000[1] : f5000[2];
   }

   private float m30000(int var1, float var2) {
      float var3 = Math.min(f2000[1], (((Integer)this.f1000[f6000[4]]).intValue() + var2) / var1);
      return (float)((Iface0659)C1182.f30000[f6000[5]]).m2000(var3);
   }

   private static void m32000() {
      boolean[] var128 = new boolean[7];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((0 | -0) >>> 31);
      f5000[6] = (boolean)((1 | -1) >>> 31);
   }
}
