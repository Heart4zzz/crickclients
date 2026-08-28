package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NxU;
import com.mojang.blaze3d.opengl.GlStateManager;
import org.joml.Matrix4f;
import rw.gui.IlkOns;

public class C0836 {
   private static boolean[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static int[] f8000;
   private static boolean[] f9000;
   public static Object[] f10000;

   private static void m2000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = 33984;
   }

   private static void m10000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
   }

   private C0836() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      boolean[] var128 = new boolean[8];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      f9000[3] = (boolean)((0 | -0) >>> 31);
      f9000[4] = (boolean)((1 | -1) >>> 31);
      f9000[5] = (boolean)((0 | -0) >>> 31);
      f9000[6] = (boolean)((0 | -0) >>> 31);
      f9000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   private static void m22000() {
      short[] var128 = new short[6];
      f7000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 6;
      f7000[3] = 7;
      f7000[4] = 6;
      f7000[5] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[7];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = 5;
      f5000[2] = 2;
      f5000[3] = 6;
      f5000[4] = 3;
      f5000[5] = 7;
      f5000[6] = 1024;
   }

   private static void m26000() {
      byte[] var128 = new byte[3];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 3;
      f6000[2] = 36;
      byte[] var129 = new byte[8];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = 4;
      f3000[3] = 5;
      f3000[4] = 6;
      f3000[5] = 7;
      f3000[6] = 8;
      f3000[7] = 36;
   }

   private static void m32000() {
      f2000 = new String[5];
      f2000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
      f2000[(1 | -1) >>> 31] = "invProjection";
      f2000[2] = "invView";
      f2000[3] = "depth_in";
      f2000[4] = "texel_size";
   }

   public static void m36000(NXi var0, NXi var1, float var2, int var3) {
      ((C0805)f10000[f7000[0]])
         .m38000()
         .m40000((float)(var1.M - var0.M), (float)(var1.B - var0.B), (float)(var1.Z - var0.Z))
         .m30000(var2)
         .m26000(var3)
         .m28000();
   }

   public static void m40000(C0138 var0) {
      if (((C0805)f10000[f7000[1]]).m38000().m16000() != 0) {
         NxU var1 = NNuU.Nq().e();
         ((Matrix4f)f10000[f7000[2]]).set(var0.m12000()).invert();
         ((Matrix4f)f10000[f7000[3]]).set(var0.m26000()).invert();
         IlkOns.m94000(var1, f9000[0]);
         ((C0832)IlkOns.f24000[f7000[4]]).m18000(var0.m12000(), var0.m26000());
         ((C0805)f10000[f7000[5]]).m24000(var1x -> {
            GlStateManager._activeTexture(f8000[0]);
            GlStateManager._bindTexture(IlkOns.m46000(var1));
            ((C1228)f10000[f5000[0]]).m20000(f9000[1]);
            ((C1223)f10000[f5000[1]]).m18000(f4000[0] / var1.N, f4000[1] / var1.y);
            ((OlssInijr)f10000[f5000[2]]).m18000((Matrix4f)f10000[f5000[3]]);
            ((OlssInijr)f10000[f5000[4]]).m18000((Matrix4f)f10000[f5000[5]]);
         });
      }
   }

   private static void m42000() {
      f10000 = new Object[f3000[6]];
      f10000[f1000[(1 | -1) >>> 31]] = Integer.valueOf(f3000[7]);
   }
}
