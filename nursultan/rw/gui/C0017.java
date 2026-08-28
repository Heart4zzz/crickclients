package rw.gui;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import rw.core.C0291;
import rw.core.C0316;
import rw.core.C0385;
import rw.data.Rec0097;

final class C0017 {
   private static final float f1000 = 28.0F;
   private final C0291 f2000;
   private final Map<rw.setting.C0059, C0316> f3000 = new IdentityHashMap<>();
   private Rec0097 f4000 = Rec0097.m14000();

   private static boolean m2000(rw.setting.C0059 var0, float var1) {
      if (var0 != null && var0.m78000().m142000() && !(var0.m42000().m14000() <= 0.0F)) {
         float var2 = var0.m42000().m36000();
         float var3 = var0.m42000().m14000();
         return var1 > 0.0F && var2 > 0.0F || var1 < 0.0F && var2 < var3;
      } else {
         return false;
      }
   }

   C0017(C0291 var1) {
      this.f2000 = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   void m6000() {
      this.f3000.clear();
   }

   void m8000(rw.setting.C0059 var1) {
      if (!this.f3000.isEmpty()) {
         this.f3000.keySet().removeIf(var1x -> !m14000(var1, var1x));
      }
   }

   private boolean m10000(rw.setting.C0059 var1, float var2) {
      float var3 = var1.m42000().m36000() - var2 * 28.0F;
      if (!var1.m42000().m82000(var3, this.f2000.m4000())) {
         return false;
      } else {
         var1.m56000(8);
         return true;
      }
   }

   private static boolean m14000(rw.setting.C0059 var0, rw.setting.C0059 var1) {
      return var0 != null && var1 != null ? C0016.m34000(var0, var1) && var1.m78000().m142000() && var1.m42000().m14000() > 0.0F : false;
   }

   private static float m16000(float var0, float var1, float var2) {
      return !(var1 <= 0.0F) && !(var2 <= 0.0F) ? var0 * (float)Math.exp(-var1 * var2) : var0;
   }

   void m18000(Rec0097 var1) {
      this.f4000 = Objects.requireNonNull(var1, "nextOptions");
      if (!this.f4000.m2000()) {
         this.m6000();
      }
   }

   Rec0097 m20000() {
      return this.f4000;
   }

   void m22000(rw.setting.C0059 var1) {
      if (var1 != null) {
         this.f3000.remove(var1);
      }
   }

   private void m24000(rw.setting.C0059 var1, float var2, float var3) {
      C0316 var4 = this.f3000.computeIfAbsent(var1, var0 -> new C0316());
      var4.m2000(-var2 * var3);
   }

   boolean m26000(rw.setting.C0059 var1, float var2) {
      if (var1 != null && !this.f3000.isEmpty()) {
         if (!this.f4000.m2000()) {
            this.m6000();
            return false;
         } else {
            boolean var3 = false;
            float var4 = Math.max(0.0F, var2);
            Iterator var5 = this.f3000.entrySet().iterator();

            while (var5.hasNext()) {
               Entry var6 = (Entry)var5.next();
               rw.setting.C0059 var7 = (rw.setting.C0059)var6.getKey();
               C0316 var8 = (C0316)var6.getValue();
               if (!m14000(var1, var7)) {
                  var5.remove();
               } else if (!(var4 <= 0.0F)) {
                  float var9 = var7.m42000().m14000();
                  float var10 = var7.m42000().m36000() + var8.m4000() * var4;
                  if (var7.m42000().m82000(var10, this.f2000.m4000())) {
                     var7.m56000(8);
                     var3 = true;
                  }

                  float var11 = var7.m42000().m36000();
                  if ((!(var11 <= 0.0F) || !(var8.m4000() < 0.0F)) && (!(var11 >= var9) || !(var8.m4000() > 0.0F))) {
                     float var12 = m16000(var8.m4000(), this.f4000.m6000(), var4);
                     if (Math.abs(var12) <= this.f4000.m16000()) {
                        var5.remove();
                     } else {
                        var8.m6000(var12);
                     }
                  } else {
                     var5.remove();
                  }
               }
            }

            return var3;
         }
      } else {
         return false;
      }
   }

   boolean m28000(rw.setting.C0059 var1, rw.setting.C0059 var2, float var3) {
      if (var1 == null || var3 == 0.0F) {
         return false;
      } else if (var2 != null && !C0016.m34000(var2, var1)) {
         return false;
      } else {
         for (rw.setting.C0059 var4 = var1; var4 != null; var4 = var4.m180000()) {
            if (m2000(var4, var3)) {
               if (!this.f4000.m2000()) {
                  return this.m10000(var4, var3);
               }

               this.m24000(var4, var3, this.f4000.m8000());
               return true;
            }

            if (var4 == var2 || C0385.m6000(var4)) {
               break;
            }
         }

         return false;
      }
   }
}
