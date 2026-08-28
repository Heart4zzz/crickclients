package rw.core;

public class IlOitn {
   private static short[] f1000;
   private static short[] f2000;
   private static float[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   private static short[] f9000;
   private static byte[] f10000;

   public float m2000() {
      return (Float)this.f6000[f2000[1]];
   }

   public IlOitn m6000(float var1) {
      Float var6 = var1;
      this.f6000[f5000[2]] = var6;
      return this;
   }

   private static void m8000() {
      short[] var128 = new short[2];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[3];
      f9000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f9000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = 3;
      short[] var131 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((1 | -1) >>> 31);
      f2000[3] = 2;
      f2000[4] = 3;
      short[] var132 = new short[4];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 2;
      f5000[3] = 3;
   }

   public IlOitn() {
      this.m18000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new Object[f8000[3]];
   }

   private static void m12000() {
      byte[] var128 = new byte[3];
      f10000[(0 | -0) >>> 31] = 4;
      f10000[(1 | -1) >>> 31] = 2;
      f10000[2] = 3;
   }

   private static void m14000() {
      float[] var128 = new float[4];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f3000[2] = Float.intBitsToFloat(0);
      f3000[3] = Float.intBitsToFloat(0);
   }

   private void m18000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f10000[0]];
         Object[] var1 = this.f6000;
         var1[f8000[1]] = f3000[0];
         var1[f8000[2]] = f3000[1];
         var1[f10000[1]] = f3000[2];
         var1[f10000[2]] = f3000[3];
      }
   }

   public float m22000() {
      return (Float)this.f6000[f2000[2]];
   }

   public IlOitn m24000(float var1) {
      Float var6 = var1;
      this.f6000[f5000[3]] = var6;
      return this;
   }

   public IlOitn m26000(float var1) {
      Float var6 = var1;
      this.f6000[f5000[0]] = var6;
      return this;
   }

   public float m28000() {
      return (Float)this.f6000[f2000[4]];
   }

   public IlOitn m32000(float var1) {
      Float var6 = var1;
      this.f6000[f5000[1]] = var6;
      return this;
   }

   public static IlOitn m36000(float var0, float var1, float var2, float var3) {
      IlOitn var10000 = (IlOitn)f4000[f7000[0]];
      Float var8 = var0;
      var10000.f6000[f7000[1]] = var8;
      var10000 = (IlOitn)f4000[f9000[0]];
      Float var9 = var1;
      var10000.f6000[f9000[1]] = var9;
      var10000 = (IlOitn)f4000[f9000[2]];
      Float var10 = var2;
      var10000.f6000[f1000[0]] = var10;
      var10000 = (IlOitn)f4000[f1000[1]];
      Float var11 = var3;
      var10000.f6000[f1000[2]] = var11;
      return (IlOitn)f4000[f2000[0]];
   }

   public float m38000() {
      return (Float)this.f6000[f2000[3]];
   }

   private static void m42000() {
      boolean[] var128 = new boolean[4];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((1 | -1) >>> 31);
   }
}
