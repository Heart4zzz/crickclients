package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0294;

record Rec0094() {
   private final C0294 f1000;

   Rec0094(C0294 var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0094,"root",Rec0094::f1000>(this, var1);
   }

   public C0294 m4000() {
      return this.f1000;
   }
}
