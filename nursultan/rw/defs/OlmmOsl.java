package rw.defs;

import java.util.Optional;

public enum OlmmOsl {
   public Object[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   public static Object[] f7000;

   private OlmmOsl(float var3) {
      this.m52000();
      Float var8 = var3;
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static OlmmOsl[] m12000() {
      return (OlmmOsl[])((OlmmOsl[])f4000[2]).clone();
   }

   private static void m14000() {
      f6000 = new String[]{"THIN", "EXTRA_LIGHT", "LIGHT"};
      f5000 = new String[]{"REGULAR", "MEDIUM", "SEMI_BOLD", "BOLD", "EXTRA_BOLD", "BLACK"};
   }

   private static void m18000() {
      f2000 = new float[]{100.0F, 200.0F, 300.0F};
      f3000 = new float[]{400.0F, 500.0F, 600.0F, 700.0F, 800.0F, 900.0F, 0.0F};
   }

   private static void m38000() {
      f7000 = new Object[]{null, null, null, null, null, null, null, null};
      f4000 = new Object[]{null, null, null};
   }

   public static Optional<OlmmOsl> m44000(float var0) {
      for (OlmmOsl var4 : (OlmmOsl[])f4000[1]) {
         if ((Float)var4.f1000[0] == var0) {
            return Optional.of(var4);
         }
      }

      return Optional.empty();
   }

   public float m46000() {
      return (Float)this.f1000[0];
   }

   private void m52000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = f3000[6];
      }
   }
}
