package rw.core;

public class C0156 {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   private static long[] f4000;
   public static Object[] f5000;

   private static void m2000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
   }

   public C0156() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[1]];
         Object[] var1 = this.f3000;
         var1[f2000[2]] = f4000[0];
      }
   }

   private static void m10000() {
      f5000 = new Object[f2000[3]];
   }

   private static void m14000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
   }

   public static C0156 m16000(long var0) {
      C0156 var10000 = (C0156)f5000[f1000[0]];
      Long var6 = var0;
      var10000.f3000[f1000[1]] = var6;
      return (C0156)f5000[f1000[2]];
   }

   public C0156 m20000(long var1) {
      Long var7 = var1;
      this.f3000[f1000[4]] = var7;
      return this;
   }

   public long m24000() {
      return (Long)this.f3000[f1000[3]];
   }

   private static void m26000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 0L;
   }
}
