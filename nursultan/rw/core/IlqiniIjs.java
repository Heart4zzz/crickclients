package rw.core;

import KDFzREm.NCa;
import KDFzREm.NKi;
import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import java.util.function.Predicate;
import rw.gui.NoInteract;

public class IlqiniIjs extends Base1148<NoInteract> {
   public Object[] f1000;

   public IlqiniIjs(NoInteract var1, String var2, boolean var3, NKi... var4) {
      super(var1, var2, var3);
      this.m4000();
      Predicate var9 = var1x -> {
         for (NKi var5 : var4) {
            if (var1x == var5) {
               return (boolean)1;
            }
         }

         return (boolean)0;
      };
      this.f1000[0] = var9;
   }

   public IlqiniIjs(NoInteract var1, String var2, boolean var3, Predicate<NKi> var4) {
      super(var1, var2, var3);
      this.m4000();
      this.f1000[0] = var4;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m6000(Object var1) {
      this.m4000();
      if (var1 instanceof rw.module.NoInteract var2) {
         NCa var3 = ((NNNZg)((NNuU)this.N[0]).T[3]).method_8320(var2.m2000().u());
         if (((Predicate)this.f1000[0]).test(var3.i())) {
            var2.N();
         }
      }
   }
}
