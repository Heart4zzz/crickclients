package rw.core;

import java.util.List;

public class C1031 {
   public static Object[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;

   private static void m2000() {
      f3000 = new String[4];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
      f3000[(1 | -1) >>> 31] = "Пласт";
      f3000[2] = "Пласт";
      f3000[3] = "Пласт";
   }

   private C1031() {
      throw new UnsupportedOperationException(f3000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f1000 = new Object[f5000[2]];
   }

   private static void m20000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = 400;
      f2000[2] = 1200;
      f2000[3] = 400;
   }

   private static <T extends Base1018> T m24000(T var0) {
      ((List)f1000[f2000[0]]).add(var0);
      return (T)var0;
   }

   private static void m30000() {
      byte[] var128 = new byte[3];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 3;
      f5000[2] = 4;
   }
}
