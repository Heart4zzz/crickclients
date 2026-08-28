package rw.defs;

public enum Enum0012 {
   f1000,
   f2000,
   f3000,
   f4000;

   private final int f5000;
   private final int f6000;

   private Enum0012(int var3, int var4) {
      this.f5000 = var3;
      this.f6000 = var4;
   }

   public static Enum0012[] m4000() {
      return (Enum0012[])f7000.clone();
   }

   public int m6000() {
      return this.f6000;
   }

   public int m8000() {
      return this.f5000;
   }
}
