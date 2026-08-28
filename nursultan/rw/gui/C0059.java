package rw.gui;

import KDFzREm.NNuU;
import KDFzREm.NxU;
import KDFzREm.pz;
import com.mojang.blaze3d.pipeline.TextureTarget;
import org.joml.Matrix4f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0011;
import rw.core.C0138;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0988;
import rw.core.C1234;
import rw.core.C1239;
import rw.core.C1246;
import rw.core.OlssInijr;
import rw.data.Rec0004;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0122;
import rw.setting.OlpOtr;

@AnnotationDefault(
   L = "Saturation",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class C0059 extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;
   private static float[] f4000;
   public Object[] f5000;

   private void m4000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[3];
         Object[] var1 = this.f5000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[7];
         Object[] var2 = this.f1000;
      }
   }

   public C0059() {
      this.m4000();
      C0988 var5 = C0122.m12000(this, f3000[0], f4000[0], f4000[1], f4000[2], f4000[3]);
      this.f5000[0] = var5;
      TextureTarget var6 = new TextureTarget(null, 1, 1, false);
      this.f5000[1] = var6;
      C0805 var7 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f5000[6]).m18000(4).m20000())
         .m22000(C0830.m42000((Rec0004)C0011.f5000[2], 256, 16))
         .m20000();
      this.f5000[2] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f5000[6]).m66000(f3000[1]);
      this.f1000[0] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f5000[6]).m66000(f3000[2]);
      this.f1000[1] = var9;
      C1239 var10 = ((OlpOtr)EspMix.f5000[6]).m10000(f3000[3]);
      this.f1000[2] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f5000[6]).m10000(f3000[4]);
      this.f1000[3] = var11;
      C0821 var12 = ((OlpOtr)EspMix.f5000[6]).m32000(f3000[5]);
      this.f1000[4] = var12;
      C0821 var13 = ((OlpOtr)EspMix.f5000[6]).m32000(f3000[6]);
      this.f1000[5] = var13;
      Matrix4f var14 = new Matrix4f();
      this.f1000[6] = var14;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new String[]{"saturation", "u_projection", "u_view", "texture_in", "depth_texture_in", "alpha", "sky_protection"};
   }

   private static void m10000() {
      f4000 = new float[]{0.0F, -1.0F, 3.0F, 0.1F, 0.0F, 0.0F, -1.0F, 1.0F};
      f2000 = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 0.0F};
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m10000(C0138 var1) {
      this.m4000();
      NxU var2 = ((NNuU)this.y[0]).e();
      ((Matrix4f)this.f1000[6]).setOrtho(f4000[4], var2.N, var2.y, f4000[5], f4000[6], f4000[7]);
      IlkOns.m66000((NxU)this.f5000[1], var2.N, var2.y);
      IlkOns.m82000(var2, (NxU)this.f5000[1]);
      IlkOns.m94000(var2, (boolean)0);
      C0806.m54000(((C0805)this.f5000[2]).m18000(), f2000[0], f2000[1], f2000[2], var2.N, var2.y, -1);
      ((C0805)this.f5000[2]).m32000(var2x -> {
         this.m4000();
         ((OlssInijr)this.f1000[0]).m18000((Matrix4f)this.f1000[6]);
         ((OlssInijr)this.f1000[1]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1239)this.f1000[2]).m8000(((pz)((NxU)this.f5000[1]).L()).N());
         ((C1239)this.f1000[3]).m4000(33985, IlkOns.m46000(var2));
         ((C0821)this.f1000[4]).m20000(-(Float)((C0988)this.f5000[0]).i());
         ((C0821)this.f1000[5]).m20000(NursultanClient.m88000().m142000().U() ? f2000[3] : f2000[4]);
      });
   }
}
