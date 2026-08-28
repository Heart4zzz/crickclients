package rw.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class C0404 {
   private C0404() {
   }

   private static boolean m4000(rw.setting.C0059 var0) {
      return C0385.m2000(var0) || !var0.m78000().m28000();
   }

   public static List<rw.setting.C0059> m6000(rw.setting.C0059 var0) {
      if (var0 != null && var0.m102000() != 0) {
         int var1 = var0.m102000();
         C0334 var2 = var0.m92000();
         int var3 = var0.m188000();
         int var4 = var0.m28000();
         if (var2.m50000(var3, var4, var1)) {
            return var2.m42000();
         } else {
            ArrayList var5 = new ArrayList(var1);
            ArrayList var6 = new ArrayList();

            for (int var7 = 0; var7 < var1; var7++) {
               rw.setting.C0059 var8 = var0.m148000(var7);
               if (m4000(var8)) {
                  var6.add(var8);
               } else {
                  var5.add(var8);
               }
            }

            var6.sort(Comparator.comparingInt(var0x -> ((rw.setting.C0059)var0x).m42000().m46000()));
            ArrayList var9 = new ArrayList(var1);
            var9.addAll(var5);
            var9.addAll(var6);
            var2.m44000(var9, var3, var4, var1);
            return var2.m42000();
         }
      } else {
         return List.of();
      }
   }
}
