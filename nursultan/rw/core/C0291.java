package rw.core;

public final class C0291 {
   private static final float f1000 = 0.25F;
   private static final float f2000 = 8.0F;
   private float f3000 = 1.0F;
   private int f4000;

   public int m2000() {
      return this.f4000;
   }

   public float m4000() {
      return this.f3000;
   }

   public void m6000(float var1) {
      float var2 = C0259.m8000(var1, 0.25F, 8.0F);
      if (Float.floatToIntBits(this.f3000) != Float.floatToIntBits(var2)) {
         this.f3000 = var2;
         this.f4000++;
      }
   }
}
