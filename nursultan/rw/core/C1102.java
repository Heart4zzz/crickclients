package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.api.Iface0654;
import rw.gui.AutoLeave;

public class C1102 extends Base1148<AutoLeave> {
   public Object[] f1000;

   public C1102(AutoLeave var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public void m8000(Object var1) {
      this.m4000();
      boolean var2 = ((Iface0654)((NNNwS)((NNuU)this.N[0]).T[4])).dataManager().m14000().m10000().m20000();
      if (var2) {
         Boolean var7 = true;
         this.f1000[0] = var7;
      } else {
         if ((Boolean)this.f1000[0]) {
            Boolean var8 = false;
            this.f1000[0] = var8;
            ((AutoLeave)this.N[1]).m8000();
         }
      }
   }
}
