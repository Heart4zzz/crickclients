package rw.setting;

import java.util.Objects;
import rw.api.Iface0207;
import rw.data.Rec0107;
import rw.defs.Enum0026;

public final class C0033 {
   private final Enum0026 f1000;
   private final Iface0207 f2000;
   private final Rec0107 f3000;

   public Rec0107 m2000() {
      return this.f3000;
   }

   C0033(Enum0026 var1, Iface0207 var2, Rec0107 var3) {
      this.f1000 = Objects.requireNonNull(var1, "type");
      this.f2000 = Objects.requireNonNull(var2, "listener");
      this.f3000 = var3 == null ? Rec0107.f4000 : var3;
   }

   public Iface0207 m4000() {
      return this.f2000;
   }

   public Enum0026 m6000() {
      return this.f1000;
   }
}
