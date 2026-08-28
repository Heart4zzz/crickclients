package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0130() {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final int f5000;
   private final int f6000;
   private final int f7000;
   private final int f8000;
   private final int f9000;
   private final int f10000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0130 m4000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, var1, this.f8000, this.f9000, this.f10000);
   }

   public Rec0130 m6000(float var1) {
      return new Rec0130(this.f1000, this.f2000, var1, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public int m8000() {
      return this.f7000;
   }

   public Rec0130(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      var1 = Math.max(0.0F, var1);
      var2 = Math.max(0.0F, var2);
      var3 = Math.max(0.0F, var3);
      var4 = Math.max(0.0F, var4);
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
   }

   public Rec0130(float var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this(var1, var2, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0130,"trackWidth;trackPadding;trackPaddingY;thumbMinHeight;trackColor;trackHoverColor;trackActiveColor;thumbColor;thumbHoverColor;thumbActiveColor",Rec0130::f1000,Rec0130::f2000,Rec0130::f3000,Rec0130::f4000,Rec0130::f5000,Rec0130::f6000,Rec0130::f7000,Rec0130::f8000,Rec0130::f9000,Rec0130::f10000>(
         this, var1
      );
   }

   public int m12000() {
      return this.f8000;
   }

   public int m14000() {
      return this.f9000;
   }

   public Rec0130 m16000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, var1, this.f10000);
   }

   public int m18000() {
      return this.f5000;
   }

   public int m20000() {
      return this.f10000;
   }

   public float m22000() {
      return this.f4000;
   }

   public Rec0130 m24000(float var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, var1, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public Rec0130 m26000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000, var1, this.f9000, this.f10000);
   }

   public boolean m28000(Rec0130 var1) {
      return var1 == null
         ? false
         : Float.compare(this.f2000, var1.f2000) == 0
            && Float.compare(this.f3000, var1.f3000) == 0
            && Float.compare(this.f4000, var1.f4000) == 0
            && this.f5000 == var1.f5000
            && this.f6000 == var1.f6000
            && this.f7000 == var1.f7000
            && this.f8000 == var1.f8000
            && this.f9000 == var1.f9000
            && this.f10000 == var1.f10000;
   }

   public Rec0130 m30000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, var1, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public Rec0130 m32000(float var1) {
      return new Rec0130(this.f1000, var1, var1, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public float m34000() {
      return this.f2000;
   }

   public boolean m36000(Rec0130 var1) {
      return var1 == null ? false : Float.compare(this.f1000, var1.f1000) == 0;
   }

   public Rec0130 m38000(float var1) {
      return new Rec0130(var1, this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public float m40000() {
      return this.f1000;
   }

   public Rec0130 m42000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, var1, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000);
   }

   public Rec0130 m44000(int var1) {
      return new Rec0130(this.f1000, this.f2000, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, var1);
   }

   public int m46000() {
      return this.f6000;
   }
}
