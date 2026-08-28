package rw.core;

import rw.api.Iface0221;
import rw.data.Rec0131;
import rw.defs.Enum0035;
import rw.defs.Enum0046;
import rw.defs.Enum0047;
import rw.gui.C0019;

final class C0387 {
   private final C0393 f1000;
   private final Iface0221 f2000;
   private final float f3000;
   private final boolean f4000;

   C0387(C0393 var1, Iface0221 var2, float var3, boolean var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   private void m2000(rw.setting.C0059 var1, C0019 var2, float var3, float var4, float var5, float var6) {
      Rec0131 var7 = var2.m150000();
      boolean var8 = C0405.m34000(var7);
      if (var2.m16000() == Enum0035.f1000) {
         this.m8000(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         this.m4000(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   private void m4000(rw.setting.C0059 var1, C0019 var2, float var3, float var4, float var5, float var6, Rec0131 var7, boolean var8) {
      int var9 = 0;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var1.m102000(); var11++) {
         rw.setting.C0059 var12 = var1.m148000(var11);
         if (C0405.m52000(var12)) {
            var9++;
            var10 += this.f2000.m4000(var12);
         }
      }

      if (var9 != 0) {
         float var17 = C0405.m42000(var9, var7, var6 - var10);
         var10 += C0405.m40000(var9, var17);
         float var18 = var4;
         if (!var8) {
            var18 = var4 + C0405.m24000(var2.m52000(), var6 - var10);
         }

         for (int var13 = 0; var13 < var1.m102000(); var13++) {
            rw.setting.C0059 var14 = var1.m148000(var13);
            if (C0405.m52000(var14)) {
               float var15 = var3 + C0405.m54000(var2.m38000(), var5 - this.f2000.m6000(var14));
               this.m14000(var14, var15, var18);
               var18 += this.f2000.m4000(var14) + var17;
            }
         }
      }
   }

   private float m6000(rw.setting.C0059 var1) {
      int var2 = 0;
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var1.m102000(); var4++) {
         rw.setting.C0059 var5 = var1.m148000(var4);
         if (C0405.m52000(var5)) {
            var2++;
            var3 += this.f2000.m4000(var5);
         }
      }

      return var3 + C0405.m44000(var2, var1.m78000().m150000());
   }

   private void m8000(rw.setting.C0059 var1, C0019 var2, float var3, float var4, float var5, float var6, Rec0131 var7, boolean var8) {
      int var9 = 0;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var1.m102000(); var11++) {
         rw.setting.C0059 var12 = var1.m148000(var11);
         if (C0405.m52000(var12)) {
            var9++;
            var10 += this.f2000.m6000(var12);
         }
      }

      if (var9 != 0) {
         float var17 = C0405.m42000(var9, var7, var5 - var10);
         var10 += C0405.m40000(var9, var17);
         float var18 = var3;
         if (!var8) {
            var18 = var3 + C0405.m24000(var2.m38000(), var5 - var10);
         }

         for (int var13 = 0; var13 < var1.m102000(); var13++) {
            rw.setting.C0059 var14 = var1.m148000(var13);
            if (C0405.m52000(var14)) {
               float var15 = var4 + C0405.m54000(var2.m52000(), var6 - this.f2000.m4000(var14));
               this.m14000(var14, var18, var15);
               var18 += this.f2000.m6000(var14) + var17;
            }
         }
      }
   }

   private float m10000(float var1) {
      return C0405.m6000(var1, this.f3000);
   }

   void m12000(rw.setting.C0059 var1) {
      this.m14000(var1, 0.0F, 0.0F);
   }

   private void m14000(rw.setting.C0059 var1, float var2, float var3) {
      this.f1000.f7000++;
      C0019 var4 = var1.m78000();
      C0347 var5 = var1.m42000();
      float var6 = this.f2000.m6000(var1);
      float var7 = this.f2000.m4000(var1);
      var5.m72000(var6, var7);
      float var8 = this.m10000(var2);
      float var9 = this.m10000(var3);
      var5.m6000(var8, var9);
      var5.m50000(var8, var9);
      var5.m54000(this.m10000(var2 + var6) - var8, this.m10000(var3 + var7) - var9);
      float var10 = var2 + C0405.m12000(var4, Enum0046.f1000);
      float var11 = var3 + C0405.m12000(var4, Enum0046.f2000);
      float var12 = Math.max(0.0F, var6 - C0405.m20000(var4, Enum0046.f1000) - C0405.m48000(var4));
      float var13 = Math.max(0.0F, var7 - C0405.m20000(var4, Enum0046.f2000));
      float var14 = this.m10000(var10);
      float var15 = this.m10000(var11);
      var5.m66000(var14, var15, this.m10000(var10 + var12) - var14, this.m10000(var11 + var13) - var15);
      if (this.f4000) {
         this.m16000(var1, var5);
         this.m18000(var1, var5, var4, var13);
      }

      this.m20000(var1, var4, var10, var11, var12, var13);
   }

   private void m16000(rw.setting.C0059 var1, C0347 var2) {
      if (var1.m120000() == Enum0047.f4000) {
         var2.m64000(Math.max(0.0F, var2.m20000()));
         String var3 = this.f2000.m2000(var1);
         var2.m70000(var3 == null ? var1.m32000() : var3);
      } else {
         var2.m64000(0.0F);
         var2.m70000("");
      }
   }

   private void m18000(rw.setting.C0059 var1, C0347 var2, C0019 var3, float var4) {
      float var5 = 0.0F;
      if (var3.m142000()) {
         var5 = Math.max(0.0F, this.m6000(var1) - var4);
      }

      var2.m24000(var5, this.f3000);
   }

   private void m20000(rw.setting.C0059 var1, C0019 var2, float var3, float var4, float var5, float var6) {
      this.m2000(var1, var2, var3, var4, var5, var6);

      for (int var7 = 0; var7 < var1.m102000(); var7++) {
         rw.setting.C0059 var8 = var1.m148000(var7);
         if (!C0405.m52000(var8)) {
            C0019 var9 = var8.m78000();
            if (C0385.m6000(var8)) {
               this.m14000(var8, var9.m108000(), var9.m106000());
            } else {
               this.m14000(var8, var3 + var9.m108000(), var4 + var9.m106000());
            }
         }
      }
   }
}
