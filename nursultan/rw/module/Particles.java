package rw.module;

import KDFzREm.NNUB;
import KDFzREm.NNUW;
import rw.Module;

public class Particles extends Module {
   private static short[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   public static Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static double[] f8000;
   private static byte[] f9000;
   public Object[] f10000;
   private static short[] f11000;

   public void m2000(double var1) {
      this.m10000();
      Double var7 = var1;
      this.f10000[f1000[2]] = var7;
   }

   public NNUW m4000() {
      this.m10000();
      return (NNUW)this.f10000[f7000[1]];
   }

   public double m8000() {
      this.m10000();
      return (Double)this.f10000[f2000[1]];
   }

   private void m10000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[f9000[0]];
         Object[] var1 = this.f10000;
         var1[f9000[1]] = f4000[0];
         var1[f9000[2]] = f4000[1];
         var1[f9000[3]] = f8000[0];
         var1[f9000[4]] = f8000[1];
         var1[f9000[5]] = f8000[2];
      }
   }

   public Particles() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   public double m12000() {
      this.m10000();
      return (Double)this.f10000[f2000[3]];
   }

   public NNUB m14000() {
      this.m10000();
      return (NNUB)this.f10000[f7000[0]];
   }

   public float m18000() {
      this.m10000();
      return (Float)this.f10000[f7000[2]];
   }

   private static void m20000() {
      double[] var128 = new double[3];
      f8000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f8000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f8000[2] = Double.longBitsToDouble(0L);
   }

   private static void m22000() {
      f5000 = new Object[f3000[1]];
   }

   private static void m24000() {
      short[] var128 = new short[8];
      f11000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f11000[2] = (short)((0 | -0) >>> 31);
      f11000[3] = (short)((1 | -1) >>> 31);
      f11000[4] = (short)((0 | -0) >>> 31);
      f11000[5] = 2;
      f11000[6] = (short)((0 | -0) >>> 31);
      f11000[7] = 3;
      short[] var129 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = 5;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = 6;
      f6000[6] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 2;
      short[] var131 = new short[6];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = 5;
      f2000[3] = 6;
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
      short[] var132 = new short[5];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 4;
      f1000[3] = 5;
      f1000[4] = 6;
   }

   private static void m26000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public double m28000() {
      this.m10000();
      return (Double)this.f10000[f2000[2]];
   }

   public void m32000(float var1) {
      this.m10000();
      Float var6 = var1;
      this.f10000[f1000[0]] = var6;
   }

   public void m34000(double var1) {
      this.m10000();
      Double var7 = var1;
      this.f10000[f1000[3]] = var7;
   }

   private static void m36000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   public void m38000(NNUB var1) {
      this.m10000();
      this.f10000[f2000[4]] = var1;
   }

   public static Particles m40000(NNUB var0, NNUW var1, float var2, float var3, double var4, double var6, double var8) {
      ((Particles)f5000[f11000[0]]).f10000[f11000[1]] = var0;
      ((Particles)f5000[f11000[2]]).f10000[f11000[3]] = var1;
      Particles var10000 = (Particles)f5000[f11000[4]];
      Float var16 = var3;
      var10000.f10000[f11000[5]] = var16;
      var10000 = (Particles)f5000[f11000[6]];
      Float var17 = var2;
      var10000.f10000[f11000[7]] = var17;
      var10000 = (Particles)f5000[f6000[0]];
      Double var18 = var4;
      var10000.f10000[f6000[1]] = var18;
      var10000 = (Particles)f5000[f6000[2]];
      Double var19 = var6;
      var10000.f10000[f6000[3]] = var19;
      var10000 = (Particles)f5000[f6000[4]];
      Double var20 = var8;
      var10000.f10000[f6000[5]] = var20;
      return (Particles)f5000[f6000[6]];
   }

   public void m44000(NNUW var1) {
      this.m10000();
      this.f10000[f2000[5]] = var1;
   }

   public void m46000(float var1) {
      this.m10000();
      Float var6 = var1;
      this.f10000[f1000[1]] = var6;
   }

   public void m48000(double var1) {
      this.m10000();
      Double var7 = var1;
      this.f10000[f1000[4]] = var7;
   }

   private static void m52000() {
      byte[] var128 = new byte[6];
      f9000[(0 | -0) >>> 31] = 7;
      f9000[(1 | -1) >>> 31] = 2;
      f9000[2] = 3;
      f9000[3] = 4;
      f9000[4] = 5;
      f9000[5] = 6;
   }

   public float m56000() {
      this.m10000();
      return (Float)this.f10000[f2000[0]];
   }
}
