package rw.module;

import rw.Module;

public class AirStuck extends Module {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;

   public static AirStuck m4000() {
      return (AirStuck)f1000[f3000[0]];
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      f1000 = new Object[f2000[1]];
   }
}
