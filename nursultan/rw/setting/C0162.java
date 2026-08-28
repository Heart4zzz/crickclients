package rw.setting;

import KDFzREm.NNIK;
import KDFzREm.NNIp;
import KDFzREm.NNNNWN;
import KDFzREm.NNNNWR;
import KDFzREm.NNNNWu;
import KDFzREm.NWU;
import KDFzREm.NWW;
import KDFzREm.Ngg;
import KDFzREm.NhA;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rw.api.Iface0592;
import rw.data.Rec0285;

public class C0162 extends NNIp {
   public Object[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static float[] f9000;
   private static byte[] f10000;
   private static float[] f11000;
   private static byte[] f12000;
   private static float[] f13000;
   private static String[] f14000;
   private static byte[] f15000;
   private static boolean[] f16000;
   public static Object[] f17000;
   private static byte[] f18000;
   private static byte[] f19000;
   private static short[] f20000;
   private static byte[] f21000;
   private static byte[] f22000;
   private static byte[] f23000;
   private static boolean[] f24000;
   private static byte[] f25000;
   private static short[] f26000;
   private static byte[] f27000;

   public void m8000() {
   }

   private static void m10000() {
      f14000 = new String[3];
      f14000[(0 | -0) >>> 31] = "glint";
      f14000[(1 | -1) >>> 31] = "Sampler0";
      f14000[2] = "Sampler0";
   }

   private float m12000(int var1) {
      return (var1 / f11000[0] + f11000[1]) / f11000[2];
   }

   public C0162() {
      super(new NNNNWN(f6000[0]), new LinkedHashMap());
      this.m22000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f1000[f6000[1]] = var5;
      ArrayList var6 = new ArrayList();
      this.f1000[f6000[2]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      float[] var128 = new float[4];
      f13000[(0 | -0) >>> 31] = Float.intBitsToFloat(1123942400);
      f13000[(1 | -1) >>> 31] = Float.intBitsToFloat(1123942400);
      f13000[2] = Float.intBitsToFloat(1123942400);
      f13000[3] = Float.intBitsToFloat(1065353216);
      float[] var129 = new float[3];
      f11000[(0 | -0) >>> 31] = Float.intBitsToFloat(1098907648);
      f11000[(1 | -1) >>> 31] = Float.intBitsToFloat(1056964608);
      f11000[2] = Float.intBitsToFloat(1098907648);
      float[] var130 = new float[3];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1123942400);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1123942400);
      f2000[2] = Float.intBitsToFloat(1123942400);
      float[] var131 = new float[6];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f5000[2] = Float.intBitsToFloat(1065353216);
      f5000[3] = Float.intBitsToFloat(1058642330);
      f5000[4] = Float.intBitsToFloat(1053609165);
      f5000[5] = Float.intBitsToFloat(1045220557);
      float[] var132 = new float[5];
      f9000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f9000[(1 | -1) >>> 31] = Float.intBitsToFloat(-1087163597);
      f9000[2] = Float.intBitsToFloat(-1102263091);
      f9000[3] = Float.intBitsToFloat(1065353216);
      f9000[4] = Float.intBitsToFloat(1060320051);
   }

   private static void m18000() {
      short[] var128 = new short[5];
      f6000[(0 | -0) >>> 31] = 256;
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[7];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((1 | -1) >>> 31);
      f7000[3] = (short)((1 | -1) >>> 31);
      f7000[4] = 240;
      f7000[5] = 240;
      f7000[6] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[3];
      f8000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      short[] var131 = new short[3];
      f20000[(0 | -0) >>> 31] = 2;
      f20000[(1 | -1) >>> 31] = 2;
      f20000[2] = 255;
      short[] var132 = new short[7];
      f26000[(0 | -0) >>> 31] = 255;
      f26000[(1 | -1) >>> 31] = 255;
      f26000[2] = 255;
      f26000[3] = 255;
      f26000[4] = 255;
      f26000[5] = 255;
      f26000[6] = (short)((1 | -1) >>> 31);
   }

   private void m22000() {
      this.f1000 = new Object[f3000[4]];
   }

   private static void m24000() {
      boolean[] var128 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
      f4000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[7];
      f16000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[2] = (boolean)((1 | -1) >>> 31);
      f16000[3] = (boolean)((0 | -0) >>> 31);
      f16000[4] = (boolean)((1 | -1) >>> 31);
      f16000[5] = (boolean)((1 | -1) >>> 31);
      f16000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[5];
      f24000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[2] = (boolean)((0 | -0) >>> 31);
      f24000[3] = (boolean)((1 | -1) >>> 31);
      f24000[4] = (boolean)((0 | -0) >>> 31);
   }

   private static void m26000() {
      f17000 = new Object[f3000[5]];
      f17000[f24000[4]] = f14000[2];
   }

   public void m28000() {
   }

   private int m32000(ByteBuffer var1, int var2) {
      int var3 = var1.get(var2) & f26000[2];
      int var4 = var1.get(var2 + f16000[5]) & f26000[3];
      int var5 = var1.get(var2 + f19000[6]) & f26000[4];
      int var6 = var1.get(var2 + f19000[7]) & f26000[5];
      return var6 << f15000[0] | var3 << f15000[1] | var4 << f15000[2] | var5;
   }

   private GpuTextureView m38000(Ngg var1) {
      NWU var2 = ((Iface0592)var1).nursultan$getRenderSetup();
      Map var3 = var2.N();
      NWW var4 = (NWW)var3.get(f14000[1]);
      if (var4 == null) {
         var4 = (NWW)var3.values().stream().findFirst().orElse(null);
      }

      return var4 == null ? null : var4.N();
   }

   public List<Rec0285> m40000() {
      this.m22000();
      ArrayList var1 = new ArrayList(((Map)this.f1000[f6000[4]]).size());
      ((Map)this.f1000[f7000[0]]).forEach((var2, var3) -> {
         Rec0285 var4 = this.m58000(var2, var3.N());
         if (var4 != null) {
            var1.add(var4);
         }
      });
      return var1;
   }

   public void m42000(Ngg var1) {
   }

   private int[] m44000(class_5596 var1, int var2) {
      if (var1 == class_5596.field_27382) {
         int var8 = var2 / f15000[3];
         int[] var9 = new int[var8 * f15000[4]];

         for (int var5 = f16000[6]; var5 < var8; var5++) {
            int var6 = var5 * f15000[5];
            int var7 = var5 * f15000[6];
            var9[var7] = var6;
            var9[var7 + f24000[0]] = var6 + f24000[1];
            var9[var7 + f18000[0]] = var6 + f18000[1];
            var9[var7 + f18000[2]] = var6 + f18000[3];
            var9[var7 + f3000[0]] = var6 + f3000[1];
            var9[var7 + f3000[2]] = var6;
         }

         return var9;
      } else if (var1 != class_5596.field_27379) {
         return null;
      } else {
         int[] var3 = new int[var2];
         int var4 = f24000[2];

         while (var4 < var2) {
            var3[var4] = var4++;
         }

         return var3;
      }
   }

   private float m46000(ByteBuffer var1, int var2) {
      float var3 = var1.get(var2) / f2000[0];
      float var4 = var1.get(var2 + f4000[6]) / f2000[1];
      float var5 = var1.get(var2 + f10000[3]) / f2000[2];
      float var6 = Math.max(
         f5000[0], ((float[])f17000[f7000[6]])[f4000[7]] * var3 + ((float[])f17000[f8000[0]])[f16000[0]] * var4 + ((float[])f17000[f8000[1]])[f10000[4]] * var5
      );
      float var7 = Math.max(
         f5000[1],
         ((float[])f17000[f8000[2]])[f16000[1]] * var3 + ((float[])f17000[f20000[0]])[f16000[2]] * var4 + ((float[])f17000[f20000[1]])[f10000[5]] * var5
      );
      return Math.min(f5000[2], (var6 + var7) * f5000[3] + f5000[4]);
   }

   public void m48000() {
      this.m22000();
      ((Map)this.f1000[f7000[1]]).clear();
      ((List)this.f1000[f7000[2]]).forEach(NNNNWN::close);
      ((List)this.f1000[f7000[3]]).clear();
   }

   private static float[] m54000(float var0, float var1, float var2) {
      float var3 = (float)Math.sqrt(var0 * var0 + var1 * var1 + var2 * var2);
      float[] var10000 = new float[f19000[4]];
      var10000[f16000[3]] = var0 / var3;
      var10000[f16000[4]] = var1 / var3;
      var10000[f19000[5]] = var2 / var3;
      return var10000;
   }

   private int m56000(int var1, float var2) {
      int var3 = var1 >>> f12000[0];
      int var4 = (int)((var1 >> f12000[1] & f20000[2]) * var2);
      int var5 = (int)((var1 >> f19000[0] & f26000[0]) * var2);
      int var6 = (int)((var1 & f26000[1]) * var2);
      return var3 << f19000[1] | var4 << f19000[2] | var5 << f19000[3] | var6;
   }

   private Rec0285 m58000(Ngg var1, NNNNWu var2) {
      if (var2 == null) {
         return null;
      } else if (var1.field_64011.contains(f14000[0])) {
         var2.close();
         return null;
      } else {
         NNNNWu var3 = var2;

         Object var26;
         label122: {
            Object var28;
            label123: {
               Rec0285 var29;
               label124: {
                  Object var7;
                  try {
                     GpuTextureView var4 = this.m38000(var1);
                     if (var4 == null) {
                        var26 = null;
                        break label122;
                     }

                     NNNNWR var5 = var2.L();
                     VertexFormat var6 = var5.N();
                     if (var6.contains(VertexFormatElement.POSITION) && var6.contains(VertexFormatElement.UV0)) {
                        int[] var27 = this.m44000(var5.u(), var5.y());
                        if (var27 == null) {
                           var28 = null;
                           break label123;
                        }

                        int var8 = var6.getVertexSize();
                        int var9 = var6.getOffset(VertexFormatElement.POSITION);
                        int var10 = var6.getOffset(VertexFormatElement.UV0);
                        int var11 = var6.contains(VertexFormatElement.COLOR) ? var6.getOffset(VertexFormatElement.COLOR) : f21000[0];
                        int var12 = var6.contains(VertexFormatElement.UV2) ? var6.getOffset(VertexFormatElement.UV2) : f21000[1];
                        int var13 = var6.contains(VertexFormatElement.NORMAL) ? var6.getOffset(VertexFormatElement.NORMAL) : f21000[2];
                        ByteBuffer var14 = var2.N().duplicate().order(ByteOrder.nativeOrder());
                        int var15 = var5.y();
                        float[] var16 = new float[var15 * f27000[0]];
                        float[] var17 = new float[var15 * f27000[1]];
                        int[] var18 = new int[var15];
                        float[] var19 = new float[var15 * f27000[2]];
                        float[] var20 = new float[var15 * f27000[3]];

                        for (int var21 = f4000[0]; var21 < var15; var21++) {
                           int var22 = var21 * var8;
                           var16[var21 * f27000[4]] = var14.getFloat(var22 + var9);
                           var16[var21 * f27000[5] + f4000[1]] = var14.getFloat(var22 + var9 + f25000[0]);
                           var16[var21 * f25000[1] + f25000[2]] = var14.getFloat(var22 + var9 + f25000[3]);
                           var17[var21 * f22000[0]] = var14.getFloat(var22 + var10);
                           var17[var21 * f22000[1] + f4000[2]] = var14.getFloat(var22 + var10 + f22000[2]);
                           var19[var21 * f23000[0]] = this.m12000(var12 < 0 ? f7000[4] : var14.getShort(var22 + var12));
                           var19[var21 * f23000[1] + f4000[3]] = this.m12000(var12 < 0 ? f7000[5] : var14.getShort(var22 + var12 + f23000[2]));
                           int var23 = var11 < 0 ? f23000[3] : this.m32000(var14, var22 + var11);
                           if (var13 >= 0) {
                              var20[var21 * f23000[4]] = var14.get(var22 + var13) / f13000[0];
                              var20[var21 * f23000[5] + f4000[4]] = var14.get(var22 + var13 + f4000[5]) / f13000[1];
                              var20[var21 * f23000[6] + f23000[7]] = var14.get(var22 + var13 + f10000[0]) / f13000[2];
                              var23 = this.m56000(var23, this.m46000(var14, var22 + var13));
                           } else {
                              var20[var21 * f10000[1] + f10000[2]] = f13000[3];
                           }

                           var18[var21] = var23;
                        }

                        var29 = new Rec0285(var4, var16, var17, var18, var19, var20, var27);
                        break label124;
                     }

                     var7 = null;
                  } catch (Throwable var25) {
                     if (var2 != null) {
                        try {
                           var3.close();
                        } catch (Throwable var24) {
                           var25.addSuppressed(var24);
                        }
                     }

                     throw var25;
                  }

                  if (var2 != null) {
                     var2.close();
                  }

                  return (Rec0285)var7;
               }

               if (var2 != null) {
                  var2.close();
               }

               return var29;
            }

            if (var2 != null) {
               var2.close();
            }

            return (Rec0285)var28;
         }

         if (var2 != null) {
            var2.close();
         }

         return (Rec0285)var26;
      }
   }

   public NNIK method_73477(Ngg var1) {
      this.m22000();
      return (NNIK)((Map)this.f1000[f6000[3]]).computeIfAbsent(var1, var1x -> {
         this.m22000();
         NNNNWN var2 = new NNNNWN(var1x.method_22722());
         ((List)this.f1000[f26000[6]]).add(var2);
         return new NhA(var2, var1x.method_23033(), var1x.method_23031());
      });
   }

   private static void m64000() {
      byte[] var128 = new byte[3];
      f21000[(0 | -0) >>> 31] = -1;
      f21000[(1 | -1) >>> 31] = -1;
      f21000[2] = -1;
      byte[] var129 = new byte[6];
      f27000[(0 | -0) >>> 31] = 3;
      f27000[(1 | -1) >>> 31] = 2;
      f27000[2] = 2;
      f27000[3] = 3;
      f27000[4] = 3;
      f27000[5] = 3;
      byte[] var130 = new byte[4];
      f25000[(0 | -0) >>> 31] = 4;
      f25000[(1 | -1) >>> 31] = 3;
      f25000[2] = 2;
      f25000[3] = 8;
      byte[] var131 = new byte[3];
      f22000[(0 | -0) >>> 31] = 2;
      f22000[(1 | -1) >>> 31] = 2;
      f22000[2] = 4;
      byte[] var132 = new byte[8];
      f23000[(0 | -0) >>> 31] = 2;
      f23000[(1 | -1) >>> 31] = 2;
      f23000[2] = 2;
      f23000[3] = -1;
      f23000[4] = 3;
      f23000[5] = 3;
      f23000[6] = 3;
      f23000[7] = 2;
      byte[] var133 = new byte[6];
      f10000[(0 | -0) >>> 31] = 2;
      f10000[(1 | -1) >>> 31] = 3;
      f10000[2] = 2;
      f10000[3] = 2;
      f10000[4] = 2;
      f10000[5] = 2;
      byte[] var134 = new byte[2];
      f12000[(0 | -0) >>> 31] = 24;
      f12000[(1 | -1) >>> 31] = 16;
      byte[] var135 = new byte[8];
      f19000[(0 | -0) >>> 31] = 8;
      f19000[(1 | -1) >>> 31] = 24;
      f19000[2] = 16;
      f19000[3] = 8;
      f19000[4] = 3;
      f19000[5] = 2;
      f19000[6] = 2;
      f19000[7] = 3;
      byte[] var136 = new byte[7];
      f15000[(0 | -0) >>> 31] = 24;
      f15000[(1 | -1) >>> 31] = 16;
      f15000[2] = 8;
      f15000[3] = 4;
      f15000[4] = 6;
      f15000[5] = 4;
      f15000[6] = 6;
      byte[] var137 = new byte[4];
      f18000[(0 | -0) >>> 31] = 2;
      f18000[(1 | -1) >>> 31] = 2;
      f18000[2] = 3;
      f18000[3] = 2;
      byte[] var138 = new byte[6];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = 5;
      f3000[3] = 2;
      f3000[4] = 2;
      f3000[5] = 3;
   }
}
