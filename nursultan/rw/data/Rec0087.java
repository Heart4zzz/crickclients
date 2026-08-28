package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import rw.core.C0275;

record Rec0087() {
   private final int f1000;
   private final int f2000;
   private final int f3000;
   private final int f4000;
   private final int f5000;
   private final int f6000;
   private final ArrayList<C0275> f7000;

   public int m2000() {
      return this.f3000;
   }

   public ArrayList<C0275> m4000() {
      return this.f7000;
   }

   Rec0087(int var1, int var2, int var3, int var4, int var5, int var6, ArrayList<C0275> var7) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0087,"contentBottom;layoutBottom;currentHeight;appendX;appendY;appendRowHeight;freeRects",Rec0087::f1000,Rec0087::f2000,Rec0087::f3000,Rec0087::f4000,Rec0087::f5000,Rec0087::f6000,Rec0087::f7000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f5000;
   }

   public int m10000() {
      return this.f4000;
   }

   public int m12000() {
      return this.f2000;
   }

   public int m14000() {
      return this.f1000;
   }

   public int m16000() {
      return this.f6000;
   }
}
