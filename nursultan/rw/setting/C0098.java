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

public class C0098 implements Iface0597<C0856> {
   public Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;
   public Object[] f4000;

   public C0098(C0830 var1) {
      this.m32000();
      OlssInijr var6 = ((OlpOtr)EspMix.f49000[0]).m66000(f2000[0]);
      this.f1000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f49000[0]).m66000(f2000[1]);
      this.f4000[0] = var7;
      C1228 var8 = ((OlpOtr)EspMix.f49000[0]).m6000(f2000[2]);
      this.f4000[1] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f49000[0]).m6000(f2000[3]);
      this.f4000[2] = var9;
      C1223 var10 = ((OlpOtr)EspMix.f49000[0]).m106000(f2000[4]);
      this.f4000[3] = var10;
      C1250 var11 = ((OlpOtr)EspMix.f49000[0]).m94000(f2000[5]);
      this.f4000[4] = var11;
      C0804 var12 = ((OlpOtr)EspMix.f49000[0]).m76000(f2000[6]);
      this.f4000[5] = var12;
      this.f1000[0] = var1;
      C0805 var14 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[0]).m16000((OlpOtr)EspMix.f49000[0]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f1000[1] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f3000 = new float[]{0.0F, 0.0F, 0.0F, 2.0F, 2.0F};
   }

   public void m30000(C0856 var1) {
      C0806.m54000((C0830)this.f1000[0], f3000[0], f3000[1], f3000[2], var1.m16000(), var1.m20000(), -1);
      ((C0805)this.f1000[1]).m32000(var2 -> {
         ((OlssInijr)this.f1000[2]).m18000(var1.m26000());
         ((OlssInijr)this.f4000[0]).m18000(var1.m42000());
         ((C1228)this.f4000[1]).m20000(0);
         ((C1228)this.f4000[2]).m20000(6);
         ((C1223)this.f4000[3]).m18000(f3000[3] / var1.m28000(), f3000[4] / var1.m36000());
         ((C1250)this.f4000[4]).m22000(var1.m52000());
         ((C0804)this.f4000[5]).m16000(var1.m8000());
      });
   }

   private void m32000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[6];
         Object[] var2 = this.f4000;
      }
   }

   private static void m40000() {
      f2000 = new String[]{"u_projection", "u_view", "texture_in", "u_texture_in", "texel_size", "color", "weights"};
   }
}
