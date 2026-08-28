package rw.core;

import KDFzREm.NNNNNA;
import java.util.function.Function;

class C0262 implements NNNNNA<B, O> {
   C0262(NNNNNA var1, Function var2, Function var3) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   public O m2000(B var1) {
      return (O)this.f1000.apply(this.f3000.decode(var1));
   }

   public void m4000(B var1, O var2) {
      this.f3000.encode(var1, this.f2000.apply(var2));
   }
}
