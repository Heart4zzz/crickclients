package rw.core;

public class C0020 {
   private static boolean[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   public static Object[] f6000;
   private static boolean[] f7000;

   private static void m2000() {
      f2000 = new boolean[]{true, true};
      f4000 = new boolean[]{true, false, false, true, false};
      f5000 = new boolean[]{false, true, false, false};
      f7000 = new boolean[]{false, false};
      f1000 = new boolean[]{false, false, false, false, false, true, false};
   }

   private C0020() {
   }

   static {
      ntfClinit();
   }

   private static int m6000(int var0) {
      int var1 = (Integer)f3000[0];
      Integer var6 = (Integer)f3000[0] + var0;
      f3000[0] = var6;
      return var1;
   }

   private static void m16000() {
      f3000 = new Object[]{26, 0, 4, 8, 12, 16, 20, 24};
      f6000 = new Object[]{25, 26};
   }
}
