package rw.core;

import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0027 implements Iface0597<IlpOkkIjl> {
   public Object[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   private static String[] f5000;

   private static void m8000() {
      f5000 = new String[]{"u_projection", "u_view", "texture_in", "overlay_in", "texel_size"};
   }

   public C0027(C0830 var1, float var2) {
      this.m42000();
      OlssInijr var7 = ((OlpOtr)EspMix.f35000[4]).m66000(f5000[0]);
      this.f1000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f35000[4]).m66000(f5000[1]);
      this.f1000[4] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f35000[4]).m6000(f5000[2]);
      this.f1000[5] = var9;
      C1228 var10 = ((OlpOtr)EspMix.f35000[4]).m6000(f5000[3]);
      this.f1000[6] = var10;
      C1223 var11 = ((OlpOtr)EspMix.f35000[4]).m106000(f5000[4]);
      this.f1000[7] = var11;
      this.f1000[0] = var1;
      Float var13 = var2;
      this.f1000[2] = var13;
      C0805 var14 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f35000[4]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f1000[1] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f4000 = new byte[]{4, -1, 8, 2, 2};
   }

   private static void m22000() {
      f2000 = new Object[]{0, 1};
   }

   private static void m32000() {
      f3000 = new float[]{0.0F};
   }

   public void m36000(IlpOkkIjl var1) {
      C0806.m32000(
         (C0830)this.f1000[0], var1.m20000(), var1.m70000(), var1.m18000(), var1.m26000(), var1.m44000(), var1.m6000(), var1.m38000(), var1.m10000(), -1
      );
      ((C0805)this.f1000[1]).m32000(var2 -> {
         ((OlssInijr)this.f1000[3]).m18000(var1.m40000());
         ((OlssInijr)this.f1000[4]).m18000(var1.m52000());
         ((C1228)this.f1000[5]).m20000(0);
         ((C1228)this.f1000[6]).m20000(1);
         ((C1223)this.f1000[7]).m18000((Float)this.f1000[2] / var1.m54000(), (Float)this.f1000[2] / var1.m34000());
      });
   }

   private void m42000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[2] = f3000[0];
      }
   }
}
