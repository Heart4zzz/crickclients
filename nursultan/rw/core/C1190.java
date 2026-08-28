package rw.core;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.stream.Stream;
import rw.data.Rec0286;
import rw.defs.Enum0090;

public class C1190 {
   public static Object[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static byte[] f6000;

   private static void m2000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = 1001;
      f2000[4] = 1001;
      f2000[5] = (short)((1 | -1) >>> 31);
      f2000[6] = 201;
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = 236;
      f5000[(1 | -1) >>> 31] = 301;
      f5000[2] = 325;
      f5000[3] = 501;
      f5000[4] = 516;
      f5000[5] = 901;
      f5000[6] = 904;
      f5000[7] = (short)((0 | -0) >>> 31);
   }

   private static void m6000() {
      Enum0090 var10000 = (Enum0090)Enum0090.f5000[f2000[2]];
      Pair[] var10001 = new Pair[f4000[0]];
      var10001[f4000[1]] = Pair.of(Integer.valueOf(f2000[3]), Integer.valueOf(f2000[4]));
      m26000(var10000, var10001);
   }

   private C1190() {
      throw new UnsupportedOperationException(f3000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[6];
      f6000[(0 | -0) >>> 31] = 5;
      f6000[(1 | -1) >>> 31] = 101;
      f6000[2] = 115;
      f6000[3] = 2;
      f6000[4] = 3;
      f6000[5] = 4;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static void m14000() {
      f1000 = new Object[f4000[6]];
   }

   private static void m18000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static Iterable<Rec0286> m22000() {
      return (List)f1000[f2000[0]];
   }

   @SafeVarargs
   private static void m26000(Enum0090 var0, Pair<Integer, Integer>... var1) {
      Pair[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = f4000[4]; var4 < var3; var4++) {
         Pair var5 = var2[var4];

         for (int var6 = (Integer)var5.getFirst(); var6 <= var5.getSecond(); var6++) {
            ((List)f1000[f5000[7]]).add(new Rec0286(var0, var5, var6));
         }
      }
   }

   public static Stream<Rec0286> m28000() {
      return ((List)f1000[f2000[1]]).stream();
   }

   private static void m34000() {
      Enum0090 var10000 = (Enum0090)Enum0090.f5000[f2000[5]];
      Pair[] var10001 = new Pair[f6000[0]];
      var10001[f4000[2]] = Pair.of(Integer.valueOf(f6000[1]), Integer.valueOf(f6000[2]));
      var10001[f4000[3]] = Pair.of(Integer.valueOf(f2000[6]), Integer.valueOf(f5000[0]));
      var10001[f6000[3]] = Pair.of(Integer.valueOf(f5000[1]), Integer.valueOf(f5000[2]));
      var10001[f6000[4]] = Pair.of(Integer.valueOf(f5000[3]), Integer.valueOf(f5000[4]));
      var10001[f6000[5]] = Pair.of(Integer.valueOf(f5000[5]), Integer.valueOf(f5000[6]));
      m26000(var10000, var10001);
   }
}
