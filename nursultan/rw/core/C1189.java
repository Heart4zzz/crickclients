package rw.core;

import java.util.Queue;

public class C1189 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f2000 = new Object[]{null};
   }

   private C1189() {
      throw new UnsupportedOperationException(oolksk0Ol<"aqqtq",-1060646902,36934963,36934962,36934961,1276358074,-629086859,391030975>()[0]);
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static void m18000() {
      Runnable var0;
      while ((var0 = (Runnable)((Queue)f2000[0]).poll()) != null) {
         var0.run();
      }
   }

   public static void m22000(Runnable var0) {
      ((Queue)f2000[0]).add(var0);
   }
}
