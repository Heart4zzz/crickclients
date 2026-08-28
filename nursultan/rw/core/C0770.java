package rw.core;

import java.util.regex.Pattern;

public class C0770 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{" ", "This is a utility class and cannot be instantiated", "(?<=[A-Z])(?=[A-Z][a-z])|(?<=[a-z])(?=[A-Z])"};
   }

   private C0770() {
      throw new UnsupportedOperationException(f1000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f2000 = new Object[]{null};
   }

   public static String m24000(String var0) {
      return ((Pattern)f2000[0]).matcher(var0).replaceAll(f1000[0]);
   }
}
