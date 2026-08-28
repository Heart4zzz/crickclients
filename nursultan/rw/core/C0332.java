package rw.core;

import rw.api.Iface0220;

final class C0332 implements Iface0220 {
   private String f1000 = "";
   private String f2000 = "";

   @Override
   public String m2000() {
      return this.f2000;
   }

   C0332() {
   }

   C0332(String var1, String var2) {
      this.f1000 = var1 == null ? "" : var1;
      this.f2000 = var2 == null ? "" : var2;
   }

   @Override
   public void m4000(String var1) {
      this.f2000 = var1 == null ? "" : var1;
   }

   public String m6000() {
      return this.f1000;
   }

   public void m8000(String var1) {
      this.f1000 = var1 == null ? "" : var1;
   }
}
