package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NNuo;
import KDFzREm.NxU;
import KDFzREm.ow;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Vector2i;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0642;
import rw.data.Rec0279;
import rw.defs.Enum0062;
import rw.defs.Enum0063;
import rw.defs.Enum0072;
import rw.defs.Enum0081;
import rw.gui.IlkOns;
import rw.gui.PgUp;
import rw.module.Huddumped;
import rw.setting.EyEa;

public class C1056 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static byte[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;
   private static short[] f17000;
   private static int[] f18000;
   private static short[] f19000;
   private static String[] f20000;
   private static short[] f21000;
   private static float[] f22000;
   private static float[] f23000;
   private static short[] f24000;
   private static boolean[] f25000;
   public Object[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static byte[] f29000;
   public static Object[] f30000;
   private static double[] f31000;
   private static short[] f32000;
   private static byte[] f33000;
   private static boolean[] f34000;
   public Object[] f35000;

   private void m2000() {
      ow var1 = ((NNuU)this.f26000[f6000[3]]).Nt();
      long var2 = var1.B();
      Integer var8 = GLFW.glfwGetInputMode(var2, f18000[1]);
      this.f9000[f6000[4]] = var8;
      GLFW.glfwSetInputMode(var2, f18000[2], f18000[3]);
      Boolean var9 = f34000[3];
      this.f9000[f27000[0]] = var9;
   }

   private static void m10000() {
      float[] var128 = new float[3];
      f22000[(0 | -0) >>> 31] = Float.intBitsToFloat(1125122048);
      f22000[(1 | -1) >>> 31] = Float.intBitsToFloat(1116733440);
      f22000[2] = Float.intBitsToFloat(1116733440);
      float[] var129 = new float[6];
      f23000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f23000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f23000[2] = Float.intBitsToFloat(1065353216);
      f23000[3] = Float.intBitsToFloat(1065353216);
      f23000[4] = Float.intBitsToFloat(1116733440);
      f23000[5] = Float.intBitsToFloat(1094713344);
   }

   public C1056(
      Rec0279 var1,
      Iface0196<C1056> var2,
      Iface0196<Boolean> var3,
      Iface0196<Float> var4,
      Iface0196<Float> var5,
      Iface0196<Float> var6,
      Iface0196<String> var7,
      Iface0196<String> var8
   ) {
      this.m40000();
      NNuU var13 = NNuU.Nq();
      this.f26000[f17000[0]] = var13;
      C0012 var14 = C0012.m84000((Integer)f30000[f17000[1]], (Integer)f30000[f19000[0]])
         .m20000((Enum0062)Enum0062.f2000[f19000[1]])
         .m44000((Enum0063)Enum0063.f1000[f19000[2]], (Enum0063)Enum0063.f1000[f7000[0]])
         .m34000(f20000[0])
         .m40000();
      this.f26000[f7000[1]] = var14;
      Integer var15 = f18000[0];
      this.f9000[f7000[2]] = var15;
      this.f26000[f24000[0]] = var1;
      this.f26000[f24000[1]] = var2;
      this.f9000[f24000[2]] = var3;
      this.f9000[f24000[3]] = var4;
      this.f9000[f24000[4]] = var5;
      this.f9000[f24000[5]] = var6;
      this.f9000[f8000[0]] = var7;
      this.f9000[f8000[1]] = var8;
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private void m12000() {
      NxU var1 = ((NNuU)this.f26000[f1000[2]]).e();
      Vector2i var2 = C0881.m20000(((NNuo)((NNuU)this.f26000[f1000[3]]).L[f1000[4]]).i(), ((NNuo)((NNuU)this.f26000[f1000[5]]).L[f1000[6]]).R());
      int var3 = Math.clamp((long)var2.x(), f25000[2], var1.N - f25000[3]);
      int var4 = Math.clamp((long)var2.y(), f25000[4], var1.y - f25000[5]);
      int var5 = Math.clamp((long)(var3 - (Integer)f30000[f11000[0]]), f25000[6], var1.N - (Integer)f30000[f11000[1]]);
      int var6 = Math.clamp((long)(var4 - (Integer)f30000[f21000[0]]), f25000[7], var1.y - (Integer)f30000[f21000[1]]);
      int var7 = var1.y - var6 - (Integer)f30000[f21000[2]];
      IlkOns.m102000(
         var1,
         (C0012)this.f26000[f21000[3]],
         var5,
         var7,
         (Integer)f30000[f21000[4]],
         (Integer)f30000[f21000[5]],
         f34000[0],
         f34000[1],
         (Integer)f30000[f21000[6]],
         (Integer)f30000[f6000[0]]
      );
      IlkOns.m94000(var1, f34000[2]);
      float var8 = f22000[0];
      C0806.m32000(
         ((C0805)f30000[f6000[1]]).m18000(), var2.x() - f22000[1], var2.y() - f22000[2], var8, var8, f23000[0], f23000[1], f23000[2], f23000[3], f29000[2]
      );
      ((C0805)f30000[f6000[2]]).m32000(var5x -> {
         var5x.m66000(f20000[1]).m18000(IlkOns.m10000());
         var5x.m66000(f20000[2]).m18000(RenderSystem.getModelViewMatrix());
         var5x.m10000(f20000[3]).m6000(((C0012)this.f26000[f27000[5]]).m66000());
         var5x.m106000(f20000[4]).m18000(((Integer)f30000[f27000[6]]).intValue(), ((Integer)f30000[f27000[7]]).intValue());
         var5x.m106000(f20000[5]).m18000(var3 - var5, var4 - var6);
      });
   }

   private static void m16000() {
      f30000 = new Object[f10000[3]];
      f30000[f12000[(0 | -0) >>> 31]] = f23000[4];
      f30000[f12000[(1 | -1) >>> 31]] = f23000[5];
      f30000[f10000[4]] = Integer.valueOf(f12000[2]);
      f30000[f10000[5]] = Integer.valueOf(f12000[3]);
   }

   private static void m20000() {
      f20000 = new String[6];
      f20000[(0 | -0) >>> 31] = "color_picker_pipette_preview";
      f20000[(1 | -1) >>> 31] = "u_projection";
      f20000[2] = "u_view";
      f20000[3] = "texture_in";
      f20000[4] = "u_source_size";
      f20000[5] = "u_center_px";
   }

   private void m24000() {
      if ((Boolean)this.f9000[f27000[1]]) {
         GLFW.glfwSetInputMode(((NNuU)this.f26000[f27000[2]]).Nt().B(), f18000[4], (Integer)this.f9000[f27000[3]]);
         Boolean var5 = f34000[4];
         this.f9000[f27000[4]] = var5;
      }
   }

   private static void m26000() {
      short[] var128 = new short[2];
      f17000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f17000[(1 | -1) >>> 31] = 3;
      short[] var129 = new short[3];
      f19000[(0 | -0) >>> 31] = 3;
      f19000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f19000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 6;
      short[] var131 = new short[6];
      f24000[(0 | -0) >>> 31] = 2;
      f24000[(1 | -1) >>> 31] = 3;
      f24000[2] = (short)((0 | -0) >>> 31);
      f24000[3] = (short)((1 | -1) >>> 31);
      f24000[4] = 2;
      f24000[5] = 3;
      short[] var132 = new short[8];
      f8000[(0 | -0) >>> 31] = 4;
      f8000[(1 | -1) >>> 31] = 5;
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = (short)((0 | -0) >>> 31);
      f8000[4] = (short)((1 | -1) >>> 31);
      f8000[5] = (short)((1 | -1) >>> 31);
      f8000[6] = (short)((0 | -0) >>> 31);
      f8000[7] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[2];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      short[] var134 = new short[5];
      f13000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f13000[(1 | -1) >>> 31] = 2;
      f13000[2] = 3;
      f13000[3] = 2;
      f13000[4] = 4;
      short[] var135 = new short[2];
      f32000[(0 | -0) >>> 31] = 5;
      f32000[(1 | -1) >>> 31] = 3;
      short[] var136 = new short[4];
      f14000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f14000[2] = (short)((0 | -0) >>> 31);
      f14000[3] = (short)((0 | -0) >>> 31);
      short[] var137 = new short[7];
      f28000[(0 | -0) >>> 31] = 2;
      f28000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f28000[2] = 2;
      f28000[3] = 3333;
      f28000[4] = 3333;
      f28000[5] = 6407;
      f28000[6] = 5121;
      short[] var138 = new short[3];
      f15000[(0 | -0) >>> 31] = 3333;
      f15000[(1 | -1) >>> 31] = 255;
      f15000[2] = 255;
      short[] var139 = new short[7];
      f1000[(0 | -0) >>> 31] = 255;
      f1000[(1 | -1) >>> 31] = 255;
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = 2;
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = 2;
      short[] var140 = new short[2];
      f11000[(0 | -0) >>> 31] = 2;
      f11000[(1 | -1) >>> 31] = 3;
      short[] var141 = new short[7];
      f21000[(0 | -0) >>> 31] = 2;
      f21000[(1 | -1) >>> 31] = 3;
      f21000[2] = 3;
      f21000[3] = (short)((1 | -1) >>> 31);
      f21000[4] = 3;
      f21000[5] = 3;
      f21000[6] = 3;
      short[] var142 = new short[5];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = 4;
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = 6;
      short[] var143 = new short[8];
      f27000[(0 | -0) >>> 31] = 7;
      f27000[(1 | -1) >>> 31] = 7;
      f27000[2] = (short)((0 | -0) >>> 31);
      f27000[3] = 6;
      f27000[4] = 7;
      f27000[5] = (short)((1 | -1) >>> 31);
      f27000[6] = 3;
      f27000[7] = 3;
   }

   private static void m28000() {
      double[] var128 = new double[(1 | -1) >>> 31];
      f31000[(0 | -0) >>> 31] = Double.longBitsToDouble(4618441417868443648L);
   }

   private static void m30000() {
      byte[] var128 = new byte[5];
      f29000[(0 | -0) >>> 31] = 3;
      f29000[(1 | -1) >>> 31] = 2;
      f29000[2] = -1;
      f29000[3] = 2;
      f29000[4] = 2;
      byte[] var129 = new byte[8];
      f33000[(0 | -0) >>> 31] = 2;
      f33000[(1 | -1) >>> 31] = 3;
      f33000[2] = 4;
      f33000[3] = 2;
      f33000[4] = 6;
      f33000[5] = 6;
      f33000[6] = 4;
      f33000[7] = 4;
      byte[] var130 = new byte[6];
      f10000[(0 | -0) >>> 31] = 8;
      f10000[(1 | -1) >>> 31] = 6;
      f10000[2] = 7;
      f10000[3] = 5;
      f10000[4] = 2;
      f10000[5] = 3;
   }

   private void m40000() {
      if (this.f26000 == null) {
         this.f26000 = new Object[f33000[7]];
         Object[] var1 = this.f26000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[f10000[0]];
         Object[] var2 = this.f9000;
         var2[f10000[1]] = Integer.valueOf(f2000[2]);
         var2[f10000[2]] = f2000[3];
      }

      if (this.f35000 == null) {
         this.f35000 = new Object[f2000[4]];
         Object[] var3 = this.f35000;
         var3[f2000[5]] = f2000[6];
      }
   }

   private static void m42000() {
      boolean[] var128 = new boolean[7];
      f16000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
      f16000[3] = (boolean)((0 | -0) >>> 31);
      f16000[4] = (boolean)((0 | -0) >>> 31);
      f16000[5] = (boolean)((1 | -1) >>> 31);
      f16000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[4];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[2];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[8];
      f25000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f25000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f25000[2] = (boolean)((0 | -0) >>> 31);
      f25000[3] = (boolean)((1 | -1) >>> 31);
      f25000[4] = (boolean)((0 | -0) >>> 31);
      f25000[5] = (boolean)((1 | -1) >>> 31);
      f25000[6] = (boolean)((0 | -0) >>> 31);
      f25000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[7];
      f34000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f34000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f34000[2] = (boolean)((0 | -0) >>> 31);
      f34000[3] = (boolean)((1 | -1) >>> 31);
      f34000[4] = (boolean)((0 | -0) >>> 31);
      f34000[5] = (boolean)((1 | -1) >>> 31);
      f34000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[7];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[4];
      f12000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[2] = (boolean)((0 | -0) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
   }

   @Iface0642(
      y = Enum0081.LISTENER
   )
   public void m48000(C0717 var1) {
      if ((Boolean)this.f35000[f8000[6]]) {
         Boolean var7 = f16000[1];
         this.f35000[f8000[7]] = var7;
         int var2 = C0876.m70000(this.m62000(), C0876.m46000(((Rec0279)this.f26000[f4000[0]]).m10000()));
         EyEa.m150000(
            (Rec0279)this.f26000[f4000[1]],
            var2,
            (Iface0196<Float>)this.f9000[f13000[0]],
            (Iface0196<Float>)this.f9000[f13000[1]],
            (Iface0196<Float>)this.f9000[f13000[2]]
         );
         EyEa.m160000((Rec0279)this.f26000[f13000[3]], var2, (Iface0196<String>)this.f9000[f13000[4]], (Iface0196<String>)this.f9000[f32000[0]]);
         this.m54000();
      } else {
         this.m12000();
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m52000(Huddumped var1) {
      if (var1.m18000()) {
         if (var1.m20000().m26000((Enum0072)Enum0072.f1000[f8000[2]]) && var1.m30000() == 0) {
            var1.N();
            Boolean var6 = f16000[0];
            this.f35000[f8000[3]] = var6;
         } else {
            if (var1.m20000().m26000((Enum0072)Enum0072.f1000[f8000[4]]) && var1.m36000((PgUp)PgUp.f16000[f8000[5]])) {
               var1.N();
               this.m54000();
            }
         }
      }
   }

   public void m54000() {
      NursultanClient.m8000().m66000(this);
      ((Iface0196)this.f26000[f32000[1]]).m6000(null);
      ((Iface0196)this.f9000[f14000[0]]).m6000(f16000[2]);
      Boolean var5 = f16000[3];
      this.f35000[f14000[1]] = var5;
      this.m24000();
   }

   private static void m58000() {
      int[] var128 = new int[5];
      f18000[(0 | -0) >>> 31] = 212993;
      f18000[(1 | -1) >>> 31] = 208897;
      f18000[2] = 208897;
      f18000[3] = 212994;
      f18000[4] = 208897;
   }

   private int m62000() {
      NxU var1 = ((NNuU)this.f26000[f14000[2]]).e();
      Vector2i var2 = C0881.m20000(((NNuo)((NNuU)this.f26000[f14000[3]]).L[f28000[0]]).i(), ((NNuo)((NNuU)this.f26000[f28000[1]]).L[f28000[2]]).R());
      int var3 = Math.clamp((long)var2.x(), f16000[4], var1.N - f16000[5]);
      int var4 = Math.clamp((long)(var1.y - f16000[6] - var2.y()), f3000[0], var1.y - f3000[1]);
      ByteBuffer var5 = BufferUtils.createByteBuffer(f29000[0]);
      IlkOns.m94000(var1, f3000[2]);
      int var6 = GL11.glGetInteger(f28000[3]);
      GL11.glPixelStorei(f28000[4], f3000[3]);
      GL11.glReadPixels(var3, var4, f5000[0], f5000[1], f28000[5], f28000[6], var5);
      GL11.glPixelStorei(f15000[0], var6);
      int var7 = var5.get(f25000[0]) & f15000[1];
      int var8 = var5.get(f25000[1]) & f15000[2];
      int var9 = var5.get(f29000[1]) & f1000[0];
      return C0876.m34000(var7, var8, var9, f1000[1]);
   }
}
