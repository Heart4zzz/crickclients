package rw.module;

import rw.Module;

public class Module021 extends Module {
   public static Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;

   public static Module021 m4000() {
      return (Module021)f1000[f2000[0]];
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m4000() {
      f1000 = new Object[f3000[1]];
   }

   private static void m6000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }
}
