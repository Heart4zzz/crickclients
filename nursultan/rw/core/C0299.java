package rw.core;

import java.util.List;
import rw.api.Iface0217;
import rw.defs.Enum0047;
import rw.setting.C0031;

public final class C0299 extends Base0298<C0299> {
   private Iface0217 f1000;

   protected C0299 m2000() {
      return this;
   }

   C0299() {
   }

   @Override
   public C0031 m2000() {
      return this.N(Enum0047.f2000, List.of(), "", "", "", this.f1000);
   }

   public C0299 m4000(Iface0217 var1) {
      return this.m6000(var1);
   }

   public C0299 m6000(Iface0217 var1) {
      this.f1000 = var1;
      return this;
   }
}
