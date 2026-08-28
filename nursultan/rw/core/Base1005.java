package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.data.Rec0223;

public abstract class Base1005 {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static int[] f7000;
   private static boolean[] f8000;
   private static byte[] f9000;
   private static boolean[] f10000;
   private static short[] f11000;
   private static byte[] f12000;
   private static boolean[] f13000;
   private static boolean[] f14000;
   private static byte[] f15000;

   private static void m2000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 100;
      f3000[(1 | -1) >>> 31] = 50;
      f3000[2] = 20;
      byte[] var129 = new byte[6];
      f9000[(0 | -0) >>> 31] = 5;
      f9000[(1 | -1) >>> 31] = 3;
      f9000[2] = 6;
      f9000[3] = 2;
      f9000[4] = 2;
      f9000[5] = 2;
      byte[] var130 = new byte[6];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 2;
      f15000[2] = 6;
      f15000[3] = 100;
      f15000[4] = 2;
      f15000[5] = 50;
      byte[] var131 = new byte[5];
      f12000[(0 | -0) >>> 31] = 3;
      f12000[(1 | -1) >>> 31] = 20;
      f12000[2] = 4;
      f12000[3] = 5;
      f12000[4] = 5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[f15000[2]];
      f1000[f14000[5]] = Integer.valueOf(f11000[1]);
      f1000[f14000[6]] = Integer.valueOf(f15000[3]);
      f1000[f15000[4]] = Integer.valueOf(f15000[5]);
      f1000[f12000[(0 | -0) >>> 31]] = Integer.valueOf(f12000[1]);
      f1000[f12000[2]] = Integer.valueOf(f12000[3]);
      f1000[f12000[4]] = Integer.valueOf(f14000[7]);
   }

   private static void m10000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = Integer.MAX_VALUE;
   }

   private static void m16000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
      f10000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[6];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((1 | -1) >>> 31);
      f8000[4] = (boolean)((1 | -1) >>> 31);
      f8000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[5];
      f13000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f13000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f13000[2] = (boolean)((1 | -1) >>> 31);
      f13000[3] = (boolean)((1 | -1) >>> 31);
      f13000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var134 = new boolean[4];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var135 = new boolean[8];
      f14000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[2] = (boolean)((1 | -1) >>> 31);
      f14000[3] = (boolean)((1 | -1) >>> 31);
      f14000[4] = (boolean)((1 | -1) >>> 31);
      f14000[5] = (boolean)((0 | -0) >>> 31);
      f14000[6] = (boolean)((1 | -1) >>> 31);
      f14000[7] = (boolean)((0 | -0) >>> 31);
   }

   public List<String> m18000(List<String> var1, String var2) {
      ArrayList var3 = new ArrayList(var1.size() + f14000[4]);
      var3.addAll(var1);
      var3.add(var2);
      return var3;
   }

   public int m20000(String var1, String var2, int var3) {
      int var4 = var1.length();
      int var5 = var2.length();
      if (Math.abs(var4 - var5) > var3) {
         return var3 + f5000[0];
      } else if (var4 == 0) {
         return var5;
      } else if (var5 == 0) {
         return var4;
      } else {
         int[][] var6 = new int[var4 + f5000[1]][var5 + f5000[2]];
         int var7 = f5000[3];

         while (var7 <= var4) {
            var6[var7][f2000[0]] = var7++;
         }

         var7 = f2000[1];

         while (var7 <= var5) {
            var6[f8000[0]][var7] = var7++;
         }

         for (int var13 = f8000[1]; var13 <= var4; var13++) {
            int var8 = f7000[0];

            for (int var9 = f8000[2]; var9 <= var5; var9++) {
               byte var10 = var1.charAt(var13 - f8000[3]) == var2.charAt(var9 - f8000[4]) ? f8000[5] : f13000[0];
               int var11 = Math.min(
                  Math.min(var6[var13 - f13000[1]][var9] + f13000[2], var6[var13][var9 - f13000[3]] + f13000[4]),
                  var6[var13 - f6000[0]][var9 - f6000[1]] + var10
               );
               if (var13 > f6000[2]
                  && var9 > f6000[3]
                  && var1.charAt(var13 - f14000[0]) == var2.charAt(var9 - f9000[4])
                  && var1.charAt(var13 - f9000[5]) == var2.charAt(var9 - f14000[1])) {
                  var11 = Math.min(var11, var6[var13 - f15000[0]][var9 - f15000[1]] + f14000[2]);
               }

               var6[var13][var9] = var11;
               if (var11 < var8) {
                  var8 = var11;
               }
            }

            if (var8 > var3) {
               return var3 + f14000[3];
            }
         }

         return var6[var4][var5];
      }
   }

   private static void m22000() {
      short[] var128 = new short[2];
      f11000[(0 | -0) >>> 31] = 200;
      f11000[(1 | -1) >>> 31] = 200;
   }

   public int m24000(String var1, String var2) {
      if (var1 == null) {
         return f4000[0];
      } else {
         String var3 = var1.toLowerCase();
         if (var3.equals(var2)) {
            return f11000[0];
         } else if (var3.startsWith(var2)) {
            return f3000[0];
         } else if (var3.contains(var2)) {
            return f3000[1];
         } else {
            int var4 = this.m28000(var2.length());
            if (var4 == 0) {
               return f4000[1];
            } else {
               int var5 = this.m20000(var3, var2, var4);
               return var5 > var4 ? f10000[0] : f3000[2] - (var5 - f10000[1]) * f9000[0];
            }
         }
      }
   }

   public abstract void m26000(String var1, int var2, List<Rec0223> var3);

   public int m28000(int var1) {
      if (var1 <= f9000[1]) {
         return f10000[2];
      } else {
         return var1 <= f9000[2] ? f10000[3] : f9000[3];
      }
   }
}
