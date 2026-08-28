package rw.defs;

public enum Enum0047 {
   f1000,
   f2000,
   f3000,
   f4000,
   f5000;

   private final String f6000;

   private Enum0047(String var3) {
      this.f6000 = var3;
   }

   public static Enum0047[] m2000() {
      return (Enum0047[])f7000.clone();
   }

   public String m6000() {
      return this.f6000;
   }
}
