package rw.core;

public class C0985 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static short[] f6000;

   private static void m4000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = 9999;
   }

   private C0985() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 7;
      f3000[(1 | -1) >>> 31] = 52;
      f3000[2] = 2;
      byte[] var129 = new byte[6];
      f4000[(0 | -0) >>> 31] = 24;
      f4000[(1 | -1) >>> 31] = 3;
      f4000[2] = 28;
      f4000[3] = 4;
      f4000[4] = 20;
      f4000[5] = 5;
      byte[] var130 = new byte[3];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 6;
      f5000[2] = 22;
   }

   private static void m12000() {
      f2000 = new Object[f3000[(0 | -0) >>> 31]];
      f2000[f1000[(0 | -0) >>> 31]] = Integer.valueOf(f6000[0]);
      f2000[f1000[(1 | -1) >>> 31]] = Integer.valueOf(f3000[1]);
      f2000[f3000[2]] = Integer.valueOf(f4000[0]);
      f2000[f4000[(1 | -1) >>> 31]] = Integer.valueOf(f4000[2]);
      f2000[f4000[3]] = Integer.valueOf(f4000[4]);
      f2000[f4000[5]] = Integer.valueOf(f5000[0]);
      f2000[f5000[(1 | -1) >>> 31]] = Integer.valueOf(f5000[2]);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
