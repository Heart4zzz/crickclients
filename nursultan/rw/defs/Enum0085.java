package rw.defs;

public enum Enum0085 {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   public static Object[] f6000;

   private static void m4000() {
      boolean[] var128 = new boolean[6];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   public static Enum0085[] m8000() {
      return (Enum0085[])((Enum0085[])f6000[f4000[0]]).clone();
   }

   private static void m10000() {
      byte[] var128 = new byte[7];
      f5000[(0 | -0) >>> 31] = 6;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
      f5000[3] = 4;
      f5000[4] = 5;
      f5000[5] = 2;
      f5000[6] = 2;
      byte[] var129 = new byte[8];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 4;
      f1000[3] = 4;
      f1000[4] = 5;
      f1000[5] = 5;
      f1000[6] = 6;
      f1000[7] = 7;
   }

   private static void m18000() {
      f6000 = new Object[f1000[7]];
   }

   private static void m24000() {
      f3000 = new String[6];
      f3000[(0 | -0) >>> 31] = "IDLE";
      f3000[(1 | -1) >>> 31] = "REQUESTING";
      f3000[2] = "WAITING";
      f3000[3] = "PROCESSING";
      f3000[4] = "SUCCESS";
      f3000[5] = "ERROR";
   }

   private static void m32000() {
      short[] var128 = new short[7];
      f4000[(0 | -0) >>> 31] = 6;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = 2;
      f4000[4] = 3;
      f4000[5] = 4;
      f4000[6] = 5;
   }
}
