package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwz;
import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.api.Iface0643;
import rw.net.PacketListener;

public class C0133 implements PacketListener<C0912> {
   static {
      ntfClinit();
   }

   public void m4000(C0912 var1) {
      NNNZg var2 = (NNNZg)NNuU.Nq().T[3];
      if (var2 != null) {
         C0153 var3 = NursultanClient.m100000();

         for (NNNwz var5 : var2.method_18456()) {
            ((Iface0643)var5).dataManager().m8000().m12000(var3.m16000(var5.method_5820()));
         }
      }
   }
}
