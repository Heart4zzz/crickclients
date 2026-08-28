package rw.core;

public class C0819 implements AutoCloseable {
   private static byte[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f4000[4]];
         Object[] var1 = this.f2000;
         var1[f4000[5]] = f4000[6];
      }
   }

   private C0819(boolean var1) {
      this.m2000();
      Boolean var6 = var1;
      this.f2000[f5000[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
   }

   public void m8000() {
      if ((Boolean)this.f2000[f5000[1]]) {
         OlrOnnk.m38000();
      }
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   private static void m16000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m18000() {
      f3000 = new Object[f1000[1]];
   }
}
