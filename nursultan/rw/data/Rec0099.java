package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0099() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;

   public float m2000() {
      return this.f1000 + this.f3000 * 0.5F;
   }

   public float m4000() {
      return this.f3000;
   }

   public Rec0099(float var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0099,"x;y;width;height",Rec0099::f1000,Rec0099::f2000,Rec0099::f3000,Rec0099::f4000>(this, var1);
   }

   public float m8000() {
      return this.f4000;
   }

   public float m10000() {
      return this.f1000;
   }

   public float m12000() {
      return this.f2000 + this.f4000 * 0.5F;
   }

   public float m14000() {
      return this.f2000 + this.f4000;
   }

   public float m16000() {
      return this.f1000 + this.f3000;
   }

   public float m18000() {
      return this.f2000;
   }
}
