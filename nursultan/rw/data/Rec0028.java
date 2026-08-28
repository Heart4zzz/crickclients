package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0028() {
   public float f1000;
   public float f2000;
   public float f3000;
   public boolean f4000;
   public boolean f5000;
   public float f6000;

   public boolean m2000() {
      return this.f5000;
   }

   public Rec0028(float var1, float var2, boolean var3, float var4, float var5, boolean var6) {
      this.f6000 = var1;
      this.f3000 = var2;
      this.f4000 = var3;
      this.f1000 = var4;
      this.f2000 = var5;
      this.f5000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0028,"yawSpeed;pitchSpeed;fastCorrection;yawOffset;pitchOffset;angularFlick",Rec0028::f6000,Rec0028::f3000,Rec0028::f4000,Rec0028::f1000,Rec0028::f2000,Rec0028::f5000>(
         this, var1
      );
   }

   public boolean m6000() {
      return this.f4000;
   }

   public float m8000() {
      return this.f6000;
   }

   public float m10000() {
      return this.f1000;
   }

   public float m12000() {
      return this.f3000;
   }

   public float m14000() {
      return this.f2000;
   }
}
