package rw.gui;

import java.util.Objects;
import rw.core.C0259;
import rw.core.C0291;
import rw.core.C0321;
import rw.data.Rec0096;
import rw.data.Rec0130;
import rw.defs.Enum0033;

final class C0018 {
   private final C0291 f1000;

   C0018(C0291 var1) {
      this.f1000 = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private Rec0096 m2000(rw.setting.C0059 var1) {
      if (!var1.m78000().m142000()) {
         return null;
      } else if (var1.m78000().m100000() == Enum0033.f1000) {
         return null;
      } else {
         float var2 = var1.m42000().m14000();
         if (var2 <= 0.0F) {
            return null;
         } else {
            Rec0130 var3 = var1.m78000().m226000();
            float var4 = var1.m42000().m18000();
            float var5 = var1.m42000().m20000();
            float var6 = C0259.m8000(var3.m40000(), 0.0F, Math.max(0.0F, var4));
            if (!(var6 <= 0.0F) && !(var5 <= 0.0F)) {
               float var7 = switch (C0321.f1000[var1.m78000().m100000().ordinal()]) {
                  case 1 -> var1.m42000().m80000() + var4;
                  case 2 -> var1.m42000().m80000() + Math.max(0.0F, var4 - var6);
                  case 3 -> var1.m42000().m80000();
                  default -> throw new MatchException(null, null);
               };
               float var8 = this.f1000.m4000();
               float var9 = C0259.m8000(var3.m34000(), 0.0F, var6 * 0.5F);
               float var10 = C0259.m8000(var3.m2000(), 0.0F, var5 * 0.5F);
               float var11 = C0259.m2000(var1.m42000().m10000() + var10, var8);
               float var12 = C0259.m2000(Math.max(0.0F, var5 - var10 * 2.0F), var8);
               if (var12 <= 0.0F) {
                  return null;
               } else {
                  float var13 = C0259.m2000(var7 + var9, var8);
                  float var15 = C0259.m2000(Math.max(0.0F, var6 - var9 * 2.0F), var8);
                  float var17 = var5 + var2;
                  float var18 = var17 <= 0.0F ? 1.0F : var5 / var17;
                  float var19 = var12 * var18;
                  var19 = C0259.m2000(C0259.m8000(var19, var3.m22000(), var12), var8);
                  float var20 = Math.max(0.0F, var12 - var19);
                  float var21 = var1.m42000().m36000() / var2;
                  float var22 = C0259.m8000(var21 * var20, 0.0F, var20);
                  float var24 = C0259.m2000(var11 + var22, var8);
                  return new Rec0096(var7, var11, var6, var12, var13, var11, var15, var12, var13, var24, var15, var19, var20);
               }
            } else {
               return null;
            }
         }
      }
   }

   Rec0096 m4000(rw.setting.C0059 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = var1.m42000().m78000();
         int var3 = var1.m72000();
         int var4 = this.f1000.m2000();
         if (var1.m92000().m18000(var2, var3, var4)) {
            return var1.m92000().m14000();
         } else {
            Rec0096 var5 = this.m2000(var1);
            var1.m92000().m46000(var5, var2, var3, var4);
            return var5;
         }
      }
   }
}
