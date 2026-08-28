package rw.core;

import com.mojang.blaze3d.systems.RenderSystem;
import rw.gui.IlkOns;
import rw.gui.ThemeManager;

public class C1051 {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static float[] f6000;
   private static String[] f7000;
   public static Object[] f8000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private C1051() {
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      float[] var128 = new float[8];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f6000[2] = Float.intBitsToFloat(1065353216);
      f6000[3] = Float.intBitsToFloat(1065353216);
      f6000[4] = Float.intBitsToFloat(1092616192);
      f6000[5] = Float.intBitsToFloat(1065353216);
      f6000[6] = Float.intBitsToFloat(1092616192);
      f6000[7] = Float.intBitsToFloat(1065353216);
   }

   private static void m24000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 255;
      f5000[3] = 255;
      f5000[4] = 255;
      f5000[5] = 255;
      f5000[6] = 2;
   }

   private static void m32000() {
      byte[] var128 = new byte[4];
      f3000[(0 | -0) >>> 31] = -1;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 4;
      f3000[3] = 4;
      byte[] var129 = new byte[5];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 6;
      f1000[2] = 6;
      f1000[3] = 2;
      f1000[4] = 3;
   }

   public static void m36000(int var0, int var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      byte var8 = f3000[0];
      C0806.m32000(((C0805)f8000[f5000[0]]).m18000(), var4, var5, var6, var7, f6000[0], f6000[1], f6000[2], f6000[3], var8);
      ((C0805)f8000[f5000[1]]).m32000(var6x -> {
         var6x.m66000(f4000[0]).m18000(IlkOns.m10000());
         var6x.m66000(f4000[1]).m18000(RenderSystem.getModelViewMatrix());
         var6x.m106000(f4000[2]).m18000(var6, var7);
         var6x.m32000(f4000[3]).m20000(f6000[4] * ThemeManager.m4000());
         var6x.m32000(f4000[4]).m20000(f6000[5] * ThemeManager.m4000());
         var6x.m94000(f4000[5]).m22000(C0876.m70000(var0, f5000[2]));
         var6x.m94000(f4000[6]).m22000(C0876.m70000(var1, f5000[3]));
         var6x.m94000(f4000[7]).m22000(C0876.m70000(var2, f5000[4]));
         var6x.m94000(f7000[0]).m22000(C0876.m70000(var3, f5000[5]));
         var6x.m94000(f7000[1]).m22000((Integer)C0077.f6000[f5000[6]]);
      });
   }

   private static void m42000() {
      f4000 = new String[8];
      f4000[(0 | -0) >>> 31] = "u_projection";
      f4000[(1 | -1) >>> 31] = "u_view";
      f4000[2] = "u_size";
      f4000[3] = "u_radius";
      f4000[4] = "u_border_width";
      f4000[5] = "u_top_left";
      f4000[6] = "u_top_right";
      f4000[7] = "u_bottom_left";
      f7000 = new String[2];
      f7000[(0 | -0) >>> 31] = "u_bottom_right";
      f7000[(1 | -1) >>> 31] = "u_border_color";
   }

   private static void m46000() {
      f8000 = new Object[f1000[4]];
      f8000[f2000[(0 | -0) >>> 31]] = f6000[6];
      f8000[f2000[(1 | -1) >>> 31]] = f6000[7];
   }
}
