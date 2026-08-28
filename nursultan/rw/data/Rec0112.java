package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import rw.api.Iface0216;

record Rec0112() {
   private final List<Iface0216> f1000;
   private final int f2000;
   static final Rec0112 f3000;

   Rec0112(List<Iface0216> var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0112,"nodes;drawCommandCount",Rec0112::f1000,Rec0112::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public List<Iface0216> m6000() {
      return this.f1000;
   }
}
