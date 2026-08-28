package rw.core;

import KDFzREm.NNIo;
import KDFzREm.NNIp;
import KDFzREm.NNNQb;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NZH;
import KDFzREm.NjL;
import KDFzREm.NxU;
import KDFzREm.Nyl;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.time.Duration;
import org.joml.Matrix4f;
import rw.api.Iface0644;
import rw.api.Iface0659;
import rw.data.Rec0004;
import rw.defs.Enum0089;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.TargetEsp;
import rw.setting.OlpOtr;

public class C0947 extends Base1148<TargetEsp> {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   public static Object[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static String[] f14000;
   private static double[] f15000;
   private static short[] f16000;
   private static float[] f17000;
   private static short[] f18000;
   private static double[] f19000;
   private static String[] f20000;
   private static float[] f21000;
   public Object[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;

   private static void m2000() {
      f20000 = new String[]{"u_projection", "u_view", "texture_in", "depth_texture_in", "inv_mvp"};
      f14000 = new String[]{"u_center", "u_band_y", "u_dir_vel", "u_time", "u_alpha"};
   }

   private static void m8000() {
      f15000 = new double[]{1.0, 0.0};
      f19000 = new double[]{1.0, 20.0, 2.0, 0.5, (float) (Math.PI * 2), Math.PI * 10, Math.PI * 10};
   }

   public C0947(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m18000();
      C1197 var8 = new C1197((Enum0089)Enum0089.f1000[0]);
      this.f22000[0] = var8;
      TextureTarget var9 = new TextureTarget(null, 1, 1, true);
      this.f22000[1] = var9;
      C0830 var10 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f22000[2] = var10;
      C0805 var11 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[1]).m16000((OlpOtr)EspMix.f3000[0]).m18000(4).m20000())
         .m22000((C0830)this.f22000[2])
         .m20000();
      this.f22000[3] = var11;
      Matrix4f var12 = new Matrix4f();
      this.f22000[4] = var12;
      Matrix4f var13 = new Matrix4f();
      this.f22000[5] = var13;
      Matrix4f var14 = new Matrix4f();
      this.f10000[0] = var14;
      OlssInijr var15 = ((OlpOtr)EspMix.f3000[0]).m66000(f20000[0]);
      this.f10000[1] = var15;
      OlssInijr var16 = ((OlpOtr)EspMix.f3000[0]).m66000(f20000[1]);
      this.f10000[2] = var16;
      C1228 var17 = ((OlpOtr)EspMix.f3000[0]).m6000(f20000[2]);
      this.f10000[3] = var17;
      C1228 var18 = ((OlpOtr)EspMix.f3000[0]).m6000(f20000[3]);
      this.f10000[4] = var18;
      OlssInijr var19 = ((OlpOtr)EspMix.f3000[0]).m66000(f20000[4]);
      this.f10000[5] = var19;
      C1233 var20 = ((OlpOtr)EspMix.f3000[0]).m64000(f14000[0]);
      this.f10000[6] = var20;
      C0821 var21 = ((OlpOtr)EspMix.f3000[0]).m32000(f14000[1]);
      this.f10000[7] = var21;
      C1223 var22 = ((OlpOtr)EspMix.f3000[0]).m106000(f14000[2]);
      this.f2000[0] = var22;
      C0821 var23 = ((OlpOtr)EspMix.f3000[0]).m32000(f14000[3]);
      this.f2000[1] = var23;
      C0821 var24 = ((OlpOtr)EspMix.f3000[0]).m32000(f14000[4]);
      this.f2000[2] = var24;
   }

   static {
      ntfClinit();
   }

   private void m18000() {
      if (this.f22000 == null) {
         this.f22000 = new Object[6];
         Object[] var1 = this.f22000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[8];
         Object[] var2 = this.f10000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var3 = this.f2000;
      }
   }

   private static void m32000() {
      f6000 = new Object[]{null, 0.5F, 0.1F, Math.PI * 10};
   }

   public void m46000(Object var1) {
      this.m18000();
      if (var1 instanceof C0138 var2) {
         ((C1197)this.f22000[0]).m48000(((TargetEsp)this.N[f7000[0]]).m16000() ? f15000[0] : f15000[1], (Duration)f6000[f7000[1]], (Iface0659)C1182.f30000[4]);
         ((C1197)this.f22000[0]).m54000();
         if (((C1197)this.f22000[0]).m52000((Enum0089)Enum0089.f1000[1])) {
            return;
         }

         NjL var3 = ((TargetEsp)this.N[1]).m10000();
         if (var3.method_31481() || !IlkOns.m50000(var3)) {
            return;
         }

         this.m54000(var2, var3);
         this.m48000(var2, var3);
      }
   }

   private void m48000(C0138 var1, NjL var2) {
      this.m18000();
      NxU var3 = ((NNuU)this.N[0]).e();
      int var4 = var3.N;
      int var5 = var3.y;
      ((Matrix4f)this.f22000[4]).setOrtho(f8000[0], var4, var5, f8000[1], f8000[2], f21000[0]);
      C0806.m54000((C0830)this.f22000[2], f21000[1], f21000[2], f21000[3], var4, var5, (Integer)((C0998)((TargetEsp)this.N[1]).f1000[5]).i());
      ((Matrix4f)this.f22000[5]).set(var1.m12000()).mul(var1.m26000());
      ((Matrix4f)this.f10000[0]).set((Matrix4f)this.f22000[5]).invert();
      NXi var6 = var1.m24000().y();
      float var7 = (float)(IlkOns.m26000(var2) - var6.M);
      float var8 = (float)(IlkOns.m34000(var2) - var6.B);
      float var9 = (float)(IlkOns.m4000(var2) - var6.Z);
      float var10 = var2.method_17682();
      double var11 = (((NNNwS)((NNuU)this.N[0]).T[4]).field_6012 + ((NNuU)this.N[0]).NK().N(false)) / f19000[1];
      double var13 = var11 % f19000[2] * f19000[3] * f19000[4];
      float var15 = var10 / f21000[4] + f21000[5];
      float var16 = var8 + var10 / f17000[0] + (float)Math.sin(var13) * var15;
      float var17 = (float)Math.cos(var13);
      IlkOns.m96000(((NxU)this.f22000[1]).L());
      IlkOns.m96000(((NxU)this.f22000[1]).i());
      ((C0805)this.f22000[3]).m32000(var8x -> {
         this.m18000();
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(IlkOns.m74000((NxU)this.f22000[1]));
         GlStateManager._activeTexture(33990);
         GlStateManager._bindTexture(IlkOns.m46000((NxU)this.f22000[1]));
         ((OlssInijr)this.f10000[1]).m18000((Matrix4f)this.f22000[4]);
         ((OlssInijr)this.f10000[2]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1228)this.f10000[3]).m20000(0);
         ((C1228)this.f10000[4]).m20000(6);
         ((OlssInijr)this.f10000[5]).m18000((Matrix4f)this.f10000[0]);
         ((C1233)this.f10000[6]).m16000(var7, var8, var9);
         ((C0821)this.f10000[7]).m20000(var16);
         ((C1223)this.f2000[0]).m18000(var17 > f17000[1] ? f17000[2] : f17000[3], Math.abs(var17));
         ((C0821)this.f2000[1]).m20000((float)(var11 % f19000[5]));
         ((C0821)this.f2000[2]).m20000(((C1197)this.f22000[0]).m44000().floatValue());
      });
   }

   private void m54000(C0138 var1, NjL var2) {
      this.m18000();
      NxU var3 = ((NNuU)this.N[0]).e();
      C1240.m22000();
      IlkOns.m66000((NxU)this.f22000[1], var3.N, var3.y);
      NNS var4 = ((NNNQb)((NNuU)this.N[0]).B[2]).Z;
      Nyl var5 = ((NNNQb)((NNuU)this.N[0]).B[2]).z;
      NZH var6 = ((NNNQb)((NNuU)this.N[f29000[0]]).B[f29000[1]]).B.N;
      NNIp var7 = ((NNNQb)((NNuU)this.N[f29000[2]]).B[f29000[3]]).u.L();
      NXi var8 = var1.m24000().y();
      NNIo var9 = new NNIo();
      var9.L().N().mul(var1.m26000());
      RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((NxU)this.f22000[1]).L(), 0, ((NxU)this.f22000[1]).i(), f19000[0]);
      OlqOrnin.m20000((NxU)this.f22000[1]);
      ((Iface0644)((NNuU)this.N[0]).Ng())
         .m2000(var2, var6, var8.M, var8.B, var8.Z, var1.m20000().N(((NNNZg)((NNuU)this.N[0]).T[3]).method_54719().N(var2)), var9, var4);
      IlkOns.m94000((NxU)this.f22000[1], (boolean)1);
      var5.N();
      var7.u();
      OlqOrnin.m2000();
      IlkOns.m94000(var3, (boolean)1);
      GlStateManager._depthFunc(515);
      C1240.m20000();
   }

   private static void m64000() {
      f12000 = new short[]{0, 0, 1, 2, 4096, 1024, 2, 1};
      f13000 = new short[]{0, 2, 3, 4, 5, 0};
      f28000 = new short[]{0, 1, 0, 2, 0, 3};
      f16000 = new short[]{0, 4};
      f24000 = new short[]{0, 5, 0, 6, 0, 7};
      f26000 = new short[]{0, 0, 0, 1, 0, 2, 0};
      f7000 = new short[]{1, 0};
      f25000 = new short[]{4, 0, 0, 1, 1};
      f23000 = new short[]{0, 1, 0};
      f4000 = new short[]{2, 0, 2};
      f29000 = new short[]{0, 2, 0, 2};
      f11000 = new short[]{1, 1};
      f27000 = new short[]{1, 0, 0};
      f1000 = new short[]{3, 1};
      f9000 = new short[]{515, 0, 4, 2};
      f18000 = new short[]{1, 5, 5, 0, 5};
      f3000 = new short[]{0, 4, 0, 1, 1, 3};
      f30000 = new short[]{1, 1, 1, 4, 2, 3, 3, 4};
      f5000 = new short[]{5, 0, 6, 7, 0, 1, 2, 0};
   }

   private static void m70000() {
      f8000 = new float[]{0.0F, 0.0F, -1.0F};
      f21000 = new float[]{1000.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.1F};
      f17000 = new float[]{2.0F, 0.0F, 1.0F, -1.0F, 0.5F, 0.1F};
   }
}
