package rw.core;

import rw.api.Iface0212;
import rw.data.Rec0102;
import rw.defs.Enum0026;

public final class C0319 extends Base0315 {
   private final int f1000;
   private final boolean f2000;
   private final Rec0102 f3000;
   private final boolean f4000;

   public Rec0102 m2000() {
      return this.f3000;
   }

   public C0319(Enum0026 var1, Iface0212 var2, int var3, boolean var4, Rec0102 var5, boolean var6) {
      super(var1, var2);
      this.f1000 = var3;
      this.f2000 = var4;
      this.f3000 = var5 == null ? Rec0102.f5000 : var5;
      this.f4000 = var6;
   }

   @Override
   public boolean m4000() {
      return this.f4000;
   }

   public boolean m6000() {
      return this.f2000;
   }

   public int m8000() {
      return this.f1000;
   }
}
