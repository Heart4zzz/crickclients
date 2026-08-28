package rw.module;

import KDFzREm.NbL;
import rw.Module;

public class IltlnIij extends Module {
   public Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   private static short[] f5000;
   public static Object[] f6000;
   private static float[] f7000;
   private static short[] f8000;

   public float m2000() {
      this.m18000();
      return (Float)this.f1000[f8000[1]];
   }

   private static void m6000() {
      byte[] var128 = new byte[2];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = 2;
   }

   public IltlnIij() {
      this.m18000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f6000 = new Object[f2000[2]];
   }

   private static void m10000() {
      short[] var128 = new short[4];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[3];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[6];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      f8000[3] = (short)((0 | -0) >>> 31);
      f8000[4] = (short)((1 | -1) >>> 31);
      f8000[5] = 2;
   }

   public NbL m12000() {
      this.m18000();
      return (NbL)this.f1000[f8000[0]];
   }

   private static void m16000() {
      float[] var128 = new float[2];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
         var1[f2000[1]] = f7000[0];
         var1[f4000[1]] = f7000[1];
      }
   }

   public float m20000() {
      this.m18000();
      return (Float)this.f1000[f8000[2]];
   }

   public IltlnIij m24000(float var1) {
      this.m18000();
      Float var6 = var1;
      this.f1000[f8000[5]] = var6;
      return this;
   }

   public IltlnIij m26000(NbL var1) {
      this.m18000();
      this.f1000[f8000[3]] = var1;
      return this;
   }

   public static IltlnIij m28000(NbL var0, float var1, float var2) {
      ((IltlnIij)f6000[f5000[0]]).f1000[f5000[1]] = var0;
      IltlnIij var10000 = (IltlnIij)f6000[f5000[2]];
      Float var8 = var1;
      var10000.f1000[f5000[3]] = var8;
      var10000 = (IltlnIij)f6000[f3000[0]];
      Float var9 = var2;
      var10000.f1000[f3000[1]] = var9;
      return (IltlnIij)f6000[f3000[2]];
   }

   public IltlnIij m30000(float var1) {
      this.m18000();
      Float var6 = var1;
      this.f1000[f8000[4]] = var6;
      return this;
   }

   private static void m32000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }
}
