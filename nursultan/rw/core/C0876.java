package rw.core;

import KDFzREm.NNWE;

public class C0876 {
   private static String[] f1000;
   private static double[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static float[] f11000;
   private static float[] f12000;
   private static float[] f13000;

   public static int m2000(int var0, float var1) {
      int var2 = Math.round(Math.clamp(var1, f11000[0], f11000[1]) / f11000[2] * f9000[0]);
      return var2 << 24 | var0 & 16777215;
   }

   private static void m4000() {
      f4000 = new float[]{255.0F, 255.0F, 255.0F};
      f11000 = new float[]{0.0F, 100.0F, 100.0F};
      f9000 = new float[]{255.0F, 0.0F, 1.0F, 360.0F, 255.0F, 255.0F, 255.0F};
      f7000 = new float[]{2.0F, 0.0F};
      f5000 = new float[]{0.0F, 0.5F, 2.0F, 6.0F, 0.0F};
      f6000 = new float[]{6.0F, 2.0F, 6.0F};
      f3000 = new float[]{4.0F, 6.0F, 360.0F, 360.0F, 360.0F, 360.0F};
      f8000 = new float[]{360.0F, 0.0F, 255.0F, 0.5F};
      f12000 = new float[]{1.0F, 2.0F, 0.33333334F, 255.0F, 255.0F, 0.33333334F, 255.0F, 0.0F};
      f13000 = new float[]{1.0F, 1.0F, 1.0F, 0.16666667F, 6.0F, 0.5F};
      f10000 = new float[]{0.6666667F, 0.6666667F, 6.0F, 85.0F, 5.94F, 255.0F, 6.07F};
   }

   public static float[] m6000(int var0) {
      float var1 = m28000(var0) / f9000[4];
      float var2 = m58000(var0) / f9000[5];
      float var3 = m20000(var0) / f9000[6];
      float var4 = Math.max(var1, Math.max(var2, var3));
      float var5 = Math.min(var1, Math.min(var2, var3));
      float var6 = (var4 + var5) / f7000[0];
      if (var4 == var5) {
         return new float[]{f7000[1], f5000[0], var6};
      } else {
         float var7 = var4 - var5;
         float var8 = var6 > f5000[1] ? var7 / (f5000[2] - var4 - var5) : var7 / (var4 + var5);
         float var9;
         if (var4 == var1) {
            var9 = ((var2 - var3) / var7 + (var2 < var3 ? f5000[3] : f5000[4])) / f6000[0];
         } else if (var4 == var2) {
            var9 = ((var3 - var1) / var7 + f6000[1]) / f6000[2];
         } else {
            var9 = ((var1 - var2) / var7 + f3000[0]) / f3000[1];
         }

         return new float[]{var9 * f3000[2], var8, var6};
      }
   }

   private static float m8000(float var0, float var1, float var2) {
      float var3 = var2;
      if (var2 < f12000[7]) {
         var3 = var2 + f13000[0];
      }

      if (var3 > f13000[1]) {
         var3 -= f13000[2];
      }

      if (var3 < f13000[3]) {
         return var0 + (var1 - var0) * f13000[4] * var3;
      } else if (var3 < f13000[5]) {
         return var1;
      } else {
         return var3 < f10000[0] ? var0 + (var1 - var0) * (f10000[1] - var3) * f10000[2] : var0;
      }
   }

   private static void m10000() {
      f2000 = new double[]{1.0, 1.0};
   }

   private C0876() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static int m20000(int var0) {
      return var0 & 0xFF;
   }

   private static void m22000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static int m28000(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int m30000(int var0, float var1) {
      return m70000(var0, Math.round(m46000(var0) * Math.clamp(var1, f9000[1], f9000[2])));
   }

   public static int m34000(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int m38000(int var0, float var1) {
      int var2 = m28000(var0);
      int var3 = m58000(var0);
      int var4 = m20000(var0);
      int var5 = m46000(var0);
      return m34000(Math.max((int)(var2 * var1), 0), Math.max((int)(var3 * var1), 0), Math.max((int)(var4 * var1), 0), var5);
   }

   public static int m42000(float var0, float var1, float var2) {
      float var3 = (var0 % f3000[3] + f3000[4]) % f3000[5] / f8000[0];
      if (var1 == f8000[1]) {
         int var9 = Math.round(var2 * f8000[2]);
         return var9 << 16 | var9 << 8 | var9;
      } else {
         float var4 = var2 < f8000[3] ? var2 * (f12000[0] + var1) : var2 + var1 - var2 * var1;
         float var5 = f12000[1] * var2 - var4;
         int var6 = Math.round(m8000(var5, var4, var3 + f12000[2]) * f12000[3]);
         int var7 = Math.round(m8000(var5, var4, var3) * f12000[4]);
         int var8 = Math.round(m8000(var5, var4, var3 - f12000[5]) * f12000[6]);
         return (var6 & 0xFF) << 16 | (var7 & 0xFF) << 8 | var8 & 0xFF;
      }
   }

   public static int m44000(int var0, int var1) {
      return m34000(var0, var0, var0, var1);
   }

   public static int m46000(int var0) {
      return var0 >>> 24;
   }

   public static int m50000(int var0, int var1, float var2) {
      int var3 = m28000(var0);
      int var4 = m58000(var0);
      int var5 = m20000(var0);
      int var6 = m46000(var0);
      int var7 = m28000(var1);
      int var8 = m58000(var1);
      int var9 = m20000(var1);
      int var10 = m46000(var1);
      return m34000(NNWE.N(var2, var3, var7), NNWE.N(var2, var4, var8), NNWE.N(var2, var5, var9), NNWE.N(var2, var6, var10));
   }

   public static int m54000(float var0, float var1, float var2) {
      return 0xFF000000 | (int)(var0 * f4000[0]) << 16 | (int)(var1 * f4000[1]) << 8 | (int)(var2 * f4000[2]);
   }

   public static int m58000(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int m60000(float var0) {
      int var1 = Math.round(var0 * f10000[3]);
      int var2;
      int var3;
      if (var1 < 43) {
         var2 = 255;
         var3 = Math.round(var1 * f10000[4]);
      } else {
         var2 = Math.round(f10000[5] - (var1 - 43) * f10000[6]);
         var3 = 255;
      }

      return 0xFF000000 | (var2 & 0xFF) << 16 | (var3 & 0xFF) << 8;
   }

   public static int m62000(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      var4 = (var4 >= 180 ? 360 - var4 : var4) * 2;
      return m50000(var2, var3, var4 / f9000[3]);
   }

   public static int m64000(int var0, float var1) {
      int var2 = m28000(var0);
      int var3 = m58000(var0);
      int var4 = m20000(var0);
      int var5 = m46000(var0);
      int var6 = (int)(f2000[0] / (f2000[1] - var1));
      if (var2 == 0 && var3 == 0 && var4 == 0) {
         return m34000(var6, var6, var6, var5);
      } else {
         if (var2 > 0 && var2 < var6) {
            var2 = var6;
         }

         if (var3 > 0 && var3 < var6) {
            var3 = var6;
         }

         if (var4 > 0 && var4 < var6) {
            var4 = var6;
         }

         return m34000(Math.min((int)(var2 / var1), 255), Math.min((int)(var3 / var1), 255), Math.min((int)(var4 / var1), 255), var5);
      }
   }

   public static boolean m68000(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      return (boolean)(Math.abs(var3 - var6) <= var2 && Math.abs(var4 - var7) <= var2 && Math.abs(var5 - var8) <= var2 ? 1 : 0);
   }

   public static int m70000(int var0, int var1) {
      return Math.clamp((long)var1, 0, 255) << 24 | var0 & 16777215;
   }
}
