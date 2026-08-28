package rw.defs;

public enum OlipnnIii {
   private static boolean[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static short[] f5000;

   private static void m2000() {
      boolean[] var128 = new boolean[6];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   public static OlipnnIii[] m6000() {
      return (OlipnnIii[])((OlipnnIii[])f4000[f5000[0]]).clone();
   }

   private static void m8000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
   }

   private static void m14000() {
      f2000 = new String[2];
      f2000[(0 | -0) >>> 31] = "MIN";
      f2000[(1 | -1) >>> 31] = "MAX";
   }

   private static void m26000() {
      f4000 = new Object[f3000[2]];
   }

   private static void m28000() {
      short[] var128 = new short[3];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((1 | -1) >>> 31);
   }
}
