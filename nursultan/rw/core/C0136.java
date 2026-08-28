package rw.core;

import KDFzREm.NNYH;
import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.data.Rec0305;
import rw.event.EventBus;
import rw.module.Huddumped;
import rw.module.OlpnniIl;
import rw.net.PacketListener;

public class C0136 implements PacketListener<Huddumped> {
   public Object[] f1000;

   private void m4000(Huddumped var1) {
      if (var1.m18000()) {
         ((C1222)this.f1000[3]).m22000(var1.m30000()).stream().map(Rec0305::m8000).forEach(rw.setting.C0160::m70000);
      }
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   public C0136() {
      this.m6000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
      EventBus var6 = NursultanClient.m8000();
      this.f1000[1] = var6;
      C0182 var7 = NursultanClient.m106000();
      this.f1000[2] = var7;
      C1222 var8 = NursultanClient.m90000();
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private void m16000(Huddumped var1) {
      OlpnniIl var2 = OlpnniIl.m6000(var1);
      ((EventBus)this.f1000[1]).m12000(var2);
      if (var2.y()) {
         var1.N();
      }
   }

   private boolean m18000() {
      return (boolean)((NNYH)((NNuU)this.f1000[0]).v[3] == null ? 1 : 0);
   }

   public void m24000(Huddumped var1) {
      if (!var1.y()) {
         if (var1.m10000()) {
            ((C0182)this.f1000[2]).m38000(var1);
            this.m16000(var1);
         } else if (this.m18000()) {
            if (var1.m18000()) {
               ((C0182)this.f1000[2]).m24000(var1);
            }

            this.m16000(var1);
            this.m4000(var1);
         }
      }
   }
}
