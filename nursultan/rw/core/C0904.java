package rw.core;

public class C0904 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   public Object[] f5000;

   private void m2000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f1000[1]];
         Object[] var1 = this.f5000;
         var1[f1000[2]] = f2000[0];
      }
   }

   public C0904() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f4000 = new Object[f1000[3]];
   }

   private static void m10000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public static C0904 m12000(float var0) {
      C0904 var10000 = (C0904)f4000[f3000[0]];
      Float var5 = var0;
      var10000.f5000[f3000[1]] = var5;
      return (C0904)f4000[f3000[2]];
   }

   private static void m16000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   public float m18000() {
      return (Float)this.f5000[f3000[3]];
   }

   public C0904 m22000(float var1) {
      Float var6 = var1;
      this.f5000[f3000[4]] = var6;
      return this;
   }

   private static void m24000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }
}
