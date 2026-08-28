package rw.core;

import KDFzREm.NNNbw;
import KDFzREm.NNNrv;
import KDFzREm.NNob;
import KDFzREm.NQo;
import java.util.function.Consumer;

class C0494 extends Base0460 {
   C0494(NNNrv var1, NNNbw var2) {
      super(var1);
      this.f1000 = var2;
   }

   public void m2000(Consumer<NQo> var1, NNob var2) {
      var1.accept(new NQo(this.f1000));
   }
}
