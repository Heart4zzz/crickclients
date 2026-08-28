package rw.net;

import KDFzREm.NJK;
import KDFzREm.NNNNNA;
import java.util.Optional;

class C0007 implements NNNNNA<B, NJK<T>> {
   private static final int f1000 = 1;
   private static final int f2000 = 2;

   C0007(NNNNNA var1) {
      this.f3000 = var1;
   }

   public void m8000(B var1, NJK<T> var2) {
      Optional var3 = var2.R();
      Optional var4 = var2.M();
      var1.writeByte((var3.isPresent() ? 1 : 0) | (var4.isPresent() ? 2 : 0));
      var3.ifPresent(var2x -> var0.encode(var1, var2x));
      var4.ifPresent(var2x -> var0.encode(var1, var2x));
   }

   public NJK<T> m12000(B var1) {
      byte var2 = var1.readByte();
      Optional var3 = (var2 & 1) != 0 ? Optional.of((Number)this.f3000.decode(var1)) : Optional.empty();
      Optional var4 = (var2 & 2) != 0 ? Optional.of((Number)this.f3000.decode(var1)) : Optional.empty();
      return new NJK(var3, var4);
   }
}
