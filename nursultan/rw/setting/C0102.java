package rw.setting;

import rw.api.Iface0597;
import rw.core.C0804;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0862;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.OlssInijr;
import rw.gui.EspMix;

public class C0102 implements Iface0597<C0862> {
   private static short[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   public static Object[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static String[] f13000;

   private static void m4000() {
      f12000 = new short[]{3, 5, 3, 6, 3, 0, 3, 1};
      f10000 = new short[]{3, 2, 3};
      f11000 = new short[]{3, 3};
      f6000 = new short[]{4, 0, 2};
      f7000 = new short[]{3, 4, 3, 3, 1};
      f1000 = new short[]{0, 1, 5, 6, 0, 1, 4, 4};
      f5000 = new short[]{2, 2, 3, 3, 4};
   }

   public C0102(C0830 var1, float[] var2, float var3) {
      this.m30000();
      OlssInijr var8 = ((OlpOtr)EspMix.f49000[3]).m66000(f13000[0]);
      this.f4000[5] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f49000[3]).m66000(f13000[1]);
      this.f4000[6] = var9;
      C1228 var10 = ((OlpOtr)EspMix.f49000[3]).m6000(f13000[2]);
      this.f8000[0] = var10;
      C1223 var11 = ((OlpOtr)EspMix.f49000[3]).m106000(f13000[3]);
      this.f8000[1] = var11;
      C1223 var12 = ((OlpOtr)EspMix.f49000[3]).m106000(f13000[4]);
      this.f8000[2] = var12;
      C1228 var13 = ((OlpOtr)EspMix.f49000[3]).m6000(f13000[5]);
      this.f8000[f11000[0]] = var13;
      C0804 var14 = ((OlpOtr)EspMix.f49000[f11000[1]]).m76000(f13000[6]);
      this.f8000[4] = var14;
      this.f4000[0] = var1;
      Float var16 = var2[0];
      this.f4000[2] = var16;
      Float var17 = var2[1];
      this.f4000[3] = var17;
      Float var18 = var3;
      this.f4000[4] = var18;
      C0805 var19 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f49000[3]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f4000[1] = var19;
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f3000 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
      f2000 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F};
   }

   private void m30000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[7];
         Object[] var1 = this.f4000;
         var1[2] = f2000[3];
         var1[3] = f2000[4];
         var1[4] = f2000[5];
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[5];
         Object[] var2 = this.f8000;
      }
   }

   private static void m34000() {
      f9000 = new Object[]{null, null, 0};
   }

   public void m38000(C0862 var1) {
      C0806.m24000((C0830)this.f4000[0], f3000[0], f3000[1], f3000[2], var1.m24000(), var1.m32000(), -1);
      ((C0805)this.f4000[1]).m32000(var2 -> {
         ((OlssInijr)this.f4000[5]).m18000(var1.m58000());
         ((OlssInijr)this.f4000[6]).m18000(var1.m8000());
         ((C1228)this.f8000[0]).m20000(0);
         ((C1223)this.f8000[1]).m18000((Float)this.f4000[4] / var1.m42000(), (Float)this.f4000[4] / var1.m46000());
         ((C1223)this.f8000[2]).m18000((Float)this.f4000[2], (Float)this.f4000[3]);
         ((C1228)this.f8000[3]).m20000(var1.m30000() - 1);
         ((C0804)this.f8000[4]).m16000(var1.m18000());
      });
   }

   private static void m42000() {
      f13000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size", "direction", "radius", "weights"};
   }
}
