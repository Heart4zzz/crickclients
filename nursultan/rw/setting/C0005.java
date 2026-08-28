package rw.setting;

public class C0005 {
   private static String[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   private static void m4000() {
      f2000 = new Object[f3000[2]];
   }

   private C0005() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = 5;
      f4000[2] = 4;
      f4000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m10000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "hotkey";
   }

   private static void m18000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }
}
