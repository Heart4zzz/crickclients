package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0103() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;

   public float m2000() {
      return this.f2000;
   }

   public Rec0103(float var1, float var2, float var3, float var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0103,"minX;minY;maxX;maxY",Rec0103::f1000,Rec0103::f2000,Rec0103::f3000,Rec0103::f4000>(this, var1);
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

   public boolean m12000(Rec0103 var1) {
      return this.f3000 > var1.f1000 && this.f1000 < var1.f3000 && this.f4000 > var1.f2000 && this.f2000 < var1.f4000;
   }

   public boolean m14000() {
      return this.f3000 > this.f1000 && this.f4000 > this.f2000;
   }

   public boolean m16000(float var1, float var2) {
      return var1 >= this.f1000 && var1 <= this.f3000 && var2 >= this.f2000 && var2 <= this.f4000;
   }
}
