package rw.core;

import KDFzREm.NNNNNA;

class C0260 implements NNNNNA<B, V> {
   C0260(Object var1) {
      this.f1000 = var1;
   }

   public V m2000(B var1) {
      return (V)this.f1000;
   }

   public void m4000(B var1, V var2) {
      if (!var2.equals(this.f1000)) {
         throw new IllegalStateException("Can't encode '" + var2 + "', expected '" + this.f1000 + "'");
      }
   }
}
