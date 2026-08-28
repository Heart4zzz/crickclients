package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0214;
import rw.api.Iface0217;

public record Rec0110() implements Iface0214 {
   private final Iface0217 f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final float f5000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0110(Iface0217 var1, float var2, float var3, float var4, float var5) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0110,"renderer;x;y;width;height",Rec0110::f1000,Rec0110::f2000,Rec0110::f3000,Rec0110::f4000,Rec0110::f5000>(
         this, var1
      );
   }

   public float m6000() {
      return this.f5000;
   }

   public float m8000() {
      return this.f4000;
   }

   public float m10000() {
      return this.f2000;
   }

   public Iface0217 m12000() {
      return this.f1000;
   }
}
