package rw.setting;

import rw.api.Iface0597;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0862;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.OlssInijr;
import rw.gui.EspMix;

public class Invprojection implements Iface0597<C0862> {
   private static String[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   public Object[] f5000;
   public Object[] f6000;

   private static void m10000() {
      f2000 = new Object[]{0, 6};
   }

   public Invprojection(C0830 var1) {
      this.m30000();
      OlssInijr var6 = ((OlpOtr)EspMix.f6000[1]).m66000(f1000[0]);
      this.f6000[0] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f6000[1]).m66000(f1000[1]);
      this.f6000[1] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f6000[1]).m66000(f1000[2]);
      this.f6000[2] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f6000[1]).m66000(f1000[3]);
      this.f6000[3] = var9;
      C0821 var10 = ((OlpOtr)EspMix.f6000[1]).m32000(f1000[4]);
      this.f6000[4] = var10;
      C1228 var11 = ((OlpOtr)EspMix.f6000[1]).m6000(f1000[5]);
      this.f6000[5] = var11;
      C1228 var12 = ((OlpOtr)EspMix.f6000[1]).m6000(f1000[6]);
      this.f6000[6] = var12;
      this.f5000[0] = var1;
      C0805 var14 = C0805.m30000()
         .m16000(C0825.m2000().m22000(((C1246)C1234.f1000[0]).m2000().m16000()).m16000((OlpOtr)EspMix.f6000[1]).m18000(f4000[0]).m20000())
         .m22000(var1)
         .m20000();
      this.f5000[1] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f4000 = new byte[]{4, 6, 2, 7, 2, 6};
   }

   private static void m24000() {
      f3000 = new float[]{0.0F, 0.0F, 1.0F};
   }

   private void m30000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f4000[2]];
         Object[] var1 = this.f5000;
      }

      if (this.f6000 == null) {
         this.f6000 = new Object[f4000[3]];
         Object[] var2 = this.f6000;
      }
   }

   public void m32000(C0862 var1) {
      C0806.m54000((C0830)this.f5000[0], f3000[0], f3000[1], f3000[2], var1.m24000(), var1.m32000(), var1.m20000());
      ((C0805)this.f5000[1]).m32000(var2 -> {
         ((OlssInijr)this.f6000[0]).m18000(var1.m58000());
         ((OlssInijr)this.f6000[1]).m18000(var1.m8000());
         ((C1228)this.f6000[5]).m20000(0);
         ((C1228)this.f6000[6]).m20000(f4000[1]);
         ((OlssInijr)this.f6000[2]).m18000(var1.m2000());
         ((OlssInijr)this.f6000[3]).m18000(var1.m44000());
         ((C0821)this.f6000[4]).m20000(var1.m34000());
      });
   }

   private static void m44000() {
      f1000 = new String[]{"u_projection", "u_view", "invProjection", "invView", "dist", "texture_in", "depth_texture_in"};
   }
}
