package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.api.Iface0212;
import rw.defs.Enum0029;

public final class C0317 {
   private C0317() {
   }

   public static void m2000(Base0315 var0) {
      if (var0 != null && var0.m38000() != null && var0.m12000() != null) {
         List var1 = m4000(var0.m38000());
         if (!var1.isEmpty()) {
            for (int var2 = 0; var2 < var1.size() - 1; var2++) {
               rw.setting.C0059 var3 = (rw.setting.C0059)var1.get(var2);
               var0.m34000(var3);
               var0.m30000(Enum0029.f1000);
               var3.m162000(var0, true);
               if (var0.m28000()) {
                  return;
               }
            }

            rw.setting.C0059 var5 = (rw.setting.C0059)var1.getLast();
            var0.m34000(var5);
            var0.m30000(Enum0029.f2000);
            var5.m162000(var0, true);
            if (!var0.m36000()) {
               var5.m162000(var0, false);
            }

            if (!var0.m28000() && var0.m8000()) {
               for (int var6 = var1.size() - 2; var6 >= 0; var6--) {
                  rw.setting.C0059 var4 = (rw.setting.C0059)var1.get(var6);
                  var0.m34000(var4);
                  var0.m30000(Enum0029.f3000);
                  var4.m162000(var0, false);
                  if (var0.m28000()) {
                     return;
                  }
               }
            }
         }
      }
   }

   private static List<rw.setting.C0059> m4000(Iface0212 var0) {
      ArrayList var1 = new ArrayList();

      for (rw.setting.C0059 var2 = (rw.setting.C0059)var0; var2 != null; var2 = var2.m180000()) {
         var1.add(var2);
      }

      ArrayList var3 = new ArrayList(var1.size());

      for (int var4 = var1.size() - 1; var4 >= 0; var4--) {
         var3.add((rw.setting.C0059)var1.get(var4));
      }

      return var3;
   }
}
