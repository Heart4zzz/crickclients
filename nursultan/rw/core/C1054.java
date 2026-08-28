package rw.core;

import java.util.List;
import org.joml.Vector4f;
import rw.data.OltrInps;
import rw.defs.OlmmOsl;
import rw.gui.C0002;
import rw.gui.IlkOns;
import rw.gui.ZwBs;

public class C1054 {
   private static String[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   public static Object[] f5000;
   private static int[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static byte[] f9000;
   private static short[] f10000;
   private static boolean[] f11000;
   public static Object[] f12000;
   private static byte[] f13000;
   private static byte[] f14000;
   private static byte[] f15000;
   private static boolean[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static float[] f19000;
   private static String[] f20000;

   private static void m6000() {
      float[] var128 = new float[6];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f8000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f8000[2] = Float.intBitsToFloat(1073741824);
      f8000[3] = Float.intBitsToFloat(1065353216);
      f8000[4] = Float.intBitsToFloat(1065353216);
      f8000[5] = Float.intBitsToFloat(1065353216);
      float[] var129 = new float[8];
      f19000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f19000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f19000[2] = Float.intBitsToFloat(1065353216);
      f19000[3] = Float.intBitsToFloat(1065353216);
      f19000[4] = Float.intBitsToFloat(1065353216);
      f19000[5] = Float.intBitsToFloat(0);
      f19000[6] = Float.intBitsToFloat(0);
      f19000[7] = Float.intBitsToFloat(0);
   }

   private static void m8000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = 65536;
   }

   private C1054() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      boolean[] var128 = new boolean[4];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((0 | -0) >>> 31);
      f18000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[6];
      f17000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[2] = (boolean)((1 | -1) >>> 31);
      f17000[3] = (boolean)((1 | -1) >>> 31);
      f17000[4] = (boolean)((0 | -0) >>> 31);
      f17000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[8];
      f16000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
      f16000[3] = (boolean)((0 | -0) >>> 31);
      f16000[4] = (boolean)((0 | -0) >>> 31);
      f16000[5] = (boolean)((1 | -1) >>> 31);
      f16000[6] = (boolean)((1 | -1) >>> 31);
      f16000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[2];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m24000() {
      if ((Integer)f5000[f7000[5]] != 0 && ((C0830)f12000[f3000[0]]).m6000().m16000() != 0) {
         int var0 = Math.min(Math.min(((List)f5000[f3000[1]]).size(), ((List)f5000[f3000[2]]).size()), f14000[0]);
         boolean var1 = var0 > f17000[2] ? f17000[3] : f17000[4];
         C0805 var2 = var1 ? (C0805)f12000[f3000[3]] : (C0805)f12000[f3000[4]];
         var2.m24000(var2x -> {
            var2x.m66000(f4000[0]).m18000(IlkOns.m10000());
            var2x.m10000(f4000[1]).m8000((Integer)f5000[f3000[5]]);
            var2x.m32000(f20000[0]).m20000((Float)f5000[f3000[6]]);
            var2x.m32000(f20000[1]).m20000((Float)f5000[f10000[0]]);
            var2x.m94000(f1000[0]).m18000(f8000[4], f8000[5], f19000[0], f19000[1]);
            var2x.m94000(f1000[1]).m18000(f19000[2], f19000[3], f19000[4], f19000[5]);
            if (!var1) {
               if (var0 == f17000[5]) {
                  Vector4f var6 = (Vector4f)((List)f5000[f10000[1]]).getFirst();
                  Vector4f var7 = (Vector4f)((List)f5000[f10000[2]]).getFirst();
                  var2x.m6000(f1000[2]).m20000(f16000[0]);
                  var2x.m94000(f1000[3]).m18000(var6.x(), var6.y(), var6.z(), var6.w());
                  var2x.m94000(f1000[4]).m18000(var7.x(), var7.y(), var7.z(), var7.w());
               } else {
                  var2x.m6000(f1000[5]).m20000(f16000[1]);
               }
            } else {
               var2x.m6000(f1000[6]).m20000(var0);
               var2x.m6000(f1000[7]).m20000(f16000[2]);

               for (int var3 = f16000[3]; var3 < var0; var3++) {
                  Vector4f var4 = (Vector4f)((List)f5000[f10000[3]]).get(var3);
                  Vector4f var5 = (Vector4f)((List)f5000[f10000[4]]).get(var3);
                  var2x.m94000("u_clip_rects[" + var3 + "]").m18000(var4.x(), var4.y(), var4.z(), var4.w());
                  var2x.m94000("u_clip_rounds[" + var3 + "]").m18000(var5.x(), var5.y(), var5.z(), var5.w());
               }
            }
         });
      }
   }

   private static void m34000() {
      f4000 = new String[2];
      f4000[(0 | -0) >>> 31] = "u_projection";
      f4000[(1 | -1) >>> 31] = "texture_in";
      f20000 = new String[2];
      f20000[(0 | -0) >>> 31] = "u_mask_start";
      f20000[(1 | -1) >>> 31] = "u_mask_end";
      f1000 = new String[8];
      f1000[(0 | -0) >>> 31] = "u_mask_start_color";
      f1000[(1 | -1) >>> 31] = "u_mask_end_color";
      f1000[2] = "u_clip_flags";
      f1000[3] = "u_clip_rect";
      f1000[4] = "u_clip_round";
      f1000[5] = "u_clip_flags";
      f1000[6] = "u_clip_count";
      f1000[7] = "u_clip_flags";
   }

   private static void m36000() {
      f12000 = new Object[f9000[4]];
      f12000[f16000[4]] = Integer.valueOf(f9000[5]);
      f12000[f16000[5]] = Integer.valueOf(f16000[6]);
      f5000 = new Object[f9000[6]];
      f5000[f16000[7]] = Integer.valueOf(f11000[(0 | -0) >>> 31]);
      f5000[f11000[(1 | -1) >>> 31]] = f19000[6];
      f5000[f9000[7]] = f19000[7];
   }

   private static void m42000(ZwBs var0, C0024 var1) {
      int var2 = var0.m44000(var1.m34000());
      if ((Integer)f5000[f7000[1]] != 0 && (Integer)f5000[f7000[2]] != var2) {
         m24000();
      }

      Integer var9 = var2;
      f5000[f7000[3]] = var9;
      float var3 = var1.m44000() / Math.max(f18000[3], var1.m6000());
      float var4 = var1.m44000() / Math.max(f17000[0], var1.m56000());
      ((C0830)f12000[f7000[4]])
         .m6000()
         .m30000(var1.m28000())
         .m30000(var1.m18000())
         .m30000(var1.m20000())
         .m30000(var1.m52000())
         .m30000(var1.m2000())
         .m30000(var1.m38000())
         .m30000(var1.m16000())
         .m30000(var1.m58000())
         .m26000(var1.m14000())
         .m30000(var3)
         .m30000(var4)
         .m26000(f17000[1])
         .m28000();
   }

   public static void m46000(
      String var0, int var1, float var2, OlmmOsl var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      ZwBs var12 = C0002.m24000();
      if (var12 != null && var0 != null && !var0.isEmpty()) {
         float var14 = var10 / Math.max(f8000[0], var4);
         float var15 = Math.max(f8000[1], (float)Math.round(var2 * var14));
         float var16 = var12.m76000(var15, var3, f18000[0]);
         float var17 = Math.round(var8 + var5 * var14);
         float var18 = Math.round(var9 + (var11 - var16) / f8000[2]);
         Float var24 = var8 + var6 * var14;
         f5000[f2000[0]] = var24;
         Float var25 = var8 + var7 * var14;
         f5000[f2000[1]] = var25;
         OltrInps var19 = C1057.m18000();
         List var26 = var19.m12000();
         f5000[f2000[2]] = var26;
         List var27 = var19.m10000();
         f5000[f2000[3]] = var27;
         Integer var28 = Integer.valueOf(f18000[1]);
         f5000[f2000[4]] = var28;
         var12.m46000();
         var12.m70000(var0, var17, var18, var15, f8000[3], var3, f18000[2], var1, var1x -> m42000(var12, var1x));
         m24000();
         List var29 = List.of();
         f5000[f2000[5]] = var29;
         List var30 = List.of();
         f5000[f7000[0]] = var30;
      }
   }

   private static void m56000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 3;
      f2000[3] = 4;
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = 3;
      short[] var129 = new short[6];
      f7000[(0 | -0) >>> 31] = 4;
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((0 | -0) >>> 31);
      f7000[4] = 2;
      f7000[5] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[7];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = 4;
      f3000[3] = 4;
      f3000[4] = 3;
      f3000[5] = (short)((0 | -0) >>> 31);
      f3000[6] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[5];
      f10000[(0 | -0) >>> 31] = 2;
      f10000[(1 | -1) >>> 31] = 3;
      f10000[2] = 4;
      f10000[3] = 3;
      f10000[4] = 4;
   }

   private static void m58000() {
      byte[] var128 = new byte[3];
      f14000[(0 | -0) >>> 31] = 64;
      f14000[(1 | -1) >>> 31] = 6;
      f14000[2] = 2;
      byte[] var129 = new byte[6];
      f13000[(0 | -0) >>> 31] = 2;
      f13000[(1 | -1) >>> 31] = 2;
      f13000[2] = 4;
      f13000[3] = 2;
      f13000[4] = 6;
      f13000[5] = 3;
      byte[] var130 = new byte[4];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 3;
      f15000[2] = 4;
      f15000[3] = 2;
      byte[] var131 = new byte[8];
      f9000[(0 | -0) >>> 31] = 6;
      f9000[(1 | -1) >>> 31] = 4;
      f9000[2] = 3;
      f9000[3] = 4;
      f9000[4] = 5;
      f9000[5] = 64;
      f9000[6] = 5;
      f9000[7] = 2;
   }
}
