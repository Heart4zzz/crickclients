package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import rw.NursultanClient;
import rw.api.Iface0606;
import rw.gui.AutoSwap;
import rw.gui.PgUp;
import rw.module.Huddumped;

public class C1089 extends Base1148<AutoSwap> {
   public C1089(AutoSwap var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      NQo var1 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_6079();
      C1086 var2 = (C1086)((C1000)((AutoSwap)this.N[1]).f12000[5]).i();
      C1086 var3 = (C1086)((C1000)((AutoSwap)this.N[1]).f12000[6]).i();
      if (((Iface0606)var2.f1000[0]).test(var1)) {
         ((AutoSwap)this.N[1]).m58000(var3::m8000);
      } else if (((Iface0606)var3.f1000[0]).test(var1)) {
         ((AutoSwap)this.N[1]).m58000(var2::m8000);
      } else if (!((AutoSwap)this.N[1]).m58000(var2::m8000)) {
         ((AutoSwap)this.N[1]).m58000(var3::m8000);
      }
   }

   public void m6000(Object var1) {
      if (var1 instanceof Huddumped var2) {
         if (this.m12000(var2)) {
            return;
         }

         NursultanClient.m36000().m36000(this::m4000);
      }
   }

   private boolean m12000(Huddumped var1) {
      C1006 var2 = (C1006)((AutoSwap)this.N[1]).f4000[0];
      return (boolean)(!var1.m38000((PgUp)var2.i(), var2.m2000()) ? 1 : 0);
   }
}
