package rw.data;

import java.lang.runtime.ObjectMethods;

public record PotionData2() {
   private static boolean[] f1000;
   public boolean f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   public String f5000;

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   private PotionData2(boolean var1, String var2) {
      this.f2000 = var1;
      this.f5000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",PotionData2,"passed;failedCheck",PotionData2::f2000,PotionData2::f5000>(this, var1);
   }

   private static void m8000() {
      f4000 = new Object[f3000[1]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
   }

   public boolean m12000() {
      return this.f2000;
   }

   public static PotionData2 m16000(String var0) {
      return new PotionData2(f1000[0], var0);
   }

   public String m18000() {
      return this.f5000;
   }
}
