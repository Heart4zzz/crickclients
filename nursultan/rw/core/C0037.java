package rw.core;

public class C0037 {
   private static byte[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static String[] f4000;

   private static void m2000() {
      f3000 = new Object[f1000[(0 | -0) >>> 31]];
      f3000[f2000[2]] = Integer.valueOf(f2000[3]);
      f3000[f2000[4]] = Integer.valueOf(f1000[1]);
      f3000[f1000[2]] = Integer.valueOf(f1000[3]);
      f3000[f1000[4]] = Integer.valueOf(f1000[5]);
      f3000[f1000[6]] = Integer.valueOf(f1000[7]);
   }

   private C0037() {
      throw new UnsupportedOperationException(f4000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[8];
      f1000[(0 | -0) >>> 31] = 5;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 2;
      f1000[3] = 4;
      f1000[4] = 3;
      f1000[5] = 8;
      f1000[6] = 4;
      f1000[7] = 16;
   }

   private static void m10000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static boolean m14000(int var0, int var1) {
      return (var0 & var1) == var1 ? f2000[0] : f2000[1];
   }

   private static void m20000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
   }
}
