package rw.core;

public class C1159 {
   public static Object[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static int[] f4000;
   private static String[] f5000;
   private static byte[] f6000;

   private static void m2000() {
      f5000 = new String[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = "^[A-Za-zА-Яа-яЁё0-9 _-]+$";
   }

   private C1159() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[2];
      f2000[(0 | -0) >>> 31] = 5;
      f2000[(1 | -1) >>> 31] = 6;
      byte[] var129 = new byte[7];
      f6000[(0 | -0) >>> 31] = 7;
      f6000[(1 | -1) >>> 31] = 3;
      f6000[2] = 32;
      f6000[3] = 2;
      f6000[4] = 3;
      f6000[5] = 4;
      f6000[6] = 50;
   }

   private static void m10000() {
      f1000 = new Object[f6000[(0 | -0) >>> 31]];
      f1000[f3000[(1 | -1) >>> 31]] = Integer.valueOf(f6000[1]);
      f1000[f3000[2]] = Integer.valueOf(f6000[2]);
      f1000[f6000[3]] = f4000[0];
      f1000[f6000[4]] = f4000[1];
      f1000[f6000[5]] = Integer.valueOf(f6000[6]);
   }

   private static void m16000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m18000() {
      int[] var128 = new int[2];
      f4000[(0 | -0) >>> 31] = 1048576;
      f4000[(1 | -1) >>> 31] = 4194304;
   }
}
