package rw.setting;

import java.util.Objects;
import rw.api.Iface0208;
import rw.core.C0259;
import rw.core.C0414;
import rw.defs.Enum0034;

final class C0060 {
   private static final float f1000 = 1.0F;
   private final rw.gui.C0013 f2000;

   C0060(rw.gui.C0013 var1) {
      this.f2000 = Objects.requireNonNull(var1, "context");
   }

   private float m2000(String var1, float var2, Rec0036 var3) {
      return this.f2000.m8000().m6000(var1, var2, var3);
   }

   private float m4000(rw.gui.C0019 var1, String var2, float var3, float var4) {
      float var5 = this.m2000(var2, var1.m78000(), var1.m24000());
      float var6 = Math.max(0.0F, var4 - var5);
      Enum0034 var7 = var1.m38000();

      return var3 + switch (var7) {
         case f1000 -> 0.0F;
         case f2000 -> var6 * 0.5F;
         case f3000 -> var6;
      };
   }

   float m6000(C0059 var1, int var2, float var3) {
      String var4 = var1.m32000();
      rw.gui.C0019 var5 = var1.m78000();
      float var6 = Math.max(0.0F, var1.m42000().m18000());
      if (!(var6 <= 0.0F) && !var4.isEmpty()) {
         float var7 = this.m2000(var4, var5.m78000(), var5.m24000());
         float var8 = Math.max(0.0F, var7 - var6);
         int var9 = C0414.m10000(var4, var2);
         float var10 = this.m2000(var4.substring(0, var9), var5.m78000(), var5.m24000());
         float var11 = Math.max(0.0F, var3);
         float var12 = var11 + Math.max(0.0F, var6 - 1.0F);
         if (var10 < var11) {
            var11 = var10;
         } else if (var10 > var12) {
            var11 = var10 - Math.max(0.0F, var6 - 1.0F);
         }

         return C0259.m8000(var11, 0.0F, var8);
      } else {
         return 0.0F;
      }
   }

   int m8000(C0059 var1, float var2, float var3) {
      String var4 = var1.m32000();
      rw.gui.C0019 var5 = var1.m78000();
      float var6 = this.m4000(var5, var4, var1.m42000().m80000(), var1.m42000().m18000());
      float var7 = var2 - var6 + Math.max(0.0F, var3);
      if (!(var7 <= 0.0F) && !var4.isEmpty()) {
         Iface0208 var8 = this.f2000.m8000();
         float var9 = var5.m78000();
         Rec0036 var10 = var5.m24000();
         float var11 = 0.0F;
         int var12 = -1;
         int var13 = 0;

         while (var13 < var4.length()) {
            int var14 = var4.codePointAt(var13);
            int var15 = var13 + Character.charCount(var14);
            if (var12 >= 0) {
               var11 += var8.m8000(var12, var14, var9, var10);
            }

            float var16 = var8.m2000(var14, var9, var10);
            if (var7 < var11 + var16 * 0.5F) {
               return var13;
            }

            var11 += var16;
            if (var7 < var11) {
               return var15;
            }

            var12 = var14;
            var13 = var15;
         }

         return var4.length();
      } else {
         return 0;
      }
   }
}
