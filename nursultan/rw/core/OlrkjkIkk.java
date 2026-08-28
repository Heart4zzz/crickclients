package rw.core;

public class OlrkjkIkk {
   public static Object[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
   }

   public OlrkjkIkk() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f4000[1]];
         Object[] var1 = this.f3000;
         var1[f4000[2]] = Integer.valueOf(f4000[3]);
      }
   }

   private static void m14000() {
      f1000 = new Object[f4000[4]];
   }

   public OlrkjkIkk m16000(int var1) {
      Integer var6 = var1;
      this.f3000[f2000[4]] = var6;
      return this;
   }

   public static OlrkjkIkk m18000(int var0) {
      OlrkjkIkk var10000 = (OlrkjkIkk)f1000[f2000[0]];
      Integer var5 = var0;
      var10000.f3000[f2000[1]] = var5;
      return (OlrkjkIkk)f1000[f2000[2]];
   }

   public int m20000() {
      return (Integer)this.f3000[f2000[3]];
   }
}
