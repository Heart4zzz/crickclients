package rw.setting;

import java.util.function.BooleanSupplier;
import rw.api.Iface0597;
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

public class C0105 implements Iface0597<C0856> {
   private static String[] f1000;
   private static byte[] f2000;
   public Object[] f3000;
   private static float[] f4000;

   public C0105(C0830 var1, BooleanSupplier var2) {
      this.m38000();
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[2]).m66000(f1000[0]);
      this.f3000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f5000[2]).m66000(f1000[1]);
      this.f3000[4] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f5000[2]).m6000(f1000[2]);
      this.f3000[5] = var9;
      C1223 var10 = ((OlpOtr)EspMix.f5000[2]).m106000(f1000[3]);
      this.f3000[6] = var10;
      C1250 var11 = ((OlpOtr)EspMix.f5000[2]).m94000(f1000[4]);
      this.f3000[7] = var11;
      this.f3000[0] = var1;
      this.f3000[1] = var2;
      C0805 var14 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[0]).m16000((OlpOtr)EspMix.f5000[2]).m18000(4).m20000()).m22000(var1).m20000();
      this.f3000[2] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size", "color"};
   }

   private static void m16000() {
      f4000 = new float[]{0.0F, 0.0F, 0.0F, 1.0F, 1.0F};
   }

   private static void m30000() {
      f2000 = new byte[]{4, -1, 8};
   }

   public void m36000(C0856 var1) {
      if (((BooleanSupplier)this.f3000[1]).getAsBoolean()) {
         C0806.m54000((C0830)this.f3000[0], f4000[0], f4000[1], f4000[2], var1.m16000(), var1.m20000(), -1);
         ((C0805)this.f3000[2]).m32000(var2 -> {
            ((OlssInijr)this.f3000[3]).m18000(var1.m26000());
            ((OlssInijr)this.f3000[4]).m18000(var1.m42000());
            ((C1228)this.f3000[5]).m20000(0);
            ((C1250)this.f3000[7]).m22000(var1.m52000());
            ((C1223)this.f3000[6]).m18000(f4000[3] / var1.m28000(), f4000[4] / var1.m36000());
         });
      }
   }

   private void m38000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[8];
         Object[] var1 = this.f3000;
      }
   }
}
