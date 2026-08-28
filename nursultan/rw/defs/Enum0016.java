package rw.defs;

public enum Enum0016 {
   left(0),
   right(1);

   private final int f3000;

   private Enum0016(int var3) {
      this.f3000 = var3;
   }

   public static Enum0016[] m2000() {
      return (Enum0016[])f4000.clone();
   }

   public static Enum0016 m6000(int var0) {
      return switch (var0) {
         case 0 -> left;
         case 1 -> right;
         default -> null;
      };
   }

   public int m8000() {
      return this.f3000;
   }
}
