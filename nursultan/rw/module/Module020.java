package rw.module;

import rw.Module;

public class Module020 extends Module {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;

   public static Module020 m2000() {
      return (Module020)f3000[f1000[0]];
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f3000 = new Object[f2000[1]];
   }

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
