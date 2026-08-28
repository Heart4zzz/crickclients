package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;

public final class C0320 extends Base0315 {
   private final Iface0212 f1000;

   public C0320(Enum0026 var1, Iface0212 var2, Iface0212 var3) {
      super(var1, var2, false, false);
      this.f1000 = var3;
   }

   public Iface0212 m2000() {
      return this.f1000;
   }
}
