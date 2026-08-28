package rw.core;

import rw.GuiWidget;
import rw.api.Iface0202;
import rw.data.Rec0264;
import rw.setting.C0031;

public class C0091 {
   private static boolean[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static int[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;
   private static String[] f8000;
   private static byte[] f9000;
   private static boolean[] f10000;
   private static float[] f11000;
   private static byte[] f12000;
   private static byte[] f13000;
   private static byte[] f14000;
   private static float[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;
   private static boolean[] f18000;
   public static Object[] f19000;
   private static boolean[] f20000;

   private static void m2000() {
      f12000 = new byte[]{2, 36, 36, 36, 2};
      f9000 = new byte[]{10, 32, 2, 2};
      f14000 = new byte[]{2, 20, 3, 2};
      f13000 = new byte[]{14, 3};
      f7000 = new byte[]{2, 6};
      f17000 = new byte[]{12, 2, 12, 3, 8, 4, 16, 5};
      f2000 = new byte[]{36, 3};
   }

   private static void m10000() {
      f3000 = new short[]{0, 500, 1, 2};
   }

   private C0091() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f15000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 12.0F, 8.0F};
      f11000 = new float[]{4.0F, 10.0F, 0.25F, 1.0F, 12.0F, 1.0F, 16.0F, 64.0F};
   }

   private static void m20000() {
      f8000 = new String[]{"\\s+", " ", " "};
   }

   private static int m24000(String[] var0, int var1) {
      int var2 = f16000[6];
      int var3 = f16000[7];
      String[] var4 = var0;
      int var5 = var0.length;

      for (int var6 = f1000[0]; var6 < var5; var6++) {
         String var7 = var4[var6];
         if (var3 == 0) {
            var3 = var7.length();
         } else if (var3 + f1000[1] + var7.length() > var1) {
            var2++;
            var3 = var7.length();
         } else {
            var3 += f1000[2] + var7.length();
         }
      }

      return var2;
   }

   private static void m28000() {
      f19000 = new Object[]{null, 12, 12, 8, 16, 36};
      f4000 = new Object[]{null, null, null};
   }

   private static String m30000(String var0) {
      String var1 = var0.trim().replaceAll(f8000[0], f8000[1]);
      if (var1.isEmpty()) {
         return var1;
      } else {
         String[] var2 = var1.split(f8000[2]);
         if (var2.length == f16000[2]) {
            return var1;
         } else {
            int var3 = m24000(var2, f12000[1]);
            int var4 = f16000[3];
            int var5 = f12000[2];
            int var6 = f12000[3];

            while (var4 <= var5) {
               int var7 = (var4 + var5) / f12000[4];
               if (m24000(var2, var7) <= var3) {
                  var6 = var7;
                  var5 = var7 - f16000[4];
               } else {
                  var4 = var7 + f16000[5];
               }
            }

            return m32000(var2, var6);
         }
      }
   }

   private static String m32000(String[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = f10000[0];
      String[] var4 = var0;
      int var5 = var0.length;

      for (int var6 = f10000[1]; var6 < var5; var6++) {
         String var7 = var4[var6];
         if (var3 == 0) {
            var2.append(var7);
            var3 = var7.length();
         } else if (var3 + f10000[2] + var7.length() > var1) {
            var2.append((char)f9000[0]).append(var7);
            var3 = var7.length();
         } else {
            var2.append((char)f9000[1]).append(var7);
            var3 += f6000[0] + var7.length();
         }
      }

      return var2.toString();
   }

   private C0031 m34000(Rec0264 var1, Iface0202 var2) {
      GuiWidget var3 = var1.m2000();
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f12000[0]];
      var10000[f16000[0]] = (rw.setting.C0056)f4000[f3000[0]];
      var10000[f16000[1]] = C1063.m30000(var1.m8000(), f15000[0], f3000[1]);
      return C0287.m26000(rw.setting.C0056.m120000(var10000), var2x -> {
         var2x.N(var3.m2000(), (rw.setting.C0056)f4000[f3000[2]]);
         var2x.N(m30000(var1.m6000()), (rw.setting.C0056)f4000[f3000[3]]);
      });
   }

   private static void m38000() {
      f5000 = new int[]{-16777216, 6579300};
   }

   private static void m46000() {
      f16000 = new boolean[]{false, true, true, true, true, true, true, false};
      f1000 = new boolean[]{false, true, true};
      f10000 = new boolean[]{false, false, true};
      f6000 = new boolean[]{true, false, false, false, false, true};
      f20000 = new boolean[]{false, false, false, true, false, true, false};
      f18000 = new boolean[]{true, true};
   }
}
