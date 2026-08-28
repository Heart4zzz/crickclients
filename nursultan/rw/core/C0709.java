package rw.core;

public class C0709 {
   public static Object[] f1000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{null};
   }

   public static C0709 m12000() {
      return (C0709)f1000[0];
   }
}
