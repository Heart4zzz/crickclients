package rw.defs;

public enum OlinIqIk {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static byte[] f4000;
   private static String[] f5000;

   static {
      ntfClinit();
   }

   public static OlinIqIk[] m6000() {
      return (OlinIqIk[])((OlinIqIk[])f3000[f1000[0]]).clone();
   }

   private static void m10000() {
      f5000 = new String[2];
      f5000[(0 | -0) >>> 31] = "SET";
      f5000[(1 | -1) >>> 31] = "CLEAR";
   }

   private static void m12000() {
      f3000 = new Object[f4000[2]];
   }

   private static void m20000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
   }

   private static void m22000() {
      short[] var128 = new short[3];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
   }

   private static void m28000() {
      boolean[] var128 = new boolean[6];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((1 | -1) >>> 31);
   }
}
