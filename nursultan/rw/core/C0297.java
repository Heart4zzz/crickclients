package rw.core;

import java.util.Objects;
import java.util.function.Supplier;

public final class C0297<T> {
   private final Supplier<T> f1000;
   private final boolean f2000;

   C0297(Supplier<T> var1) {
      this.f1000 = Objects.requireNonNull(var1, "defaultValue");
      this.f2000 = true;
   }

   C0297(T var1) {
      this.f1000 = () -> (T)var1;
      this.f2000 = true;
   }

   C0297() {
      this.f1000 = null;
      this.f2000 = false;
   }

   public T m2000() {
      if (!this.f2000) {
         throw new C0284("Context has no default value: " + this);
      } else {
         return this.f1000.get();
      }
   }

   public boolean m6000() {
      return this.f2000;
   }
}
