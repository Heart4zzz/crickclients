package rw.core;

public class C0259 {
   public static float m2000(float var0, float var1) {
      if (!Float.isFinite(var0)) {
         return var0;
      } else {
         return Float.isFinite(var1) && !(var1 <= 0.0F) ? Math.round(var0 * var1) / var1 : var0;
      }
   }

   public static float m4000(float var0) {
      return m8000(var0, 0.0F, 1.0F);
   }

   public static int m6000(int var0, int var1, int var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static float m8000(float var0, float var1, float var2) {
      return Math.min(Math.max(var0, var1), var2);
   }
}
