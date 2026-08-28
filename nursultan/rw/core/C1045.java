package rw.core;

public class C1045 {
   private static String[] f1000;
   private static boolean[] f2000;

   private C1045() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new String[3];
      f1000[(0 | -0) >>> 31] = "-";
      f1000[(1 | -1) >>> 31] = ".";
      f1000[2] = "-.";
   }

   public static String m12000(float var0) {
      return Math.floor(var0) == var0 ? String.valueOf((int)var0) : String.valueOf(var0);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
   }

   public static String m16000(float var0, String var1) {
      return m12000(var0) + var1;
   }

   public static boolean m18000(String var0) {
      return !var0.isEmpty() && !var0.equals(f1000[0]) && !var0.equals(f1000[1]) && !var0.equals(f1000[2]) ? f2000[1] : f2000[0];
   }

   public static String m22000(String var0, String var1) {
      String var2 = var0.trim();
      return !var1.isBlank() && var2.endsWith(var1) ? var2.substring(f2000[2], var2.length() - var1.length()).trim() : var2;
   }
}
