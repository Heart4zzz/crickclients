package rw.core;

// $VF: synthetic class
public class C1165 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[7];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = 4;
   }

   private static void m10000() {
      f2000 = new Object[f1000[6]];
   }
}
