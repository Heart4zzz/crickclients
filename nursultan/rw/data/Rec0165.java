package rw.data;

import KDFzREm.NUA;
import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;

record Rec0165() {
   private final NXi f1000;
   final String f2000;
   final NUA f3000;

   public NUA m2000() {
      return this.f3000;
   }

   Rec0165(NXi var1, String var2, NUA var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0165,"pos;text;style",Rec0165::f1000,Rec0165::f2000,Rec0165::f3000>(this, var1);
   }

   public String m6000() {
      return this.f2000;
   }

   public NXi m8000() {
      return this.f1000;
   }
}
