package rw.defs;

public enum Enum0013 {
   f1000,
   f2000;

   private final int f3000;

   private Enum0013(int var3) {
      this.f3000 = var3;
   }

   public static Enum0013[] m2000() {
      return (Enum0013[])f4000.clone();
   }

   public static Enum0013 m6000(int var0) {
      return var0 == f1000.f3000 ? f1000 : f2000;
   }

   public int m8000() {
      return this.f3000;
   }
}
