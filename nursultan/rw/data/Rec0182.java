package rw.data;

import KDFzREm.NKi;
import java.lang.runtime.ObjectMethods;

public record Rec0182() {
   public int f1000;
   public NKi f2000;

   public Rec0182(NKi var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0182,"block;color",Rec0182::f2000,Rec0182::f1000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public NKi m6000() {
      return this.f2000;
   }
}
