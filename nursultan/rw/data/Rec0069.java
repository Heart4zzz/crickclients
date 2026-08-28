package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0069() {
   private final int f1000;
   private final int f2000;

   Rec0069(int var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0069,"width;height",Rec0069::f1000,Rec0069::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f1000;
   }
}
