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

public class C0111 implements Iface0597<OllkkkIrq> {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   public Object[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static float[] f13000;

   private static void m6000() {
      f5000 = new String[]{"u_projection", "u_view", "inv_view_proj", "aurora_a", "aurora_b", "params"};
   }

   public C0111(SkyCustomization var1, C0830 var2) {
      this.m38000();
      Matrix4f var7 = new Matrix4f();
      this.f4000[1] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f13000[0]).m66000(f5000[0]);
      this.f4000[2] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f13000[0]).m66000(f5000[1]);
      this.f4000[3] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f13000[f12000[0]]).m66000(f5000[2]);
      this.f4000[f12000[1]] = var10;
      C1250 var11 = ((OlpOtr)EspMix.f13000[f12000[2]]).m94000(f5000[3]);
      this.f4000[f12000[3]] = var11;
      C1250 var12 = ((OlpOtr)EspMix.f13000[0]).m94000(f5000[4]);
      this.f4000[6] = var12;
      C1250 var13 = ((OlpOtr)EspMix.f13000[0]).m94000(f5000[5]);
      this.f4000[7] = var13;
      this.f3000[0] = var1;
      this.f3000[1] = var2;
      C0805 var16 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f13000[0]).m18000(4).m20000())
         .m22000(var2)
         .m20000();
      this.f4000[0] = var16;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f8000 = new short[]{1, 0, 2, 0, 3};
      f12000 = new short[]{0, 4, 0, 5};
      f1000 = new short[]{0, 6, 0, 7};
      f11000 = new short[]{0, 1};
      f6000 = new short[]{3, 0, 0, 0, 0, 1, 1};
      f9000 = new short[]{0, 0, 2, 1, 3};
      f10000 = new short[]{3, 4, 5, 0, 6};
      f2000 = new short[]{0, 7, 0, 0, 0};
   }

   private static void m18000() {
      f7000 = new byte[]{4, -1, 2, 8};
   }

   private static void m24000() {
      f13000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   public void m36000(OllkkkIrq var1) {
      int var2 = ((SkyCustomization)this.f3000[0]).m26000().m126000();
      int var3 = ((SkyCustomization)this.f3000[0]).m26000().m76000();
      ((Matrix4f)this.f4000[1]).setOrtho(f13000[0], var2, var3, f13000[1], f13000[2], f13000[3]);
      C0806.m54000((C0830)this.f3000[1], f13000[4], f13000[5], f13000[6], var2, var3, -1);
      float var4 = ((SkyCustomization)this.f3000[0]).m68000(var1.m4000().N(true));
      ((C0805)this.f4000[0])
         .m32000(
            var3x -> {
               ((OlssInijr)this.f4000[2]).m18000((Matrix4f)this.f4000[1]);
               ((OlssInijr)this.f4000[3]).m18000((Matrix4f)IlkOns.f9000[3]);
               ((OlssInijr)this.f4000[4]).m18000(var1.m18000());
               ((C1250)this.f4000[5]).m22000((Integer)((SkyCustomization)this.f3000[0]).m32000().i());
               ((C1250)this.f4000[6]).m22000((Integer)((SkyCustomization)this.f3000[0]).m46000().i());
               ((C1250)this.f4000[7])
                  .m18000(
                     var4,
                     (Float)((SkyCustomization)this.f3000[0]).m40000().i(),
                     (Float)((SkyCustomization)this.f3000[0]).m12000().i(),
                     (Float)((SkyCustomization)this.f3000[0]).m10000().i()
                  );
            }
         );
   }

   private void m38000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[8];
         Object[] var2 = this.f4000;
      }
   }
}
