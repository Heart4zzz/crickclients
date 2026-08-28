package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;

public final class C0310 extends Base0315 {
   private final String f1000;
   private final String f2000;

   public C0310(Enum0026 var1, Iface0212 var2, String var3, String var4) {
      super(var1, var2);
      this.f1000 = var3 == null ? "" : var3;
      this.f2000 = var4 == null ? "" : var4;
   }

   public String m2000() {
      return this.f2000;
   }

   public String m4000() {
      return this.f1000;
   }
}
