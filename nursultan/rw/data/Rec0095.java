package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0095() {
   private final Rec0106 f1000;
   private final String f2000;

   Rec0095(Rec0106 var1, String var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0095,"path;name",Rec0095::f1000,Rec0095::f2000>(this, var1);
   }

   public String m4000() {
      return this.f2000;
   }

   public Rec0106 m6000() {
      return this.f1000;
   }
}
