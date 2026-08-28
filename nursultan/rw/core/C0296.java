package rw.core;

import java.util.List;
import rw.defs.Enum0047;
import rw.setting.C0031;

public final class C0296 extends Base0298<C0296> {
   private String f1000 = "";

   public C0296 m2000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
      return this;
   }

   protected C0296 m4000() {
      return this;
   }

   C0296() {
   }

   @Override
   public C0031 m2000() {
      return this.N(Enum0047.f4000, List.of(), this.f1000, "", "", null);
   }
}
