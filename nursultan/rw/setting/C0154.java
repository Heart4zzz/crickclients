package rw.setting;

import KDFzREm.NNBK;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNiR;
import KDFzREm.NNNYO;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NxU;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import org.joml.Matrix3x2fStack;
import org.lwjgl.opengl.GL11;
import rw.api.Iface0642;
import rw.core.C0022;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0814;
import rw.core.C0920;
import rw.core.C1193;
import rw.core.C1240;
import rw.core.OlqOrnin;
import rw.data.Oljjtpnom;
import rw.gui.IlkOns;

public class C0154 {
   private static short[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static byte[] f7000;
   private static byte[] f8000;
   private static short[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   public Object[] f13000;
   private static short[] f14000;
   private static float[] f15000;
   private static String[] f16000;
   private static short[] f17000;
   private static float[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static double[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static byte[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   public Object[] f30000;
   private static short[] f31000;
   private static byte[] f32000;
   private static short[] f33000;
   private static short[] f34000;

   private void m2000(int var1) {
      if (!((boolean[])this.f30000[4])[var1]) {
         ((boolean[])this.f30000[4])[var1] = (boolean)1;
         ((IntArrayList)this.f30000[3]).add(var1);
      }
   }

   private void m4000(NNBK var1) {
      C1240.m22000();
      ((NNNYO)((NNuU)f3000[0]).i[5]).M.N((GpuBufferSlice)IlkOns.f24000[0]);
      if (!(Boolean)this.f13000[1]) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(((NxU)this.f10000[5]).L(), 0, ((NxU)this.f10000[5]).i(), f24000[0]);
         this.m26000();
         Boolean var7 = true;
         this.f13000[1] = var7;
      }

      OlqOrnin.m20000((NxU)this.f10000[5]);
      IlkOns.m44000(((Integer)this.f10000[2]).intValue(), ((Integer)this.f10000[2]).intValue());
      C0022.m22000(RenderSystem.getProjectionMatrixBuffer());

      try {
         IlkOns.m94000((NxU)this.f10000[5], (boolean)1);
         this.m18000();
         this.m40000(var1);
         ((NNNYO)((NNuU)f3000[0]).i[5]).M.N((GpuBufferSlice)IlkOns.f24000[0]);
      } finally {
         C0022.m20000();
         OlqOrnin.m2000();
         IlkOns.m94000(((NNuU)f3000[0]).e(), (boolean)1);
         IlkOns.m84000();
      }

      for (int var2 = 0; var2 < ((IntArrayList)this.f30000[3]).size(); var2++) {
         ((boolean[])this.f30000[4])[((IntArrayList)this.f30000[3]).getInt(var2)] = (boolean)0;
      }

      ((IntArrayList)this.f30000[3]).clear();
      C1240.m20000();
   }

   public int m6000() {
      return (Integer)this.f10000[0];
   }

   private static void m10000() {
      f21000 = new short[]{6, 3, 2};
      f19000 = new short[]{3, 0, 1, 2, 3};
      f4000 = new short[]{4, 2, 2, 5, 4, 0, 4, 1};
      f6000 = new short[]{4, 2, 4, 4, 6, 0};
      f12000 = new short[]{0, 6, 0, 2, 1};
      f33000 = new short[]{0, 5, 2, 2, 3};
      f5000 = new short[]{3, 5, 1};
      f2000 = new short[]{6, 4, 0};
      f26000 = new short[]{1, 2, 4, 3, 5, 1};
      f14000 = new short[]{2, 0, 4, 2, 0, 0, 3, 1};
      f20000 = new short[]{5, 4, 5, 5, 6};
      f28000 = new short[]{0, 6};
      f22000 = new short[]{0, 2, 4, 1, 1, 4};
      f29000 = new short[]{4, 3, 5, 3553, 10241, 9728};
      f1000 = new short[]{3553, 10240, 9728, 0, 5, 0, 1};
      f9000 = new short[]{5, 5, 1, 5, 2, 2};
      f17000 = new short[]{5, 0, 5, 0, 0, 0, 3, 4};
      f11000 = new short[]{3, 3, 3089, 3, 3};
      f23000 = new short[]{1, 1, 0, 0, 2};
      f25000 = new short[]{0, 0, 0, 16384, 3089, 0, 3, 3};
      f34000 = new short[]{2, 1, 1};
      f31000 = new short[]{0, 0, 1, 1, 3, 3, 3, 3};
   }

   public C0154() {
      this(32, 32);
   }

   public C0154(int var1, int var2) {
      this.m74000();
      Int2IntOpenHashMap var7 = new Int2IntOpenHashMap();
      this.f10000[6] = var7;
      IntArrayList var8 = new IntArrayList(64);
      this.f30000[3] = var8;
      Integer var9 = -1;
      this.f13000[2] = var9;
      String var10 = f16000[0];
      this.f13000[3] = var10;
      Integer var11 = var1;
      this.f10000[0] = var11;
      Integer var12 = var2;
      this.f10000[1] = var12;
      Integer var13 = var2 * var1;
      this.f10000[2] = var13;
      Float var14 = f15000[0] / var2;
      this.f10000[3] = var14;
      Integer var15 = var2 * var2;
      this.f10000[4] = var15;
      TextureTarget var16 = new TextureTarget(null, (Integer)this.f10000[2], (Integer)this.f10000[2], true);
      this.f10000[5] = var16;
      int[] var17 = new int[this.f10000[4]];
      this.f30000[0] = var17;
      int[] var18 = new int[this.f10000[4]];
      this.f30000[1] = var18;
      NQo[] var19 = new NQo[this.f10000[4]];
      this.f30000[2] = var19;
      boolean[] var20 = new boolean[this.f10000[4]];
      this.f30000[4] = var20;
      ((Int2IntOpenHashMap)this.f10000[6]).defaultReturnValue(-1);
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f16000 = new String[]{"glidfy:0", "textures"};
   }

   private Oljjtpnom m16000(int var1) {
      int var2 = var1 % (Integer)this.f10000[1];
      int var3 = var1 / (Integer)this.f10000[1];
      float var4 = var2 * (Float)this.f10000[3];
      float var5 = var3 * (Float)this.f10000[3];
      float var6 = var4 + (Float)this.f10000[3];
      float var7 = var5 + (Float)this.f10000[3];
      return new Oljjtpnom(var1, var4, var5, var6, var7);
   }

   private void m18000() {
      GL11.glColorMask((boolean)1, (boolean)1, (boolean)1, (boolean)1);
      GL11.glDepthMask((boolean)1);
      GL11.glClearColor(f15000[3], f15000[4], f15000[5], f15000[6]);
      GL11.glEnable(3089);

      for (int var1 = 0; var1 < ((IntArrayList)this.f30000[3]).size(); var1++) {
         int var2 = ((IntArrayList)this.f30000[3]).getInt(var1);
         int var3 = var2 % (Integer)this.f10000[1];
         int var4 = var2 / (Integer)this.f10000[1];
         int var5 = var3 * (Integer)this.f10000[0];
         int var6 = var4 * (Integer)this.f10000[0];
         int var7 = (Integer)this.f10000[2] - var6 - (Integer)this.f10000[0];
         GL11.glScissor(var5, var7, (Integer)this.f10000[0], (Integer)this.f10000[0]);
         GL11.glClear(16384);
      }

      GL11.glDisable(3089);
   }

   private static void m24000() {
      f15000 = new float[]{1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 16.0F};
      f18000 = new float[]{0.0F};
   }

   private void m26000() {
      GlStateManager._activeTexture(33984);
      GlStateManager._bindTexture(IlkOns.m74000((NxU)this.f10000[5]));
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
   }

   private static void m28000() {
      f8000 = new byte[]{32, 32, 64, -1, -1, -1, -1, -1};
      f27000 = new byte[]{-1, 7, 2};
      f7000 = new byte[]{3, 4, 6, 5, 4, 2, 4};
      f32000 = new byte[]{32, 2, 32, 3, 16};
   }

   private int m30000() {
      int var1 = -1;
      int var2 = Integer.MAX_VALUE;

      for (int var3 = 0; var3 < this.f10000[4]; var3++) {
         if (((int[])this.f30000[1])[var3] < var2) {
            var2 = ((int[])this.f30000[1])[var3];
            var1 = var3;
            if (var2 == 0) {
               break;
            }
         }
      }

      return var1;
   }

   private static void m34000() {
      f3000 = new Object[]{null, 32, 32, 16};
   }

   private void m38000(Property var1) {
      for (int var2 = 0; var2 < this.f10000[4]; var2++) {
         NQo var3 = ((NQo[])this.f30000[2])[var2];
         if (var3 != null && !var3.R()) {
            NNNNiR var4 = (NNNNiR)var3.method_58694(NNNNRZ.Nb);
            if (var4 != null) {
               GameProfile var5 = var4.y();
               if (var5 != null && var5.properties().get(f16000[1]).contains(var1)) {
                  this.m2000(var2);
               }
            }
         }
      }
   }

   private void m40000(NNBK var1) {
      C1240.m22000();
      Matrix3x2fStack var2 = var1.i();
      float var3 = ((Integer)this.f10000[0]).intValue() / f15000[7];

      for (int var4 = 0; var4 < ((IntArrayList)this.f30000[3]).size(); var4++) {
         int var5 = ((IntArrayList)this.f30000[3]).getInt(var4);
         NQo var6 = ((NQo[])this.f30000[2])[var5];
         if (var6 != null && !var6.R()) {
            int var7 = var5 % (Integer)this.f10000[1];
            int var8 = var5 / (Integer)this.f10000[1];
            float var9 = var7 * (Integer)this.f10000[0];
            float var10 = var8 * (Integer)this.f10000[0];
            var2.pushMatrix();
            var2.translate(var9, var10);
            var2.scale(var3);
            var1.N(var6, 0, 0);
            var2.popMatrix();
         }
      }
   }

   public String m42000() {
      int var1 = IlkOns.m74000((NxU)this.f10000[5]);
      if (var1 != (Integer)this.f13000[2]) {
         Integer var6 = var1;
         this.f13000[2] = var6;
         String var7 = "glidfy:" + var1;
         this.f13000[3] = var7;
      }

      return (String)this.f13000[3];
   }

   private static void m48000() {
      f24000 = new double[]{1.0};
   }

   @Iface0642
   public void m50000(C0920 var1) {
      Property var2 = var1.m12000();
      if (var2 != null) {
         ((NNuU)f3000[0]).execute(() -> this.m38000(var2));
      }
   }

   @Iface0642
   public void m52000(rw.core.C0151 var1) {
      ((Int2IntOpenHashMap)this.f10000[6]).clear();

      for (int var2 = 0; var2 < this.f10000[4]; var2++) {
         ((int[])this.f30000[0])[var2] = 0;
         ((int[])this.f30000[1])[var2] = 0;
         ((NQo[])this.f30000[2])[var2] = null;
         ((boolean[])this.f30000[4])[var2] = (boolean)0;
      }

      ((IntArrayList)this.f30000[3]).clear();
      Integer var7 = 0;
      this.f30000[5] = var7;
      Boolean var8 = false;
      this.f13000[1] = var8;
      Integer var9 = -1;
      this.f13000[2] = var9;
   }

   public void m54000(NQo var1, float var2, float var3, float var4) {
      Oljjtpnom var5 = this.m70000(var1);
      if (var5.m4000()) {
         C0806.m32000(
            ((C0805)C0814.f15000[1]).m18000(),
            NNWE.y(var2),
            NNWE.y(var3),
            var4,
            var4,
            var5.m22000(),
            f15000[1] - var5.m28000(),
            var5.m30000(),
            f15000[2] - var5.m14000(),
            -1
         );
      }
   }

   private int m58000(int var1, NQo var2) {
      int var3;
      if ((Integer)this.f30000[5] < (Integer)this.f10000[4]) {
         int var10002 = (Integer)this.f30000[5];
         Integer var8 = var10002 + 1;
         this.f30000[5] = var8;
         var3 = var10002;
      } else {
         var3 = this.m30000();
         if (var3 < 0) {
            return -1;
         }

         ((Int2IntOpenHashMap)this.f10000[6]).remove(((int[])this.f30000[f28000[0]])[var3]);
      }

      ((Int2IntOpenHashMap)this.f10000[f28000[1]]).put(var1, var3);
      ((int[])this.f30000[0])[var3] = var1;
      ((NQo[])this.f30000[2])[var3] = var2;
      this.m2000(var3);
      return var3;
   }

   public void m60000(NNBK var1) {
      Integer var6 = (Integer)this.f13000[0] + 1;
      this.f13000[0] = var6;
      if (!((IntArrayList)this.f30000[3]).isEmpty() || !(Boolean)this.f13000[1]) {
         this.m4000(var1);
      }
   }

   public int m68000() {
      return IlkOns.m74000((NxU)this.f10000[5]);
   }

   public Oljjtpnom m70000(NQo var1) {
      if (var1 != null && !var1.R()) {
         int var2 = C1193.m72000(var1);
         int var3 = ((Int2IntOpenHashMap)this.f10000[6]).get(var2);
         if (var3 < 0) {
            var3 = this.m58000(var2, var1);
            if (var3 < 0) {
               return (Oljjtpnom)Oljjtpnom.f3000[0];
            }
         } else {
            ((NQo[])this.f30000[2])[var3] = var1;
         }

         ((int[])this.f30000[1])[var3] = (Integer)this.f13000[0];
         return this.m16000(var3);
      } else {
         return (Oljjtpnom)Oljjtpnom.f3000[0];
      }
   }

   private void m74000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[7];
         Object[] var1 = this.f10000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[f7000[0]] = f18000[0];
         var1[f7000[1]] = 0;
      }

      if (this.f30000 == null) {
         this.f30000 = new Object[f7000[2]];
         Object[] var2 = this.f30000;
         var2[f7000[3]] = 0;
      }

      if (this.f13000 == null) {
         this.f13000 = new Object[f7000[4]];
         Object[] var3 = this.f13000;
         var3[0] = 0;
         var3[1] = false;
         var3[f7000[5]] = 0;
      }
   }
}
