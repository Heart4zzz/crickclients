package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.NursultanClient;
import rw.api.Iface0654;
import rw.net.PacketListener;

public class C0141 implements PacketListener<C0916> {
   public static Object[] f1000;
   public Object[] f2000;

   private void m6000() {
      if ((NNNwS)((NNuU)this.f2000[0]).T[4] != null) {
         ((Iface0654)((NNNwS)((NNuU)this.f2000[0]).T[4])).dataManager().m10000().m12000(((NNNwS)((NNuU)this.f2000[0]).T[4]).method_36455());
         NursultanClient.m8000().m12000(C0719.m14000());
      }
   }

   public C0141() {
      this.m10000();
      NNuU var5 = NNuU.Nq();
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{3000L};
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private void m12000() {
      if (NursultanClient.m74000().m10000() % 20 == 0) {
         for (C0073 var2 : NursultanClient.m46000().m10000()) {
            var2.m34000();
         }
      }
   }

   public void m30000(C0916 var1) {
      this.m12000();
      ((C0013)C0013.f2000[0]).m30000();
      NursultanClient.m74000().m14000();
      NursultanClient.m36000().m26000();
      this.m34000();
      this.m6000();
      C0892.m52000();
   }

   private void m34000() {
      C0153 var1 = NursultanClient.m100000();
      var1.m28000(3000L, System.currentTimeMillis());
      if (!var1.m14000() && (NNNwS)((NNuU)this.f2000[0]).T[4] != null && ((NNNwS)((NNuU)this.f2000[0]).T[4]).field_6012 % 20 == 0 && ((NNuU)this.f2000[0]).y()) {
         NursultanClient.m82000()
            .m56000(
               new C1214(
                  ((NNNwS)((NNuU)this.f2000[0]).T[4]).method_23317(),
                  ((NNNwS)((NNuU)this.f2000[0]).T[4]).method_23318(),
                  ((NNNwS)((NNuU)this.f2000[0]).T[4]).method_23321()
               )
            );
      }
   }
}
