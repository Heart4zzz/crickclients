package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NXi;
import java.util.Set;
import rw.api.Iface0597;
import rw.data.OlnpOqOpi;
import rw.gui.EspMix;
import rw.gui.KillEffect;
import rw.setting.OlpOtr;

public class OlmlOlil implements Iface0597<C0138> {
   public Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;

   OlmlOlil(KillEffect var1, C0830 var2) {
      this.m6000();
      this.f1000[5] = var1;
      OlssInijr var8 = ((OlpOtr)EspMix.f50000[5]).m66000(f2000[0]);
      this.f1000[3] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f50000[5]).m66000(f2000[1]);
      this.f1000[4] = var9;
      this.f1000[0] = var2;
      C0805 var11 = C0805.m30000()
         .m16000(
            C0825.m2000()
               .m22000(((C1246)C1234.f1000[1]).m2000().m20000((OlnpOqOpi)OlnpOqOpi.f1000[0]).m16000())
               .m16000((OlpOtr)EspMix.f50000[5])
               .m18000(4)
               .m20000()
         )
         .m22000(var2)
         .m18000(6)
         .m20000();
      this.f1000[1] = var11;
      C0805 var12 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[1]).m16000((OlpOtr)EspMix.f50000[5]).m18000(4).m20000())
         .m22000(var2)
         .m18000(6)
         .m20000();
      this.f1000[2] = var12;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
      }
   }

   private static void m12000() {
      f3000 = new float[]{1.0F, 20.0F, 255.0F};
   }

   private static void m22000() {
      f2000 = new String[]{"u_projection", "u_view"};
   }

   public void m24000(C0138 var1) {
      NXi var2 = var1.m24000().y();
      float var3 = var1.m20000().N(true);
      C0811 var4 = ((C0830)this.f1000[0]).m6000();

      for (C0859 var6 : (Set)((KillEffect)this.f1000[5]).f6000[0]) {
         for (OlsOrqs var8 : var6.m18000()) {
            double var9 = NNWE.u(var3, ((NXi)var8.f8000[1]).M, ((NXi)var8.f8000[0]).M);
            double var11 = NNWE.u(var3, ((NXi)var8.f8000[1]).B, ((NXi)var8.f8000[0]).B);
            double var13 = NNWE.u(var3, ((NXi)var8.f8000[1]).Z, ((NXi)var8.f8000[0]).Z);
            int var15 = (Integer)var8.f3000[1] - (Integer)var8.f3000[2];
            float var16 = Math.min(f3000[0], var15 / f3000[1]);
            int var17 = C0876.m70000((Integer)((C0998)((KillEffect)this.f1000[5]).f11000[1]).i(), (int)(f3000[2] * var16));
            var4.m40000((float)(var9 - var2.M), (float)(var11 - var2.B), (float)(var13 - var2.Z)).m30000((Float)var8.f3000[0]).m26000(var17).m28000();
         }
      }

      C0805 var18 = ((C0991)((KillEffect)this.f1000[5]).f11000[0]).i() ? (C0805)this.f1000[2] : (C0805)this.f1000[1];
      var18.m24000(var2x -> {
         ((OlssInijr)this.f1000[3]).m18000(var1.m12000());
         ((OlssInijr)this.f1000[4]).m18000(var1.m26000());
      });
   }
}
