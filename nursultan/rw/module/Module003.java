package rw.module;

import rw.Module;

public class Module003 extends Module {
   private static short[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;

   public static Module003 m4000() {
      return (Module003)f2000[f1000[0]];
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f2000 = new Object[f3000[1]];
   }
}
