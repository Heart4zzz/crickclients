package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;

public final class C0306 extends Base0315 {
   private final float f1000;
   private final float f2000;
   private final Iface0212 f3000;

   public Iface0212 m2000() {
      return this.f3000;
   }

   public C0306(Enum0026 var1, Iface0212 var2, float var3, float var4, Iface0212 var5) {
      super(var1, var2, false, false);
      this.f1000 = var3;
      this.f2000 = var4;
      this.f3000 = var5;
   }

   public float m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}
