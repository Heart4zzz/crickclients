package rw.defs;

import java.util.Arrays;

public enum OlpiIqlss {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m2000() {
      f2000 = new Object[]{null, null, null};
   }

   private OlpiIqlss(String var3) {
      this.m22000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static OlpiIqlss[] m10000() {
      return (OlpiIqlss[])((OlpiIqlss[])f2000[2]).clone();
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public String m32000() {
      return (String)this.f1000[0];
   }

   public static OlpiIqlss m34000(String var0) {
      return Arrays.stream(m10000()).filter(var1 -> ((String)var1.f1000[0]).equals(var0)).findFirst().orElse((OlpiIqlss)f2000[1]);
   }

   private static void m40000() {
      f3000 = new String[]{"RU", "ru", "EN", "en"};
   }
}
