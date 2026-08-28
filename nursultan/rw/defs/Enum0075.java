package rw.defs;

public enum Enum0075 {
   private static short[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;

   private static void m4000() {
      short[] var128 = new short[3];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   public static Enum0075[] m6000() {
      return (Enum0075[])((Enum0075[])f4000[f1000[0]]).clone();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[6];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      f4000 = new Object[f3000[2]];
   }

   private static void m18000() {
      f2000 = new String[2];
      f2000[(0 | -0) >>> 31] = "FAST";
      f2000[(1 | -1) >>> 31] = "SMOOTH";
   }

   private static void m28000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
   }
}
