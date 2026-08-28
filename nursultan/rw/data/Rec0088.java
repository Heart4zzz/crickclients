package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0088() {
   private final byte[] f1000;
   private final int f2000;
   private final int f3000;
   private final int f4000;
   private final double f5000;
   private final double f6000;
   private final double f7000;
   private final double f8000;
   private final double f9000;

   public int m2000() {
      return this.f2000;
   }

   public double m4000() {
      return this.f6000;
   }

   public Rec0088(byte[] var1, int var2, int var3, int var4, double var5, double var7, double var9, double var11, double var13) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var7;
      this.f7000 = var9;
      this.f8000 = var11;
      this.f9000 = var13;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0088,"pixels;width;height;channels;planeL;planeB;planeR;planeT;advance",Rec0088::f1000,Rec0088::f2000,Rec0088::f3000,Rec0088::f4000,Rec0088::f5000,Rec0088::f6000,Rec0088::f7000,Rec0088::f8000,Rec0088::f9000>(
         this, var1
      );
   }

   public double m8000() {
      return this.f7000;
   }

   public double m10000() {
      return this.f8000;
   }

   public int m12000() {
      return this.f4000;
   }

   public double m14000() {
      return this.f9000;
   }

   public int m16000() {
      return this.f3000;
   }

   public byte[] m18000() {
      return this.f1000;
   }

   public boolean m20000() {
      return this.f2000 == 0 || this.f3000 == 0;
   }

   public double m22000() {
      return this.f5000;
   }
}
