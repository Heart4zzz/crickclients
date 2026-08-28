package rw.module;

import rw.Module;

public class AttackAura extends Module {
   private static float[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static boolean[] f10000;
   private static short[] f11000;
   private static double[] f12000;
   public static Object[] f13000;

   public boolean m4000() {
      this.m28000();
      return (Boolean)this.f9000[f5000[3]];
   }

   public AttackAura m6000(double var1) {
      this.m28000();
      Double var7 = var1;
      this.f9000[f2000[2]] = var7;
      return this;
   }

   public AttackAura m8000(boolean var1) {
      this.m28000();
      Boolean var6 = var1;
      this.f9000[f6000[2]] = var6;
      return this;
   }

   public float m10000() {
      this.m28000();
      return (Float)this.f9000[f5000[0]];
   }

   private static void m12000() {
      f13000 = new Object[f10000[5]];
   }

   public AttackAura() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   public double m14000() {
      this.m28000();
      return (Double)this.f9000[f6000[3]];
   }

   public float m16000() {
      this.m28000();
      return (Float)this.f9000[f5000[1]];
   }

   public double m18000() {
      this.m28000();
      return (Double)this.f9000[f6000[4]];
   }

   private static void m22000() {
      byte[] var128 = new byte[6];
      f4000[(0 | -0) >>> 31] = 7;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = 4;
      f4000[4] = 5;
      f4000[5] = 6;
   }

   private static void m24000() {
      short[] var128 = new short[6];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = (short)((1 | -1) >>> 31);
      f8000[4] = (short)((0 | -0) >>> 31);
      f8000[5] = 2;
      short[] var129 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = 4;
      f3000[4] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[2];
      f7000[(0 | -0) >>> 31] = 5;
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[4];
      f2000[(0 | -0) >>> 31] = 6;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      short[] var132 = new short[2];
      f11000[(0 | -0) >>> 31] = 2;
      f11000[(1 | -1) >>> 31] = 3;
      short[] var133 = new short[6];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 5;
      f6000[2] = 6;
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = 2;
      short[] var134 = new short[4];
      f5000[(0 | -0) >>> 31] = 3;
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = 5;
      f5000[3] = 6;
   }

   private static void m26000() {
      double[] var128 = new double[3];
      f12000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f12000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f12000[2] = Double.longBitsToDouble(0L);
   }

   private void m28000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[f4000[0]];
         Object[] var1 = this.f9000;
         var1[f10000[1]] = f12000[0];
         var1[f10000[2]] = f12000[1];
         var1[f4000[1]] = f12000[2];
         var1[f4000[2]] = f1000[0];
         var1[f4000[3]] = f1000[1];
         var1[f4000[4]] = f10000[3];
         var1[f4000[5]] = f10000[4];
      }
   }

   public double m32000() {
      this.m28000();
      return (Double)this.f9000[f6000[5]];
   }

   public AttackAura m34000(boolean var1) {
      this.m28000();
      Boolean var6 = var1;
      this.f9000[f6000[1]] = var6;
      return this;
   }

   public AttackAura m36000(float var1) {
      this.m28000();
      Float var6 = var1;
      this.f9000[f6000[0]] = var6;
      return this;
   }

   public AttackAura m38000(double var1) {
      this.m28000();
      Double var7 = var1;
      this.f9000[f2000[3]] = var7;
      return this;
   }

   private static void m40000() {
      float[] var128 = new float[2];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   public AttackAura m42000(double var1) {
      this.m28000();
      Double var7 = var1;
      this.f9000[f11000[0]] = var7;
      return this;
   }

   public static AttackAura m44000(double var0, double var2, double var4, float var6, float var7, boolean var8, boolean var9) {
      AttackAura var10000 = (AttackAura)f13000[f8000[0]];
      Double var14 = var0;
      var10000.f9000[f8000[1]] = var14;
      var10000 = (AttackAura)f13000[f8000[2]];
      Double var15 = var2;
      var10000.f9000[f8000[3]] = var15;
      var10000 = (AttackAura)f13000[f8000[4]];
      Double var16 = var4;
      var10000.f9000[f8000[5]] = var16;
      var10000 = (AttackAura)f13000[f3000[0]];
      Float var17 = var6;
      var10000.f9000[f3000[1]] = var17;
      var10000 = (AttackAura)f13000[f3000[2]];
      Float var18 = var7;
      var10000.f9000[f3000[3]] = var18;
      var10000 = (AttackAura)f13000[f3000[4]];
      Boolean var19 = var8;
      var10000.f9000[f7000[0]] = var19;
      var10000 = (AttackAura)f13000[f7000[1]];
      Boolean var20 = var9;
      var10000.f9000[f2000[0]] = var20;
      return (AttackAura)f13000[f2000[1]];
   }

   public AttackAura m46000(float var1) {
      this.m28000();
      Float var6 = var1;
      this.f9000[f11000[1]] = var6;
      return this;
   }

   private static void m50000() {
      boolean[] var128 = new boolean[6];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[2] = (boolean)((1 | -1) >>> 31);
      f10000[3] = (boolean)((0 | -0) >>> 31);
      f10000[4] = (boolean)((0 | -0) >>> 31);
      f10000[5] = (boolean)((1 | -1) >>> 31);
   }

   public boolean m54000() {
      this.m28000();
      return (Boolean)this.f9000[f5000[2]];
   }
}
