package rw.data;

import KDFzREm.NNNG;
import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;

public record Rec0247() {
   public NQo f1000;
   public NNNG f2000;
   public int f3000;

   public NQo m2000() {
      return this.f1000;
   }

   Rec0247(NNNG var1, NQo var2, int var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0247,"groupId;stack;remainingTicks",Rec0247::f2000,Rec0247::f1000,Rec0247::f3000>(this, var1);
   }

   public NNNG m6000() {
      return this.f2000;
   }

   public int m8000() {
      return this.f3000;
   }
}
