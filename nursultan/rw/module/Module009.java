package rw.module;

import rw.Module;

public class Module009 extends Module {
   private static boolean[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f2000 = new Object[f1000[1]];
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
