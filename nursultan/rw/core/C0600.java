package rw.core;

import KDFzREm.NBS;
import KDFzREm.NBf;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import rw.api.Iface0515;

class C0600<T> {
   private final Iface0515<T> f1000;
   @Nullable
   T f2000;

   C0600(Iface0515<T> var1) {
      this.f1000 = var1;
   }

   @Nullable
   public NBS<T> m2000(NBf<T> var1) {
      Object var2 = this.f1000.m2000();
      if (!Objects.equals(var2, this.f2000)) {
         this.f2000 = (T)var2;
         return var1.N(var2);
      } else {
         return null;
      }
   }
}
