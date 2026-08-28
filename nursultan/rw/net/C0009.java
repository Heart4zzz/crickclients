package rw.net;

import KDFzREm.NNNNNA;
import java.util.function.Function;

class C0009 implements NNNNNA<O, V> {
   C0009(NNNNNA var1, Function var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   public V m6000(O var1) {
      Object var2 = this.f1000.apply(var1);
      return (V)this.f2000.decode(var2);
   }

   public void m8000(O var1, V var2) {
      Object var3 = this.f1000.apply(var1);
      this.f2000.encode(var3, var2);
   }
}
