package rw.core;

import KDFzREm.NXi;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import rw.data.Rec0004;

public class IltOiis {
   private static short[] f1000;
   private static byte[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static float[] f7000;
   private static String[] f8000;
   private static byte[] f9000;
   private static boolean[] f10000;

   private static void m2000() {
      short[] var128 = new short[3];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
   }

   private IltOiis() {
      throw new UnsupportedOperationException(f8000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[5];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 3;
      f2000[3] = 4;
      f2000[4] = 7;
      byte[] var129 = new byte[8];
      f6000[(0 | -0) >>> 31] = 6;
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = 6;
      f6000[3] = 5;
      f6000[4] = 4;
      f6000[5] = 5;
      f6000[6] = 5;
      f6000[7] = 3;
      byte[] var130 = new byte[3];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 6;
      f5000[2] = 3;
      byte[] var131 = new byte[3];
      f9000[(0 | -0) >>> 31] = 6;
      f9000[(1 | -1) >>> 31] = 7;
      f9000[2] = 3;
      byte[] var132 = new byte[7];
      f4000[(0 | -0) >>> 31] = 7;
      f4000[(1 | -1) >>> 31] = 7;
      f4000[2] = 4;
      f4000[3] = 5;
      f4000[4] = 6;
      f4000[5] = 6;
      f4000[6] = 2;
   }

   private static void m10000() {
      float[] var128 = new float[7];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1044952121);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(1073741824);
      f7000[2] = Float.intBitsToFloat(1060320051);
      f7000[3] = Float.intBitsToFloat(1065353216);
      f7000[4] = Float.intBitsToFloat(1065353216);
      f7000[5] = Float.intBitsToFloat(1065353216);
      f7000[6] = Float.intBitsToFloat(1065353216);
      float[] var129 = new float[8];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f3000[2] = Float.intBitsToFloat(1065353216);
      f3000[3] = Float.intBitsToFloat(1065353216);
      f3000[4] = Float.intBitsToFloat(1065353216);
      f3000[5] = Float.intBitsToFloat(1065353216);
      f3000[6] = Float.intBitsToFloat(1065353216);
      f3000[7] = Float.intBitsToFloat(1065353216);
   }

   private static void m16000() {
      f8000 = new String[2];
      f8000[(0 | -0) >>> 31] = "mismatch format";
      f8000[(1 | -1) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static void m20000(C0830 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, float var10) {
      m22000(var0, (Rec0004)C0011.f5000[f1000[0]]);
      var0.m6000().m42000(var1, var2, var3, var4).m42000(var1, var5, var6, var7).m26000(var8).m26000(var9).m30000(var10).m28000();
   }

   private static void m22000(C0830 var0, Rec0004 var1) {
      if (var0.m64000() != var1) {
         throw new IllegalStateException(f8000[0]);
      }
   }

   public static void m24000(Matrix4fStack var0, C0830 var1, C0830 var2, NXi var3, C1172 var4, int var5) {
      m22000(var1, (Rec0004)C0011.f5000[f1000[1]]);
      float var6 = (float)(var4.m18000() - var3.M);
      float var7 = (float)(var4.m10000() - var3.B);
      float var8 = (float)(var4.m70000() - var3.Z);
      float var9 = (float)(var4.m60000() - var3.M);
      float var10 = (float)(var4.m36000() - var3.B);
      float var11 = (float)(var4.m26000() - var3.Z);
      m32000(var0, var2, var6, var7, var8, var9, var10, var11, C0876.m70000(var5, (int)(C0876.m46000(var5) * f7000[0] * f7000[1])));
      int var12 = C0876.m64000(var5, f7000[2]);
      m20000(var1, var0, var6, var7, var8, var6, var7, var11, var12, var12, f7000[3]);
      m20000(var1, var0, var6, var7, var11, var9, var7, var11, var12, var12, f7000[4]);
      m20000(var1, var0, var9, var7, var11, var9, var7, var8, var12, var12, f7000[5]);
      m20000(var1, var0, var9, var7, var8, var6, var7, var8, var12, var12, f7000[6]);
      m20000(var1, var0, var6, var10, var8, var6, var10, var11, var12, var12, f3000[0]);
      m20000(var1, var0, var6, var10, var11, var9, var10, var11, var12, var12, f3000[1]);
      m20000(var1, var0, var9, var10, var11, var9, var10, var8, var12, var12, f3000[2]);
      m20000(var1, var0, var9, var10, var8, var6, var10, var8, var12, var12, f3000[3]);
      m20000(var1, var0, var6, var7, var8, var6, var10, var8, var12, var12, f3000[4]);
      m20000(var1, var0, var6, var7, var11, var6, var10, var11, var12, var12, f3000[5]);
      m20000(var1, var0, var9, var7, var11, var9, var10, var11, var12, var12, f3000[6]);
      m20000(var1, var0, var9, var7, var8, var9, var10, var8, var12, var12, f3000[7]);
   }

   private static void m30000() {
      boolean[] var128 = new boolean[4];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((1 | -1) >>> 31);
      f10000[3] = (boolean)((1 | -1) >>> 31);
   }

   public static void m32000(Matrix4f var0, C0830 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      m22000(var1, (Rec0004)C0011.f5000[f1000[2]]);
      C0811 var9 = var1.m6000();
      int var10 = var9.m16000();
      var9.m42000(var0, var2, var3, var4).m26000(var8).m28000();
      var9.m42000(var0, var2, var3, var7).m26000(var8).m28000();
      var9.m42000(var0, var5, var3, var7).m26000(var8).m28000();
      var9.m42000(var0, var5, var3, var4).m26000(var8).m28000();
      var9.m42000(var0, var2, var6, var4).m26000(var8).m28000();
      var9.m42000(var0, var2, var6, var7).m26000(var8).m28000();
      var9.m42000(var0, var5, var6, var7).m26000(var8).m28000();
      var9.m42000(var0, var5, var6, var4).m26000(var8).m28000();
      C0808 var11 = var1.m52000();
      var11.m24000(var10);
      var11.m24000(var10 + f10000[0]);
      var11.m24000(var10 + f2000[0]);
      var11.m24000(var10);
      var11.m24000(var10 + f2000[1]);
      var11.m24000(var10 + f2000[2]);
      var11.m24000(var10 + f2000[3]);
      var11.m24000(var10 + f2000[4]);
      var11.m24000(var10 + f6000[0]);
      var11.m24000(var10 + f6000[1]);
      var11.m24000(var10 + f6000[2]);
      var11.m24000(var10 + f6000[3]);
      var11.m24000(var10);
      var11.m24000(var10 + f6000[4]);
      var11.m24000(var10 + f6000[5]);
      var11.m24000(var10);
      var11.m24000(var10 + f6000[6]);
      var11.m24000(var10 + f10000[1]);
      var11.m24000(var10 + f6000[7]);
      var11.m24000(var10 + f5000[0]);
      var11.m24000(var10 + f5000[1]);
      var11.m24000(var10 + f5000[2]);
      var11.m24000(var10 + f9000[0]);
      var11.m24000(var10 + f9000[1]);
      var11.m24000(var10);
      var11.m24000(var10 + f9000[2]);
      var11.m24000(var10 + f4000[0]);
      var11.m24000(var10);
      var11.m24000(var10 + f4000[1]);
      var11.m24000(var10 + f4000[2]);
      var11.m24000(var10 + f10000[2]);
      var11.m24000(var10 + f4000[3]);
      var11.m24000(var10 + f4000[4]);
      var11.m24000(var10 + f10000[3]);
      var11.m24000(var10 + f4000[5]);
      var11.m24000(var10 + f4000[6]);
   }
}
