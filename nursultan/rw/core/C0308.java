package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;

public final class C0308 extends Base0315 {
   private final float f1000;
   private final float f2000;
   private final float f3000;

   public float m2000() {
      return this.f3000;
   }

   public C0308(Iface0212 var1, float var2, float var3, float var4) {
      super(Enum0026.f5000, var1);
      this.f1000 = var2;
      this.f2000 = var3;
      this.f3000 = var4;
   }

   public float m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}
