package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.defs.Enum0046;
import rw.gui.C0019;
import rw.setting.C0062;

final class C0398 {
   private final C0062 f1000;
   private final ArrayList<rw.setting.C0059> f2000 = new ArrayList<>();
   private float[] f3000 = new float[0];

   C0398(C0062 var1) {
      this.f1000 = var1;
   }

   void m2000(List<rw.setting.C0059> var1, Enum0046 var2, float var3) {
      ArrayList var4 = this.f2000;
      var4.clear();
      var4.addAll(var1);

      while (var3 > 0.01F && !var4.isEmpty()) {
         float var5 = Float.MAX_VALUE;
         float var6 = Float.MAX_VALUE;
         float var7 = var3;

         for (rw.setting.C0059 var9 : var4) {
            float var10 = this.f1000.m20000(var9).m2000(var2);
            if (!C0405.m32000(var10, var5)) {
               if (var10 < var5) {
                  var6 = var5;
                  var5 = var10;
               }

               if (var10 > var5) {
                  var6 = Math.min(var6, var10);
                  var7 = var6 - var5;
               }
            }
         }

         var7 = Math.min(var7, var3 / var4.size());

         for (int var16 = 0; var16 < var4.size(); var16++) {
            rw.setting.C0059 var17 = (rw.setting.C0059)var4.get(var16);
            C0412 var18 = this.f1000.m20000(var17);
            float var11 = var18.m2000(var2);
            if (C0405.m32000(var11, var5)) {
               C0019 var12 = var17.m78000();
               float var13 = C0405.m18000(var12, var2, var18.m22000(var2));
               float var14 = var11 + var7;
               if (var14 >= var13) {
                  var14 = var13;
                  var4.remove(var16--);
               }

               var18.m20000(var2, var14);
               var3 -= var14 - var11;
            }
         }
      }
   }

   void m4000(List<rw.setting.C0059> var1, Enum0046 var2, float var3) {
      ArrayList var4 = this.f2000;
      var4.clear();
      var4.addAll(var1);
      if (this.f3000.length < var4.size()) {
         this.f3000 = new float[var4.size()];
      }

      while (var3 < -0.01F && !var4.isEmpty()) {
         float var5 = 0.0F;

         for (rw.setting.C0059 var7 : var4) {
            var5 += this.f1000.m20000(var7).m2000(var2);
         }

         if (var5 <= 0.01F) {
            break;
         }

         float var17 = -var3;
         float var18 = 0.0F;
         boolean var8 = false;
         float[] var9 = this.f3000;

         for (int var10 = 0; var10 < var4.size(); var10++) {
            rw.setting.C0059 var11 = (rw.setting.C0059)var4.get(var10);
            C0412 var12 = this.f1000.m20000(var11);
            float var13 = var12.m2000(var2);
            float var14 = var12.m12000(var2);
            float var15 = var17 * (var13 / var5);
            float var16 = Math.max(var14, var13 - var15);
            if (var16 <= var14 + 0.01F) {
               var8 = true;
            }

            var9[var10] = var16;
            var18 += var13 - var16;
         }

         for (int var19 = 0; var19 < var4.size(); var19++) {
            this.f1000.m20000((rw.setting.C0059)var4.get(var19)).m20000(var2, var9[var19]);
         }

         var3 += var18;
         if (var18 <= 0.01F || !var8) {
            break;
         }

         for (int var20 = 0; var20 < var4.size(); var20++) {
            rw.setting.C0059 var21 = (rw.setting.C0059)var4.get(var20);
            C0412 var22 = this.f1000.m20000(var21);
            if (C0405.m32000(var22.m2000(var2), var22.m12000(var2))) {
               var4.remove(var20--);
            }
         }
      }
   }
}
