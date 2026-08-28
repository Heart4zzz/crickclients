package rw.core;

import rw.gui.PgUp;

public class C1231 {
   private static boolean[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   public static Object[] f5000;

   private static void m6000() {
      boolean[] var128 = new boolean[7];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
   }

   private C1231() {
      throw new UnsupportedOperationException(f4000[3]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f5000 = new Object[f1000[5]];
      f5000[f1000[6]] = Integer.valueOf(f2000[6]);
   }

   private static void m16000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static int m20000(PgUp var0) {
      return switch (((int[])C1237.f5000[f3000[0]])[var0.ordinal()]) {
         case 1, 2 -> f1000[3];
         case 3, 4 -> f2000[4];
         case 5, 6 -> f2000[5];
         default -> f1000[4];
      };
   }

   public static int m22000(PgUp var0, int var1) {
      return var1 & f2000[0] & (m20000(var0) ^ f2000[1]);
   }

   private static void m26000() {
      byte[] var128 = new byte[7];
      f2000[(0 | -0) >>> 31] = 7;
      f2000[(1 | -1) >>> 31] = -1;
      f2000[2] = 2;
      f2000[3] = 4;
      f2000[4] = 2;
      f2000[5] = 4;
      f2000[6] = 7;
   }

   private static void m28000() {
      f4000 = new String[4];
      f4000[(0 | -0) >>> 31] = "Ctrl+";
      f4000[(1 | -1) >>> 31] = "Shift+";
      f4000[2] = "Alt+";
      f4000[3] = "This is a utility class and cannot be instantiated";
   }

   public static String m32000(PgUp var0, int var1) {
      if (var1 == 0) {
         return var0.m68000();
      } else {
         StringBuilder var2 = new StringBuilder();
         if ((var1 & f2000[2]) != 0) {
            var2.append(f4000[0]);
         }

         if ((var1 & f1000[2]) != 0) {
            var2.append(f4000[1]);
         }

         if ((var1 & f2000[3]) != 0) {
            var2.append(f4000[2]);
         }

         return var2.append(var0.m68000()).toString();
      }
   }

   public static boolean m34000(PgUp var0) {
      return m20000(var0) != 0 ? f1000[0] : f1000[1];
   }
}
