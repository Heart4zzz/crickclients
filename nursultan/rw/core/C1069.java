package rw.core;

// $VF: synthetic class
public class C1069 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      byte[] var128 = new byte[5];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
      f3000[3] = 3;
      f3000[4] = 4;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      f2000 = new Object[f4000[3]];
   }
}
