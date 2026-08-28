package rw.core;

import KDFzREm.NCj;
import KDFzREm.NGa;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.module.AutoAccept;

public class C0675 extends C0687 {
   public C0675(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (this.U() && var1 instanceof AutoAccept var2 && (NNNZg)((NNuU)this.N[0]).T[3] != null && (NNNwS)((NNuU)this.N[0]).T[4] != null) {
         if (var2.m6000() instanceof NCj var3 && var3.N() == 31) {
            if (var3.N((NNNZg)((NNuU)this.N[0]).T[3]) instanceof NGa var6 && var6.u() == (NNNwS)((NNuU)this.N[0]).T[4]) {
               var2.N();
            }
         }
      }
   }
}
