package rw.core;

import KDFzREm.NCa;
import KDFzREm.NFB;
import KDFzREm.NFd;
import KDFzREm.NHN;
import KDFzREm.NKA;
import KDFzREm.NKi;
import KDFzREm.NNGd;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NaH;
import KDFzREm.NaQ;
import KDFzREm.Ned;
import KDFzREm.Npo;
import KDFzREm.Xu;
import rw.gui.AttackAura;
import rw.module.Module005;

public class IlqIsmn extends C0779 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public IlqIsmn(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3, (boolean)0);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   public void m4000(Object var1) {
      this.m2000();
      if (var1 instanceof C0719) {
         Boolean var7 = true;
         this.f1000[0] = var7;
      } else if (var1 instanceof rw.module.AttackAura) {
         Boolean var8 = false;
         this.f1000[0] = var8;
      } else if (var1 instanceof Module005 var2 && (Boolean)this.f1000[0] && this.m2000(var2.m14000(), var2.m4000())) {
         var2.N();
      }
   }

   private boolean m2000(NCa var1, Ned var2) {
      Ned var3 = Ned.method_49638(((NNNwS)((NNuU)this.N[0]).T[4]).method_33571());
      if (!var3.equals(var2) && (!((NNNwS)((NNuU)this.N[0]).T[4]).method_41328(NNGd.field_18079) || !var3.method_10084().equals(var2))) {
         NKi var4 = var1.i();
         return (boolean)(!(var4 instanceof Npo)
               && !(var4 instanceof NaQ)
               && !(var4 instanceof NaH)
               && !(var4 instanceof NHN)
               && !(var4 instanceof NKA)
               && !(var4 instanceof Xu)
               && !(var4 instanceof NFd)
               && !(var4 instanceof NFB)
            ? 0
            : 1);
      } else {
         return (boolean)1;
      }
   }
}
