package rw.core;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NFA;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.Nkq;
import rw.NursultanClient;
import rw.module.ShulkerPreview_x;
import rw.net.PacketListener;
import rw.setting.C0106;

public class C0152 implements PacketListener<ShulkerPreview_x> {
   private static boolean[] f1000;
   private static String[] f2000;
   private static short[] f3000;

   private void m2000(ShulkerPreview_x var1) {
      if ((Boolean)NursultanClient.f13000[3] && NNuU.Nq().U() && NNuU.Nq().s() && NNuU.Nq().L()) {
         var1.N();
         NQo var2 = var1.m2000().i();
         if (!var2.R()) {
            NAd var3 = NAd.N.N(new NFA(rw.setting.C0159.m8000(var2).toAbsolutePath().toString()));
            C0106.m42000(NAN.y(f2000[0]).y(var2.Y()).L(var3));
         }
      }
   }

   private static void m4000() {
      f2000 = new String[]{"Parsed item: "};
   }

   static {
      ntfClinit();
   }

   private void m12000(ShulkerPreview_x var1) {
      if (var1.m2000() != null) {
         NQo var2 = var1.m2000().i();
         if (!var2.R()) {
            NQl var3 = var2.B();
            if (var1.m6000() == Nkq.field_7795 && NNuU.Nq().s() && NNuU.Nq().L()) {
               for (NYj var5 : var1.m12000().T) {
                  if (var5.i().N(var3)) {
                     NursultanClient.m60000().m38000(var1.m20000(), var5.u, 1, Nkq.field_7795).m24000();
                  }
               }
            }
         }
      }
   }

   private static void m14000() {
      f1000 = new boolean[]{true};
   }

   public void m16000(ShulkerPreview_x var1) {
      this.m2000(var1);
      this.m12000(var1);
   }

   private static void m18000() {
      f3000 = new short[]{3};
   }
}
