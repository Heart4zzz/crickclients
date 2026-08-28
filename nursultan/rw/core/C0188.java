package rw.core;

import KDFzREm.NNCk;
import org.jspecify.annotations.Nullable;

class C0188 implements NNCk<B, T> {
   C0188(Class var1) {
      this.f1000 = var1;
   }

   public Class<? extends B> m2000() {
      return this.f1000;
   }

   @Nullable
   public T m4000(B var1) {
      return (T)(this.f1000.isInstance(var1) ? var1 : null);
   }
}
