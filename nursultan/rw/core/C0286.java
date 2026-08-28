package rw.core;

import java.util.List;
import rw.defs.Enum0047;
import rw.setting.C0031;

public final class C0286 extends Base0298<C0286> {
   private String f1000 = "";

   public C0286 m2000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
      return this;
   }

   protected C0286 m4000() {
      return this;
   }

   C0286() {
   }

   @Override
   public C0031 m2000() {
      return this.N(Enum0047.f5000, List.of(), "", "", this.f1000, null);
   }
}
