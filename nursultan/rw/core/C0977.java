package rw.core;

public class C0977 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private C0977() {
      throw new UnsupportedOperationException(f4000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[f1000[(0 | -0) >>> 31]];
      f2000[f5000[(0 | -0) >>> 31]] = Integer.valueOf(f5000[1]);
      f2000[f5000[2]] = Integer.valueOf(f1000[1]);
      f2000[f1000[2]] = Integer.valueOf(f1000[3]);
      f2000[f1000[4]] = Integer.valueOf(f1000[5]);
      f2000[f1000[6]] = Integer.valueOf(f3000[0]);
      f2000[f3000[(1 | -1) >>> 31]] = Integer.valueOf(f3000[2]);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[3];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      byte[] var128 = new byte[7];
      f1000[(0 | -0) >>> 31] = 6;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = 4;
      f1000[4] = 3;
      f1000[5] = 8;
      f1000[6] = 4;
      byte[] var129 = new byte[3];
      f3000[(0 | -0) >>> 31] = 16;
      f3000[(1 | -1) >>> 31] = 5;
      f3000[2] = 31;
   }
}
