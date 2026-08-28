package rw.core;

import rw.api.Iface0192;
import rw.data.Rec0070;
import rw.defs.Enum0019;
import rw.gui.C0019;

final class C0281 {
   private C0281() {
   }

   static boolean m2000(rw.setting.C0059 var0, rw.setting.C0024 var1) {
      if (var0 == null) {
         return false;
      } else {
         rw.setting.C0056 var2 = var0.m54000();
         C0373 var3 = var2 == null ? C0373.f1000 : var2.m102000();
         if (var3.m74000()) {
            return false;
         } else if (var1.m10000(var0)) {
            return true;
         } else {
            C0019 var4 = var0.m78000();
            C0019 var5 = var3.m92000(var4);
            Rec0070 var6 = var5.m152000();

            for (Enum0019 var10 : Enum0019.m8000()) {
               if (var10.m24000(var4, var5)) {
                  Iface0192 var11 = var6.m6000(var10);
                  if (var11.m4000() && var10.m22000(var4, var5, var11)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }
}
