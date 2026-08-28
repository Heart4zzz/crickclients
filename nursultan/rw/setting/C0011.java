package rw.setting;

public class C0011 {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static String[] f4000;

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 5;
      f1000[2] = 4;
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   private C0011() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new Object[f2000[2]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "selectable";
   }
}
