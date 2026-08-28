package rw.core;

import KDFzREm.NNNNNA;
import KDFzREm.NNNNyb;
import KDFzREm.NNNNys;

class C0263 implements NNNNNA<B, V> {
   C0263(NNNNys var1, NNNNyb var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public V m2000(B var1) {
      return (V)this.f1000.decode(var1);
   }

   public void m4000(B var1, V var2) {
      this.f2000.encode(var2, var1);
   }
}
