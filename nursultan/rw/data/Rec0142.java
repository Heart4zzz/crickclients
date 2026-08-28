package rw.data;

import KDFzREm.NYD;
import java.lang.runtime.ObjectMethods;

record Rec0142() {
   private final NYD f1000;
   private final int f2000;
   private final int f3000;

   public int m2000() {
      return this.f3000;
   }

   Rec0142(NYD var1, int var2, int var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0142,"row;column;page",Rec0142::f1000,Rec0142::f2000,Rec0142::f3000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public NYD m8000() {
      return this.f1000;
   }
}
