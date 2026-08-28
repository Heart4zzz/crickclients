package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0246() {
   public float f1000;
   public float f2000;
   public float f3000;
   public float f4000;
   public float f5000;
   public float f6000;
   public int f7000;
   public float f8000;
   public int f9000;
   public int f10000;
   public float f11000;
   public float f12000;

   public float m2000() {
      return this.f5000;
   }

   public float m4000() {
      return this.f11000;
   }

   Rec0246(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, float var12) {
      this.f3000 = var1;
      this.f2000 = var2;
      this.f4000 = var3;
      this.f6000 = var4;
      this.f11000 = var5;
      this.f12000 = var6;
      this.f8000 = var7;
      this.f5000 = var8;
      this.f9000 = var9;
      this.f7000 = var10;
      this.f10000 = var11;
      this.f1000 = var12;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0246,"x1;y1;x2;y2;u1;v1;u2;v2;atlasPage;atlasPageWidth;atlasPageHeight;pxRange",Rec0246::f3000,Rec0246::f2000,Rec0246::f4000,Rec0246::f6000,Rec0246::f11000,Rec0246::f12000,Rec0246::f8000,Rec0246::f5000,Rec0246::f9000,Rec0246::f7000,Rec0246::f10000,Rec0246::f1000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f7000;
   }

   public float m10000() {
      return this.f3000;
   }

   public float m12000() {
      return this.f8000;
   }

   public float m14000() {
      return this.f2000;
   }

   public int m16000() {
      return this.f10000;
   }

   public float m18000() {
      return this.f12000;
   }

   public float m20000() {
      return this.f1000;
   }

   public float m22000() {
      return this.f6000;
   }

   public float m24000() {
      return this.f4000;
   }

   public int m26000() {
      return this.f9000;
   }
}
