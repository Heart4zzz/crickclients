package rw.setting;

import rw.api.Iface0597;
import rw.core.C0804;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0856;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.C1250;
import rw.core.OlssInijr;
import rw.gui.EspMix;

public class C0099 implements Iface0597<C0856> {
   private static float[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   public C0099(C0830 var1) {
      this.m40000();
      OlssInijr var6 = ((OlpOtr)EspMix.f49000[1]).m66000(f3000[0]);
      this.f2000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f49000[1]).m66000(f3000[1]);
      this.f2000[3] = var7;
      C1228 var8 = ((OlpOtr)EspMix.f49000[1]).m6000(f3000[2]);
      this.f2000[4] = var8;
      C1223 var9 = ((OlpOtr)EspMix.f49000[1]).m106000(f3000[3]);
      this.f2000[5] = var9;
      C1250 var10 = ((OlpOtr)EspMix.f49000[1]).m94000(f3000[4]);
      this.f2000[6] = var10;
      C0804 var11 = ((OlpOtr)EspMix.f49000[1]).m76000(f3000[5]);
      this.f2000[7] = var11;
      this.f2000[0] = var1;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f49000[1]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f2000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f3000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size", "color", "weights"};
   }

   private static void m22000() {
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 2.0F, 2.0F};
   }

   public void m36000(C0856 var1) {
      C0806.m54000((C0830)this.f2000[0], f1000[0], f1000[1], f1000[2], var1.m16000(), var1.m20000(), -1);
      ((C0805)this.f2000[1]).m32000(var2 -> {
         ((OlssInijr)this.f2000[2]).m18000(var1.m26000());
         ((OlssInijr)this.f2000[3]).m18000(var1.m42000());
         ((C1228)this.f2000[4]).m20000(0);
         ((C1223)this.f2000[5]).m18000(f1000[3] / var1.m28000(), f1000[4] / var1.m36000());
         ((C1250)this.f2000[6]).m22000(var1.m52000());
         ((C0804)this.f2000[7]).m16000(var1.m8000());
      });
   }

   private void m40000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
      }
   }
}
