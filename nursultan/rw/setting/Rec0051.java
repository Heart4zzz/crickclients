package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0215;
import rw.api.Iface0216;

public record Rec0051() implements Iface0216 {
   private final Iface0215 f1000;
   private final List<Iface0216> f2000;

   public Rec0051(Iface0215 var1, List<Iface0216> var2) {
      Objects.requireNonNull(var1, "mask");
      Objects.requireNonNull(var2, "children");
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0051,"mask;children",Rec0051::f1000,Rec0051::f2000>(this, var1);
   }

   public List<Iface0216> m4000() {
      return this.f2000;
   }

   public Iface0215 m6000() {
      return this.f1000;
   }
}
