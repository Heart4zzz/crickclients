package rw.defs;

public enum IlIijjrn {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static String[] f5000;

   private static void m2000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = 2;
   }

   static {
      ntfClinit();
   }

   public static IlIijjrn[] m8000() {
      return (IlIijjrn[])((IlIijjrn[])f4000[f3000[0]]).clone();
   }

   private static void m12000() {
      boolean[] var128 = new boolean[6];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f4000 = new Object[f1000[5]];
   }

   private static void m28000() {
      byte[] var128 = new byte[6];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = 2;
      f1000[4] = 3;
      f1000[5] = 4;
   }

   private static void m30000() {
      f5000 = new String[3];
      f5000[(0 | -0) >>> 31] = "SINGLE";
      f5000[(1 | -1) >>> 31] = "LEFT";
      f5000[2] = "RIGHT";
   }
}
