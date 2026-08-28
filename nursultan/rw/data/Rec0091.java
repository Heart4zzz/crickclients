package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import rw.core.C0294;
import rw.setting.C0059;

record Rec0091() {
   private final List<C0294> f1000;
   private final List<C0059> f2000;
   private final List<C0059> f3000;
   private static final Rec0091 f4000;

   public List<C0059> m2000() {
      return this.f2000;
   }

   Rec0091(List<C0294> var1, List<C0059> var2, List<C0059> var3) {
      this.f1000 = var1 == null ? List.of() : List.copyOf(var1);
      this.f2000 = var2 == null ? List.of() : List.copyOf(var2);
      this.f3000 = var3 == null ? List.of() : List.copyOf(var3);
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0091,"desiredChildren;immediateDetachChildren;exitingChildren",Rec0091::f1000,Rec0091::f2000,Rec0091::f3000>(
         this, var1
      );
   }

   public List<C0059> m6000() {
      return this.f3000;
   }

   public List<C0294> m8000() {
      return this.f1000;
   }

   static Rec0091 m10000() {
      return f4000;
   }
}
