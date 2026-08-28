package rw.setting;

public class C0006 {
   private static short[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 5;
      f1000[2] = 4;
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   private C0006() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new Object[f4000[1]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "switch";
   }
}
