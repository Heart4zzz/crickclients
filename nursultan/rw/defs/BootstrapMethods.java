package rw.defs;

import java.util.Arrays;

public enum BootstrapMethods {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m8000() {
      f2000 = new String[]{"TOGGLE", "toggle", "HOLD", "hold"};
   }

   private BootstrapMethods(String var3) {
      this.m40000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static BootstrapMethods[] m10000() {
      return (BootstrapMethods[])((BootstrapMethods[])f3000[2]).clone();
   }

   private static void m12000() {
      f3000 = new Object[]{null, null, null};
   }

   public static BootstrapMethods m34000(String var0) {
      return Arrays.stream(m10000()).filter(var1 -> ((String)var1.f1000[0]).equalsIgnoreCase(var0)).findFirst().orElse(null);
   }

   public String m38000() {
      return (String)this.f1000[0];
   }

   private void m40000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}
