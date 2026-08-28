package rw.defs;

public enum Enum0018 {
   f1000,
   f2000,
   f3000;

   private final int f4000;
   private final int f5000;
   private final boolean f6000;

   public boolean m2000() {
      return this.f6000;
   }

   private Enum0018(int var3, int var4, boolean var5) {
      this.f4000 = var3;
      this.f5000 = var4;
      this.f6000 = var5;
   }

   public static Enum0018[] m4000() {
      return (Enum0018[])f7000.clone();
   }

   public int m8000() {
      return this.f5000;
   }

   public int m10000() {
      return this.f4000;
   }
}
