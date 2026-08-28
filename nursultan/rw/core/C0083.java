package rw.core;

public class C0083 {
   private static float[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;

   private static void m2000() {
      f4000 = new byte[]{2, 3};
   }

   private C0083() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[]{null, null, null};
   }

   private static void m10000() {
      f3000 = new boolean[]{false, true};
   }

   private static void m14000() {
      f1000 = new float[]{100.0F, 20.0F, 20.0F, 20.0F, 50.0F, 20.0F, 100.0F};
   }
}
