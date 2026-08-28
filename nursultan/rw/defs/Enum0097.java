package rw.defs;

import java.util.Map;

public enum Enum0097 {
   private static String[] f1000;
   public static Object[] f2000;
   public Object[] f3000;

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
         var1[0] = 0;
      }
   }

   private Enum0097(int var3) {
      this.m8000();
      Integer var8 = var3;
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0097[] m10000() {
      return (Enum0097[])((Enum0097[])f2000[4]).clone();
   }

   private static void m12000() {
      f2000 = new Object[]{null, null, null, null, null};
   }

   private static void m14000() {
      f1000 = new String[]{"REQUEST_LIST", "REQUEST_PULL", "REQUEST_PUSH"};
   }

   public int m30000() {
      return (Integer)this.f3000[0];
   }

   public static Enum0097 m32000(int var0) {
      return (Enum0097)((Map)f2000[3]).get(var0);
   }
}
