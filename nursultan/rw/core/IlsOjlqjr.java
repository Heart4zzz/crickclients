package rw.core;

public class IlsOjlqjr {
   private static double[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   private static void m4000() {
      boolean[] var128 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
   }

   public IlsOjlqjr() {
      this.m26000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      double[] var128 = new double[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
   }

   private static void m8000() {
      f4000 = new Object[f5000[3]];
   }

   private static void m12000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public static IlsOjlqjr m14000(double var0) {
      IlsOjlqjr var10000 = (IlsOjlqjr)f4000[f3000[0]];
      Double var6 = var0;
      var10000.f2000[f3000[1]] = var6;
      return (IlsOjlqjr)f4000[f3000[2]];
   }

   public double m20000() {
      return (Double)this.f2000[f3000[3]];
   }

   public IlsOjlqjr m24000(double var1) {
      Double var7 = var1;
      this.f2000[f3000[4]] = var7;
      return this;
   }

   private void m26000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f5000[1]];
         Object[] var1 = this.f2000;
         var1[f5000[2]] = f1000[0];
      }
   }
}
