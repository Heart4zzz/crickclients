package rw.core;

import KDFzREm.NNNNNA;
import KDFzREm.NNNNiC;
import KDFzREm.NNNbw;
import KDFzREm.NNNrD;
import KDFzREm.NQl;
import KDFzREm.NQo;

class C0588 implements NNNNNA<NNNrD, NQo> {
   C0588(NNNNNA var1) {
      this.f1000 = var1;
   }

   public NQo m6000(NNNrD var1) {
      int var2 = var1.E();
      if (var2 <= 0) {
         return NQo.E;
      } else {
         NNNbw var3 = (NNNbw)NQl.i.decode(var1);
         NNNNiC var4 = (NNNNiC)this.f1000.decode(var1);
         return new NQo(var3, var2, var4);
      }
   }

   public void m8000(NNNrD var1, NQo var2) {
      if (var2.R()) {
         var1.L(0);
      } else {
         var1.L(var2.c());
         NQl.i.encode(var1, var2.Z());
         this.f1000.encode(var1, var2.W.M());
      }
   }
}
