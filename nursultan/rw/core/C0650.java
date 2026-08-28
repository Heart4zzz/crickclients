package rw.core;

public class C0650 {
   private static int[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;

   private static void m4000() {
      f3000 = new Object[f5000[(0 | -0) >>> 31]];
      f3000[f4000[(0 | -0) >>> 31]] = f2000[(1 | -1) >>> 31];
      f3000[f4000[(1 | -1) >>> 31]] = f1000[0];
      f3000[f5000[(1 | -1) >>> 31]] = Short.valueOf(f5000[2]);
      f3000[f5000[3]] = Short.valueOf(f5000[4]);
      f3000[f5000[5]] = Short.valueOf(f5000[6]);
   }

   private C0650() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[7];
      f5000[(0 | -0) >>> 31] = 5;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 16;
      f5000[3] = 3;
      f5000[4] = 15;
      f5000[5] = 4;
      f5000[6] = 15;
   }

   private static void m10000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 4194304;
   }

   private static void m18000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m22000() {
      f2000 = new String[2];
      f2000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
      f2000[(1 | -1) >>> 31] = "/ws";
   }
}
