package rw.defs;

public enum AcceptPart {
   private static String[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;

   private static void m2000() {
      short[] var128 = new short[3];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   public static AcceptPart[] m6000() {
      return (AcceptPart[])((AcceptPart[])f5000[f2000[0]]).clone();
   }

   private static void m14000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
   }

   private static void m18000() {
      f5000 = new Object[f4000[2]];
   }

   private static void m22000() {
      f1000 = new String[2];
      f1000[(0 | -0) >>> 31] = "IRC";
      f1000[(1 | -1) >>> 31] = "PARTY";
   }

   private static void m28000() {
      boolean[] var128 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
   }
}
