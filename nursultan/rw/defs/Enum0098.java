package rw.defs;

import java.util.Map;

public enum Enum0098 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m6000() {
      f2000 = new Object[]{null, null, null, null, null, null, null};
   }

   private Enum0098(int var3) {
      this.m12000();
      Integer var8 = var3;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0098[] m10000() {
      return (Enum0098[])((Enum0098[])f2000[6]).clone();
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   private static void m14000() {
      f3000 = new String[]{"REQUEST_LIST", "REQUEST_CREATE", "REQUEST_DELETE", "REQUEST_ACTIVATE", "REQUEST_REFRESH"};
   }

   public static Enum0098 m34000(int var0) {
      return (Enum0098)((Map)f2000[5]).get(var0);
   }

   public int m36000() {
      return (Integer)this.f1000[0];
   }
}
