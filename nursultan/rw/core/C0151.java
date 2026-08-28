package rw.core;

public class C0151 {
   public static Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m8000() {
      f1000 = new Object[f3000[1]];
   }

   public static C0151 m14000() {
      return (C0151)f1000[f2000[0]];
   }
}
