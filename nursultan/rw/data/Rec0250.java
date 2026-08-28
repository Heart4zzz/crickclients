package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0250() {
   public float f1000;
   public float f2000;
   public float f3000;
   public float f4000;
   public float f5000;
   public float f6000;

   public float m2000() {
      return this.f1000;
   }

   public Rec0250(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.f5000 = var1;
      this.f3000 = var2;
      this.f6000 = var3;
      this.f4000 = var4;
      this.f1000 = var5;
      this.f2000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0250,"u0;v0;u1;v1;planeWidth;planeHeight",Rec0250::f5000,Rec0250::f3000,Rec0250::f6000,Rec0250::f4000,Rec0250::f1000,Rec0250::f2000>(
         this, var1
      );
   }

   public float m6000() {
      return this.f5000;
   }

   public float m8000() {
      return this.f2000;
   }

   public float m10000() {
      return this.f3000;
   }

   public float m12000() {
      return this.f4000;
   }

   public float m14000() {
      return this.f6000;
   }
}
