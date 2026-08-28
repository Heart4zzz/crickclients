package rw.core;

import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.api.Iface0606;
import rw.gui.QuickUse;

public class C0740 extends C0746 {
   public C0740(Iface0606 var1, String var2, QuickUse var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m8000() {
   }

   public void m12000(int var1) {
      super.m26000(var1);
      NNuU var10000 = (NNuU)this.N[3];
      Integer var6 = 0;
      var10000.M[4] = var6;
      Integer var7 = 4;
      this.N[6] = var7;
      NursultanClient.m36000().m14000(1, () -> {
         QuickUse var10000x = (QuickUse)this.N[0];
         Boolean var5 = false;
         var10000x.f2000[1] = var5;
      });
   }
}
