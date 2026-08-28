package rw.core;

import rw.data.Rec0312;

public class C1244 {
   private static String[] f1000;

   private C1244() {
      throw new UnsupportedOperationException(f1000[1]);
   }

   static {
      ntfClinit();
   }

   private static String m6000(String var0) {
      return var0.toLowerCase();
   }

   public static Rec0312 m10000(String var0) {
      return new Rec0312("entry." + var0);
   }

   private static void m14000() {
      f1000 = new String[]{"module.%s.description", "This is a utility class and cannot be instantiated"};
   }

   public static String m18000(String var0) {
      return f1000[0].formatted(m6000(var0));
   }
}
