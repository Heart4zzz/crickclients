package rw.data;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.Ned;
import java.lang.runtime.ObjectMethods;

public record Rec0176() {
   public boolean f1000;
   public Ned f2000;
   public NCU f3000;
   public NCa f4000;

   public Ned m2000() {
      return this.f2000;
   }

   Rec0176(NCa var1, NCU var2, Ned var3, boolean var4) {
      this.f4000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0176,"state;shape;pos;open",Rec0176::f4000,Rec0176::f3000,Rec0176::f2000,Rec0176::f1000>(this, var1);
   }

   public boolean m6000() {
      return this.f1000;
   }

   public NCa m8000() {
      return this.f4000;
   }

   public NCU m10000() {
      return this.f3000;
   }
}
