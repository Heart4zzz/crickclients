package rw.core;

public class C0708 {
   public static Object[] f1000;

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   public static C0708 m14000() {
      return (C0708)f1000[0];
   }
}
