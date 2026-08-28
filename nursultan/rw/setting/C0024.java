package rw.setting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import net.minecraft.util.profiling.jfr.callback.ProfiledDuration;
import rw.api.Iface0192;
import rw.core.C0317;
import rw.core.C0370;
import rw.core.C0373;
import rw.data.Rec0070;
import rw.data.Rec0079;
import rw.defs.Enum0019;

public final class C0024 {
   private final rw.gui.C0013 f1000;
   private final Map<C0059, ProfiledDuration> f2000 = new IdentityHashMap<>();
   private final Set<C0059> f3000 = Collections.newSetFromMap(new IdentityHashMap<>());

   public boolean m2000(C0059 var1) {
      ProfiledDuration var2 = this.f2000.get(var1);
      if (var2 != null && !var2.N.isEmpty()) {
         for (C0026 var4 : var2.N.values()) {
            if (var4.m10000().m14000()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private C0024(rw.gui.C0013 var1) {
      this.f1000 = Objects.requireNonNull(var1, "context");
   }

   public void m6000(C0059 var1) {
      if (var1 != null) {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            C0059 var3 = (C0059)var2.pop();
            this.f2000.remove(var3);
            this.f3000.remove(var3);

            for (int var4 = 0; var4 < var3.m102000(); var4++) {
               var2.push(var3.m148000(var4));
            }
         }
      }
   }

   public Rec0079 m8000(float var1) {
      if (!(var1 <= 0.0F) && !this.f2000.isEmpty()) {
         boolean var2 = false;
         boolean var3 = false;
         Iterator var4 = this.f2000.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            C0059 var6 = (C0059)var5.getKey();
            ProfiledDuration var7 = (ProfiledDuration)var5.getValue();
            if (var7.N.isEmpty()) {
               var4.remove();
            } else if (var7.y) {
               var7.y = false;
            } else {
               rw.gui.C0019 var8 = var6.m78000();
               C0370 var9 = null;
               ArrayList var10 = null;
               Iterator var11 = var7.N.values().iterator();

               while (var11.hasNext()) {
                  C0026 var12 = (C0026)var11.next();
                  boolean var13 = var12.m34000(var1);
                  if (var13 || var12.m36000()) {
                     if (var9 == null) {
                        var9 = var8.m216000();
                     }

                     var12.m10000().m40000(var9, var12);
                     if (var12.m36000()) {
                        var11.remove();
                        if (var10 == null) {
                           var10 = new ArrayList(2);
                        }

                        var10.add(var12.m10000());
                     }
                  }
               }

               rw.gui.C0019 var16 = var9 == null ? var8 : var9.m60000();
               boolean var17 = !var16.m156000(var8);
               boolean var14 = !var16.m132000(var8);
               boolean var15 = !var16.m4000(var8);
               if (var17 || var14 || var15) {
                  var6.m152000(var16);
                  if (var17) {
                     var6.m56000(2);
                     var3 = true;
                  } else if (var14) {
                     var6.m56000(4);
                  } else {
                     var6.m56000(1);
                  }

                  var2 = true;
               }

               m16000(var6, var10, var7.N.isEmpty());
               if (var7.N.isEmpty()) {
                  var4.remove();
               }
            }
         }

         return Rec0079.m8000(var2, var3);
      } else {
         return Rec0079.f3000;
      }
   }

   public boolean m10000(C0059 var1) {
      ProfiledDuration var2 = this.f2000.get(var1);
      return var2 != null && !var2.N.isEmpty();
   }

   private static void m14000(C0059 var0, Enum0019 var1, boolean var2) {
      C0317.m2000(new SelectItemModel$UnbakedSwitch(var0, var1, var2));
   }

   private static void m16000(C0059 var0, List<Enum0019> var1, boolean var2) {
      if (var1 != null && !var1.isEmpty()) {
         for (Enum0019 var4 : var1) {
            m14000(var0, var4, var2);
         }
      }
   }

   public static C0024 m18000(rw.gui.C0013 var0) {
      return var0.m10000(C0024.class).orElseGet(() -> {
         C0024 var1 = new C0024(var0);
         var0.m12000(C0024.class, var1);
         return var1;
      });
   }

   public boolean m20000(C0059 var1) {
      if (var1 == null) {
         return false;
      } else {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            C0059 var3 = (C0059)var2.pop();
            ProfiledDuration var4 = this.f2000.get(var3);
            if (var3.m26000() && var4 != null && !var4.N.isEmpty()) {
               return true;
            }

            for (int var5 = 0; var5 < var3.m102000(); var5++) {
               var2.push(var3.m148000(var5));
            }
         }

         return false;
      }
   }

   private rw.gui.C0019 m22000(C0059 var1, rw.gui.C0019 var2, C0373 var3) {
      if (var3 != null && !var3.m74000()) {
         rw.gui.C0019 var4 = var3.m92000(var2);
         Rec0070 var5 = var2.m152000();
         rw.gui.C0019 var6 = var2;
         ProfiledDuration var7 = null;

         for (Enum0019 var11 : Enum0019.m8000()) {
            if (var11.m24000(var4, var2)) {
               Iface0192 var12 = var5.m6000(var11);
               if (var12.m4000() && var11.m22000(var4, var2, var12)) {
                  if (var7 == null) {
                     ProfiledDuration var10000 = new ProfiledDuration;
                     var10000.finish(true);
                     var7 = var10000;
                  }

                  var7.N.put(var11, var11.m48000(var4, var2, var12));
                  var6 = var11.m20000(var4, var6);
               }
            }
         }

         if (var7 != null && !var7.N.isEmpty()) {
            this.f2000.put(var1, var7);
         }

         return var6;
      } else {
         return var2;
      }
   }

   public rw.gui.C0019 m24000(C0059 var1, rw.gui.C0019 var2, rw.gui.C0019 var3, C0373 var4) {
      if (var1 != null && var2 != null && var3 != null) {
         if (!this.f3000.contains(var1)) {
            this.f3000.add(var1);
            this.f2000.remove(var1);
            return this.m22000(var1, var3, var4);
         } else {
            rw.gui.C0019 var5 = var3;
            ProfiledDuration var6 = this.f2000.computeIfAbsent(var1, var0 -> {
               ProfiledDuration var10000 = new ProfiledDuration;
               var10000.finish(false);
               return var10000;
            });
            Rec0070 var7 = var3.m152000();

            for (Enum0019 var11 : Enum0019.m8000()) {
               if (!var11.m24000(var2, var3)) {
                  var6.N.remove(var11);
               } else {
                  Iface0192 var12 = var7.m6000(var11);
                  if (var12.m4000() && var11.m22000(var2, var3, var12)) {
                     C0026 var13 = var6.N.get(var11);
                     if (var13 != null && var13.m38000(var12) && var11.m36000(var13, var3)) {
                        var5 = var11.m20000(var2, var5);
                     } else if (var13 != null && var13.m20000(var12) && var13.m22000(var11.m46000(var3))) {
                        var5 = var11.m42000(var5, var13.m18000());
                     } else {
                        C0026 var14 = var11.m48000(var2, var3, var12);
                        var6.N.put(var11, var14);
                        var5 = var11.m20000(var2, var5);
                     }
                  } else {
                     var6.N.remove(var11);
                  }
               }
            }

            if (var6.N.isEmpty()) {
               this.f2000.remove(var1);
            }

            return var5;
         }
      } else {
         return var3;
      }
   }

   public boolean m26000(float var1) {
      return this.m8000(var1).m6000();
   }
}
