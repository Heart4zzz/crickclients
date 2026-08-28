package rw.core;

public class C0954 {
   private static short[] f1000;
   private static long[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;
   private static String[] f6000;

   public static int m2000(int var0) {
      return var0 / f1000[0];
   }

   private static void m4000() {
      f6000 = new String[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private C0954() {
      throw new UnsupportedOperationException(f6000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      short[] var128 = new short[2];
      f1000[(0 | -0) >>> 31] = 1200;
      f1000[(1 | -1) >>> 31] = 1200;
   }

   public static long m14000(int var0) {
      return var0 * f2000[0];
   }

   public static int m20000(int var0) {
      return var0 * f4000[1];
   }

   private static void m22000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 20;
      f4000[(1 | -1) >>> 31] = 20;
      f4000[2] = 2;
   }

   private static void m26000() {
      f5000 = new Object[f4000[2]];
      f5000[f3000[(0 | -0) >>> 31]] = f2000[2];
      f5000[f3000[(1 | -1) >>> 31]] = f2000[3];
   }

   public static int m28000(int var0) {
      return var0 * f1000[1];
   }

   private static void m30000() {
      long[] var128 = new long[4];
      f2000[(0 | -0) >>> 31] = 50L;
      f2000[(1 | -1) >>> 31] = 50L;
      f2000[2] = 20L;
      f2000[3] = 50L;
   }

   public static int m32000(int var0) {
      return var0 / f4000[0];
   }

   public static int m36000(long var0) {
      return (int)(var0 / f2000[1]);
   }

   private static void m42000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
