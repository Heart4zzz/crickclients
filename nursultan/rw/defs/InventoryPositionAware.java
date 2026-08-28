package rw.defs;

public enum InventoryPositionAware {
   f1000,
   f2000,
   f3000,
   f4000;

   private final int f5000;

   public boolean m2000() {
      return this == f3000 || this == f4000;
   }

   private InventoryPositionAware(int var3) {
      this.f5000 = var3;
   }

   public static InventoryPositionAware[] m4000() {
      return (InventoryPositionAware[])f6000.clone();
   }

   public boolean m8000() {
      return this == f2000 || this == f4000;
   }

   public static InventoryPositionAware m10000(int var0) {
      if (var0 == f1000.f5000) {
         return f1000;
      } else if (var0 == f2000.f5000) {
         return f2000;
      } else {
         return var0 == f3000.f5000 ? f3000 : f4000;
      }
   }

   public int m12000() {
      return this.f5000;
   }
}
