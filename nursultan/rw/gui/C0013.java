package rw.gui;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import rw.api.Iface0178;
import rw.api.Iface0198;
import rw.api.Iface0208;
import rw.api.Iface0209;
import rw.core.C0291;
import rw.setting.C0029;

public final class C0013 {
   private final Iface0198 f1000;
   private final Iface0208 f2000;
   private final Iface0178 f3000;
   private final C0291 f4000 = new C0291();
   private final Map<Class<?>, Object> f5000 = new HashMap<>();
   private final Iface0209 f6000;

   public Iface0178 m2000() {
      return this.f3000;
   }

   public C0013(Iface0198 var1, Iface0208 var2, Iface0178 var3) {
      this.f1000 = Objects.requireNonNull(var1, "clipboard");
      this.f2000 = Objects.requireNonNull(var2, "fontMetrics");
      this.f3000 = Objects.requireNonNull(var3, "textMeasurer");
      this.f6000 = new C0029(this);
   }

   public Iface0209 m4000() {
      return this.f6000;
   }

   public C0291 m6000() {
      return this.f4000;
   }

   public Iface0208 m8000() {
      return this.f2000;
   }

   public <T> Optional<T> m10000(Class<T> var1) {
      Object var2 = this.f5000.get(Objects.requireNonNull(var1, "type"));
      return var2 == null ? Optional.empty() : Optional.of((T)var1.cast(var2));
   }

   public <T> void m12000(Class<T> var1, T var2) {
      this.f5000.put(Objects.requireNonNull(var1, "type"), Objects.requireNonNull(var2, "service"));
   }

   public Iface0198 m14000() {
      return this.f1000;
   }
}
