package rw.core;

import KDFzREm.NNNNNA;
import KDFzREm.NNNNyT;
import KDFzREm.NNNNys;

class C0261 implements NNNNNA<B, V> {
   C0261(NNNNys var1, NNNNyT var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public V m2000(B var1) {
      return (V)this.f1000.decode(var1);
   }

   public void m4000(B var1, V var2) {
      this.f2000.encode(var1, var2);
   }
}
