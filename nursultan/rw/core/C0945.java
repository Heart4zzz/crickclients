package rw.core;

import KDFzREm.NNNNsE;
import rw.module.IltOmtiq;
import rw.module.Nametags;

public class C0945 extends Base0930 {
   public C0945(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof Nametags var2 && var2.m4000() instanceof NNNNsE) {
         var2.N();
      } else {
         if (var1 instanceof IltOmtiq var3) {
            var3.N();
         }
      }
   }
}
