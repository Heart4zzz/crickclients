package rw.core;

import KDFzREm.NNNNNA;
import java.util.function.BiFunction;
import java.util.function.Function;

class C0415 implements NNNNNA<B, C> {
   C0415(NNNNNA var1, NNNNNA var2, BiFunction var3, Function var4, Function var5) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public C m2000(B var1) {
      Object var2 = this.f1000.decode(var1);
      Object var3 = this.f2000.decode(var1);
      return (C)this.f3000.apply(var2, var3);
   }

   public void m4000(B var1, C var2) {
      this.f1000.encode(var1, this.f4000.apply(var2));
      this.f2000.encode(var1, this.f5000.apply(var2));
   }
}
