package rw.data;

import KDFzREm.Ned;
import java.lang.runtime.ObjectMethods;

public record Rec0195() {
   public int f1000;
   public Ned f2000;

   Rec0195(Ned var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0195,"blockPos;color",Rec0195::f2000,Rec0195::f1000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public Ned m6000() {
      return this.f2000;
   }
}
