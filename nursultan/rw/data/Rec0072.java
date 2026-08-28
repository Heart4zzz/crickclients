package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0190;
import rw.core.C0269;

record Rec0072() implements Iface0190 {
   private final C0269 f1000;
   private final C0269 f2000;
   private final int f3000;
   private final int f4000;
   private final int[] f5000;
   private final int[] f6000;
   private final int[] f7000;
   private final int[] f8000;
   private final int[] f9000;
   private final int f10000;

   public int m2000() {
      return this.f3000;
   }

   public int[] m4000() {
      return this.f7000;
   }

   Rec0072(C0269 var1, C0269 var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int var10) {
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

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0072,"newPage;oldPage;width;height;cp;x;y;w;h;count",Rec0072::f1000,Rec0072::f2000,Rec0072::f3000,Rec0072::f4000,Rec0072::f5000,Rec0072::f6000,Rec0072::f7000,Rec0072::f8000,Rec0072::f9000,Rec0072::f10000>(
         this, var1
      );
   }

   public int[] m8000() {
      return this.f8000;
   }

   public int[] m10000() {
      return this.f9000;
   }

   public int[] m12000() {
      return this.f5000;
   }

   public int m14000() {
      return this.f10000;
   }

   public int m16000() {
      return this.f4000;
   }

   public C0269 m18000() {
      return this.f2000;
   }

   public C0269 m20000() {
      return this.f1000;
   }

   public int[] m22000() {
      return this.f6000;
   }
}
