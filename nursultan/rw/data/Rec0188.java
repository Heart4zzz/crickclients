package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0983;

public record Rec0188() {
   public boolean f1000;
   public float f2000;
   public float f3000;
   public boolean f4000;
   public boolean f5000;
   public boolean f6000;
   public double f7000;
   public boolean f8000;
   public boolean f9000;
   public C0983 f10000;
   public boolean f11000;

   public float m2000() {
      return this.f2000;
   }

   public boolean m4000() {
      return this.f4000;
   }

   public Rec0188(
      C0983 var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, float var9, float var10, double var11
   ) {
      this.f10000 = var1;
      this.f11000 = var2;
      this.f9000 = var3;
      this.f8000 = var4;
      this.f5000 = var5;
      this.f4000 = var6;
      this.f1000 = var7;
      this.f6000 = var8;
      this.f3000 = var9;
      this.f2000 = var10;
      this.f7000 = var11;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0188,"rotation;currentHardRaycast;serverHardRaycast;urgentCatchup;holdPitch;detachedAim;overshootAim;pullbackFlick;yawError;pitchError;distance",Rec0188::f10000,Rec0188::f11000,Rec0188::f9000,Rec0188::f8000,Rec0188::f5000,Rec0188::f4000,Rec0188::f1000,Rec0188::f6000,Rec0188::f3000,Rec0188::f2000,Rec0188::f7000>(
         this, var1
      );
   }

   public boolean m8000() {
      return this.f6000;
   }

   public boolean m10000() {
      return this.f8000;
   }

   public boolean m12000() {
      return this.f9000;
   }

   public float m14000() {
      return this.f3000;
   }

   public boolean m16000() {
      return this.f11000;
   }

   public double m18000() {
      return this.f7000;
   }

   public C0983 m20000() {
      return this.f10000;
   }

   public boolean m22000() {
      return this.f5000;
   }

   public boolean m28000() {
      return this.f1000;
   }
}
