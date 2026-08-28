package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSS;
import rw.module.AutoAccept;

public class C0790 extends Base1138 {
   public C0790(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof AutoAccept var2) {
         if (var2.m6000() instanceof NSS var4 && var4.N() == ((NNNwS)((NNuU)this.N[0]).T[4]).method_5628()) {
            var2.N();
         }
      }
   }
}
