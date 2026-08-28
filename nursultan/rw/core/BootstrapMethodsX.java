package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class BootstrapMethodsX implements Iface0597<IlpOkkIjl> {
   private static short[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   public Object[] f9000;

   private static void m6000() {
      f4000 = new float[]{0.0F};
   }

   private void m8000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[7];
         Object[] var1 = this.f9000;
         var1[2] = f4000[0];
      }
   }

   public BootstrapMethodsX(C0830 var1, float var2) {
      this.m8000();
      OlssInijr var7 = ((OlpOtr)EspMix.f35000[3]).m66000(f7000[0]);
      this.f9000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f35000[3]).m66000(f7000[1]);
      this.f9000[4] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f35000[3]).m6000(f7000[2]);
      this.f9000[5] = var9;
      C1223 var10 = ((OlpOtr)EspMix.f35000[3]).m106000(f7000[3]);
      this.f9000[6] = var10;
      this.f9000[0] = var1;
      Float var12 = var2;
      this.f9000[2] = var12;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f35000[3]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f9000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f3000 = new Object[]{0};
   }

   private static void m20000() {
      f2000 = new short[]{3, 3};
      f8000 = new short[]{3, 4, 3, 5, 3};
      f5000 = new short[]{6, 0};
      f6000 = new short[]{2, 3, 3, 1, 0, 1, 3, 4};
      f1000 = new short[]{5, 6, 2, 2};
   }

   private static void m24000() {
      f7000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size"};
   }

   public void m30000(IlpOkkIjl var1) {
      C0806.m32000(
         (C0830)this.f9000[0], var1.m20000(), var1.m70000(), var1.m18000(), var1.m26000(), var1.m44000(), var1.m6000(), var1.m38000(), var1.m10000(), -1
      );
      ((C0805)this.f9000[1]).m32000(var2 -> {
         ((OlssInijr)this.f9000[3]).m18000(var1.m40000());
         ((OlssInijr)this.f9000[4]).m18000(var1.m52000());
         ((C1228)this.f9000[5]).m20000(0);
         ((C1223)this.f9000[6]).m18000((Float)this.f9000[2] / var1.m54000(), (Float)this.f9000[2] / var1.m34000());
      });
   }
}
