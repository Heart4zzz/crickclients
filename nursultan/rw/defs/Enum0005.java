package rw.defs;

import java.util.Map;

public enum Enum0005 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m8000() {
      f2000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private Enum0005(int var3) {
      this.m14000();
      Integer var8 = var3;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0005[] m10000() {
      return (Enum0005[])((Enum0005[])f2000[7]).clone();
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public int m32000() {
      return (Integer)this.f1000[0];
   }

   public static Enum0005 m34000(int var0) {
      return (Enum0005)((Map)f2000[6]).get(var0);
   }

   private static void m42000() {
      f3000 = new String[]{"LIST_RESPONSE", "CREATE_RESPONSE", "DELETE_RESPONSE", "NACK", "ACTIVATE_RESPONSE", "REFRESH_RESPONSE"};
   }
}
