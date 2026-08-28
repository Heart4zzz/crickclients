package rw.core;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class C0882 {
   private static String[] f1000;
   private static byte[] f2000;
   private static long[] f3000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 16;
   }

   private C0882() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      long[] var128 = new long[5];
      f3000[(0 | -0) >>> 31] = 281474976710655L;
      f3000[(1 | -1) >>> 31] = 4095L;
      f3000[2] = 28672L;
      f3000[3] = 4611686018427387903L;
      f3000[4] = Long.MIN_VALUE;
   }

   private static void m10000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static UUID m16000() {
      long var0 = System.currentTimeMillis() & f3000[0];
      long var2 = ThreadLocalRandom.current().nextLong() & f3000[1];
      long var4 = var0 << f2000[0] | f3000[2] | var2;
      long var6 = ThreadLocalRandom.current().nextLong();
      long var8 = var6 & f3000[3] | f3000[4];
      return new UUID(var4, var8);
   }
}
