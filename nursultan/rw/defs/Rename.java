package rw.defs;

import java.util.Map;

public enum Rename {
   public static Object[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static String[] f4000;

   private void m6000() {
      if (IIqntIk<"skumxp",-2117079293,561654266,561654267,561654264,-2117079293,-2117079293,-2117079293>(this) == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = 0;
      }
   }

   private Rename(int var3) {
      this.m6000();
      Integer var8 = var3;
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Rename[] m12000() {
      return (Rename[])((Rename[])f1000[1]).clone();
   }

   private static void m16000() {
      f4000 = new String[]{"LIST_RESPONSE", "CREATE_RESPONSE", "UPDATE_RESPONSE", "GET_RESPONSE", "DELETE_RESPONSE", "RENAME_RESPONSE", "NACK"};
   }

   private static void m26000() {
      f3000 = new Object[]{null, null, null, null, null, null, null};
      f1000 = new Object[]{null, null};
   }

   public static Rename m36000(int var0) {
      return (Rename)((Map)f1000[0]).get(var0);
   }

   public int m38000() {
      return (Integer)this.f2000[0];
   }
}
