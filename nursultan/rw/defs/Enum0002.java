package rw.defs;

public enum Enum0002 {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private static void m8000() {
      f3000 = new Object[]{null, null, null, null};
   }

   private Enum0002(String var3) {
      this.m28000();
      this.f2000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0002[] m10000() {
      return (Enum0002[])((Enum0002[])f3000[3]).clone();
   }

   private static void m20000() {
      f1000 = new String[]{"OFFLINE_GENERATED", "account.type.offline-generated", "OFFLINE", "account.type.offline", "MICROSOFT", "account.type.microsoft"};
   }

   private void m28000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public String m34000() {
      return (String)this.f2000[0];
   }
}
