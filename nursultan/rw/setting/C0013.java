package rw.setting;

public class C0013 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static String[] f4000;

   private static void m2000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 5;
      f3000[2] = 4;
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   private C0013() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "combo";
   }

   private static void m18000() {
      f2000 = new Object[f1000[4]];
   }
}
