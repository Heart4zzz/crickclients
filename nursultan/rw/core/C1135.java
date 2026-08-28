package rw.core;

public class C1135 {
   private static long[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   public static Object[] f4000;
   private static byte[] f5000;

   private static void m4000() {
      byte[] var128 = new byte[6];
      f5000[(0 | -0) >>> 31] = 5;
      f5000[(1 | -1) >>> 31] = 16;
      f5000[2] = 64;
      f5000[3] = 2;
      f5000[4] = 3;
      f5000[5] = 4;
   }

   private C1135() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
   }

   private static void m12000() {
      f4000 = new Object[f5000[(0 | -0) >>> 31]];
      f4000[f3000[(0 | -0) >>> 31]] = Integer.valueOf(f5000[1]);
      f4000[f3000[(1 | -1) >>> 31]] = Integer.valueOf(f5000[2]);
      f4000[f5000[3]] = Integer.valueOf(f2000[0]);
      f4000[f5000[4]] = f1000[0];
      f4000[f5000[5]] = Integer.valueOf(f3000[2]);
   }

   private static void m14000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 0L;
   }

   private static void m22000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 9999;
   }
}
