package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0119() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;

   public float m2000() {
      return this.f2000;
   }

   public Rec0119(float var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0119,"x;y;width;height",Rec0119::f1000,Rec0119::f2000,Rec0119::f3000,Rec0119::f4000>(this, var1);
   }

   public float m6000() {
      return this.f4000;
   }

   public float m8000() {
      return this.f3000;
   }

   public float m10000() {
      return this.f1000;
   }

   public boolean m12000() {
      return this.f3000 <= 0.0F || this.f4000 <= 0.0F;
   }
}
