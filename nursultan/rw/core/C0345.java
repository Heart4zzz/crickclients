package rw.core;

import rw.api.Iface0220;

final class C0345 implements Iface0220 {
   private String f1000 = "";

   C0345() {
   }

   C0345(String var1) {
      this.f1000 = var1 == null ? "" : var1;
   }

   @Override
   public String m2000() {
      return this.f1000;
   }

   @Override
   public void m4000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
   }
}
