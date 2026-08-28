package rw.defs;

public enum Enum0014 {
   simple(0),
   event_based(1);

   private final int f3000;

   private Enum0014(int var3) {
      this.f3000 = var3;
   }

   public static Enum0014[] m2000() {
      return (Enum0014[])f4000.clone();
   }

   public static Enum0014 m6000(int var0) {
      return var0 == event_based.f3000 ? event_based : simple;
   }

   public int m8000() {
      return this.f3000;
   }
}
