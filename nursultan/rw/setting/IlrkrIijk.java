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

public class IlrkrIijk implements Iface0597<C0862> {
   public Object[] f1000;
   public static Object[] f2000;
   public Object[] f3000;
   private static String[] f4000;
   private static float[] f5000;

   private static void m6000() {
      f4000 = new String[]{"u_projection", "u_view", "invProjection", "invView", "dist", "texture_in", "depth_texture_in"};
   }

   public IlrkrIijk(C0830 var1) {
      this.m24000();
      OlssInijr var6 = ((OlpOtr)EspMix.f5000[0]).m66000(f4000[0]);
      this.f1000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f5000[0]).m66000(f4000[1]);
      this.f1000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f5000[0]).m66000(f4000[2]);
      this.f1000[4] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f5000[0]).m66000(f4000[3]);
      this.f3000[0] = var9;
      C0821 var10 = ((OlpOtr)EspMix.f5000[0]).m32000(f4000[4]);
      this.f3000[1] = var10;
      C1228 var11 = ((OlpOtr)EspMix.f5000[0]).m6000(f4000[5]);
      this.f3000[2] = var11;
      C1228 var12 = ((OlpOtr)EspMix.f5000[0]).m6000(f4000[6]);
      this.f3000[3] = var12;
      this.f1000[0] = var1;
      C0805 var14 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f5000[0]).m18000(4).m20000()).m22000(var1).m20000();
      this.f1000[1] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f5000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   private void m24000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[4];
         Object[] var2 = this.f3000;
      }
   }

   public void m32000(C0862 var1) {
      C0806.m24000((C0830)this.f1000[0], f5000[0], f5000[1], f5000[2], var1.m24000(), var1.m32000(), -1);
      ((C0805)this.f1000[1]).m32000(var2 -> {
         ((OlssInijr)this.f1000[2]).m18000(var1.m58000());
         ((OlssInijr)this.f1000[3]).m18000(var1.m8000());
         ((C1228)this.f3000[2]).m20000(0);
         ((C1228)this.f3000[3]).m20000(6);
         ((OlssInijr)this.f1000[4]).m18000(var1.m2000());
         ((OlssInijr)this.f3000[0]).m18000(var1.m44000());
         ((C0821)this.f3000[1]).m20000(var1.m34000());
      });
   }

   private static void m46000() {
      f2000 = new Object[]{0, 6};
   }
}
