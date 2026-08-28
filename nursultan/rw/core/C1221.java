package rw.core;

public class C1221 {
   public static Object[] f1000;
   private static boolean[] f2000;

   private C1221() {
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
   }

   private static void m6000() {
      f1000 = new Object[f2000[(0 | -0) >>> 31]];
      f1000[f2000[(1 | -1) >>> 31]] = Byte.valueOf(f2000[2]);
   }
}
