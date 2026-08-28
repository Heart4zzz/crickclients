package rw.gui;

import KDFzREm.CM;
import KDFzREm.Jf;
import KDFzREm.NHS;
import KDFzREm.NNBK;
import KDFzREm.NNIC;
import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NxU;
import KDFzREm.ow;
import KDFzREm.pi;
import KDFzREm.pz;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL33C;
import rw.NursultanClient;
import rw.api.Iface0006;
import rw.api.Iface0671;
import rw.api.NestMembersX;
import rw.core.C0012;
import rw.core.C0806;
import rw.core.C0830;
import rw.data.Rec0284;
import rw.defs.OlmmOsl;

public class IlkOns {
   private static byte[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   public static Object[] f5000;
   private static float[] f6000;
   private static String[] f7000;
   private static float[] f8000;
   public static Object[] f9000;
   private static float[] f10000;
   private static byte[] f11000;
   private static byte[] f12000;
   private static float[] f13000;
   private static byte[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   private static float[] f17000;
   private static byte[] f18000;
   private static float[] f19000;
   private static byte[] f20000;
   private static float[] f21000;
   private static double[] f22000;
   private static byte[] f23000;
   public static Object[] f24000;
   private static float[] f25000;
   private static float[] f26000;
   private static byte[] f27000;
   private static byte[] f28000;

   public static double m4000(NbK var0) {
      return !ooIqnp<"jmzqnof",-454846320,1802321470,1802321530,1802321477,1846414590,-694400221>(var0)
         ? var0.method_23321()
         : NNWE.u(m86000(var0), var0.field_5969, var0.method_23321());
   }

   public static void m6000(NxU var0) {
      var0.N((NxU)f24000[5]);
   }

   public static Matrix4f m10000() {
      return (Matrix4f)f24000[3];
   }

   private IlkOns() {
      throw new UnsupportedOperationException(f7000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f22000 = new double[]{0.0, 2.0, 2.0, 0.1, 1.0};
   }

   private static void m20000() {
      f5000 = new Object[]{4, 4, 16, 20, 5, 35, -1442182646};
      f9000 = new Object[]{1.5F, 1.0F, 2.2F, null, null};
      f24000 = new Object[]{null, null, null, null, null, null, null};
   }

   public static void m24000() {
      ow var0 = NNuU.Nq().Nt();
      float var1 = var0.U() / var0.j();
      float var2 = var0.E() / var0.j();
      RenderSystem.setProjectionMatrix(((CM)f24000[1]).y(var1, var2), Jf.field_54954);
      ((Matrix4f)f24000[3]).set(((Iface0671)((CM)f24000[1])).m2000(var1, var2));
   }

   public static double m26000(NbK var0) {
      return !var0.method_5805() ? var0.method_23317() : NNWE.u(m86000(var0), var0.field_6014, var0.method_23317());
   }

   private static void m28000() {
      f7000 = new String[]{" ", "This is a utility class and cannot be instantiated", "nursultan-unscale"};
   }

   public static double m34000(NbK var0) {
      return !var0.method_5805() ? var0.method_23318() : NNWE.u(m86000(var0), var0.field_6036, var0.method_23318());
   }

   public static int m36000() {
      return GL12.glGetInteger(3379);
   }

   public static void m38000(NxU var0) {
      m66000((NxU)f24000[5], var0.N, var0.y);
      ((NxU)f24000[5]).N(var0);
   }

   public static Rec0284 m40000(float var0, float var1, float var2) {
      Vector4f var3 = new Vector4f(var0, var1, var2, f10000[0]);
      var3.mul((Matrix4f)f9000[4]);
      float var4 = var3.x / var3.w;
      float var5 = var3.y / var3.w;
      ow var6 = ((NNuU)f24000[2]).Nt();
      float var7 = var6.U();
      float var8 = var6.E();
      float var9 = (var4 * f10000[1] + f10000[2]) * var7;
      float var10 = (f17000[0] - (var5 * f17000[1] + f17000[2])) * var8;
      int var11 = var3.w > f17000[3] ? 1 : 0;
      if (var11 == 0) {
         var9 = var7 - var9;
         var10 = var8 - var10;
      }

      return new Rec0284(new Vector2f(var9, var10), (boolean)var11);
   }

   public static Matrix4f m44000(float var0, float var1) {
      RenderSystem.setProjectionMatrix(((CM)f24000[1]).y(var0, var1), Jf.field_54954);
      ((Matrix4f)f24000[3]).set(((Iface0671)((CM)f24000[1])).m2000(var0, var1));
      return (Matrix4f)f24000[3];
   }

   public static int m46000(NxU var0) {
      GpuTexture var1 = var0.i();
      return var1 == null ? 0 : ((pz)var1).N();
   }

   public static boolean m50000(NbK var0) {
      return m100000(var0.method_5829());
   }

   public static NXi m52000() {
      return ((NNNYO)((NNuU)f24000[2]).i[5]).s().y();
   }

   private static void m54000() {
      f2000 = new float[]{3.0F, 1.0F, 2.0F, Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE};
      f16000 = new float[]{Float.MIN_VALUE, Float.MAX_VALUE};
      f21000 = new float[]{Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 2.0F, 2.0F, 0.0F, 0.0F};
      f10000 = new float[]{1.0F, 0.5F, 0.5F};
      f17000 = new float[]{1.0F, 0.5F, 0.5F, 0.01F, 1.0F, 0.01F};
      f25000 = new float[]{0.5F, 0.5F, 1.0F, 0.5F, 0.5F, -1.0F, 50.0F};
      f13000 = new float[]{100.0F, 10.0F};
      f4000 = new float[]{0.0F, 0.0F, 0.0F, 35.0F, 5.0F, 5.0F, 20.0F};
      f8000 = new float[]{8.0F, 24.0F, 2.0F, 2.0F, 4.0F, 20.0F, 2.0F};
      f26000 = new float[]{2.0F, 4.0F, 4.0F, 0.0F};
      f19000 = new float[]{4.0F, 4.0F, 16.0F, 0.0F, 1.0F, 4.0F, 4.0F, 3.0F};
      f15000 = new float[]{1.0F, 1.0F, 2.0F, 2.0F, 1.5F, 1.0F, 2.2F};
      f6000 = new float[]{-1000.0F, 11000.0F, 0.0F, 0.0F, 0.0F};
   }

   public static void m56000(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      m104000(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void m58000(NNIC var0) {
      f24000[4] = var0;
   }

   public static Vector2f m60000(Vector2f var0, float var1, float var2, float var3) {
      float var4 = var1 / f21000[3];
      float var5 = var2 / f21000[4];
      float var6 = var4 - var3;
      float var7 = var5 - var3;
      float var8 = var0.x - var4;
      float var9 = var0.y - var5;
      if (var8 == f21000[5] && var9 == f21000[6]) {
         return new Vector2f(var4, var5 - var7);
      } else {
         float var10 = var8 * var8 / (var6 * var6) + var9 * var9 / (var7 * var7);
         float var11 = (float)(f22000[4] / Math.sqrt(var10));
         return new Vector2f(var4 + var8 * var11, var5 + var9 * var11);
      }
   }

   public static void m62000(FloatBuffer var0, int var1) {
      var0.clear();
      float var2 = Math.max(var1 / f2000[0], f2000[1]);
      double var3 = f22000[0];

      for (int var5 = 0; var5 <= var1; var5++) {
         double var6 = m64000(var5, var2);
         var0.put((float)var6);
         var3 += var5 == 0 ? var6 : var6 * f22000[1];
      }

      for (int var8 = 0; var8 <= var1; var8++) {
         var0.put(var8, (float)(var0.get(var8) / var3));
      }

      var0.rewind();
   }

   public static double m64000(float var0, float var1) {
      double var2 = var1 * var1;
      return Math.exp(-(var0 * var0) / (f22000[2] * var2));
   }

   public static void m66000(NxU var0, int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (var1 != var0.N || var2 != var0.y) {
            var0.N(var1, var2);
            m96000(var0.L());
            m96000(var0.i());
         }
      }
   }

   public static Vector4f m68000(NbK var0, boolean var1) {
      NXi var2 = m52000();
      double var3 = (var1 ? m26000(var0) : var0.method_23317()) - var2.M;
      double var5 = (var1 ? m34000(var0) : var0.method_23318()) - var2.B;
      double var7 = (var1 ? m4000(var0) : var0.method_23321()) - var2.Z;
      float var9 = var0.method_17681() / f2000[2];
      float var10 = var0.method_17682();
      float var11 = (float)(var3 - var9);
      float var12 = (float)var5;
      float var13 = (float)(var7 - var9);
      float var14 = (float)(var3 + var9);
      float var15 = (float)(var5 + var10 + f22000[3]);
      float var16 = (float)(var7 + var9);
      float[] var10000 = new float[]{
         var11,
         var12,
         var13,
         var11,
         var15,
         var13,
         var14,
         var12,
         var13,
         var14,
         var15,
         var13,
         var11,
         var12,
         var16,
         var11,
         var15,
         var16,
         var14,
         var12,
         var16,
         var14,
         0.0F,
         0.0F
      };
      var10000[f3000[0]] = var15;
      var10000[f3000[1]] = var16;
      float[] var17 = var10000;
      Vector4f var18 = new Vector4f(f2000[3], f2000[4], f2000[5], f16000[0]);

      for (int var19 = 0; var19 < f3000[2]; var19++) {
         Vector2f var20 = m72000(var17[var19 * f3000[3]], var17[var19 * f3000[4] + 1], var17[var19 * f3000[5] + f3000[6]]);
         if (var20 != null) {
            var20 = var20.round();
            var18.set(Math.min(var20.x, var18.x()), Math.min(var20.y, var18.y()), Math.max(var20.x, var18.z()), Math.max(var20.y, var18.w()));
         }
      }

      return var18.x() == f16000[1] && var18.y() == f21000[0] && var18.z() == f21000[1] && var18.w() == f21000[2] ? null : var18;
   }

   public static void m70000(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      GlStateManager._glBindFramebuffer(36008, var0);
      GlStateManager._glBindFramebuffer(36009, var1);
      GlStateManager._glBlitFrameBuffer(0, 0, var2, var3, 0, 0, var4, var5, var6, var7);
   }

   public static Vector2f m72000(float var0, float var1, float var2) {
      Vector4f var3 = new Vector4f(var0, var1, var2, f17000[4]);
      var3.mul((Matrix4f)f9000[4]);
      if (var3.w <= f17000[5]) {
         return null;
      } else {
         float var4 = var3.x / var3.w;
         float var5 = var3.y / var3.w;
         ow var6 = ((NNuU)f24000[2]).Nt();
         float var7 = (var4 * f25000[0] + f25000[1]) * var6.U();
         float var8 = (f25000[2] - (var5 * f25000[3] + f25000[4])) * var6.E();
         return new Vector2f(var7, var8);
      }
   }

   public static int m74000(NxU var0) {
      return ((pz)var0.L()).N();
   }

   public static void m78000(ZwBs var0, C0830 var1, String var2, int var3, float var4, float var5, NQo var6, int var7) {
      m80000(var0, var1, var2, var3, var4, var5, var6, var7, f25000[5]);
   }

   public static void m80000(ZwBs var0, C0830 var1, String var2, int var3, float var4, float var5, NQo var6, int var7, float var8) {
      float var9 = Math.max(Math.round(var7 * f25000[6] / f13000[0]) / f13000[1], f4000[0]);
      String var10 = String.valueOf(var9);
      float var11 = var0.m76000(var3, (OlmmOsl)OlmmOsl.f7000[3], false);
      int var12 = !var2.isEmpty() ? 1 : 0;
      float var13 = var12 != 0 ? var0.m56000(var2, var3, (OlmmOsl)OlmmOsl.f7000[3], false) : f4000[1];
      float var14 = var12 != 0 ? var0.m56000(f7000[0], var3, (OlmmOsl)OlmmOsl.f7000[3], false) : f4000[2];
      float var15 = var0.m56000(var10, var3, (OlmmOsl)OlmmOsl.f7000[3], false);
      float var16 = Math.max(f4000[3], (float)Math.ceil(var15 / f4000[4]) * f4000[5]);
      float var17 = var13 + var14 + var16;
      float var18 = var17 + f4000[6] + f8000[0];
      float var19 = f8000[1];
      float var20 = NNWE.y(var4 - var18 / f8000[2]);
      float var21 = NNWE.y(var5 - var19 / f8000[3]);
      float var22 = var20 + f8000[4] + f8000[5];
      float var23 = var21 + (var19 - var11) / f8000[6];
      C0806.m36000(var1, var20 - f26000[0], var21, var18 + f26000[1] + f26000[2], var19 + (var8 >= f26000[3] ? f3000[7] : 0), -1442182646);
      NursultanClient.m66000().m54000(var6, var20 + f19000[0], var21 + f19000[1], f19000[2]);
      if (var12 != 0) {
         var0.m62000(var2).m86000(var22, var23).m102000(var3).m98000((OlmmOsl)OlmmOsl.f7000[3]).m28000(-1).m4000();
      }

      var0.m62000(var10).m86000(var22 + var17 - var15, var23).m102000(var3).m98000((OlmmOsl)OlmmOsl.f7000[3]).m28000(-1).m4000();
      if (var8 >= f19000[3]) {
         float var24 = Math.min(var8, f19000[4]);
         float var25 = var18 + f19000[5] + f19000[6];
         int var26 = NNWE.M(var24 / f19000[7], f15000[0], f15000[1]) | 0xFF000000;
         C0806.m36000(var1, var20 - f15000[2], var21 + var19, var25 * var24, f15000[3], var26);
      }
   }

   public static void m82000(NxU var0, NxU var1) {
      RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var0.L(), var1.L(), 0, 0, 0, 0, 0, var1.N, var1.y);
   }

   public static Matrix4f m84000() {
      ow var0 = NNuU.Nq().Nt();
      float var1 = var0.U();
      float var2 = var0.E();
      return m44000(var1, var2);
   }

   public static float m86000(NbK var0) {
      return ((NNuU)f24000[2]).NK().N((NNNZg)((NNuU)f24000[2]).T[3] == null || !((NNNZg)((NNuU)f24000[2]).T[3]).method_54719().N(var0));
   }

   public static void m88000(NxU var0, C0012 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int var12 = ((pz)var0.L()).N(((pi)RenderSystem.getDevice()).y(), var0.i());
         NestMembersX var13 = NestMembersX.m4000();
         Iface0006 var14 = var13.m2000(var12, var0.N, var0.y);
         Iface0006 var15 = ((rw.core.C0013)rw.core.C0013.f2000[0]).m8000(var1);
         var13.m12000(var14, var15, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   public static void m92000(NNBK var0, NQo var1, float var2, float var3) {
      var0.N(var1, NNWE.y(var2), NNWE.y(var3));
   }

   public static void m94000(NxU var0, boolean var1) {
      ((rw.core.C0013)rw.core.C0013.f2000[0]).m40000(var0, var1);
   }

   public static void m96000(GpuTexture var0) {
      if (var0 instanceof pz var1) {
         GlStateManager._activeTexture(33984);
         GlStateManager._bindTexture(var1.N());
         GL33C.glBindSampler(0, 0);
         GL12.glTexParameteri(3553, 10241, 9729);
         GL12.glTexParameteri(3553, 10240, 9729);
         GL12.glTexParameteri(3553, 10242, 33071);
         GL12.glTexParameteri(3553, 10243, 33071);
         GL12.glTexParameteri(3553, 33084, 0);
         GL12.glTexParameteri(3553, 33085, 0);
      }
   }

   public static boolean m100000(NHS var0) {
      return (boolean)((NNIC)f24000[4] != null && ((NNIC)f24000[4]).method_23093(var0) ? 1 : 0);
   }

   public static void m102000(NxU var0, C0012 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      m88000(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 16384, 9728);
   }

   public static void m104000(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var4 > 0 && var5 > 0 && var8 > 0 && var9 > 0) {
         int var12 = GlStateManager.getFrameBuffer(36008);
         int var13 = GlStateManager.getFrameBuffer(36009);
         GlStateManager._glBindFramebuffer(36008, var0);
         GlStateManager._glBindFramebuffer(36009, var1);
         GlStateManager._glBlitFrameBuffer(var2, var3, var2 + var4, var3 + var5, var6, var7, var6 + var8, var7 + var9, var10, var11);
         GlStateManager._glBindFramebuffer(36009, var13);
         GlStateManager._glBindFramebuffer(36008, var12);
      }
   }

   public static void m106000(int var0, int var1, int var2, int var3, int var4, int var5) {
      m70000(var0, var1, var2, var3, var4, var5, 16384, 9728);
   }

   private static void m108000() {
      f27000 = new byte[]{24, 2, 3, 4, 5, 6, 7};
      f23000 = new byte[]{8, 9, 10, 11, 12, 13};
      f28000 = new byte[]{14, 15};
      f12000 = new byte[]{16, 17, 18, 19, 20, 21};
      f3000 = new byte[]{22, 23, 8, 3, 3, 3, 2, 2};
      f1000 = new byte[]{-1, -1, 2, 3};
      f14000 = new byte[]{4, 2, 3, 5, 6, 7};
      f11000 = new byte[]{4, 4, 2, 16, 3};
      f18000 = new byte[]{20, 4, 5, 5, 35, 6};
      f20000 = new byte[]{5, 2, 7};
   }
}
