package rw.defs;

public enum Enum0071 {
   private static byte[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   static {
      ntfClinit();
   }

   public static Enum0071[] m8000() {
      return (Enum0071[])((Enum0071[])f3000[f5000[0]]).clone();
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
      f3000 = new Object[f1000[5]];
   }

   private static void m18000() {
      byte[] var128 = new byte[6];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = 2;
      f1000[4] = 3;
      f1000[5] = 4;
   }

   private static void m26000() {
      short[] var128 = new short[4];
      f5000[(0 | -0) >>> 31] = 3;
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((1 | -1) >>> 31);
      f5000[3] = 2;
   }

   private static void m30000() {
      f2000 = new String[3];
      f2000[(0 | -0) >>> 31] = "ADD";
      f2000[(1 | -1) >>> 31] = "REMOVE";
      f2000[2] = "CLEAR";
   }
}
