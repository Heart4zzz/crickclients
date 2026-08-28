package rw.defs;

public enum Enum0077 {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   public static Enum0077[] m6000() {
      return (Enum0077[])((Enum0077[])f2000[2]).clone();
   }

   private static void m16000() {
      f2000 = new Object[]{null, null, null};
   }

   private static void m28000() {
      f1000 = new String[]{"REGULAR", "MTSDF"};
   }
}
