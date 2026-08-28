package rw.core;

import java.util.Set;
import java.util.regex.Pattern;
import rw.defs.Enum0082;

public class C1151 {
   private static short[] f1000;
   private static byte[] f2000;
   private static long[] f3000;
   private static short[] f4000;
   private static int[] f5000;

   private static void m6000() {
      long[] var128 = new long[2];
      f3000[(0 | -0) >>> 31] = 4194304L;
      f3000[(1 | -1) >>> 31] = 50L;
   }

   private C1151() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 1048576;
   }

   public static void m14000(long var0) {
      if (var0 >= f3000[1]) {
         throw new C1139((Enum0082)Enum0082.f4000[f4000[2]]);
      }
   }

   private static void m16000() {
      byte[] var128 = new byte[2];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 32;
   }

   public static void m20000(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         if (var0.length > f5000[0]) {
            throw new C1139((Enum0082)Enum0082.f4000[f1000[5]]);
         }
      } else {
         throw new C1139((Enum0082)Enum0082.f4000[f1000[4]]);
      }
   }

   public static void m22000(int var0) {
      if (!((Set)C1159.f1000[f4000[0]]).contains(var0)) {
         throw new C1139((Enum0082)Enum0082.f4000[f4000[1]]);
      }
   }

   public static String m24000(String var0) {
      if (var0 == null) {
         throw new C1139((Enum0082)Enum0082.f4000[f1000[0]]);
      } else {
         String var1 = var0.strip();
         if (var1.length() < f2000[0] || var1.length() > f2000[1]) {
            throw new C1139((Enum0082)Enum0082.f4000[f1000[1]]);
         } else if (!((Pattern)C1159.f1000[f1000[2]]).matcher(var1).matches()) {
            throw new C1139((Enum0082)Enum0082.f4000[f1000[3]]);
         } else {
            return var1;
         }
      }
   }

   public static void m26000(long var0) {
      if (var0 > f3000[0]) {
         throw new C1139((Enum0082)Enum0082.f4000[f1000[6]]);
      }
   }

   private static void m28000() {
      short[] var128 = new short[7];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 5;
      f1000[3] = 2;
      f1000[4] = 3;
      f1000[5] = 4;
      f1000[6] = 4;
      short[] var129 = new short[3];
      f4000[(0 | -0) >>> 31] = 6;
      f4000[(1 | -1) >>> 31] = 3;
      f4000[2] = 5;
   }
}
