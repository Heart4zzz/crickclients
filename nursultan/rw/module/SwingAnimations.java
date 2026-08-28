package rw.module;

import KDFzREm.NNIo;
import KDFzREm.Nbh;
import rw.Module;

public class SwingAnimations extends Module {
   public static Object[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static byte[] f7000;

   public float m2000() {
      this.m6000();
      return (Float)this.f3000[f2000[2]];
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f7000[0]];
         Object[] var1 = this.f3000;
         var1[f4000[1]] = f5000[0];
         var1[f4000[2]] = f5000[1];
      }
   }

   public SwingAnimations() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      float[] var128 = new float[2];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
   }

   public Nbh m12000() {
      this.m6000();
      return (Nbh)this.f3000[f2000[4]];
   }

   private static void m16000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = 4;
   }

   private static void m18000() {
      f1000 = new Object[f4000[3]];
   }

   public NNIo m22000() {
      this.m6000();
      return (NNIo)this.f3000[f2000[5]];
   }

   private static void m24000() {
      short[] var128 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = 3;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      f6000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = 2;
      f2000[5] = 3;
   }

   public static SwingAnimations m26000(Nbh var0, NNIo var1, float var2, float var3) {
      ((SwingAnimations)f1000[f6000[0]]).f3000[f6000[1]] = var0;
      ((SwingAnimations)f1000[f6000[2]]).f3000[f6000[3]] = var1;
      SwingAnimations var10000 = (SwingAnimations)f1000[f6000[4]];
      Float var10 = var2;
      var10000.f3000[f6000[5]] = var10;
      var10000 = (SwingAnimations)f1000[f6000[6]];
      Float var11 = var3;
      var10000.f3000[f2000[0]] = var11;
      return (SwingAnimations)f1000[f2000[1]];
   }

   public float m28000() {
      this.m6000();
      return (Float)this.f3000[f2000[3]];
   }
}
