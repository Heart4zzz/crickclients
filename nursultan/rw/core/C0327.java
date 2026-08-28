package rw.core;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import rw.data.Rec0089;
import rw.data.Rec0112;

final class C0327 {
   private static final Logger f1000;
   private final C0341 f2000 = new C0341();

   private static String m2000(rw.setting.C0059 var0) {
      String var1 = var0.m154000();
      return var1 != null && !var1.isBlank() ? var1 : "<anonymous>";
   }

   C0346 m6000(rw.setting.C0059 var1, Rec0112 var2, List<String> var3, boolean var4) {
      if (!var4) {
         return C0346.m10000(var2.m6000(), var2.m4000(), var3);
      } else {
         List var5 = this.f2000.m8000(var1);
         if (var5.isEmpty()) {
            return C0346.m10000(var2.m6000(), var2.m4000(), var3);
         } else {
            ArrayList var6 = new ArrayList(var2.m6000().size() + var5.size());
            var6.addAll(var2.m6000());
            var6.addAll(var5);
            return C0346.m10000(var6, var2.m4000() + var5.size(), var3);
         }
      }
   }

   void m8000(rw.setting.C0059 var1, int var2, C0330 var3, Rec0089 var4) {
      Rec0089 var5 = var4 == null ? Rec0089.f3000 : var4;
      if (var5.m6000() && var3.f3000 > 0) {
         f1000.info(
            () -> "Draw commands rebuilt for root='"
               + m2000(var1)
               + "', drawCommandCount="
               + var2
               + ", rebuiltNodes="
               + var3.f3000
               + ", cacheHits="
               + var3.f1000
               + ", cacheMisses="
               + var3.f2000
         );
      }
   }
}
