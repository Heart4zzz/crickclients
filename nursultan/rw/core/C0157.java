package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwz;
import KDFzREm.NNuU;
import rw.api.Iface0643;
import rw.net.PacketListener;

public class C0157 implements PacketListener<C0903> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C0157() {
      this.m2000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m14000(String var1, boolean var2) {
      if ((NNNZg)((NNuU)this.f1000[0]).T[3] != null) {
         for (NNNwz var4 : ((NNNZg)((NNuU)this.f1000[0]).T[3]).method_18456()) {
            if (var1.equals(var4.method_5820())) {
               ((Iface0643)var4).dataManager().m10000().m12000(var2);
            }
         }
      }
   }

   private void m16000() {
      if ((NNNZg)((NNuU)this.f1000[0]).T[3] != null) {
         for (NNNwz var2 : ((NNNZg)((NNuU)this.f1000[0]).T[3]).method_18456()) {
            ((Iface0643)var2).dataManager().m10000().m12000(false);
         }
      }
   }

   public void m18000(C0903 var1) {
      switch (((int[])C0148.f1000[0])[var1.m22000().ordinal()]) {
         case 1:
            this.m14000(var1.m24000().m6000(), (boolean)1);
            break;
         case 2:
            this.m14000(var1.m24000().m6000(), (boolean)0);
            break;
         case 3:
            this.m16000();
      }
   }
}
