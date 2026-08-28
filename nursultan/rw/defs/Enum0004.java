package rw.defs;

public enum Enum0004 {
   private static short[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   public static Object[] f5000;

   private static void m4000() {
      f5000 = new Object[f3000[5]];
   }

   static {
      ntfClinit();
   }

   public static Enum0004[] m8000() {
      return (Enum0004[])((Enum0004[])f5000[f1000[0]]).clone();
   }

   private static void m12000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f2000 = new String[3];
      f2000[(0 | -0) >>> 31] = "IDLE";
      f2000[(1 | -1) >>> 31] = "SIGNING_IN";
      f2000[2] = "ERROR";
   }

   private static void m28000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = 2;
   }

   private static void m30000() {
      byte[] var128 = new byte[6];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 2;
      f3000[3] = 2;
      f3000[4] = 3;
      f3000[5] = 4;
   }
}
