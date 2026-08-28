package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;

public final class C0318 extends Base0315 {
   private final float f1000;
   private final float f2000;
   private final int f3000;
   private final boolean f4000;

   public int m2000() {
      return this.f3000;
   }

   public C0318(Enum0026 var1, Iface0212 var2, float var3, float var4, int var5, boolean var6) {
      super(var1, var2);
      this.f1000 = var3;
      this.f2000 = var4;
      this.f3000 = var5;
      this.f4000 = var6;
   }

   @Override
   public boolean m4000() {
      return this.f4000;
   }

   public float m6000() {
      return this.f2000;
   }

   public float m8000() {
      return this.f1000;
   }
}
