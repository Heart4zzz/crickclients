package rw.core;

import KDFzREm.NNNNNA;
import java.util.function.Function;

class C0417 implements NNNNNA<B, C> {
   C0417(NNNNNA var1, Function var2, Function var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public C m2000(B var1) {
      Object var2 = this.f1000.decode(var1);
      return (C)this.f2000.apply(var2);
   }

   public void m4000(B var1, C var2) {
      this.f1000.encode(var1, this.f3000.apply(var2));
   }
}
