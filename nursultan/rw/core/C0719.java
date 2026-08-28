package rw.core;

public class C0719 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static short[] f3000;

   private static void m2000() {
      f2000 = new Object[f1000[1]];
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public static C0719 m14000() {
      return (C0719)f2000[f3000[0]];
   }
}
