package rw.core;

import java.util.Objects;
import java.util.function.Supplier;
import rw.api.Iface0199;

final class C0311<T> {
   private T f1000;
   T f2000;
   Supplier<T> f3000;
   Iface0199<T> f4000;

   C0311(T var1, Supplier<T> var2, Iface0199<T> var3) {
      this.f1000 = (T)var1;
      this.f2000 = (T)var1;
      this.f3000 = Objects.requireNonNull(var2, "snapshotSupplier");
      this.f4000 = Objects.requireNonNull(var3, "changeDetector");
   }

   void m2000() {
      this.f1000 = this.f2000;
   }

   boolean m4000() {
      Object var1 = this.f3000.get();
      return this.f4000.m2000(this.f1000, (T)var1);
   }
}
