package rw.setting;

import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.C1250;
import rw.core.OllkkkIrq;
import rw.core.OlssInijr;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.SkyCustomization;

public class IlkkOttlj implements Iface0597<OllkkkIrq> {
   private static String[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   public Object[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static byte[] f7000;

   private static void m6000() {
      f7000 = new byte[]{4, -1, 4, 6};
   }

   public IlkkOttlj(SkyCustomization var1, C0830 var2) {
      this.m18000();
      Matrix4f var7 = new Matrix4f();
      this.f4000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f7000[0]).m66000(f1000[0]);
      this.f3000[0] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f7000[0]).m66000(f1000[1]);
      this.f3000[1] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f7000[0]).m66000(f1000[2]);
      this.f3000[2] = var10;
      C1250 var11 = ((OlpOtr)EspMix.f7000[0]).m94000(f1000[3]);
      this.f3000[3] = var11;
      C1250 var12 = ((OlpOtr)EspMix.f7000[0]).m94000(f1000[4]);
      this.f3000[4] = var12;
      C1250 var13 = ((OlpOtr)EspMix.f7000[0]).m94000(f1000[5]);
      this.f3000[5] = var13;
      this.f4000[0] = var1;
      this.f4000[1] = var2;
      C0805 var16 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f7000[0]).m18000(f7000[0]).m20000())
         .m22000(var2)
         .m20000();
      this.f4000[2] = var16;
   }

   static {
      ntfClinit();
   }

   private void m18000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f7000[2]];
         Object[] var1 = this.f4000;
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[f7000[3]];
         Object[] var2 = this.f3000;
      }
   }

   private static void m24000() {
      f2000 = new boolean[]{true};
   }

   public void m32000(OllkkkIrq var1) {
      int var2 = ((SkyCustomization)this.f4000[0]).m50000().m126000();
      int var3 = ((SkyCustomization)this.f4000[0]).m50000().m76000();
      ((Matrix4f)this.f4000[3]).setOrtho(f5000[0], var2, var3, f5000[1], f5000[2], f5000[3]);
      C0806.m54000((C0830)this.f4000[1], f5000[4], f5000[5], f5000[6], var2, var3, f7000[1]);
      float var4 = ((SkyCustomization)this.f4000[0]).m68000(var1.m4000().N(true));
      ((C0805)this.f4000[2]).m32000(var3x -> {
         ((OlssInijr)this.f3000[0]).m18000((Matrix4f)this.f4000[3]);
         ((OlssInijr)this.f3000[1]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((OlssInijr)this.f3000[2]).m18000(var1.m18000());
         ((C1250)this.f3000[3]).m22000((Integer)((SkyCustomization)this.f4000[0]).m32000().i());
         ((C1250)this.f3000[4]).m22000((Integer)((SkyCustomization)this.f4000[0]).m46000().i());
         ((C1250)this.f3000[5]).m18000(var4, f6000[0], f6000[1], f6000[2]);
      });
   }

   private static void m34000() {
      f5000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
      f6000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   private static void m40000() {
      f1000 = new String[]{"u_projection", "u_view", "inv_view_proj", "aurora_a", "aurora_b", "params"};
   }
}
