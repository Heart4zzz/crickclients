package rw.core;

// $VF: synthetic class
public class C0772 {
   private static boolean[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      byte[] var128 = new byte[2];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 3;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[6];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f3000 = new Object[f1000[5]];
   }
}
