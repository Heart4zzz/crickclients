package rw.core;

import com.mojang.blaze3d.systems.RenderSystem;
import rw.gui.IlkOns;

public class C1048 {
   public static Object[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static boolean[] f6000;

   private static void m2000() {
      float[] var128 = new float[4];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f5000[2] = Float.intBitsToFloat(1065353216);
      f5000[3] = Float.intBitsToFloat(1065353216);
   }

   private C1048() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new Object[f6000[1]];
   }

   private static void m14000() {
      byte[] var128 = new byte[7];
      f2000[(0 | -0) >>> 31] = -1;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 5;
      f2000[3] = 4;
      f2000[4] = 2;
      f2000[5] = 6;
      f2000[6] = 6;
   }

   private static void m20000() {
      f4000 = new String[3];
      f4000[(0 | -0) >>> 31] = "u_projection";
      f4000[(1 | -1) >>> 31] = "u_view";
      f4000[2] = "u_size";
   }

   public static void m28000(float var0, float var1, float var2, float var3) {
      byte var4 = f2000[0];
      C0806.m32000(((C0805)f1000[f3000[0]]).m18000(), var0, var1, var2, var3, f5000[0], f5000[1], f5000[2], f5000[3], var4);
      ((C0805)f1000[f3000[1]]).m32000(var2x -> {
         var2x.m66000(f4000[0]).m18000(IlkOns.m10000());
         var2x.m66000(f4000[1]).m18000(RenderSystem.getModelViewMatrix());
         var2x.m106000(f4000[2]).m18000(var2, var3);
      });
   }

   private static void m30000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m34000() {
      boolean[] var128 = new boolean[2];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
