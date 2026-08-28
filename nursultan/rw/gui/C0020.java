package rw.gui;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import rw.api.Iface0192;
import rw.api.Iface0203;
import rw.core.C0388;
import rw.core.C0401;
import rw.core.C0405;
import rw.data.Rec0076;
import rw.data.Rec0125;
import rw.defs.Enum0019;
import rw.defs.Enum0022;
import rw.defs.Enum0039;
import rw.defs.Enum0046;
import rw.setting.C0024;
import rw.setting.C0061;

public final class C0020 {
   private static final float f1000 = 0.001F;
   private final C0024 f2000;
   private final Map<rw.setting.C0059, C0401> f3000 = new IdentityHashMap<>();

   private C0020(C0024 var1) {
      this.f2000 = Objects.requireNonNull(var1, "animationManager");
   }

   private static boolean m2000(Rec0125 var0, Rec0125 var1) {
      if (var0 != null && var1 != null && var0.m20000() == var1.m20000()) {
         return switch (var0.m20000()) {
            case f1000, f2000 -> Float.isFinite(var0.m14000())
               && Float.isFinite(var0.m36000())
               && Float.isFinite(var1.m14000())
               && Float.isFinite(var1.m36000());
            case f4000, f3000 -> Float.isFinite(var0.m8000()) && Float.isFinite(var1.m8000());
         };
      } else {
         return false;
      }
   }

   private float m6000(rw.setting.C0059 var1, Enum0046 var2, float var3) {
      return this.m28000(var1, var2, var3, false);
   }

   private static Iface0192 m8000(C0019 var0, Enum0046 var1) {
      return var0.m152000().m6000(m16000(var1));
   }

   private static C0388 m12000(C0401 var0, Enum0046 var1) {
      return var1 == Enum0046.f1000 ? var0.f1000 : var0.f2000;
   }

   private static boolean m14000(Iface0192 var0) {
      if (var0 == null || !var0.m4000()) {
         return false;
      } else if (var0 instanceof Rec0076) {
         return true;
      } else {
         return var0 instanceof Iface0203 var1 ? var1.m2000(Enum0022.f1000) : false;
      }
   }

   private static Enum0019 m16000(Enum0046 var0) {
      return var0 == Enum0046.f1000 ? Enum0019.f17000 : Enum0019.f18000;
   }

   public boolean m18000(float var1) {
      if (!(var1 <= 0.0F) && !this.f3000.isEmpty()) {
         boolean var2 = false;

         for (Entry var4 : this.f3000.entrySet()) {
            rw.setting.C0059 var5 = (rw.setting.C0059)var4.getKey();
            C0401 var6 = (C0401)var4.getValue();
            var2 |= this.m26000(var5, var6.f1000, var1);
            var2 |= this.m26000(var5, var6.f2000, var1);
         }

         return var2;
      } else {
         return false;
      }
   }

   private static boolean m20000(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   public static C0020 m22000(C0013 var0) {
      C0013 var1 = Objects.requireNonNull(var0, "context");
      return var1.m10000(C0020.class).orElseGet(() -> {
         C0020 var1x = new C0020(C0024.m18000(var1));
         var1.m12000(C0020.class, var1x);
         return var1x;
      });
   }

   private static boolean m24000(Rec0125 var0, Rec0125 var1) {
      if (var0 != null && var1 != null && var0.m20000() == var1.m20000() && !Objects.equals(var0, var1)) {
         return switch (var1.m20000()) {
            case f1000, f2000 -> !m2000(var0, var1);
            default -> false;
         };
      } else {
         return false;
      }
   }

   private boolean m26000(rw.setting.C0059 var1, C0388 var2, float var3) {
      if (var2.f5000 == null) {
         return false;
      } else {
         boolean var4 = var2.f5000.m8000(var3);
         var2.f3000 = var2.f5000.m4000();
         if (var2.f5000.m6000()) {
            var2.f3000 = var2.f4000;
            var2.f5000 = null;
            var4 = true;
         }

         if (var4) {
            var1.m56000(2);
         }

         return var4;
      }
   }

   private float m28000(rw.setting.C0059 var1, Enum0046 var2, float var3, boolean var4) {
      C0401 var5 = this.f3000.get(var1);
      if (var5 == null) {
         return var3;
      } else {
         C0388 var6 = m12000(var5, var2);
         var6.f1000 = true;
         var6.f2000 = C0405.m28000(var1.m78000(), var2);
         var6.f3000 = var3;
         var6.f4000 = var3;
         var6.f5000 = null;
         var6.f6000 = var4;
         return var3;
      }
   }

   private static boolean m30000(C0019 var0, Enum0046 var1) {
      Rec0125 var2 = C0405.m28000(var0, var1);
      return var2.m20000() == Enum0039.f1000 || var2.m20000() == Enum0039.f2000;
   }

   float m32000(rw.setting.C0059 var1, Enum0046 var2, float var3) {
      if (var1 == null) {
         return var3;
      } else {
         C0019 var4 = var1.m78000();
         if (!m30000(var4, var2)) {
            return this.m6000(var1, var2, var3);
         } else {
            Iface0192 var5 = m8000(var4, var2);
            if (!m14000(var5)) {
               return this.m6000(var1, var2, var3);
            } else {
               C0388 var6 = m12000(this.f3000.computeIfAbsent(var1, var0 -> new C0401()), var2);
               Rec0125 var7 = C0405.m28000(var4, var2);
               if (!var6.f1000) {
                  var6.f1000 = true;
                  var6.f2000 = var7;
                  var6.f3000 = var3;
                  var6.f4000 = var3;
                  return var3;
               } else {
                  Rec0125 var8 = var6.f2000;
                  boolean var9 = m24000(var8, var7);
                  boolean var10 = m34000(var8, var7, var6.f4000, var3);
                  boolean var11 = this.f2000.m2000(var1);
                  boolean var12 = !var9 && var10 && (var11 || var6.f6000);
                  var6.f6000 = var11;
                  if (var12) {
                     return this.m28000(var1, var2, var3, var11);
                  } else {
                     boolean var13 = var6.f5000 != null || var9 || var10;
                     var6.f2000 = var7;
                     if (!var13) {
                        return this.m28000(var1, var2, var3, var11);
                     } else if (m20000(var6.f4000, var3) && var6.f5000 == null) {
                        var6.f3000 = var3;
                        return var3;
                     } else if (var6.f5000 != null) {
                        if (!m20000(var6.f4000, var3)) {
                           var6.f5000 = C0061.m10000(m16000(var2), var5, var6.f3000, var3);
                           var6.f4000 = var3;
                        }

                        return var6.f3000;
                     } else if (m20000(var6.f3000, var3)) {
                        var6.f4000 = var3;
                        return var3;
                     } else {
                        var6.f5000 = C0061.m10000(m16000(var2), var5, var6.f3000, var3);
                        var6.f4000 = var3;
                        return var6.f3000;
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean m34000(Rec0125 var0, Rec0125 var1, float var2, float var3) {
      return var1 != null && Objects.equals(var0, var1) && !m20000(var2, var3) ? var1.m20000() == Enum0039.f1000 || var1.m20000() == Enum0039.f2000 : false;
   }

   public void m36000(rw.setting.C0059 var1) {
      if (var1 != null) {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            rw.setting.C0059 var3 = (rw.setting.C0059)var2.pop();
            this.f3000.remove(var3);

            for (int var4 = 0; var4 < var3.m102000(); var4++) {
               var2.push(var3.m148000(var4));
            }
         }
      }
   }
}
