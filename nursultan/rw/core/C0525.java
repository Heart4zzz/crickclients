package rw.core;

import KDFzREm.NIW;
import KDFzREm.NNNbg;
import KDFzREm.NNNvj;
import KDFzREm.NNRP;
import KDFzREm.NNrI;
import KDFzREm.NjB;
import KDFzREm.Nrv;
import java.util.Map;

public class C0525 {
   private final NNNbg<NIW> f1000;
   private Map<NjB, NNNvj> f2000 = NNRP.i.y;
   private Nrv f3000 = NNRP.i.L;
   private NNrI f4000 = NNRP.i.u;

   public C0525(NNNbg<NIW> var1) {
      this.f1000 = var1;
   }

   public NNRP m2000() {
      return new NNRP(this.f1000, this.f2000, this.f3000, this.f4000);
   }

   public C0525 m4000(NNrI var1) {
      this.f4000 = var1;
      return this;
   }

   public C0525 m6000(Nrv var1) {
      this.f3000 = var1;
      return this;
   }

   public C0525 m8000(Map<NjB, NNNvj> var1) {
      this.f2000 = var1;
      return this;
   }
}
