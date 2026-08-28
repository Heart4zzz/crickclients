package rw.defs;

import java.util.Map;

public enum Enum0006 {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private Enum0006(int var3) {
      this.m26000();
      Integer var8 = var3;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0006[] m10000() {
      return (Enum0006[])((Enum0006[])f3000[5]).clone();
   }

   private static void m12000() {
      f3000 = new Object[]{null, null, null, null, null, null};
   }

   private static void m16000() {
      f2000 = new String[]{"LIST_RESPONSE", "BLOB", "ACK", "NACK"};
   }

   private void m26000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public static Enum0006 m32000(int var0) {
      return (Enum0006)((Map)f3000[4]).get(var0);
   }

   public int m34000() {
      return (Integer)this.f1000[0];
   }
}
