package rw.core;

import KDFzREm.NNNNNA;
import java.util.function.Function;

class C0416 implements NNNNNA<B, U> {
   C0416(NNNNNA var1, Function var2, Function var3) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   public U m2000(B var1) {
      Object var2 = this.f3000.decode(var1);
      NNNNNA var3 = (NNNNNA)this.f1000.apply(var2);
      return (U)var3.decode(var1);
   }

   public void m4000(B var1, U var2) {
      Object var3 = this.f2000.apply(var2);
      NNNNNA var4 = (NNNNNA)this.f1000.apply(var3);
      this.f3000.encode(var1, var3);
      var4.encode(var1, var2);
   }
}
