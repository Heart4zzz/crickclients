package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0018() {
   public boolean f1000;
   public float f2000;
   public float f3000;
   public float f4000;
   public float f5000;
   public float f6000;
   public boolean f7000;
   public float f8000;
   public float f9000;
   public float f10000;

   public float m2000() {
      return this.f8000;
   }

   public float m4000() {
      return this.f5000;
   }

   public Rec0018(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, boolean var9, boolean var10) {
      this.f2000 = var1;
      this.f5000 = var2;
      this.f9000 = var3;
      this.f10000 = var4;
      this.f6000 = var5;
      this.f4000 = var6;
      this.f8000 = var7;
      this.f3000 = var8;
      this.f1000 = var9;
      this.f7000 = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0018,"yawDelta;pitchDelta;minYawShare;minPitchShare;maxYawShare;maxPitchShare;yawJerkScale;pitchJerkScale;breakSmoothing;outputBurst",Rec0018::f2000,Rec0018::f5000,Rec0018::f9000,Rec0018::f10000,Rec0018::f6000,Rec0018::f4000,Rec0018::f8000,Rec0018::f3000,Rec0018::f1000,Rec0018::f7000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f6000;
   }

   public float m10000() {
      return this.f4000;
   }

   public float m12000() {
      return this.f10000;
   }

   public float m14000() {
      return this.f2000;
   }

   public boolean m16000() {
      return this.f1000;
   }

   public float m18000() {
      return this.f3000;
   }

   public boolean m20000() {
      return this.f7000;
   }

   public float m24000() {
      return this.f9000;
   }
}
