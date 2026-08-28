package rw.setting;

public class C0003 {
   public static Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static String[] f4000;

   private static void m4000() {
      f1000 = new Object[f3000[2]];
   }

   private C0003() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = 4;
      f2000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m14000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "slider";
   }
}
