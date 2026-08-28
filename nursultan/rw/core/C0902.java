package rw.core;

public class C0902 {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m8000() {
      f3000 = new Object[f2000[1]];
   }

   public static C0902 m14000() {
      return (C0902)f3000[f1000[0]];
   }
}
