package rw.core;

public class C0721 {
   public static Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;

   private static void m4000() {
      f1000 = new Object[f3000[1]];
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public static C0721 m12000() {
      return (C0721)f1000[f2000[0]];
   }
}
