package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import rw.core.C0313;

record Rec0106() {
   private final List<String> f1000;

   Rec0106(List<String> var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0106,"segments",Rec0106::f1000>(this, var1);
   }

   @Override
   public String toString() {
      return String.join("/", this.f1000);
   }

   Rec0106 m4000(String var1) {
      ArrayList var2 = new ArrayList(this.f1000.size() + 1);
      var2.addAll(this.f1000);
      var2.add(var1);
      return new Rec0106(List.copyOf(var2));
   }

   public List<String> m6000() {
      return this.f1000;
   }

   static Rec0106 m8000(String var0) {
      return new Rec0106(List.of(C0313.m2000(var0, "rootKey")));
   }
}
