package rw.gui;

import KDFzREm.NNIo;
import KDFzREm.NNNQL;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.Nbh;
import KDFzREm.ow;
import KDFzREm.pz;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.List;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0003;
import rw.core.BootstrapMethodsX;
import rw.core.C0011;
import rw.core.C0012;
import rw.core.C0805;
import rw.core.C0808;
import rw.core.C0811;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0826;
import rw.core.C0830;
import rw.core.C1174;
import rw.core.C1223;
import rw.core.C1239;
import rw.core.C1240;
import rw.core.C1246;
import rw.core.C1250;
import rw.core.IlksOmts;
import rw.core.IlpOkkIjl;
import rw.core.OlssInijr;
import rw.data.CriticalPartApi;
import rw.data.OlnpOqOpi;
import rw.data.Rec0004;
import rw.data.Rec0285;
import rw.data.Rec0304;
import rw.data.Rec0309;
import rw.defs.Enum0061;
import rw.defs.Enum0063;
import rw.setting.OlpOtr;
import rw.setting.OltOlmsps;

public class C0095 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static byte[] f9000;
   private static short[] f10000;
   public Object[] f11000;
   private static short[] f12000;
   private static byte[] f13000;
   private static short[] f14000;
   private static byte[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static byte[] f25000;
   private static short[] f26000;
   public Object[] f27000;
   public Object[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static byte[] f31000;
   private static byte[] f32000;
   public Object[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   private static float[] f37000;
   private static byte[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   public Object[] f41000;
   private static short[] f42000;
   private static float[] f43000;
   private static String[] f44000;
   private static short[] f45000;
   private static byte[] f46000;
   private static byte[] f47000;
   private static short[] f48000;
   private static short[] f49000;
   private static short[] f50000;

   private IlksOmts<IlpOkkIjl> m4000() {
      if ((Integer)this.f27000[4] == 0) {
         return (IlksOmts<IlpOkkIjl>)this.f11000[1];
      } else {
         return switch (this.f8000[3]) {
            case 2 -> (IlksOmts)this.f11000[2];
            case 4 -> (IlksOmts)this.f27000[0];
            default -> (IlksOmts)this.f27000[1];
         };
      }
   }

   private static void m12000() {
      f1000 = new short[]{0, 1, 16384, 1};
      f2000 = new short[]{0, 0, 0};
      f23000 = new short[]{1, 4, 1, 2, 4, 3};
      f29000 = new short[]{4, 4, 4};
      f17000 = new short[]{5, 4, 6};
      f30000 = new short[]{4, 7, 4};
      f20000 = new short[]{0, 4};
      f42000 = new short[]{1, 2, 4096, 1024, 2, 3};
      f5000 = new short[]{2, 0, 4, 2, 1, 0, 2, 1};
      f36000 = new short[]{2, 2, 3, 0, 1, 0, 2, 0};
      f7000 = new short[]{3, 3, 4, 0, 1};
      f12000 = new short[]{2, 0, 1, 2, 5, 4, 4};
      f22000 = new short[]{3, 4, 5, 4, 4, 5};
      f14000 = new short[]{0, 4, 2978, 2};
      f39000 = new short[]{3, 2};
      f40000 = new short[]{2, 2, 2, 4, 3};
      f48000 = new short[]{1, 4, 2, 2, 0, 2, 2};
      f21000 = new short[]{1, 0, 2, 2, 1, 4, 3, 2};
      f19000 = new short[]{0, 4, 3, 4, 1, 3};
      f34000 = new short[]{2, 0, 1, 3};
      f26000 = new short[]{3, 7, 7, 3};
      f10000 = new short[]{3, 7, 7, 7, 7, 0};
      f18000 = new short[]{0, 2, 0, 3, 0, 4, 0, 1};
      f24000 = new short[]{1, 1, 1, 0, 3};
      f50000 = new short[]{1, 1, 6, 6, 6, 10241, 9728};
      f45000 = new short[]{6, 10240, 9728, 6};
      f16000 = new short[]{10242, 6, 10243, 6, 0, 0};
      f35000 = new short[]{0, 0};
      f3000 = new short[]{3, 4, 5};
      f49000 = new short[]{6, 7, 0, 1, 0, 0};
   }

   private IlksOmts<IlpOkkIjl> m14000(int var1) {
      C0826 var2 = IlksOmts.m22000()
         .m18000((BootstrapMethodsX)this.f8000[2])
         .m30000(var1x -> this.m88000(var1x, 1, 2))
         .m36000(var1 == 2 ? (C0012)this.f33000[2] : (C0012)this.f33000[0])
         .m50000(() -> IlkOns.m74000(((NNuU)this.f28000[0]).e()));
      if (var1 >= 4) {
         var2 = var2.m32000((BootstrapMethodsX)this.f8000[2])
            .m30000(var1x -> this.m88000(var1x, 2, 4))
            .m36000(var1 == 4 ? (C0012)this.f33000[2] : (C0012)this.f33000[1])
            .m10000((C0012)this.f33000[0]);
      }

      if (var1 == 8) {
         var2 = var2.m32000((BootstrapMethodsX)this.f8000[2])
            .m30000(var1x -> this.m88000(var1x, 4, 8))
            .m36000((C0012)this.f33000[2])
            .m10000((C0012)this.f33000[1]);
      }

      return var2.m32000((OltOlmsps)this.f41000[4])
         .m30000(this::m80000)
         .m36000((C0012)this.f33000[3])
         .m10000((C0012)this.f33000[2])
         .m32000((OltOlmsps)this.f8000[0])
         .m30000(this::m80000)
         .m36000((C0012)this.f33000[4])
         .m10000((C0012)this.f33000[3])
         .m52000();
   }

   private int m16000() {
      if ((Integer)this.f27000[6] == 0) {
         Integer var5 = GL33.glGenSamplers();
         this.f27000[6] = var5;
         GL33.glSamplerParameteri((Integer)this.f27000[6], 10241, 9728);
         GL33.glSamplerParameteri((Integer)this.f27000[6], 10240, 9728);
         GL33.glSamplerParameteri((Integer)this.f27000[6], 10242, 33071);
         GL33.glSamplerParameteri((Integer)this.f27000[6], 10243, 33071);
      }

      return (Integer)this.f27000[6];
   }

   public C0095() {
      this.m46000();
      NNuU var5 = NNuU.Nq();
      this.f28000[0] = var5;
      C0830 var6 = C0830.m42000((Rec0004)f4000[1], 65536, 16384);
      this.f28000[1] = var6;
      C0805 var7 = C0805.m30000()
         .m16000(
            C0825.m2000()
               .m22000(
                  C1246.m18000()
                     .m24000((Rec0309)Rec0309.f6000[0])
                     .m20000((OlnpOqOpi)OlnpOqOpi.f1000[0])
                     .m14000((CriticalPartApi)CriticalPartApi.f2000[0])
                     .m22000((Rec0304)Rec0304.f1000[1])
                     .m16000()
               )
               .m16000((OlpOtr)EspMix.f7000[4])
               .m18000(4)
               .m20000()
         )
         .m22000((C0830)this.f28000[1])
         .m20000();
      this.f28000[2] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f7000[4]).m66000(f44000[0]);
      this.f28000[3] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f7000[4]).m66000(f44000[1]);
      this.f28000[4] = var9;
      C1239 var10 = ((OlpOtr)EspMix.f7000[4]).m10000(f44000[2]);
      this.f28000[5] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f7000[4]).m10000(f44000[3]);
      this.f28000[6] = var11;
      C1250 var12 = ((OlpOtr)EspMix.f7000[4]).m94000(f44000[4]);
      this.f28000[7] = var12;
      C0821 var13 = ((OlpOtr)EspMix.f7000[4]).m32000(f44000[5]);
      this.f41000[0] = var13;
      C1223 var14 = ((OlpOtr)EspMix.f7000[4]).m106000(f44000[6]);
      this.f41000[1] = var14;
      C0830 var15 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f41000[2] = var15;
      IlpOkkIjl var16 = new IlpOkkIjl();
      this.f41000[3] = var16;
      OltOlmsps var17 = OltOlmsps.m24000((C0830)this.f41000[2], (float[])OltOlmsps.f2000[0]);
      this.f41000[4] = var17;
      OltOlmsps var18 = OltOlmsps.m24000((C0830)this.f41000[2], (float[])OltOlmsps.f2000[1]);
      this.f8000[0] = var18;
      BootstrapMethodsX var19 = new BootstrapMethodsX((C0830)this.f41000[2], f37000[0]);
      this.f8000[1] = var19;
      BootstrapMethodsX var20 = new BootstrapMethodsX((C0830)this.f41000[2], f37000[1]);
      this.f8000[2] = var20;
      Integer var21 = 1;
      this.f8000[3] = var21;
      C0012 var22 = this.m42000(2);
      this.f33000[0] = var22;
      C0012 var23 = this.m42000(4);
      this.f33000[1] = var23;
      C0012 var24 = this.m96000((Enum0061)Enum0061.f1000[0]);
      this.f33000[2] = var24;
      C0012 var25 = this.m96000((Enum0061)Enum0061.f1000[0]);
      this.f33000[3] = var25;
      C0012 var26 = this.m96000((Enum0061)Enum0061.f1000[3]);
      this.f33000[4] = var26;
      FloatBuffer var27 = BufferUtils.createFloatBuffer(30);
      this.f11000[0] = var27;
      IlksOmts var28 = this.m98000();
      this.f11000[1] = var28;
      IlksOmts var29 = this.m14000(2);
      this.f11000[2] = var29;
      IlksOmts var30 = this.m14000(4);
      this.f27000[0] = var30;
      IlksOmts var31 = this.m14000(8);
      this.f27000[1] = var31;
      int[] var32 = new int[f6000[0]];
      this.f27000[2] = var32;
      Integer var33 = Integer.valueOf(f6000[1]);
      this.f27000[5] = var33;
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f25000 = new byte[]{4, 2, 4, 30, 2, 4, 8};
      f6000 = new byte[]{4, -1};
      f13000 = new byte[]{30, 2, 3, 2, 4, 4, 8};
      f32000 = new byte[]{5, 2, 15, 4, 8, 3};
      f31000 = new byte[]{3, 3};
      f38000 = new byte[]{3, 2, 2, 2, 3, 3, 3, 2};
      f9000 = new byte[]{4, 8, 2, 4, 2, 3, 3, 2};
      f47000 = new byte[]{2, 3, 8, 5};
      f46000 = new byte[]{4, 3, 5, 3, 8, 4, 5, 6};
      f15000 = new byte[]{2, 30};
   }

   private static void m34000() {
      f37000 = new float[]{0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F};
      f43000 = new float[]{1.0F, 0.0F};
   }

   private static void m38000() {
      f44000 = new String[]{"u_projection", "u_view", "texture_in", "blurred_in", "u_color", "u_mix", "u_resolution"};
   }

   private C0012 m42000(int var1) {
      return C0012.m96000(() -> this.m78000(((NNuU)this.f28000[0]).Nt().U(), var1), () -> this.m78000(((NNuU)this.f28000[0]).Nt().E(), var1))
         .m44000((Enum0063)Enum0063.f1000[1], (Enum0063)Enum0063.f1000[1])
         .m26000((Enum0061)Enum0061.f1000[0])
         .m40000();
   }

   private void m46000() {
      if (this.f28000 == null) {
         this.f28000 = new Object[8];
         Object[] var1 = this.f28000;
      }

      if (this.f41000 == null) {
         this.f41000 = new Object[5];
         Object[] var2 = this.f41000;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var3 = this.f8000;
         var3[3] = 0;
      }

      if (this.f33000 == null) {
         this.f33000 = new Object[5];
         Object[] var4 = this.f33000;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[3];
         Object[] var5 = this.f11000;
      }

      if (this.f27000 == null) {
         this.f27000 = new Object[8];
         Object[] var6 = this.f27000;
         var6[4] = 0;
         var6[5] = 0;
         var6[6] = 0;
      }
   }

   public boolean m58000() {
      return (boolean)((Iface0003)this.f27000[3] != null ? 1 : 0);
   }

   private int m60000(int var1) {
      if (var1 == 0) {
         return 1;
      } else if (var1 < 5) {
         return 2;
      } else {
         return var1 < 15 ? 4 : 8;
      }
   }

   private void m72000(List<Rec0285> var1, Matrix4f var2, ow var3, Iface0003 var4, int var5, float var6) {
      for (Rec0285 var8 : var1) {
         if (!var8.m8000().isClosed() && var8.m8000().texture() instanceof pz var9) {
            this.m90000(var8);
            ((C0805)this.f28000[2]).m32000(var7 -> {
               ((OlssInijr)this.f28000[3]).m18000(var2);
               ((OlssInijr)this.f28000[4]).m18000(RenderSystem.getModelViewMatrix());
               ((C1239)this.f28000[5]).m8000(var9.N());
               GL33.glBindSampler(0, this.m16000());
               ((C1239)this.f28000[6]).m4000(33985, var4.m4000());
               ((C1250)this.f28000[7]).m22000(var5);
               ((C0821)this.f41000[0]).m20000(var6);
               ((C1223)this.f41000[1]).m18000(var3.U(), var3.E());
            });
         }
      }
   }

   public void m76000(int var1) {
      Integer var7 = Math.clamp((long)var1, 0, 30);
      this.f27000[4] = var7;
      Integer var8 = this.m60000((Integer)this.f27000[4]);
      this.f8000[3] = var8;
      if ((Integer)this.f27000[4] > 0 && (Integer)this.f27000[5] != (Integer)this.f27000[4]) {
         Integer var9 = (Integer)this.f27000[4];
         this.f27000[5] = var9;
         IlkOns.m62000((FloatBuffer)this.f11000[0], (Integer)this.f27000[4] - 1);
      }

      int var2 = GL33.glGetInteger(36006);
      GL33.glGetIntegerv(2978, (int[])this.f27000[2]);
      this.m4000().m8000((IlpOkkIjl)this.f41000[3]);
      GlStateManager._glBindFramebuffer(36160, var2);
      GL33.glViewport(((int[])this.f27000[2])[0], ((int[])this.f27000[2])[1], ((int[])this.f27000[2])[2], ((int[])this.f27000[2])[3]);
      Iface0003 var10 = ((C0012)this.f33000[4]).m66000();
      this.f27000[3] = var10;
   }

   private int m78000(int var1, int var2) {
      return Math.max(1, (var1 + var2 - 1) / var2);
   }

   private void m80000(IlpOkkIjl var1) {
      ow var2 = ((NNuU)this.f28000[0]).Nt();
      var1.m42000(this.m100000(var2.U())).m66000(this.m100000(var2.E())).m2000((Integer)this.f27000[4]).m56000((FloatBuffer)this.f11000[0]);
   }

   public boolean m82000(NbL var1) {
      return (boolean)((NbL)this.f27000[f26000[1]] != null && (NbL)this.f27000[f26000[2]] != var1 ? 0 : 1);
   }

   public void m84000(NNNQL var1, float var2, NNIo var3, NNNwS var4, int var5, Matrix4f var6, int var7, int var8, float var9) {
      Iface0003 var10 = (Iface0003)this.f27000[f26000[3]];
      Object var22 = null;
      this.f27000[3] = var22;

      List var11;
      List var12;
      try {
         NbL var23 = NbL.field_5808;
         this.f27000[7] = var23;
         var11 = C1174.m18000(var5x -> var1.N(var2, var3, var5x, var4, var5));
         NbL var24 = NbL.field_5810;
         this.f27000[7] = var24;
         var12 = C1174.m18000(var5x -> var1.N(var2, var3, var5x, var4, var5));
      } finally {
         Object var26 = null;
         this.f27000[7] = var26;
      }

      if (var10 != null && (!var11.isEmpty() || !var12.isEmpty())) {
         Nbh var13 = var4.method_6068();
         ow var14 = ((NNuU)this.f28000[0]).Nt();
         C1240 var15 = C1240.m20000();

         try {
            IlkOns.m94000(((NNuU)this.f28000[0]).e(), (boolean)1);
            this.m72000(var11, var6, var14, var10, var13 == Nbh.field_6183 ? var7 : var8, var9);
            this.m72000(var12, var6, var14, var10, var13 == Nbh.field_6183 ? var8 : var7, var9);
            GL33.glBindSampler(0, 0);
         } catch (Throwable var32) {
            if (var15 != null) {
               try {
                  var15.m12000();
               } catch (Throwable var30) {
                  var32.addSuppressed(var30);
               }
            }

            throw var32;
         }

         if (var15 != null) {
            var15.m12000();
         }
      }
   }

   private void m88000(IlpOkkIjl var1, int var2, int var3) {
      ow var4 = ((NNuU)this.f28000[0]).Nt();
      int var5 = this.m78000(var4.U(), var3);
      int var6 = this.m78000(var4.E(), var3);
      var1.m40000().setOrtho(f37000[2], var5, var6, f37000[3], f37000[4], f37000[5]);
      var1.m52000().set((Matrix4f)IlkOns.f9000[3]);
      var1.m48000(0)
         .m60000(0)
         .m24000(var5)
         .m46000(var6)
         .m42000(this.m78000(var4.U(), var2))
         .m66000(this.m78000(var4.E(), var2))
         .m50000(f37000[6])
         .m58000(f37000[7])
         .m4000(f43000[0])
         .m28000(f43000[1]);
   }

   private void m90000(Rec0285 var1) {
      C0811 var2 = ((C0830)this.f28000[1]).m6000();
      C0808 var3 = ((C0830)this.f28000[1]).m52000();
      float[] var4 = var1.m4000();
      float[] var5 = var1.m10000();
      float[] var6 = var1.m18000();
      int var7 = var4.length / 3;

      for (int var8 = 0; var8 < var7; var8++) {
         var2.m40000(var4[var8 * 3], var4[var8 * 3 + 1], var4[var8 * 3 + 2])
            .m32000(var5[var8 * 2], var5[var8 * 2 + 1])
            .m40000(var6[var8 * 3], var6[var8 * 3 + 1], var6[var8 * 3 + 2])
            .m28000();
      }

      for (int var11 : var1.m12000()) {
         var3.m24000(var11);
      }
   }

   public void m92000() {
      Object var5 = null;
      this.f27000[f26000[0]] = var5;
   }

   private C0012 m96000(Enum0061 var1) {
      return C0012.m96000(() -> this.m100000(((NNuU)this.f28000[0]).Nt().U()), () -> this.m100000(((NNuU)this.f28000[0]).Nt().E()))
         .m44000((Enum0063)Enum0063.f1000[1], (Enum0063)Enum0063.f1000[1])
         .m26000(var1)
         .m40000();
   }

   private IlksOmts<IlpOkkIjl> m98000() {
      return IlksOmts.<IlpOkkIjl>m22000()
         .m18000((BootstrapMethodsX)this.f8000[1])
         .m30000(var1 -> this.m88000(var1, 1, 1))
         .m36000((C0012)this.f33000[4])
         .m50000(() -> IlkOns.m74000(((NNuU)this.f28000[0]).e()))
         .m52000();
   }

   private int m100000(int var1) {
      return this.m78000(var1, (Integer)this.f8000[3]);
   }

   private static void m104000() {
      f4000 = new Object[]{30, null};
   }
}
