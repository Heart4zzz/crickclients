package rw.defs;

public enum Enum0086 {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   public static Object[] f4000;

   private static void m10000() {
      f1000 = new Object[]{null, null, null, null, null, null, null};
      f4000 = new Object[]{null, null};
   }

   private Enum0086(Enum0055 var3) {
      this.m46000();
      this.f2000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0086[] m12000() {
      return (Enum0086[])((Enum0086[])f4000[1]).clone();
   }

   private static void m26000() {
      f3000 = new String[]{"COMBAT", "MOVEMENT", "VISUAL", "PLAYER", "MISC", "CONFIGS", "AUTO_BUY", "ACCOUNTS"};
   }

   public Enum0055 m38000() {
      return (Enum0055)this.f2000[0];
   }

   public static Enum0086 m42000(Enum0055 var0) {
      for (Enum0086 var4 : m12000()) {
         if ((Enum0055)var4.f2000[0] == var0) {
            return var4;
         }
      }

      return null;
   }

   private void m46000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }
}
