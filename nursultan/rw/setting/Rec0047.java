package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import rw.api.Iface0214;
import rw.api.Iface0216;

public record Rec0047() implements Iface0216 {
   private final Iface0214 f1000;

   public Rec0047(Iface0214 var1) {
      Objects.requireNonNull(var1, "command");
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0047,"command",Rec0047::f1000>(this, var1);
   }

   public Iface0214 m4000() {
      return this.f1000;
   }
}
