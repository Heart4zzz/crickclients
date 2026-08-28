package rw.core;

import java.util.List;
import rw.defs.Enum0047;
import rw.setting.C0031;

public final class C0300 extends Base0298<C0300> {
   private String f1000 = "";
   private String f2000 = "";

   public C0300 m2000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
      return this;
   }

   protected C0300 m4000() {
      return this;
   }

   C0300() {
   }

   @Override
   public C0031 m2000() {
      return this.N(Enum0047.f3000, List.of(), this.f1000, this.f2000, "", null);
   }

   public C0300 m6000(String var1) {
      this.f2000 = var1 == null ? "" : var1;
      return this;
   }

   public C0300 m8000(String var1) {
      return this.m2000(var1);
   }
}
