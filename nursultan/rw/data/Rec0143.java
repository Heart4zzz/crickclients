package rw.data;

import KDFzREm.NNFU;
import KDFzREm.NNNNuN;
import KDFzREm.NNNgG;
import KDFzREm.NNpQ;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

record Rec0143() {
   final NNpQ<NNFU> f1000;
   final NNFU f2000;

   public NNFU m2000() {
      return this.f2000;
   }

   Rec0143(NNpQ<NNFU> var1, NNFU var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0143,"key;value",Rec0143::f1000,Rec0143::f2000>(this, var1);
   }

   public NNpQ<NNFU> m6000() {
      return this.f1000;
   }

   NNNNuN m8000() {
      return new NNNNuN(Optional.empty(), NNNgG.N(this.f1000, this.f2000));
   }
}
