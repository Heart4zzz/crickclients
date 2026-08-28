package rw.core;

// $VF: synthetic class
public class C1067 {
   private static boolean[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      f1000[7] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[3];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 3;
   }

   private static void m10000() {
      f3000 = new Object[f1000[7]];
   }
}
