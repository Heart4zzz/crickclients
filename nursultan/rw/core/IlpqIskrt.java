package rw.core;

public class IlpqIskrt {
   private static float[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   public IlpqIskrt() {
      this.m14000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
   }

   private void m14000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f5000[1]];
         Object[] var1 = this.f4000;
         var1[f5000[2]] = f1000[0];
      }
   }

   public IlpqIskrt m16000(float var1) {
      Float var6 = var1;
      this.f4000[f3000[4]] = var6;
      return this;
   }

   public static IlpqIskrt m20000(float var0) {
      IlpqIskrt var10000 = (IlpqIskrt)f2000[f3000[0]];
      Float var5 = var0;
      var10000.f4000[f3000[1]] = var5;
      return (IlpqIskrt)f2000[f3000[2]];
   }

   public float m22000() {
      return (Float)this.f4000[f3000[3]];
   }

   private static void m26000() {
      f2000 = new Object[f5000[3]];
   }
}
