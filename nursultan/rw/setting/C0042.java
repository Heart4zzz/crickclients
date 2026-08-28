package rw.setting;

import java.util.Objects;
import rw.core.C0297;

final class C0042 {
   static final Object f1000;
   private final C0042 f2000;
   private final C0297<?> f3000;
   private final Object f4000;

   C0042(C0042 var1, C0297<?> var2, Object var3) {
      this.f2000 = var1;
      this.f3000 = Objects.requireNonNull(var2, "context");
      this.f4000 = var3;
   }

   Object m2000(C0297<?> var1) {
      for (C0042 var2 = this; var2 != null; var2 = var2.f2000) {
         if (var2.f3000 == var1) {
            return var2.f4000;
         }
      }

      return f1000;
   }
}
