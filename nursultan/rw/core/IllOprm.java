package rw.core;

import java.util.stream.LongStream;

public class IllOprm {
   private static boolean[] f1000;
   private static double[] f2000;
   private static long[] f3000;
   private static byte[] f4000;
   private static String[] f5000;

   private static void m2000() {
      long[] var128 = new long[2];
      f3000[(0 | -0) >>> 31] = 0L;
      f3000[(1 | -1) >>> 31] = 1000L;
   }

   private IllOprm() {
      throw new UnsupportedOperationException(f5000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f5000 = new String[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m12000() {
      byte[] var128 = new byte[2];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m26000() {
      double[] var128 = new double[2];
      f2000[(0 | -0) >>> 31] = Double.longBitsToDouble(4611686018427387904L);
      f2000[(1 | -1) >>> 31] = Double.longBitsToDouble(4652007308841189376L);
   }

   public static long m28000(LongStream var0, double var1) {
      long[] var3 = var0.distinct().sorted().toArray();
      if (var3.length == 0) {
         return f3000[0];
      } else {
         int var4 = var3.length / f4000[0];
         double var5 = var3.length % f4000[1] == f1000[0] ? var3[var4] : (var3[var4 - f1000[1]] + var3[var4]) / f2000[0];
         double var7 = var5 - var5 * var1;
         return Math.round(var7 / f2000[1]) * f3000[1];
      }
   }
}
