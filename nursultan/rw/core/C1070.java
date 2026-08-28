package rw.core;

import com.mojang.blaze3d.systems.RenderSystem;
import rw.gui.IlkOns;

public class C1070 {
   private static float[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   private static short[] f6000;

   private static void m6000() {
      short[] var128 = new short[3];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = 255;
   }

   private C1070() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f4000 = new Object[f2000[1]];
   }

   private static void m20000() {
      float[] var128 = new float[4];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f1000[2] = Float.intBitsToFloat(1065353216);
      f1000[3] = Float.intBitsToFloat(1065353216);
   }

   private static void m28000() {
      f5000 = new String[4];
      f5000[(0 | -0) >>> 31] = "u_projection";
      f5000[(1 | -1) >>> 31] = "u_view";
      f5000[2] = "u_size";
      f5000[3] = "u_color";
   }

   public static void m32000(int var0, float var1, float var2, float var3, float var4) {
      byte var5 = f3000[0];
      C0806.m32000(((C0805)f4000[f6000[0]]).m18000(), var1, var2, var3, var4, f1000[0], f1000[1], f1000[2], f1000[3], var5);
      ((C0805)f4000[f6000[1]]).m32000(var3x -> {
         var3x.m66000(f5000[0]).m18000(IlkOns.m10000());
         var3x.m66000(f5000[1]).m18000(RenderSystem.getModelViewMatrix());
         var3x.m106000(f5000[2]).m18000(var3, var4);
         var3x.m94000(f5000[3]).m22000(C0876.m70000(var0, f6000[2]));
      });
   }

   private static void m34000() {
      byte[] var128 = new byte[7];
      f3000[(0 | -0) >>> 31] = -1;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
      f3000[3] = 4;
      f3000[4] = 2;
      f3000[5] = 6;
      f3000[6] = 6;
   }
}
