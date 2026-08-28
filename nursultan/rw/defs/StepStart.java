package rw.defs;

import rw.core.C0259;

public enum StepStart {
   f1000,
   f2000,
   f3000,
   f4000,
   f5000,
   f6000,
   f7000,
   f8000;

   public static StepStart[] m2000() {
      return (StepStart[])f9000.clone();
   }

   public float m6000(float var1) {
      float var2 = C0259.m4000(var1);

      return switch (this) {
         case f1000 -> var2;
         case f2000 -> var2 * var2 * (3.0F - 2.0F * var2);
         case f3000 -> var2 * var2;
         case f4000 -> 1.0F - (1.0F - var2) * (1.0F - var2);
         case f5000 -> var2 < 0.5F ? 2.0F * var2 * var2 : 1.0F - 2.0F * (1.0F - var2) * (1.0F - var2);
         case f6000 -> {
            float var3 = 1.0F - var2;
            yield 1.0F - var3 * var3 * var3 * var3 * var3;
         }
         case f7000 -> var2 <= 0.0F ? 0.0F : 1.0F;
         case f8000 -> var2 < 1.0F ? 0.0F : 1.0F;
      };
   }
}
