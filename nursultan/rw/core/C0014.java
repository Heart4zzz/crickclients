package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.ow;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import rw.api.Iface0003;
import rw.api.Iface0597;
import rw.data.Rec0004;
import rw.gui.IlkOns;
import rw.setting.OltOlmsps;

public class C0014 {
   public Object[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static byte[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static byte[] f26000;
   public Object[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   public Object[] f34000;
   private static float[] f35000;
   public Object[] f36000;
   private static byte[] f37000;
   private static short[] f38000;
   private static float[] f39000;
   private static short[] f40000;
   private static short[] f41000;
   private static short[] f42000;
   private static byte[] f43000;
   private static short[] f44000;
   private static short[] f45000;
   private static float[] f46000;
   private static short[] f47000;
   private static short[] f48000;
   private static short[] f49000;
   private static short[] f50000;
   public Object[] f51000;
   private static short[] f52000;
   public Object[] f53000;
   public static Object[] f54000;
   private static short[] f55000;
   private static short[] f56000;
   private static byte[] f57000;
   private static byte[] f58000;
   private static byte[] f59000;
   private static float[] f60000;

   private void m2000(IlpOkkIjl var1) {
      GL11.glViewport(0, 0, (Integer)this.f51000[3], (Integer)this.f51000[4]);
   }

   public float m6000() {
      return (((Integer)this.f51000[3]).intValue() - f35000[2]) / ((Integer)this.f51000[5]).intValue();
   }

   private int m8000() {
      return (Iface0003)this.f19000[5] != null ? ((Iface0003)this.f19000[5]).m4000() : IlkOns.m74000(((NNuU)this.f36000[0]).e());
   }

   private static void m12000() {
      f14000 = new short[]{0, 2, 4096, 1024, 1, 2, 1};
      f18000 = new short[]{0, 3, 1, 1};
      f52000 = new short[]{0, 1, 2, 3};
      f28000 = new short[]{4, 5, 0, 1, 2, 3, 4};
      f41000 = new short[]{7, 0, 3, 4};
      f24000 = new short[]{0, 2, 4, 0, 1};
      f12000 = new short[]{2, 3};
      f38000 = new short[]{1, 4, 1, 5};
      f40000 = new short[]{1, 6, 4, 0, 5, 1};
      f48000 = new short[]{5, 1};
      f50000 = new short[]{3, 2, 1};
      f23000 = new short[]{0, 1};
      f31000 = new short[]{2, 6, 3, 1, 0, 0};
      f49000 = new short[]{5, 6, 3, 4, 3, 4, 3, 4};
      f33000 = new short[]{3, 4, 3, 4, 1};
      f56000 = new short[]{2, 3, 4};
      f11000 = new short[]{5, 3, 5, 0};
      f29000 = new short[]{4, 0, 1, 2, 7, 0, 1, 2};
      f25000 = new short[]{3, 4, 5, 0, 1};
      f21000 = new short[]{2, 3, 3, 3, 4, 4, 5};
      f32000 = new short[]{4, 0, 2, 2, 2, 4, 2978};
      f13000 = new short[]{5, 6, 1, 0, 2};
      f22000 = new short[]{4, 5, 5, 5, 5, 3, 5};
      f45000 = new short[]{5, 0, 6, 6, 3};
      f47000 = new short[]{5, 4};
      f55000 = new short[]{0, 1, 2};
      f17000 = new short[]{3, 4, 1};
      f20000 = new short[]{2, 1, 2};
      f7000 = new short[]{3, 4, 3, 5, 4, 0};
      f44000 = new short[]{1, 2, 1, 2, 1, 2, 7, 0};
      f42000 = new short[]{1, 2, 3, 4, 1, 2};
      f9000 = new short[]{5, 2, 0, 1, 3, 2, 3};
      f2000 = new short[]{2, 2, 2, 2, 2, 2, 0, 5};
      f30000 = new short[]{2, 1, 2, 1};
   }

   private int m14000() {
      return (Iface0003)this.f19000[6] != null ? ((Iface0003)this.f19000[6]).m4000() : this.m8000();
   }

   public C0014() {
      this.m58000();
      NNuU var5 = NNuU.Nq();
      this.f36000[0] = var5;
      C0830 var6 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f36000[1] = var6;
      IlpOkkIjl var7 = new IlpOkkIjl();
      this.f36000[2] = var7;
      OltOlmsps var8 = OltOlmsps.m24000((C0830)this.f36000[1], (float[])OltOlmsps.f2000[0]);
      this.f36000[3] = var8;
      OltOlmsps var9 = OltOlmsps.m24000((C0830)this.f36000[1], (float[])OltOlmsps.f2000[1]);
      this.f51000[0] = var9;
      Integer var10 = 1;
      this.f51000[1] = var10;
      Integer var11 = 1;
      this.f51000[2] = var11;
      Integer var12 = 1;
      this.f51000[3] = var12;
      Integer var13 = 1;
      this.f51000[4] = var13;
      Integer var14 = 32;
      this.f51000[5] = var14;
      Integer var15 = 32;
      this.f19000[0] = var15;
      Integer var16 = 1;
      this.f19000[1] = var16;
      Integer var17 = 1;
      this.f19000[2] = var17;
      Integer var18 = 1;
      this.f19000[3] = var18;
      Integer var19 = 1;
      this.f19000[4] = var19;
      Integer var20 = 1;
      this.f19000[7] = var20;
      Integer var21 = 1;
      this.f53000[0] = var21;
      Integer var22 = 1;
      this.f53000[3] = var22;
      Integer var23 = 1;
      this.f53000[4] = var23;
      Float var24 = f16000[0];
      this.f1000[f24000[0]] = var24;
      Float var25 = f16000[1];
      this.f1000[f24000[1]] = var25;
      Float var26 = f10000[0];
      this.f1000[f24000[2]] = var26;
      Float var27 = f10000[1];
      this.f27000[f24000[3]] = var27;
      C0012 var28 = KrHa.m2000(() -> (Integer)this.f51000[1], () -> (Integer)this.f51000[2]);
      this.f27000[f24000[4]] = var28;
      C0012 var29 = KrHa.m2000(() -> (Integer)this.f51000[1], () -> (Integer)this.f51000[2]);
      this.f27000[2] = var29;
      C0012 var30 = KrHa.m2000(() -> (Integer)this.f51000[5], () -> (Integer)this.f19000[0]);
      this.f27000[3] = var30;
      BootstrapMethodsX var31 = new BootstrapMethodsX((C0830)this.f36000[1], f10000[2]);
      this.f27000[4] = var31;
      C0027 var32 = new C0027((C0830)this.f36000[1], f10000[3]);
      this.f27000[5] = var32;
      BootstrapMethodsX var33 = new BootstrapMethodsX((C0830)this.f36000[1], f10000[4]);
      this.f27000[6] = var33;
      IlksOmts var34 = this.m76000((BootstrapMethodsX)this.f27000[4], false);
      this.f34000[0] = var34;
      IlksOmts var35 = this.m76000((C0027)this.f27000[5], true);
      this.f34000[1] = var35;
      int[] var36 = new int[4];
      this.f34000[5] = var36;
   }

   static {
      ntfClinit();
   }

   private void m26000(IlpOkkIjl var1) {
      GL11.glViewport(0, 0, (Integer)this.f51000[1], (Integer)this.f51000[2]);
   }

   private static void m30000() {
      f54000 = new Object[]{6, 32};
   }

   private static void m40000() {
      f15000 = new byte[]{32, 32};
      f43000 = new byte[]{4, 30, 2, 3, 6};
      f26000 = new byte[]{6, 32, 32, 32, 32, 6};
      f3000 = new byte[]{6, 6, 6, 6, 4};
      f37000 = new byte[]{6, 2, 3};
      f58000 = new byte[]{4, 5, 8, 2, 3, 4, 7};
      f57000 = new byte[]{6, 2};
      f6000 = new byte[]{3, 4, 5, 6, 2, 3, 4};
      f59000 = new byte[]{5, 7, 6, 3, 4, 2, 6, 32};
   }

   private int m42000(int var1) {
      return Math.floorDiv(var1, 6) * f3000[0];
   }

   public float m44000() {
      return f35000[3];
   }

   private void m46000(int var1) {
      if (var1 != (Integer)this.f34000[3] || (FloatBuffer)this.f34000[2] == null) {
         Integer var6 = var1;
         this.f34000[3] = var6;
         if ((FloatBuffer)this.f34000[2] == null) {
            FloatBuffer var7 = MemoryUtil.memAllocFloat(var1);
            this.f34000[2] = var7;
         } else if (var1 > ((FloatBuffer)this.f34000[2]).capacity()) {
            FloatBuffer var8 = MemoryUtil.memRealloc((FloatBuffer)this.f34000[2], var1);
            this.f34000[2] = var8;
         }

         IlkOns.m62000((FloatBuffer)this.f34000[2], var1 - 1);
      }
   }

   private void m48000(IlpOkkIjl var1) {
      var1.m40000().setOrtho(f46000[0], ((Integer)this.f19000[7]).intValue(), ((Integer)this.f53000[0]).intValue(), f46000[1], f46000[2], f39000[0]);
      var1.m48000((Integer)this.f53000[1])
         .m60000((Integer)this.f53000[2])
         .m24000((Integer)this.f53000[3])
         .m46000((Integer)this.f53000[4])
         .m42000(((Integer)this.f51000[1]).intValue())
         .m66000(((Integer)this.f51000[2]).intValue())
         .m50000((Float)this.f53000[5])
         .m58000((Float)this.f1000[2])
         .m4000((Float)this.f1000[0])
         .m28000((Float)this.f1000[1]);
   }

   public float m50000() {
      return (((Integer)this.f51000[4]).intValue() - f35000[4]) / ((Integer)this.f19000[0]).intValue();
   }

   private void m54000(IlpOkkIjl var1) {
      var1.m40000().setOrtho(f4000[1], ((Integer)this.f19000[1]).intValue(), ((Integer)this.f19000[2]).intValue(), f4000[2], f4000[3], f5000[0]);
      var1.m48000(0)
         .m60000(0)
         .m24000((Integer)this.f19000[1])
         .m46000((Integer)this.f19000[2])
         .m42000(((Integer)this.f51000[1]).intValue())
         .m66000(((Integer)this.f51000[2]).intValue())
         .m50000(f5000[1])
         .m58000(f5000[2])
         .m4000(f5000[3])
         .m28000(f5000[4]);
   }

   private int m56000(int var1, int var2) {
      return Math.min(this.m82000(var1), var2);
   }

   private void m58000() {
      if (this.f36000 == null) {
         this.f36000 = new Object[f3000[4]];
         Object[] var1 = this.f36000;
      }

      if (this.f51000 == null) {
         this.f51000 = new Object[6];
         Object[] var2 = this.f51000;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0;
         var2[5] = 0;
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[8];
         Object[] var3 = this.f19000;
         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = 0;
         var3[4] = 0;
         var3[7] = 0;
      }

      if (this.f53000 == null) {
         this.f53000 = new Object[6];
         Object[] var4 = this.f53000;
         var4[0] = 0;
         var4[1] = 0;
         var4[2] = 0;
         var4[3] = 0;
         var4[4] = 0;
         var4[5] = f39000[1];
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var5 = this.f1000;
         var5[0] = f39000[2];
         var5[1] = f39000[3];
         var5[2] = f39000[4];
         var5[3] = f39000[5];
         var5[4] = f39000[6];
         var5[5] = f39000[7];
      }

      if (this.f27000 == null) {
         this.f27000 = new Object[7];
         Object[] var6 = this.f27000;
         var6[0] = f60000[0];
      }

      if (this.f34000 == null) {
         this.f34000 = new Object[6];
         Object[] var7 = this.f34000;
         var7[3] = 0;
         var7[4] = 0;
      }
   }

   public Iface0003 m60000(Iface0003 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return this.m62000(var1, null, var2, var3, var4, var5, var6, var7, var8);
   }

   private Iface0003 m62000(Iface0003 var1, Iface0003 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var7 > 0 && var8 > 0) {
         this.f19000[5] = var1;
         this.f19000[6] = var2;
         Integer var37 = Math.max(1, var3);
         this.f19000[3] = var37;
         Integer var38 = Math.max(1, var4);
         this.f19000[4] = var38;
         int var10 = Math.min(30, var9);
         this.m46000(var10);
         int var11 = NNWE.N(var5, 0, (Integer)this.f19000[3]);
         int var12 = NNWE.N(var6, 0, (Integer)this.f19000[4]);
         int var13 = NNWE.N(var5 + var7, 0, (Integer)this.f19000[3]);
         int var14 = NNWE.N(var6 + var8, 0, (Integer)this.f19000[4]);
         int var15 = var13 - var11;
         int var16 = var14 - var12;
         if (var15 > 0 && var16 > 0) {
            int var17 = this.m56000(var15, (Integer)this.f19000[3]);
            int var18 = this.m56000(var16, (Integer)this.f19000[4]);
            if (var17 > 0 && var18 > 0) {
               int var19 = this.m72000(var11, var17, (Integer)this.f19000[3]);
               int var20 = this.m72000(var12, var18, (Integer)this.f19000[4]);
               int var21 = var19 + var17;
               int var22 = var20 + var18;
               int var23 = this.m70000(var17);
               int var24 = this.m70000(var18);
               int var25 = this.m70000(var7);
               int var26 = this.m70000(var8);
               float var27 = (float)NNWE.N(var11 - var19, 0, var17) / var17;
               float var28 = f8000[0] - (float)NNWE.N(var21 - var13, 0, var17) / var17;
               float var29 = (float)NNWE.N(var22 - var14, 0, var18) / var18;
               float var30 = f8000[1] - (float)NNWE.N(var12 - var20, 0, var18) / var18;
               Integer var39 = var23;
               this.f51000[1] = var39;
               Integer var40 = var24;
               this.f51000[2] = var40;
               Integer var41 = var25;
               this.f51000[3] = var41;
               Integer var42 = var26;
               this.f51000[4] = var42;
               Integer var43 = this.m78000((Integer)this.f51000[5], (Integer)this.f51000[3]);
               this.f51000[5] = var43;
               Integer var44 = this.m78000((Integer)this.f19000[0], (Integer)this.f51000[4]);
               this.f19000[0] = var44;
               Integer var45 = var17;
               this.f19000[1] = var45;
               Integer var46 = var18;
               this.f19000[2] = var46;
               Integer var47 = var7;
               this.f19000[7] = var47;
               Integer var48 = var8;
               this.f53000[0] = var48;
               Integer var49 = var11 - var5;
               this.f53000[1] = var49;
               Integer var50 = var12 - var6;
               this.f53000[2] = var50;
               Integer var51 = var15;
               this.f53000[3] = var51;
               Integer var52 = var16;
               this.f53000[4] = var52;
               Float var53 = var27;
               this.f53000[5] = var53;
               Float var54 = var28;
               this.f1000[0] = var54;
               Float var55 = var29;
               this.f1000[1] = var55;
               Float var56 = var30;
               this.f1000[2] = var56;
               Float var57 = (float)var19 / ((Integer)this.f19000[3]).intValue();
               this.f1000[3] = var57;
               Float var58 = (float)var21 / ((Integer)this.f19000[3]).intValue();
               this.f1000[4] = var58;
               Float var59 = f8000[2] - (float)var20 / ((Integer)this.f19000[4]).intValue();
               this.f1000[5] = var59;
               Float var60 = f35000[0] - (float)var22 / ((Integer)this.f19000[4]).intValue();
               this.f27000[0] = var60;
               ((IlpOkkIjl)this.f36000[2]).m2000(var10).m56000((FloatBuffer)this.f34000[2]);
               ((IlpOkkIjl)this.f36000[2]).m52000().set(RenderSystem.getModelViewMatrix());
               Integer var61 = GL11.glGetInteger(36006);
               this.f34000[4] = var61;
               GL11.glGetIntegerv(2978, (int[])this.f34000[5]);
               ((Iface0003)this.f19000[6] != null ? (IlksOmts)this.f34000[1] : (IlksOmts)this.f34000[0]).m8000((IlpOkkIjl)this.f36000[2]);
               GlStateManager._glBindFramebuffer(36160, (Integer)this.f34000[4]);
               GL11.glViewport(((int[])this.f34000[5])[0], ((int[])this.f34000[5])[1], ((int[])this.f34000[5])[2], ((int[])this.f34000[5])[3]);
               return ((C0012)this.f27000[3]).m66000();
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void m64000(IlpOkkIjl var1) {
      var1.m40000().setOrtho(f35000[5], ((Integer)this.f19000[1]).intValue(), ((Integer)this.f19000[2]).intValue(), f35000[6], f35000[7], f4000[0]);
      var1.m48000(0)
         .m60000(0)
         .m24000((Integer)this.f19000[1])
         .m46000((Integer)this.f19000[2])
         .m42000(((Integer)this.f19000[3]).intValue())
         .m66000(((Integer)this.f19000[4]).intValue())
         .m50000((Float)this.f1000[3])
         .m58000((Float)this.f1000[5])
         .m4000((Float)this.f1000[4])
         .m28000((Float)this.f27000[0]);
   }

   public Iface0003 m66000(int var1, int var2, int var3, int var4, int var5) {
      ow var6 = ((NNuU)this.f36000[0]).Nt();
      return this.m62000(null, null, var6.U(), var6.E(), var1, var2, var3, var4, var5);
   }

   public Iface0003 m68000(Iface0003 var1, int var2, int var3, int var4, int var5, int var6) {
      ow var7 = ((NNuU)this.f36000[0]).Nt();
      return this.m62000(null, var1, var7.U(), var7.E(), var2, var3, var4, var5, var6);
   }

   private int m70000(int var1) {
      return Math.max(1, (var1 + 6 - 1) / 6);
   }

   private int m72000(int var1, int var2, int var3) {
      return var2 >= var3 ? 0 : NNWE.N(this.m42000(var1), 0, var3 - var2);
   }

   public float m74000() {
      return f35000[1];
   }

   private IlksOmts<IlpOkkIjl> m76000(Iface0597<IlpOkkIjl> var1, boolean var2) {
      C0826 var3 = IlksOmts.m22000().m18000(var1).m30000(this::m64000).m18000((C0012)this.f27000[1], false).m34000(this::m26000).m46000(33984, this::m8000);
      if (var2) {
         var3.m46000(33985, this::m14000);
      }

      return var3.m32000((OltOlmsps)this.f36000[3])
         .m30000(this::m54000)
         .m18000((C0012)this.f27000[2], false)
         .m34000(this::m26000)
         .m10000((C0012)this.f27000[1])
         .m32000((OltOlmsps)this.f51000[0])
         .m30000(this::m54000)
         .m18000((C0012)this.f27000[1], false)
         .m34000(this::m26000)
         .m10000((C0012)this.f27000[2])
         .m32000((BootstrapMethodsX)this.f27000[6])
         .m30000(this::m48000)
         .m42000((C0012)this.f27000[3], false)
         .m34000(this::m2000)
         .m10000((C0012)this.f27000[1])
         .m52000();
   }

   private int m78000(int var1, int var2) {
      return var2 <= var1 ? var1 : Math.max(32, (var2 + 32 - 1) / 32 * 32);
   }

   private static void m80000() {
      f16000 = new float[]{1.0F, 1.0F};
      f10000 = new float[]{1.0F, 1.0F, 6.0F, 6.0F, 0.0F};
      f8000 = new float[]{1.0F, 1.0F, 1.0F};
      f35000 = new float[]{1.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F};
      f4000 = new float[]{1.0F, 0.0F, 0.0F, -1.0F};
      f5000 = new float[]{1.0F, 0.0F, 1.0F, 1.0F, 0.0F};
      f46000 = new float[]{0.0F, 0.0F, -1.0F};
      f39000 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f60000 = new float[]{0.0F};
   }

   private int m82000(int var1) {
      return (Math.max(0, var1) + f3000[1] - 1) / f3000[2] * f3000[3];
   }
}
