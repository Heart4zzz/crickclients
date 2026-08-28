package rw.core;

public class C0905 {
   private static boolean[] f1000;
   private static short[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new Object[f1000[1]];
   }

   private static void m8000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public static C0905 m12000() {
      return (C0905)f3000[f2000[0]];
   }
}
