package rw.core;

import rw.data.Rec0099;

final class C0322 {
   private C0322() {
   }

   private static boolean m2000(rw.setting.C0059 var0) {
      return var0.m42000().m36000() <= 0.0F ? false : var0.m78000().m142000();
   }

   static Rec0099 m4000(rw.setting.C0059 var0) {
      float var1 = 0.0F;
      rw.setting.C0059 var2 = var0;

      for (rw.setting.C0059 var3 = var0.m180000(); var3 != null && !C0385.m6000(var2); var3 = var3.m180000()) {
         if (m2000(var3) && C0385.m4000(var2)) {
            var1 -= Math.max(0.0F, var3.m42000().m36000());
         }

         var2 = var3;
      }

      return new Rec0099(var0.m42000().m58000(), var0.m42000().m8000() + var1, var0.m42000().m48000(), var0.m42000().m22000());
   }
}
