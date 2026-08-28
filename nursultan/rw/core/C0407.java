package rw.core;

import rw.data.Rec0125;
import rw.data.Rec0133;
import rw.data.Rec0134;
import rw.defs.Enum0031;
import rw.defs.Enum0035;
import rw.defs.Enum0046;
import rw.defs.Enum0047;
import rw.gui.C0019;
import rw.setting.C0062;

final class C0407 {
   private final C0062 f1000;

   C0407(C0062 var1) {
      this.f1000 = var1;
   }

   private Rec0134 m2000(rw.setting.C0059 var1, C0019 var2) {
      Rec0125 var3 = var2.m32000();
      Rec0125 var4 = var2.m220000();
      boolean var5 = C0405.m38000(var3);
      boolean var6 = C0405.m38000(var4) && var5;
      if (!var5) {
         return new Rec0134(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         Rec0133 var7 = this.f1000.m22000(var1, var2);
         float var8 = C0405.m38000(var4) ? var7.m6000() : 0.0F;
         float var9 = var2.m90000() == Enum0031.f2000 ? var7.m2000() : var7.m8000();
         return new Rec0134(var7.m8000(), var6 ? var7.m6000() : 0.0F, var9, var8);
      }
   }

   private static float m4000(C0019 var0, Enum0046 var1, float var2) {
      return C0405.m10000(var0, var1, var2);
   }

   private Rec0134 m6000(rw.setting.C0059 var1, C0019 var2) {
      return var1.m120000() == Enum0047.f4000 ? this.m2000(var1, var2) : new Rec0134(0.0F, 0.0F, 0.0F, 0.0F);
   }

   void m8000(rw.setting.C0059 var1) {
      this.f1000.m8000().f2000++;

      for (int var2 = 0; var2 < var1.m102000(); var2++) {
         rw.setting.C0059 var3 = var1.m148000(var2);
         this.m8000(var3);
      }

      C0019 var15 = var1.m78000();
      boolean var16 = var15.m142000();
      boolean var4 = var15.m16000() == Enum0035.f1000;
      int var11 = 0;
      float var5;
      float var6;
      float var7;
      float var8;
      float var9;
      float var10;
      if (var4) {
         var5 = C0405.m20000(var15, Enum0046.f1000);
         var6 = C0405.m20000(var15, Enum0046.f2000);
         var7 = C0405.m20000(var15, Enum0046.f1000);
         var8 = C0405.m20000(var15, Enum0046.f2000);
         var9 = C0405.m20000(var15, Enum0046.f1000);
         var10 = C0405.m20000(var15, Enum0046.f2000);

         for (int var12 = 0; var12 < var1.m102000(); var12++) {
            rw.setting.C0059 var13 = var1.m148000(var12);
            if (C0405.m52000(var13)) {
               var11++;
               C0412 var14 = this.f1000.m20000(var13);
               var5 += m10000(var14, Enum0046.f1000);
               var6 = Math.max(var6, var14.f2000 + C0405.m20000(var15, Enum0046.f2000));
               if (!var16) {
                  var7 += var14.f5000;
                  var8 = Math.max(var8, var14.f6000 + C0405.m20000(var15, Enum0046.f2000));
                  var9 += var14.m12000(Enum0046.f1000);
                  var10 = Math.max(var10, var14.m12000(Enum0046.f2000) + C0405.m20000(var15, Enum0046.f2000));
               }
            }
         }
      } else {
         var5 = C0405.m20000(var15, Enum0046.f1000);
         var6 = C0405.m20000(var15, Enum0046.f2000);
         var7 = C0405.m20000(var15, Enum0046.f1000);
         var8 = C0405.m20000(var15, Enum0046.f2000);
         var9 = C0405.m20000(var15, Enum0046.f1000);
         var10 = C0405.m20000(var15, Enum0046.f2000);

         for (int var21 = 0; var21 < var1.m102000(); var21++) {
            rw.setting.C0059 var26 = var1.m148000(var21);
            if (C0405.m52000(var26)) {
               var11++;
               C0412 var27 = this.f1000.m20000(var26);
               var6 += var27.f2000;
               var5 = Math.max(var5, m10000(var27, Enum0046.f1000) + C0405.m20000(var15, Enum0046.f1000));
               if (!var16) {
                  var8 += var27.f6000;
                  var7 = Math.max(var7, var27.f5000 + C0405.m20000(var15, Enum0046.f1000));
                  var10 += var27.m12000(Enum0046.f2000);
                  var9 = Math.max(var9, var27.m12000(Enum0046.f1000) + C0405.m20000(var15, Enum0046.f1000));
               }
            }
         }
      }

      if (var11 == 0) {
         Rec0134 var22 = this.m6000(var1, var15);
         var5 = C0405.m20000(var15, Enum0046.f1000) + var22.m10000();
         var6 = C0405.m20000(var15, Enum0046.f2000) + var22.m8000();
         var7 = C0405.m20000(var15, Enum0046.f1000) + var22.m2000();
         var8 = C0405.m20000(var15, Enum0046.f2000) + var22.m6000();
         var9 = var7;
         var10 = var8;
      } else if (var4) {
         float var23 = C0405.m44000(var11, var15.m150000());
         var5 += var23;
         var7 = var16 ? C0405.m20000(var15, Enum0046.f1000) : var7 + var23;
         var8 = var16 ? C0405.m20000(var15, Enum0046.f2000) : var8;
         var9 = var16 ? C0405.m20000(var15, Enum0046.f1000) : var9 + var23;
         var10 = var16 ? C0405.m20000(var15, Enum0046.f2000) : var10;
      } else {
         float var24 = C0405.m44000(var11, var15.m150000());
         var6 += var24;
         var7 = var16 ? C0405.m20000(var15, Enum0046.f1000) : var7;
         var8 = var16 ? C0405.m20000(var15, Enum0046.f2000) : var8 + var24;
         var9 = var16 ? C0405.m20000(var15, Enum0046.f1000) : var9;
         var10 = var16 ? C0405.m20000(var15, Enum0046.f2000) : var10 + var24;
      }

      C0412 var25 = this.f1000.m20000(var1);
      var25.f1000 = C0405.m56000(var15, Enum0046.f1000, var5);
      var25.f2000 = C0405.m56000(var15, Enum0046.f2000, var6);
      var25.m14000(Enum0046.f1000, var25.f1000);
      var25.m14000(Enum0046.f2000, var25.f2000);
      var25.f5000 = C0405.m10000(var15, Enum0046.f1000, var7);
      var25.f6000 = C0405.m10000(var15, Enum0046.f2000, var8);
      var25.m10000(Enum0046.f1000, m4000(var15, Enum0046.f1000, var9));
      var25.m10000(Enum0046.f2000, m4000(var15, Enum0046.f2000, var10));
      if (var15.m32000().m4000()) {
         var25.f5000 = Math.max(var25.f5000, var7);
         var25.m10000(Enum0046.f1000, Math.max(var25.m12000(Enum0046.f1000), var7));
      }

      var25.f1000 = this.f1000.m14000(var1, Enum0046.f1000, var25.f1000);
      if (!var15.m32000().m4000()) {
         var25.m6000(Enum0046.f1000);
      }
   }

   private static float m10000(C0412 var0, Enum0046 var1) {
      return Math.max(var0.m8000(var1), var0.m22000(var1));
   }
}
