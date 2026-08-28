package rw.data;

import java.lang.runtime.ObjectMethods;

public record OlIirk() {
   public float f1000;
   public float f2000;
   public float f3000;
   public float f4000;
   public boolean f5000;

   public float m2000() {
      return this.f1000;
   }

   public OlIirk(float var1, float var2, float var3, float var4, boolean var5) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
      this.f5000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlIirk,"yawDelta;pitchDelta;yawSpeed;pitchSpeed;holdPitch",OlIirk::f4000,OlIirk::f3000,OlIirk::f1000,OlIirk::f2000,OlIirk::f5000>(
         this, var1
      );
   }

   public boolean m6000() {
      return this.f5000;
   }

   public float m8000() {
      return this.f3000;
   }

   public float m10000() {
      return this.f4000;
   }

   public float m12000() {
      return this.f2000;
   }
}
