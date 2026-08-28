package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0857 implements Iface0597<C0862> {
   private static float[] f1000;
   public static Object[] f2000;
   public Object[] f3000;
   private static String[] f4000;

   private static void m8000() {
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 2.0F, 2.0F};
   }

   public C0857(C0830 var1) {
      this.m22000();
      OlssInijr var6 = ((OlpOtr)EspMix.f5000[1]).m66000(f4000[0]);
      this.f3000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[1]).m66000(f4000[1]);
      this.f3000[3] = var7;
      C1228 var8 = ((OlpOtr)EspMix.f5000[1]).m6000(f4000[2]);
      this.f3000[4] = var8;
      C1223 var9 = ((OlpOtr)EspMix.f5000[1]).m106000(f4000[3]);
      this.f3000[5] = var9;
      this.f3000[0] = var1;
      C0805 var11 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f5000[1]).m18000(4).m20000()).m22000(var1).m20000();
      this.f3000[1] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f4000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size"};
   }

   private void m22000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[6];
         Object[] var1 = this.f3000;
      }
   }

   public void m28000(C0862 var1) {
      C0806.m24000((C0830)this.f3000[0], f1000[0], f1000[1], f1000[2], var1.m24000(), var1.m32000(), -1);
      ((C0805)this.f3000[1]).m32000(var2 -> {
         ((OlssInijr)this.f3000[2]).m18000(var1.m58000());
         ((OlssInijr)this.f3000[3]).m18000(var1.m8000());
         ((C1228)this.f3000[4]).m20000(0);
         ((C1223)this.f3000[5]).m18000(var1.m30000() * (f1000[3] / var1.m42000()), var1.m30000() * (f1000[4] / var1.m46000()));
      });
   }

   private static void m36000() {
      f2000 = new Object[]{0};
   }
}
