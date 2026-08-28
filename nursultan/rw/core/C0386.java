package rw.core;

import java.util.ArrayList;
import rw.data.Rec0125;
import rw.defs.Enum0039;
import rw.defs.Enum0046;
import rw.gui.C0019;
import rw.setting.C0062;

final class C0386 {
   private final C0062 f1000;
   private final C0398 f2000;
   private final ArrayList<rw.setting.C0059> f3000 = new ArrayList<>();
   private final ArrayList<rw.setting.C0059> f4000 = new ArrayList<>();
   private final ArrayList<rw.setting.C0059> f5000 = new ArrayList<>();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m2000(rw.setting.C0059 var1, Enum0046 var2, float var3) {
      for (int var4 = 0; var4 < var1.m102000(); var4++) {
         rw.setting.C0059 var5 = var1.m148000(var4);
         if (!C0405.m52000(var5)) {
            C0412 var6 = this.f1000.m20000(var5);
            C0019 var7 = var5.m78000();
            Rec0125 var8 = C0405.m28000(var7, var2);
            float var9 = C0385.m6000(var5) ? (var2 == Enum0046.f1000 ? this.f1000.m12000() : this.f1000.m2000()) : var3;

            var6.m20000(var2, switch (C0397.f1000[var8.m20000().ordinal()]) {
               case 1 -> C0405.m50000(var7, var2, var8.m8000());
               case 2 -> this.m8000(var7, var2, var9);
               case 3 -> C0405.m8000(var7, var2, var9);
               case 4 -> C0405.m8000(var7, var2, var6.m8000(var2));
               default -> throw new MatchException(null, null);
            });
            this.m4000(var5, var2);
         }
      }
   }

   C0386(C0062 var1) {
      this.f1000 = var1;
      this.f2000 = new C0398(var1);
   }

   private void m4000(rw.setting.C0059 var1, Enum0046 var2) {
      C0412 var3 = this.f1000.m20000(var1);
      var3.m14000(var2, var3.m2000(var2));
      var3.m20000(var2, this.f1000.m14000(var1, var2, var3.m2000(var2)));
      var3.m6000(var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m6000(rw.setting.C0059 var1, Enum0046 var2, float var3) {
      for (int var4 = 0; var4 < var1.m102000(); var4++) {
         rw.setting.C0059 var5 = var1.m148000(var4);
         if (C0405.m52000(var5)) {
            C0412 var6 = this.f1000.m20000(var5);
            C0019 var7 = var5.m78000();
            Rec0125 var8 = C0405.m28000(var7, var2);

            float var9 = switch (C0397.f1000[var8.m20000().ordinal()]) {
               case 1 -> Math.min(C0405.m50000(var7, var2, var8.m8000()), var3);
               case 2 -> C0405.m14000(var7, var2, var3);
               case 3 -> C0405.m8000(var7, var2, var3);
               case 4 -> C0405.m8000(var7, var2, Math.min(var6.m8000(var2), var3));
               default -> throw new MatchException(null, null);
            };
            var6.m20000(var2, Math.max(var6.m22000(var2), var9));
            this.m4000(var5, var2);
         }
      }
   }

   private float m8000(C0019 var1, Enum0046 var2, float var3) {
      float var4 = Math.max(0.0F, var3 - C0405.m58000(var1, var2));
      float var5 = C0405.m28000(var1, var2).m16000(var4);
      return C0405.m50000(var1, var2, var5);
   }

   private static boolean m10000(C0019 var0, Enum0046 var1) {
      return var1 == Enum0046.f2000 && var0.m142000();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void m12000(rw.setting.C0059 var1, Enum0046 var2, float var3) {
      C0412 var4 = this.f1000.m20000(var1);
      C0019 var5 = var1.m78000();
      Rec0125 var6 = C0405.m28000(var5, var2);
      float var7 = var4.m8000(var2);

      var4.m20000(var2, switch (C0397.f1000[var6.m20000().ordinal()]) {
         case 1 -> C0405.m50000(var5, var2, var6.m8000());
         case 2 -> C0405.m14000(var5, var2, var3);
         case 3 -> C0405.m8000(var5, var2, var3);
         case 4 -> C0405.m56000(var5, var2, var7);
         default -> throw new MatchException(null, null);
      });
      var4.m14000(var2, var4.m2000(var2));
      this.m4000(var1, var2);
   }

   void m14000(rw.setting.C0059 var1, Enum0046 var2) {
      this.m16000(var1, var2, false);
   }

   private void m16000(rw.setting.C0059 var1, Enum0046 var2, boolean var3) {
      if (var2 == Enum0046.f1000) {
         this.f1000.m8000().f3000++;
      } else {
         this.f1000.m8000().f4000++;
      }

      C0019 var4 = var1.m78000();
      C0412 var5 = this.f1000.m20000(var1);
      float var6 = C0405.m46000(var5, var4, var2);
      if (C0405.m36000(var4, var2)) {
         this.m18000(var1, var4, var2, var6, var3);
      } else {
         this.m6000(var1, var2, var6);
      }

      this.m2000(var1, var2, var6);
      boolean var7 = var3 || m10000(var4, var2);

      for (int var8 = 0; var8 < var1.m102000(); var8++) {
         rw.setting.C0059 var9 = var1.m148000(var8);
         this.m16000(var9, var2, var7);
      }
   }

   private void m18000(rw.setting.C0059 var1, C0019 var2, Enum0046 var3, float var4, boolean var5) {
      ArrayList var6 = this.f3000;
      ArrayList var7 = this.f4000;
      ArrayList var8 = this.f5000;
      var6.clear();
      var7.clear();
      var8.clear();
      int var9 = 0;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;

      for (int var13 = 0; var13 < var1.m102000(); var13++) {
         rw.setting.C0059 var14 = var1.m148000(var13);
         if (C0405.m52000(var14)) {
            var9++;
            C0412 var15 = this.f1000.m20000(var14);
            C0019 var16 = var14.m78000();
            Rec0125 var17 = C0405.m28000(var16, var3);
            if (var17.m20000() == Enum0039.f3000) {
               var8.add(var14);
               var11 += var17.m8000();
               var12 += C0405.m58000(var16, var3);
            } else {
               var10 += var15.m2000(var3);
            }

            if (var17.m20000() != Enum0039.f4000) {
               var6.add(var14);
            }

            if (var17.m20000() == Enum0039.f2000) {
               var7.add(var14);
            }
         }
      }

      if (var9 != 0) {
         var10 += C0405.m44000(var9, var2.m150000());
         if (!var8.isEmpty()) {
            float var23 = Math.max(0.0F, var4 - var10);
            float var25 = Math.max(0.0F, var23 - var12);
            float var26 = var11 > 100.01F ? var11 : 100.0F;

            for (int var27 = 0; var27 < var8.size(); var27++) {
               rw.setting.C0059 var28 = (rw.setting.C0059)var8.get(var27);
               C0412 var18 = this.f1000.m20000(var28);
               C0019 var19 = var28.m78000();
               Rec0125 var20 = C0405.m28000(var19, var3);
               float var21 = var25 * var20.m8000() / var26;
               var18.m20000(var3, C0405.m50000(var19, var3, var21));
               var10 += var18.m2000(var3);
            }
         }

         float var24 = var4 - var10;
         if (var24 < -0.01F) {
            if (!var5 && !m10000(var2, var3)) {
               if (!var6.isEmpty()) {
                  this.f2000.m4000(var6, var3, var24);
               }
            }
         } else {
            if (var24 > 0.01F && !var7.isEmpty()) {
               this.f2000.m2000(var7, var3, var24);
            }
         }
      }
   }
}
