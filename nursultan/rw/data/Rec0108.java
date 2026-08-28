package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0108() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;

   public float m2000() {
      return this.f2000;
   }

   Rec0108(float var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0108,"minX;minY;maxX;maxY",Rec0108::f1000,Rec0108::f2000,Rec0108::f3000,Rec0108::f4000>(this, var1);
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

   boolean m12000() {
      return this.f3000 > this.f1000 && this.f4000 > this.f2000;
   }
}
