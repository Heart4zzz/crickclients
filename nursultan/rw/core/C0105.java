package rw.core;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNin;
import KDFzREm.NNNNuc;
import KDFzREm.NQo;
import rw.defs.Enum0059;

public class C0105 extends rw.setting.C0156 {
   public C0105(NQo var1, String var2, String var3, Enum0059 var4) {
      super(var1, var2, var3, var4);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean m2000(NQo var1) {
      return (boolean)(((NNNNuc)var1.y().a_(NNNNRZ.b, NNNNuc.N)).y().isEmpty() && !var1.y().N(NNNNRZ.R) && ((NNNNin)var1.y().a_(NNNNRZ.P, NNNNin.N)).u()
         ? 1
         : 0);
   }
}
