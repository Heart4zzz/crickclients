package rw.core;

public class C0011 {
   private static byte[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;
   private static byte[] f8000;
   private static byte[] f9000;
   private static byte[] f10000;

   private static void m2000() {
      f10000 = new byte[]{2, 3, 5};
      f1000 = new byte[]{3, 3, 2, 3};
      f3000 = new byte[]{4, 3, 3};
      f8000 = new byte[]{2, 2, 2, 3, 3, 2, 3, 5};
      f9000 = new byte[]{4, 4, 2, 3, 4};
      f7000 = new byte[]{4, 11, 4, 2, 2, 3, 4, 4};
      f2000 = new byte[]{4, 5, 6, 7, 2, 8, 9, 4};
      f4000 = new byte[]{10, 4, 5, 5, 4, 4, 2};
      f6000 = new byte[]{3, 2, 4, 6, 7};
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f5000 = new Object[]{null, null, null, null, null, null, null};
   }
}
