package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0216;
import rw.core.C0259;

public record Rec0045() implements Iface0216 {
   private final float f1000;
   private final List<Iface0216> f2000;

   public Rec0045(float var1, List<Iface0216> var2) {
      Objects.requireNonNull(var2, "children");
      var1 = C0259.m4000(var1);
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0045,"alpha;children",Rec0045::f1000,Rec0045::f2000>(this, var1);
   }

   public List<Iface0216> m4000() {
      return this.f2000;
   }

   public float m6000() {
      return this.f1000;
   }
}
