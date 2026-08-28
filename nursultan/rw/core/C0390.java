package rw.core;

import rw.data.Rec0132;
import rw.defs.Enum0031;
import rw.defs.Enum0035;
import rw.defs.Enum0046;
import rw.defs.Enum0047;
import rw.gui.C0019;
import rw.setting.C0062;

final class C0390 {
   private final C0062 f1000;

   C0390(C0062 var1) {
      this.f1000 = var1;
   }

   void m2000(rw.setting.C0059 var1) {
      this.f1000.m8000().f6000++;

      for (int var2 = 0; var2 < var1.m102000(); var2++) {
         rw.setting.C0059 var3 = var1.m148000(var2);
         this.m2000(var3);
      }

      C0019 var12 = var1.m78000();
      C0412 var13 = this.f1000.m20000(var1);
      boolean var4 = var12.m142000();
      if (var12.m16000() == Enum0035.f1000) {
         float var14 = C0405.m20000(var12, Enum0046.f2000);
         float var15 = C0405.m20000(var12, Enum0046.f2000);
         float var16 = C0405.m20000(var12, Enum0046.f2000);
         int var17 = 0;

         for (int var19 = 0; var19 < var1.m102000(); var19++) {
            rw.setting.C0059 var20 = var1.m148000(var19);
            if (C0405.m52000(var20)) {
               var17++;
               C0412 var21 = this.f1000.m20000(var20);
               var14 = Math.max(var14, var21.f2000 + C0405.m20000(var12, Enum0046.f2000));
               if (!var4) {
                  var15 = Math.max(var15, var21.f6000 + C0405.m20000(var12, Enum0046.f2000));
                  var16 = Math.max(var16, var21.m12000(Enum0046.f2000) + C0405.m20000(var12, Enum0046.f2000));
               }
            }
         }

         if (var17 == 0) {
            this.m6000(var1, var13);
         } else {
            var13.f2000 = C0405.m56000(var12, Enum0046.f2000, var14);
            var13.f6000 = C0405.m10000(var12, Enum0046.f2000, var4 ? C0405.m20000(var12, Enum0046.f2000) : var15);
            var13.m10000(Enum0046.f2000, C0405.m10000(var12, Enum0046.f2000, var4 ? C0405.m20000(var12, Enum0046.f2000) : var16));
            this.m6000(var1, var13);
         }
      } else {
         float var5 = C0405.m20000(var12, Enum0046.f2000);
         float var6 = C0405.m20000(var12, Enum0046.f2000);
         float var7 = C0405.m20000(var12, Enum0046.f2000);
         int var8 = 0;

         for (int var9 = 0; var9 < var1.m102000(); var9++) {
            rw.setting.C0059 var10 = var1.m148000(var9);
            if (C0405.m52000(var10)) {
               var8++;
               C0412 var11 = this.f1000.m20000(var10);
               var5 += var11.f2000;
               if (!var4) {
                  var6 += var11.f6000;
                  var7 += var11.m12000(Enum0046.f2000);
               }
            }
         }

         if (var8 == 0) {
            this.m6000(var1, var13);
         } else {
            float var18 = C0405.m44000(var8, var12.m150000());
            var13.f2000 = C0405.m56000(var12, Enum0046.f2000, var5 + var18);
            var13.f6000 = C0405.m10000(var12, Enum0046.f2000, var4 ? C0405.m20000(var12, Enum0046.f2000) : var6 + var18);
            var13.m10000(Enum0046.f2000, C0405.m10000(var12, Enum0046.f2000, var4 ? C0405.m20000(var12, Enum0046.f2000) : var7 + var18));
            this.m6000(var1, var13);
         }
      }
   }

   void m4000(rw.setting.C0059 var1) {
      this.f1000.m8000().f5000++;

      for (int var2 = 0; var2 < var1.m102000(); var2++) {
         rw.setting.C0059 var3 = var1.m148000(var2);
         this.m4000(var3);
      }

      if (var1.m120000() == Enum0047.f4000) {
         C0019 var9 = var1.m78000();
         C0412 var10 = this.f1000.m20000(var1);
         var10.f9000 = var1.m32000();
         boolean var4 = C0405.m38000(var9.m220000());
         boolean var5 = var9.m90000() == Enum0031.f2000;
         if (!var4 && !var5) {
            this.m6000(var1, var10);
         } else {
            float var6 = Float.POSITIVE_INFINITY;
            if (var5) {
               var6 = Math.max(0.0F, var10.f1000 - C0405.m20000(var9, Enum0046.f1000) - C0405.m48000(var9));
            }

            Rec0132 var7 = this.f1000.m16000(var1, var9, var6);
            var10.f9000 = var7.m10000();
            if (!var4) {
               this.m6000(var1, var10);
            } else {
               float var8 = C0405.m20000(var9, Enum0046.f2000) + var7.m2000();
               var10.f2000 = C0405.m56000(var9, Enum0046.f2000, var8);
               var10.f6000 = C0405.m10000(var9, Enum0046.f2000, var8);
               var10.m10000(Enum0046.f2000, var10.f6000);
               this.m6000(var1, var10);
            }
         }
      }
   }

   private void m6000(rw.setting.C0059 var1, C0412 var2) {
      var2.m14000(Enum0046.f2000, var2.f2000);
      var2.f2000 = this.f1000.m14000(var1, Enum0046.f2000, var2.f2000);
      var2.m6000(Enum0046.f2000);
   }
}
