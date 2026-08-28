package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0190;

record Rec0084() implements Iface0190 {
   private final int f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final float f5000;
   private final float f6000;
   private final int f7000;
   private final int f8000;
   private final int f9000;
   private final int f10000;
   private final int f11000;

   public float m2000() {
      return this.f3000;
   }

   public int m4000() {
      return this.f7000;
   }

   Rec0084(int var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
      this.f8000 = var8;
      this.f9000 = var9;
      this.f10000 = var10;
      this.f11000 = var11;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0084,"cp;planeL;planeB;planeR;planeT;advance;x;y;w;h;page",Rec0084::f1000,Rec0084::f2000,Rec0084::f3000,Rec0084::f4000,Rec0084::f5000,Rec0084::f6000,Rec0084::f7000,Rec0084::f8000,Rec0084::f9000,Rec0084::f10000,Rec0084::f11000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f8000;
   }

   public int m10000() {
      return this.f9000;
   }

   public float m12000() {
      return this.f5000;
   }

   public int m14000() {
      return this.f11000;
   }

   public int m16000() {
      return this.f10000;
   }

   public float m18000() {
      return this.f4000;
   }

   public float m20000() {
      return this.f2000;
   }

   public int m22000() {
      return this.f1000;
   }

   public float m24000() {
      return this.f6000;
   }
}
