package rw.gui;

import KDFzREm.NNBK;
import KDFzREm.NNIo;
import KDFzREm.NNIp;
import KDFzREm.NNNQb;
import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NZH;
import KDFzREm.NbK;
import KDFzREm.NxU;
import KDFzREm.Nyl;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.function.Consumer;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL13;
import rw.NursultanClient;
import rw.api.Iface0601;
import rw.api.Iface0644;
import rw.core.Base0748;
import rw.core.C0011;
import rw.core.C0012;
import rw.core.C0138;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0812;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0844;
import rw.core.C0846;
import rw.core.C0848;
import rw.core.C0856;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1240;
import rw.core.C1246;
import rw.core.IlksOmts;
import rw.core.KrHa;
import rw.core.OlqOrnin;
import rw.core.OlssInijr;
import rw.data.Rec0004;
import rw.setting.C0099;
import rw.setting.C0100;
import rw.setting.C0105;
import rw.setting.C0122;
import rw.setting.OlpOtr;

public class GuiManager {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static float[] f20000;
   private static String[] f21000;
   public Object[] f22000;
   private static short[] f23000;
   private static String[] f24000;
   private static short[] f25000;
   private static float[] f26000;
   public Object[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   public Object[] f30000;
   public static Object[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static float[] f34000;
   public Object[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   private static float[] f41000;
   private static short[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   private static double[] f45000;

   private static void m2000() {
      f45000 = new double[]{1.0, 0.0, 2.0, Math.PI * 2, 2.0, 2.0};
   }

   private void m6000(C0856 var1) {
      int var2 = ((NNuU)this.f22000[0]).Nt().U();
      int var3 = ((NNuU)this.f22000[0]).Nt().E();
      var1.m34000(var2).m2000(var3).m44000(var2).m38000(var3);
      var1.m26000().set(IlkOns.m10000());
   }

   private C0012 m18000() {
      return KrHa.m46000(() -> this.m42000(((NNuU)this.f22000[0]).e().N), () -> this.m42000(((NNuU)this.f22000[0]).e().y), false);
   }

   private C0012 m24000() {
      return KrHa.m2000(() -> ((NNuU)this.f22000[0]).e().N / 2, () -> ((NNuU)this.f22000[0]).e().y / 2);
   }

   public GuiManager(GuiElement var1) {
      this.m62000();
      NNuU var8 = NNuU.Nq();
      this.f22000[0] = var8;
      TextureTarget var9 = new TextureTarget(null, 1, 1, true);
      this.f22000[1] = var9;
      TextureTarget var10 = new TextureTarget(null, 1, 1, true);
      this.f22000[2] = var10;
      FloatBuffer var11 = BufferUtils.createFloatBuffer(7);
      this.f22000[3] = var11;
      C0830 var12 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f22000[4] = var12;
      C0856 var13 = new C0856();
      this.f35000[0] = var13;
      C0012 var14 = this.m24000();
      this.f35000[1] = var14;
      C0012 var15 = this.m18000();
      this.f27000[0] = var15;
      C0012 var16 = this.m18000();
      this.f27000[1] = var16;
      IlksOmts var17 = IlksOmts.<C0856>m22000()
         .m18000(new C0099((C0830)this.f22000[4]))
         .m28000((C0012)this.f35000[1])
         .m50000(this::m114000)
         .m32000(new rw.setting.C0098((C0830)this.f22000[4]))
         .m4000(((NNuU)this.f22000[0])::e)
         .m10000((C0012)this.f35000[1])
         .m46000(33990, this::m114000)
         .m32000(new C0105((C0830)this.f22000[4], this::m80000))
         .m4000(((NNuU)this.f22000[0])::e)
         .m50000(this::m114000)
         .m52000();
      this.f27000[2] = var17;
      Integer var18 = -1;
      this.f27000[4] = var18;
      C0805 var19 = this.m102000((OlpOtr)EspMix.f7000[2], true);
      this.f27000[5] = var19;
      OlssInijr var20 = ((OlpOtr)EspMix.f7000[2]).m66000(f24000[0]);
      this.f27000[6] = var20;
      OlssInijr var21 = ((OlpOtr)EspMix.f7000[2]).m66000(f24000[1]);
      this.f27000[7] = var21;
      C1228 var22 = ((OlpOtr)EspMix.f7000[2]).m6000(f24000[2]);
      this.f30000[0] = var22;
      C1228 var23 = ((OlpOtr)EspMix.f7000[2]).m6000(f24000[3]);
      this.f30000[1] = var23;
      C1228 var24 = ((OlpOtr)EspMix.f7000[2]).m6000(f24000[4]);
      this.f30000[2] = var24;
      C1223 var25 = ((OlpOtr)EspMix.f7000[2]).m106000(f24000[5]);
      this.f8000[0] = var25;
      C1223 var26 = ((OlpOtr)EspMix.f7000[2]).m106000(f24000[6]);
      this.f8000[1] = var26;
      this.f8000[2] = var1;
      C1013 var28 = (C1013)var1.f2000[5];
      this.f8000[3] = var28;
      C1013 var29 = (C1013)var1.f22000[0];
      this.f4000[0] = var29;
      C0846 var2 = new C0846(f24000[7], true, this::m84000, var0 -> {});
      C0846 var3 = new C0846(f21000[0], false, this::m116000, var0 -> {});
      C1000 var30 = C0122.m18000(var1, f21000[1], var2, var3);
      this.f4000[6] = var30;
      ((C1000)this.f4000[6]).N(var1x -> ((C1013)this.f8000[3]).m14000());
      C0991 var31 = (C0991)C0122.m26000(var1, f21000[2], true).N(var2x -> (boolean)(((C1013)this.f8000[3]).m14000() && var2.U() ? 1 : 0));
      this.f4000[1] = var31;
      C0991 var32 = (C0991)C0122.m26000(var1, f21000[3], true).N(var2x -> (boolean)(((C1013)this.f8000[3]).m14000() && var3.U() ? 1 : 0));
      this.f4000[2] = var32;
      C0998 var33 = (C0998)C0122.m6000(var1, f21000[4], -12025345).N(var1x -> ((C1013)this.f8000[3]).m14000());
      this.f4000[3] = var33;
      C0988 var34 = (C0988)C0122.m12000(var1, f21000[5], f26000[0], f26000[1], f26000[2], f26000[3])
         .N(var2x -> (boolean)(var3.U() && ((C1013)this.f8000[3]).m14000() ? 1 : 0));
      this.f4000[5] = var34;
      C0998 var35 = (C0998)C0122.m6000(var1, f21000[6], -12025345).N(var1x -> ((C1013)this.f4000[0]).m14000());
      this.f4000[4] = var35;
      this.m68000();
   }

   static {
      ntfClinit();
   }

   private static void m36000() {
      f31000 = new Object[]{6.0F, 2};
   }

   private int m42000(int var1) {
      return Math.max(1, (var1 + 2 - 1) / 2);
   }

   private IlksOmts<C0856> m46000() {
      int var1 = Math.max(1, ((Float)((C0988)this.f4000[5]).i()).intValue());
      if ((IlksOmts)this.f27000[3] == null || (Integer)this.f27000[4] != var1) {
         Integer var6 = var1;
         this.f27000[4] = var6;
         IlksOmts var7 = this.m100000(var1);
         this.f27000[3] = var7;
      }

      return (IlksOmts<C0856>)this.f27000[3];
   }

   private double m54000() {
      return !((C0991)this.f4000[2]).i() ? f45000[1] : -(NursultanClient.m74000().m10000() + ((NNuU)this.f22000[0]).NK().N(true));
   }

   private void m62000() {
      if (this.f22000 == null) {
         this.f22000 = new Object[5];
         Object[] var1 = this.f22000;
      }

      if (this.f35000 == null) {
         this.f35000 = new Object[2];
         Object[] var2 = this.f35000;
      }

      if (this.f27000 == null) {
         this.f27000 = new Object[8];
         Object[] var3 = this.f27000;
         var3[4] = 0;
      }

      if (this.f30000 == null) {
         this.f30000 = new Object[3];
         Object[] var4 = this.f30000;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var5 = this.f8000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[8];
         Object[] var6 = this.f4000;
         var6[7] = false;
      }
   }

   private void m68000() {
      ((FloatBuffer)this.f22000[3]).clear();

      for (int var1 = 0; var1 <= f26000[6]; var1++) {
         ((FloatBuffer)this.f22000[3]).put((float)this.m118000(var1, f26000[7]));
      }

      ((FloatBuffer)this.f22000[3]).rewind();
   }

   private boolean m80000() {
      return (Boolean)((C0991)this.f4000[1]).i();
   }

   private void m84000(NNBK var1, int var2, int var3, int var4) {
      this.m98000(var2, var3, var4);
      ((IlksOmts)this.f27000[2]).m8000((C0856)this.f35000[0]);
   }

   private static void m92000() {
      f16000 = new short[]{0, 1, 2};
      f11000 = new short[]{3, 2};
      f39000 = new short[]{4096, 1024, 4, 0, 1};
      f7000 = new short[]{0, 1, 4, 1, 4};
      f25000 = new short[]{0, 1, 4, 0};
      f18000 = new short[]{2, 4, 2};
      f13000 = new short[]{5, 2, 6, 2};
      f12000 = new short[]{7, 2, 0, 2, 1};
      f42000 = new short[]{2, 2, 2, 0, 2};
      f19000 = new short[]{1, 2, 5};
      f40000 = new short[]{3, 0, 0, 6, 6, 1, 2};
      f5000 = new short[]{3, 5, 4, 7, 3, 0};
      f23000 = new short[]{0, 1, 2};
      f29000 = new short[]{0, 2, 0, 2, 0, 2};
      f28000 = new short[]{0, 2, 2, 1, 1, 1, 3, 2};
      f9000 = new short[]{2, 7, 0, 0, 3, 1, 515, 7};
      f1000 = new short[]{0, 0};
      f3000 = new short[]{3, 3, 6, 0, 0, 5, 6};
      f37000 = new short[]{7, 4, 2, 0, 5};
      f38000 = new short[]{0, 5, 3, 4, 4, 3};
      f17000 = new short[]{3, 4};
      f44000 = new short[]{0, 1, 0, 4, 4, 0, 3, 3};
      f36000 = new short[]{3, 0, 5, 3, 0, 0, 3};
      f32000 = new short[]{0, 2, 0, 1, 0, 0};
      f15000 = new short[]{1, 0, 3, 4, 4, 0, 0, 0};
      f2000 = new short[]{0, 1};
      f33000 = new short[]{2, 1};
      f43000 = new short[]{0, 1};
      f6000 = new short[]{2, 0, 1};
      f14000 = new short[]{0, 5, 0, 3, 3, 3, 3, 3};
   }

   private void m94000(C0805 var1, OlssInijr var2, OlssInijr var3, float var4, float var5, float var6, float var7, int var8, Consumer<OlpOtr> var9) {
      C0806.m54000((C0830)this.f22000[4], var4, var5, f41000[2], var6, var7, var8);
      var1.m32000(var3x -> {
         var2.m18000(IlkOns.m10000());
         var3.m18000(RenderSystem.getModelViewMatrix());
         var9.accept(var3x);
      });
   }

   private C0856 m98000(int var1, int var2, int var3) {
      ((C0856)this.f35000[0])
         .m34000(var2)
         .m2000(var3)
         .m44000(var2)
         .m38000(var3)
         .m48000(var1)
         .m32000((Float)((C0988)this.f4000[5]).i())
         .m46000((FloatBuffer)this.f22000[3]);
      ((C0856)this.f35000[0]).m26000().set(IlkOns.m10000());
      ((C0856)this.f35000[0]).m42000().set((Matrix4f)IlkOns.f9000[3]);
      return (C0856)this.f35000[0];
   }

   private IlksOmts<C0856> m100000(int var1) {
      C0812 var2 = IlksOmts.m22000();
      var2.m18000(new C0844((C0830)this.f22000[4]))
         .m30000(this::m110000)
         .m30000(var0 -> GL13.glClearColor(f34000[2], f34000[3], f34000[4], f20000[0]))
         .m28000((C0012)this.f27000[0])
         .m50000(this::m114000);
      C0012[] var3 = new C0012[]{(C0012)this.f27000[1], (C0012)this.f27000[0]};
      int var4 = this.m42000(var1 + 2);

      int var5;
      for (var5 = 0; var4 >= 1; var4 /= 2) {
         C0012 var6 = var3[var5 % 2];
         C0012 var7 = var3[(var5 + 1) % 2];
         var2.m18000(new C0848((C0830)this.f22000[4], var4))
            .m30000(var0 -> GL13.glClearColor(f41000[3], f41000[4], f34000[0], f34000[1]))
            .m28000(var6)
            .m10000(var7);
         var5++;
      }

      C0012 var9 = var3[(var5 + 1) % 2];
      return var2.m18000(new C0100((C0830)this.f22000[4], this::m54000))
         .m30000(this::m6000)
         .m4000(((NNuU)this.f22000[0])::e)
         .m10000(var9)
         .m46000(33990, this::m114000)
         .m52000();
   }

   private C0805 m102000(OlpOtr var1, boolean var2) {
      return C0805.m30000()
         .m16000(C0825.m2000().m22000(var2 ? (C1246)C1234.f1000[0] : (C1246)C1234.f1000[3]).m16000(var1).m18000(4).m20000())
         .m22000((C0830)this.f22000[4])
         .m20000();
   }

   public void m104000(C0138 var1) {
      Boolean var17 = false;
      this.f4000[7] = var17;
      if (((C1013)this.f8000[3]).m14000() || ((C1013)this.f4000[0]).m14000()) {
         NxU var2 = ((NNuU)this.f22000[0]).e();
         C1240.m22000();
         IlkOns.m66000((NxU)this.f22000[1], var2.N, var2.y);
         IlkOns.m66000((NxU)this.f22000[2], var2.N, var2.y);
         NNS var3 = ((NNNQb)((NNuU)this.f22000[0]).B[2]).Z;
         Nyl var4 = ((NNNQb)((NNuU)this.f22000[0]).B[2]).z;
         NZH var5 = ((NNNQb)((NNuU)this.f22000[0]).B[2]).B.N;
         NNIp var6 = ((NNNQb)((NNuU)this.f22000[0]).B[2]).u.L();
         NXi var7 = var1.m24000().y();
         NNIo var8 = new NNIo();
         var8.L().N().mul(var1.m26000());
         ((NxU)this.f22000[2]).N(var2);
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((NxU)this.f22000[1]).L(), 0, ((NxU)this.f22000[1]).i(), f45000[0]);
         OlqOrnin.m20000((NxU)this.f22000[1]);

         for (NbK var10 : ((NNNZg)NNuU.Nq().T[3]).M()) {
            if (IlkOns.m50000(var10)) {
               for (Base0748 var12 : (List)((C1003)((GuiElement)this.f8000[2]).f5000[2]).i()) {
                  if (var12.test(var10)) {
                     Boolean var18 = true;
                     this.f4000[7] = var18;
                     ((Iface0644)((NNuU)this.f22000[0]).Ng())
                        .m2000(var10, var5, var7.M, var7.B, var7.Z, var1.m20000().N(((NNNZg)((NNuU)this.f22000[0]).T[3]).method_54719().N(var10)), var8, var3);
                  }
               }
            }
         }

         IlkOns.m94000((NxU)this.f22000[1], (boolean)1);
         var4.N();
         var6.u();
         OlqOrnin.m2000();
         IlkOns.m94000(var2, (boolean)1);
         GlStateManager._depthFunc(515);
         C1240.m20000();
      }
   }

   public void m106000(NNBK var1) {
      if ((Boolean)this.f4000[7]) {
         int var2 = ((NNuU)this.f22000[0]).Nt().U();
         int var3 = ((NNuU)this.f22000[0]).Nt().E();
         int var4 = (Integer)((C0998)this.f4000[f3000[0]]).i();
         GlStateManager._depthMask((boolean)0);
         if (((C1013)this.f8000[f3000[1]]).m14000()) {
            ((Iface0601)((C1013)((C1000)this.f4000[f3000[2]]).i())).m2000(var1, var4, var2, var3);
         }

         IlkOns.m94000(((NNuU)this.f22000[f3000[3]]).e(), (boolean)1);
         if (((C1013)this.f4000[f3000[4]]).m14000()) {
            this.m94000(
               (C0805)this.f27000[f3000[5]],
               (OlssInijr)this.f27000[f3000[6]],
               (OlssInijr)this.f27000[7],
               f26000[4],
               f26000[5],
               var2,
               var3,
               (Integer)((C0998)this.f4000[4]).i(),
               var3x -> {
                  this.m122000(33984, IlkOns.m74000((NxU)this.f22000[1]));
                  this.m122000(33990, IlkOns.m46000((NxU)this.f22000[2]));
                  this.m122000(33991, IlkOns.m46000((NxU)this.f22000[1]));
                  ((C1228)this.f30000[0]).m20000(0);
                  ((C1228)this.f30000[1]).m20000(6);
                  ((C1228)this.f30000[2]).m20000(7);
                  ((C1223)this.f8000[0]).m18000(f20000[1] / var2, f20000[2] / var3);
                  ((C1223)this.f8000[1]).m18000(f20000[3], ((NNNYO)((NNuU)this.f22000[0]).i[5]).P());
               }
            );
         }

         GlStateManager._depthMask((boolean)0);
      }
   }

   private void m110000(C0856 var1) {
      int var2 = this.m42000(var1.m16000());
      int var3 = this.m42000(var1.m20000());
      var1.m34000(var2).m2000(var3).m44000(var2).m38000(var3);
      var1.m26000().setOrtho(f10000[0], var2, var3, f10000[1], f41000[0], f41000[1]);
   }

   private int m114000() {
      return IlkOns.m74000((NxU)this.f22000[1]);
   }

   private void m116000(NNBK var1, int var2, int var3, int var4) {
      this.m98000(var2, var3, var4).m32000((Float)((C0988)this.f4000[5]).i());
      this.m46000().m8000((C0856)this.f35000[0]);
   }

   private double m118000(float var1, float var2) {
      double var3 = Math.pow(var2, f45000[2]);
      double var5 = org.joml.Math.invsqrt(f45000[3] * var3);
      return var5 * Math.exp(-Math.pow(var1, f45000[4]) / (f45000[5] * var3));
   }

   private void m122000(int var1, int var2) {
      GlStateManager._activeTexture(var1);
      GlStateManager._bindTexture(var2);
   }

   private static void m130000() {
      f24000 = new String[]{"u_projection", "u_view", "texture_in", "depth_in", "depth_entity_in", "texel_size", "near_far", "blur"};
      f21000 = new String[]{"waves", "shader-effect", "glow-outline", "pulse", "glow-color", "radius", "chams-color"};
   }

   private static void m136000() {
      f26000 = new float[]{6.0F, 6.0F, 32.0F, 1.0F, 0.0F, 0.0F, 6.0F, 3.0F};
      f10000 = new float[]{0.0F, 0.0F};
      f41000 = new float[]{-1.0F, 1.0F, 0.0F, -1.0F, -1.0F};
      f34000 = new float[]{-1.0F, 1.0F, -1.0F, -1.0F, -1.0F};
      f20000 = new float[]{1.0F, 3.0F, 3.0F, 0.05F, 6.0F};
   }
}
