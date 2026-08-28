package rw.core;

public final class C0368 {
   private final String f1000;

   private C0368(String var1) {
      this.f1000 = m2000(var1);
   }

   @Override
   public String toString() {
      return this.f1000.isEmpty() ? "StyleSlot@" + Integer.toHexString(System.identityHashCode(this)) : "StyleSlot[" + this.f1000 + "]";
   }

   private static String m2000(String var0) {
      return var0 != null && !var0.isBlank() ? var0.trim() : "";
   }

   public String m4000() {
      return this.f1000;
   }

   public static C0368 m6000(String var0) {
      return new C0368(var0);
   }

   public static C0368 m8000() {
      return new C0368(null);
   }
}
