package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0098() {
   private final boolean f1000;
   static final Rec0098 f2000;
   static final Rec0098 f3000;

   Rec0098(boolean var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0098,"changed",Rec0098::f1000>(this, var1);
   }

   public boolean m4000() {
      return this.f1000;
   }
}
