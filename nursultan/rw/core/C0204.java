package rw.core;

import KDFzREm.NCa;
import KDFzREm.NKL;
import KDFzREm.NNFz;
import KDFzREm.NNHG;
import KDFzREm.NNPy;
import KDFzREm.Ned;
import KDFzREm.NgI;
import KDFzREm.Ngc;
import java.util.Optional;

class C0204 extends NNFz {
   C0204(NNHG var1, Ned var2, boolean var3) {
      this.f1000 = var2;
      this.f2000 = var3;
   }

   public Optional<Float> m2000(Ngc var1, NgI var2, Ned var3, NCa var4, NNPy var5) {
      return var3.equals(this.f1000) && this.f2000 ? Optional.of(NKL.K.R()) : super.N(var1, var2, var3, var4, var5);
   }
}
