package rw.core;

import rw.api.Iface0220;

final class C0339 implements Iface0220 {
   private String f1000 = "";

   public void m2000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
   }

   C0339() {
   }

   C0339(String var1) {
      this.f1000 = var1 == null ? "" : var1;
   }

   public String m4000() {
      return this.f1000;
   }
}
