package rw.defs;

public enum Enum0015 {
   f1000,
   f2000;

   private final int f3000;

   private Enum0015(int var3) {
      this.f3000 = var3;
   }

   public static Enum0015[] m2000() {
      return (Enum0015[])f4000.clone();
   }

   public static Enum0015 m6000(int var0) {
      return var0 == f1000.f3000 ? f1000 : f2000;
   }

   public double m8000(double var1) {
      switch (this) {
         case f1000:
            return var1;
         case f2000:
            return Math.signum(var1);
         default:
            throw new AssertionError();
      }
   }

   public int m10000() {
      return this.f3000;
   }
}
