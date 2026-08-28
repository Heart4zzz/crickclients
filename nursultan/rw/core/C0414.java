package rw.core;

final class C0414 {
   static boolean m2000(String var0, int var1, int var2) {
      return m12000(var0, var1, var2) != m8000(var0, var1, var2);
   }

   static int m4000(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = m10000(var0, var1);
         return var2 >= var0.length() ? var0.length() : var0.offsetByCodePoints(var2, 1);
      } else {
         return 0;
      }
   }

   private C0414() {
   }

   static int m6000(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = m10000(var0, var1);
         return var2 <= 0 ? 0 : var0.offsetByCodePoints(var2, -1);
      } else {
         return 0;
      }
   }

   static int m8000(String var0, int var1, int var2) {
      return Math.max(m10000(var0, var1), m10000(var0, var2));
   }

   static int m10000(String var0, int var1) {
      String var2 = var0 == null ? "" : var0;
      int var3 = C0259.m6000(var1, 0, var2.length());
      return var3 > 0 && var3 < var2.length() && Character.isLowSurrogate(var2.charAt(var3)) && Character.isHighSurrogate(var2.charAt(var3 - 1))
         ? var3 - 1
         : var3;
   }

   static int m12000(String var0, int var1, int var2) {
      return Math.min(m10000(var0, var1), m10000(var0, var2));
   }
}
