package rw.defs;

public enum Enum0030 {
   f1000,
   f2000;

   private final int f3000;

   private Enum0030(int var3) {
      this.f3000 = var3;
   }

   public static Enum0030[] m2000() {
      return (Enum0030[])f4000.clone();
   }

   public int m6000() {
      return this.f3000;
   }
}
