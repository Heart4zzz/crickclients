package rw.core;

import rw.gui.C0019;

final class C0309 {
   private C0309() {
   }

   private static boolean m2000(rw.setting.C0059 var0, float var1, float var2, float var3) {
      float var4 = C0385.m6000(var0) ? 0.0F : var1;
      float var5 = C0385.m6000(var0) ? 0.0F : var2;
      C0019 var6 = var0.m78000();
      C0347 var7 = var0.m42000();
      float var8 = var4 + var6.m80000().m2000(var7.m48000());
      float var9 = var5 + var6.m102000().m2000(var7.m22000());
      boolean var10 = false;
      if (var8 != 0.0F || var9 != 0.0F) {
         float var11 = C0259.m2000(var7.m58000() + var8, var3) - var7.m58000();
         float var12 = C0259.m2000(var7.m8000() + var9, var3) - var7.m8000();
         if (var11 != 0.0F || var12 != 0.0F) {
            var7.m6000(var7.m58000() + var11, var7.m8000() + var12);
            var7.m66000(var7.m80000() + var11, var7.m10000() + var12, var7.m18000(), var7.m20000());
            var0.m56000(1);
            var10 = true;
         }
      }

      for (int var13 = 0; var13 < var0.m102000(); var13++) {
         var10 |= m2000(var0.m148000(var13), var8, var9, var3);
      }

      return var10;
   }

   static boolean m4000(rw.setting.C0059 var0, float var1) {
      return m2000(var0, 0.0F, 0.0F, var1);
   }

   static void m6000(rw.setting.C0059 var0) {
      C0347 var1 = var0.m42000();
      if (var1.m58000() != var1.m32000() || var1.m8000() != var1.m34000()) {
         float var2 = var1.m80000() - var1.m58000();
         float var3 = var1.m10000() - var1.m8000();
         var1.m6000(var1.m32000(), var1.m34000());
         var1.m66000(var1.m32000() + var2, var1.m34000() + var3, var1.m18000(), var1.m20000());
         var0.m56000(1);
      }

      for (int var4 = 0; var4 < var0.m102000(); var4++) {
         m6000(var0.m148000(var4));
      }
   }
}
