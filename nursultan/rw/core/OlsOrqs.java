package rw.core;

import KDFzREm.NXi;

public class OlsOrqs {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   private static byte[] f4000;
   private static double[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static short[] f11000;

   private static void m2000() {
      float[] var128 = new float[4];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(1097859072);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f10000[2] = Float.intBitsToFloat(1065353216);
      f10000[3] = Float.intBitsToFloat(0);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[8];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((0 | -0) >>> 31);
      f2000[7] = (boolean)((0 | -0) >>> 31);
   }

   public OlsOrqs(NXi var1, NXi var2, float var3, int var4) {
      this.m16000();
      this.f8000[f7000[0]] = var1;
      this.f8000[f7000[1]] = var2;
      Float var17 = var3;
      this.f3000[f7000[2]] = var17;
      Integer var18 = var4;
      this.f3000[f7000[3]] = var18;
      double var5 = Math.random() - f5000[0];
      double var7 = f5000[1] + Math.random() * f5000[2];
      double var9 = Math.random() - f5000[3];
      NXi var19 = new NXi(var5, var7, var9).L(f5000[4]);
      this.f8000[f7000[4]] = var19;
      NXi var20 = new NXi(Math.random() - f5000[5], Math.random() - f5000[6], Math.random() - f5000[7]).u();
      this.f8000[f1000[0]] = var20;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((1 | -1) >>> 31);
      f7000[4] = 2;
      short[] var129 = new short[4];
      f1000[(0 | -0) >>> 31] = 4;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f9000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = 2;
      f9000[2] = 3;
      short[] var131 = new short[6];
      f11000[(0 | -0) >>> 31] = 4;
      f11000[(1 | -1) >>> 31] = 2;
      f11000[2] = 2;
      f11000[3] = (short)((0 | -0) >>> 31);
      f11000[4] = 3;
      f11000[5] = 2;
      short[] var132 = new short[8];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = 3;
      f6000[3] = 3;
      f6000[4] = 2;
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = 2;
      f6000[7] = (short)((1 | -1) >>> 31);
   }

   private static void m10000() {
      double[] var128 = new double[8];
      f5000[(0 | -0) >>> 31] = Double.longBitsToDouble(4602678819172646912L);
      f5000[(1 | -1) >>> 31] = Double.longBitsToDouble(4590429028186199163L);
      f5000[2] = Double.longBitsToDouble(4602678819172646912L);
      f5000[3] = Double.longBitsToDouble(4602678819172646912L);
      f5000[4] = Double.longBitsToDouble(4596373779694328218L);
      f5000[5] = Double.longBitsToDouble(4602678819172646912L);
      f5000[6] = Double.longBitsToDouble(4602678819172646912L);
      f5000[7] = Double.longBitsToDouble(4602678819172646912L);
   }

   private void m16000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[f4000[1]];
         Object[] var1 = this.f8000;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[f4000[2]];
         Object[] var2 = this.f3000;
         var2[f2000[3]] = f10000[3];
         var2[f2000[4]] = Integer.valueOf(f2000[5]);
         var2[f4000[3]] = Integer.valueOf(f2000[6]);
         var2[f4000[4]] = Integer.valueOf(f2000[7]);
      }
   }

   public void m18000() {
      Integer var6 = (Integer)this.f3000[f1000[1]] + f2000[0];
      this.f3000[f1000[2]] = var6;
      NXi var7 = (NXi)this.f8000[f1000[3]];
      this.f8000[f9000[0]] = var7;
      byte var1 = f4000[0];
      if ((Integer)this.f3000[f9000[1]] % var1 == 0 || (NXi)this.f8000[f9000[2]] == null) {
         NXi var8 = ((NXi)this.f8000[f11000[0]])
            .u()
            .B((NXi)this.f8000[f11000[1]])
            .L(Math.min(((Integer)this.f3000[f11000[2]]).intValue() / f10000[0], f10000[1]))
            .i((NXi)this.f8000[f11000[3]]);
         this.f8000[f11000[4]] = var8;
         Integer var9 = (Integer)this.f3000[f11000[5]] + var1;
         this.f3000[f6000[0]] = var9;
      }

      NXi var10 = ((NXi)this.f8000[f6000[1]]).N((NXi)this.f8000[f6000[2]], f10000[2] / ((Integer)this.f3000[f6000[3]] - (Integer)this.f3000[f6000[4]]));
      this.f8000[f6000[5]] = var10;
   }

   public boolean m24000() {
      return this.f3000[f6000[6]] > this.f3000[f6000[7]] ? f2000[1] : f2000[2];
   }

   private static void m28000() {
      byte[] var128 = new byte[5];
      f4000[(0 | -0) >>> 31] = 5;
      f4000[(1 | -1) >>> 31] = 5;
      f4000[2] = 4;
      f4000[3] = 2;
      f4000[4] = 3;
   }
}
