package rw.defs;

public enum Enum0053 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;

   private static void m2000() {
      boolean[] var128 = new boolean[6];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   public static Enum0053[] m8000() {
      return (Enum0053[])((Enum0053[])f2000[f5000[0]]).clone();
   }

   private static void m10000() {
      byte[] var128 = new byte[4];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
      f3000[3] = 2;
      byte[] var129 = new byte[5];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 3;
      f1000[3] = 4;
      f1000[4] = 5;
   }

   private static void m22000() {
      f2000 = new Object[f1000[4]];
   }

   private static void m26000() {
      short[] var128 = new short[5];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((1 | -1) >>> 31);
      f5000[3] = 2;
      f5000[4] = 3;
   }

   private static void m32000() {
      f4000 = new String[4];
      f4000[(0 | -0) >>> 31] = "ADD";
      f4000[(1 | -1) >>> 31] = "UPDATE";
      f4000[2] = "PLAYER_INIT";
      f4000[3] = "REMOVE";
   }
}
