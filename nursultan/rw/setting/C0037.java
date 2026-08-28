package rw.setting;

import java.util.Objects;
import java.util.function.UnaryOperator;
import rw.api.Iface0196;
import rw.defs.Enum0023;

final class C0037<T> implements Iface0196<T> {
   T f1000;
   Enum0023 f2000;
   final boolean f3000;
   private final Runnable f4000;

   @Override
   public T m2000() {
      return this.f1000;
   }

   C0037(T var1, Enum0023 var2, boolean var3, Runnable var4) {
      this.f1000 = (T)var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = Objects.requireNonNull(var4, "requestRender");
   }

   @Override
   public void m4000() {
      this.f4000.run();
   }

   public void m6000(UnaryOperator<T> var1) {
      Objects.requireNonNull(var1, "update");
      this.m8000((T)var1.apply(this.f1000));
   }

   public void m8000(T var1) {
      this.f1000 = (T)var1;
      this.m4000();
   }
}
