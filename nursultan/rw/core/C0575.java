package rw.core;

import KDFzREm.NNqu;
import KDFzREm.NNqy;

public final class C0575<S> implements NNqu<S> {
   private final S f1000;
   private final S f2000;

   public C0575(S var1, S var2) {
      this.f1000 = (S)var1;
      this.f2000 = (S)var2;
   }

   public <T> T m2000(NNqy<? super S, T> var1) {
      return (T)var1.N(this.f1000, this.f2000);
   }
}
