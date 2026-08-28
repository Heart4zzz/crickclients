package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0850 implements Iface0597<C0862> {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;
   public static Object[] f4000;

   private static void m4000() {
      f2000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   }

   public C0850(C0830 var1, float var2) {
      this.m40000();
      OlssInijr var7 = ((OlpOtr)EspMix.f35000[3]).m66000(f3000[0]);
      this.f1000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f35000[3]).m66000(f3000[1]);
      this.f1000[4] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f35000[3]).m6000(f3000[2]);
      this.f1000[5] = var9;
      C1223 var10 = ((OlpOtr)EspMix.f35000[3]).m106000(f3000[3]);
      this.f1000[6] = var10;
      this.f1000[0] = var1;
      Float var12 = var2;
      this.f1000[2] = var12;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f35000[3]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f1000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new Object[]{0};
   }

   private static void m24000() {
      f3000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size"};
   }

   public void m36000(C0862 var1) {
      C0806.m24000((C0830)this.f1000[0], f2000[0], f2000[1], f2000[2], var1.m24000(), var1.m32000(), -1);
      ((C0805)this.f1000[1]).m32000(var2 -> {
         ((OlssInijr)this.f1000[3]).m18000(var1.m58000());
         ((OlssInijr)this.f1000[4]).m18000(var1.m8000());
         ((C1228)this.f1000[5]).m20000(0);
         ((C1223)this.f1000[6]).m18000((Float)this.f1000[2] / var1.m42000(), (Float)this.f1000[2] / var1.m46000());
      });
   }

   private void m40000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[7];
         Object[] var1 = this.f1000;
         var1[2] = f2000[3];
      }
   }
}
