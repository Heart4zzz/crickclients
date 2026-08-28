package rw.core;

import rw.defs.Enum0012;

public final class C0248 {
   public static final int f1000 = 0;
   public static final int f2000 = -16777216;
   private static final int f3000 = 255;

   public static int m2000(int var0) {
      return m22000(var0, Enum0012.f3000);
   }

   private C0248() {
   }

   public static boolean m4000(int var0) {
      return m20000(var0) < 255;
   }

   public static int m6000(int var0) {
      return m22000(var0, Enum0012.f4000);
   }

   public static int m8000(int var0) {
      return m22000(var0, Enum0012.f2000);
   }

   private static int m10000(int var0, int var1, float var2) {
      return Math.round(var0 + (var1 - var0) * var2);
   }

   public static int m12000(int var0, int var1, float var2) {
      float var3 = C0259.m4000(var2);
      int var4 = m10000(m8000(var0), m8000(var1), var3);
      int var5 = m10000(m2000(var0), m2000(var1), var3);
      int var6 = m10000(m6000(var0), m6000(var1), var3);
      int var7 = m10000(m20000(var0), m20000(var1), var3);
      return m18000(var4, var5, var6, var7);
   }

   public static int m14000(int var0, float var1) {
      if (!(var1 >= 1.0F) && var0 != 0) {
         int var2 = var0 >>> Enum0012.f1000.m6000() & 0xFF;
         int var3 = (int)(var2 * var1);
         return var0 & ~Enum0012.f1000.m8000() | var3 << Enum0012.f1000.m6000();
      } else {
         return var0;
      }
   }

   public static int m16000(int var0, Enum0012 var1, int var2) {
      Enum0012 var3 = var1 == null ? Enum0012.f1000 : var1;
      int var4 = C0259.m6000(var2, 0, 255);
      int var5 = var0 & ~var3.m8000();
      return var5 | var4 << var3.m6000();
   }

   public static int m18000(int var0, int var1, int var2, int var3) {
      int var4 = C0259.m6000(var0, 0, 255);
      int var5 = C0259.m6000(var1, 0, 255);
      int var6 = C0259.m6000(var2, 0, 255);
      int var7 = C0259.m6000(var3, 0, 255);
      return var7 << Enum0012.f1000.m6000() | var4 << Enum0012.f2000.m6000() | var5 << Enum0012.f3000.m6000() | var6 << Enum0012.f4000.m6000();
   }

   public static int m20000(int var0) {
      return m22000(var0, Enum0012.f1000);
   }

   public static int m22000(int var0, Enum0012 var1) {
      Enum0012 var2 = var1 == null ? Enum0012.f1000 : var1;
      return var0 >>> var2.m6000() & 0xFF;
   }

   public static boolean m24000(int var0) {
      return m20000(var0) > 0;
   }
}
