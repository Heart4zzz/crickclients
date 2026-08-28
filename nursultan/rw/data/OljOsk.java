package rw.data;

import java.lang.runtime.ObjectMethods;

public record OljOsk() {
   public float f1000;
   public int f2000;
   public float f3000;
   public float f4000;
   public float f5000;
   public float f6000;
   public float f7000;
   public float f8000;
   public float f9000;
   public float f10000;

   public float m2000() {
      return this.f4000;
   }

   public int m4000() {
      return this.f2000;
   }

   public OljOsk(int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.f2000 = var1;
      this.f4000 = var2;
      this.f7000 = var3;
      this.f8000 = var4;
      this.f9000 = var5;
      this.f6000 = var6;
      this.f1000 = var7;
      this.f3000 = var8;
      this.f5000 = var9;
      this.f10000 = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OljOsk,"glTextureId;u0;v0;u1;v1;minX;maxX;minY;maxY;advance",OljOsk::f2000,OljOsk::f4000,OljOsk::f7000,OljOsk::f8000,OljOsk::f9000,OljOsk::f6000,OljOsk::f1000,OljOsk::f3000,OljOsk::f5000,OljOsk::f10000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f10000;
   }

   public float m10000() {
      return this.f5000;
   }

   public float m12000() {
      return this.f9000;
   }

   public float m14000() {
      return this.f7000;
   }

   public float m16000() {
      return this.f3000;
   }

   public float m18000() {
      return this.f6000;
   }

   public float m20000() {
      return this.f8000;
   }

   public float m22000() {
      return this.f1000;
   }
}
