package rw.defs;

import java.util.Map;

public enum Enum0083 {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f2000 = new String[]{"CREATED", "ALREADY_ACTIVATED", "OWN_LINK", "UPDATED"};
   }

   private Enum0083(int var3) {
      this.m14000();
      Integer var8 = var3;
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0083[] m10000() {
      return (Enum0083[])((Enum0083[])f1000[5]).clone();
   }

   private static void m12000() {
      f1000 = new Object[]{null, null, null, null, null, null};
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
         var1[0] = 0;
      }
   }

   public int m30000() {
      return (Integer)this.f3000[0];
   }

   public static Enum0083 m34000(int var0) {
      return (Enum0083)((Map)f1000[4]).get(var0);
   }
}
