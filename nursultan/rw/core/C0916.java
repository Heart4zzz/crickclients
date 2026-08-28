package rw.core;

public class C0916 {
   public static Object[] f1000;

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   public static C0916 m14000() {
      return (C0916)f1000[0];
   }
}
