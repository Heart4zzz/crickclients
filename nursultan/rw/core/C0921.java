package rw.core;

public class C0921 {
   private static short[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static boolean[] f7000;

   private static void m2000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[4];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public C0921() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f2000[0]];
         Object[] var1 = this.f5000;
         var1[f7000[1]] = f4000[0];
         var1[f7000[2]] = f4000[1];
      }
   }

   private static void m12000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m16000() {
      boolean[] var128 = new boolean[4];
      f7000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[2] = (boolean)((1 | -1) >>> 31);
      f7000[3] = (boolean)((1 | -1) >>> 31);
   }

   public float m18000() {
      return (Float)this.f5000[f6000[0]];
   }

   public C0921 m20000(float var1) {
      Float var6 = var1;
      this.f5000[f6000[2]] = var6;
      return this;
   }

   public static C0921 m24000(float var0, float var1) {
      C0921 var10000 = (C0921)f3000[f1000[0]];
      Float var6 = var0;
      var10000.f5000[f1000[1]] = var6;
      var10000 = (C0921)f3000[f1000[2]];
      Float var7 = var1;
      var10000.f5000[f1000[3]] = var7;
      return (C0921)f3000[f1000[4]];
   }

   public C0921 m26000(float var1) {
      Float var6 = var1;
      this.f5000[f6000[3]] = var6;
      return this;
   }

   public float m30000() {
      return (Float)this.f5000[f6000[1]];
   }

   private static void m32000() {
      f3000 = new Object[f7000[3]];
   }
}
