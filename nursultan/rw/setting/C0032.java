package rw.setting;

import java.util.Objects;
import rw.core.C0290;
import rw.core.C0301;
import rw.core.C0384;
import rw.defs.Enum0047;

final class C0032 {
   C0059 m2000(C0031 var1) {
      Objects.requireNonNull(var1, "spec");
      Enum0047 var2 = var1.m20000();
      C0059 var3 = new C0059(var1.m30000(), var2);
      C0384.m2000(var3, C0301.m4000(var1));
      C0290 var4 = C0301.m2000(var1);
      if (var4 != null) {
         var4.m4000(var3);
      }

      var3.m142000(var1.m32000());
      var3.m156000(var1.m10000());

      for (C0033 var6 : var1.m16000()) {
         var3.m160000(var6.m6000(), var6.m4000(), var6.m2000());
      }

      if (var2 == Enum0047.f4000) {
         var3.m140000(var1.m4000());
      }

      if (var2 == Enum0047.f3000) {
         var3.m140000(var1.m4000());
         var3.m126000(var1.m6000());
      }

      if (var2 == Enum0047.f5000) {
         var3.m6000(var1.m8000());
      }

      if (var2 == Enum0047.f2000 && var1.m14000() != null) {
         var3.m158000(var1.m14000());
      }

      for (C0031 var8 : var1.m2000()) {
         var3.m172000(this.m2000(var8));
      }

      return var3;
   }
}
