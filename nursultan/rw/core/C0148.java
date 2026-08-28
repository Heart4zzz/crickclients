package rw.core;

// $VF: synthetic class
public class C0148 {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[8];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
      f2000[5] = (boolean)((1 | -1) >>> 31);
      f2000[6] = (boolean)((0 | -0) >>> 31);
      f2000[7] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[f2000[7]];
   }

   private static void m12000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
   }
}
