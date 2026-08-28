package rw.core;

public class C0831 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      f5000 = new boolean[]{false, true, false, false, true, false, true};
      f4000 = new boolean[]{false, true, false, false, true, false};
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[]{null, null, null, null, null, null};
   }

   private static void m10000() {
      f3000 = new byte[]{4, 4, 2};
      f1000 = new byte[]{4, 4, 3, 4, 4, 4, 5, 6};
   }
}
