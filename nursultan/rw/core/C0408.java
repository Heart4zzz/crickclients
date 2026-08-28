package rw.core;

import rw.defs.Enum0032;
import rw.gui.C0019;
import rw.setting.C0062;

final class C0408 {
   private final C0062 f1000;

   C0408(C0062 var1) {
      this.f1000 = var1;
   }

   private int m2000(rw.setting.C0059 var1, C0019 var2) {
      if (!var2.m28000()) {
         return var2.m70000();
      } else {
         return var2.m76000() != Enum0032.f2000 ? 0 : 1000 + this.f1000.m4000();
      }
   }

   private void m4000(rw.setting.C0059 var1, int var2) {
      this.f1000.m8000().f1000++;
      var1.m122000(var2);
      var1.m42000().m76000(this.m2000(var1, var1.m78000()));

      for (int var3 = 0; var3 < var1.m102000(); var3++) {
         rw.setting.C0059 var4 = var1.m148000(var3);
         this.m4000(var4, var2 + 1);
      }
   }

   void m6000() {
      this.m4000(this.f1000.m18000(), 0);
   }
}
