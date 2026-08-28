package rw.core;

public class OltlIpjm {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated", "ms", "b", "t", "s", "°", "%"};
   }

   private OltlIpjm() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f2000 = new Object[]{null, null, null, null, null, null};
   }
}
