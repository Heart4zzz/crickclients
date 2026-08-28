package rw.gui;

import rw.core.C0816;
import rw.core.C0820;
import rw.defs.Enum0060;
import rw.setting.C0091;
import rw.setting.OlpOtr;

public class EspMix {
   private static boolean[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   public static Object[] f4000;
   public static Object[] f5000;
   public static Object[] f6000;
   public static Object[] f7000;
   private static String[] f8000;
   private static byte[] f9000;
   private static String[] f10000;
   private static boolean[] f11000;
   public static Object[] f12000;
   public static Object[] f13000;
   private static String[] f14000;
   private static byte[] f15000;
   private static String[] f16000;
   private static String[] f17000;
   private static boolean[] f18000;
   private static byte[] f19000;
   private static String[] f20000;
   private static String[] f21000;
   private static boolean[] f22000;
   private static String[] f23000;
   private static boolean[] f24000;
   private static byte[] f25000;
   private static byte[] f26000;
   private static float[] f27000;
   private static String[] f28000;
   private static String[] f29000;
   private static float[] f30000;
   private static boolean[] f31000;
   private static byte[] f32000;
   private static short[] f33000;
   private static boolean[] f34000;
   public static Object[] f35000;
   private static double[] f36000;
   private static byte[] f37000;
   private static String[] f38000;
   private static boolean[] f39000;
   public static Object[] f40000;
   private static String[] f41000;
   private static byte[] f42000;
   private static String[] f43000;
   private static byte[] f44000;
   private static short[] f45000;
   public static Object[] f46000;
   private static boolean[] f47000;
   private static byte[] f48000;
   public static Object[] f49000;
   public static Object[] f50000;
   private static String[] f51000;
   public static Object[] f52000;
   private static byte[] f53000;
   private static boolean[] f54000;
   private static float[] f55000;
   private static String[] f56000;

   private static void m4000() {
      f36000 = new double[]{0.0, 2.0, 2.0};
   }

   private static OlpOtr m12000() {
      return ((C0816)f49000[f33000[4]])
         .m26000()
         .m22000(f38000[3], (Enum0060)Enum0060.f1000[f33000[5]])
         .m22000(f38000[4], (Enum0060)Enum0060.f1000[f33000[6]])
         .m22000(f29000[0], (Enum0060)Enum0060.f1000[f33000[7]])
         .m8000();
   }

   private static OlpOtr m16000(String var0) {
      return new OlpOtr((String)f12000[f33000[2]], m20000(var0));
   }

   private static String m20000(String var0) {
      return "shaders/" + var0;
   }

   private EspMix() {
      ((OlpOtr)f3000[f45000[0]]).m84000(f10000[0], f11000[0]);
      ((OlpOtr)f46000[f45000[1]]).m84000(f10000[1], f11000[1]);
      ((OlpOtr)f46000[f33000[0]]).m84000(f10000[2], f11000[2]);
      ((OlpOtr)f50000[f33000[1]]).m84000(f10000[3], f11000[3]);
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f12000 = new Object[]{null, f17000[1], null, null};
      f40000 = new Object[]{null, null, null, null, null, null};
      f6000 = new Object[]{null, null};
      f5000 = new Object[]{null, null, null, null, null, null, null};
      f49000 = new Object[]{null, null, null, null, null, null, null};
      f35000 = new Object[]{null, null, null, null, null, null};
      f13000 = new Object[]{null, null};
      f7000 = new Object[]{null, null, null, null, null, null};
      f4000 = new Object[]{null, null};
      f3000 = new Object[]{null, null, null, null, null};
      f46000 = new Object[]{null, null};
      f50000 = new Object[]{null, null, null, null, null, null, null, null};
      f52000 = new Object[]{null};
   }

   private static void m30000() {
      f10000 = new String[]{"Scene", "Scene", "Scene", "Scene", "shaders/", "CLIP_USE_LOOP", "CLIP_USE_LOOP"};
      f20000 = new String[]{"ui_uber.vert", "ui_uber.frag", "CLIP_USE_LOOP", "BLUR_ENABLED"};
      f38000 = new String[]{"radius", "weights", "direction", "radius", "weights"};
      f29000 = new String[]{
         "direction",
         "default.vert",
         "blurred_round_rect.frag",
         "blurred_round_rect.frag",
         "color_multiply.frag",
         "layer_composite.frag",
         "color_picker_alpha.frag"
      };
      f51000 = new String[]{
         "color_picker_gradient.frag",
         "color_picker_hue.frag",
         "color_picker_pipette_preview.frag",
         "depth_filter.frag",
         "depth_mask.frag",
         "flood.frag",
         "outline_pass.frag",
         "uv_seed.frag"
      };
      f28000 = new String[]{"jump_flood.frag", "esp_mix.frag", "grayscale_fade.frag", "glows.frag", "glowf.frag", "gaussian.frag", "downscale.frag"};
      f16000 = new String[]{"downscale_composite.frag", "texture_copy.frag", "sky_aurora.frag"};
      f14000 = new String[]{"sky_borealis.frag", "sky_borealis_aurora.frag"};
      f21000 = new String[]{"shockwave.frag", "chams.frag", "ghost.vert", "ghost.frag"};
      f23000 = new String[]{"hands.vert", "hands.frag", "sparkle.frag", "target_head.frag", "target_health_ring.frag", "target_scan.frag"};
      f43000 = new String[]{"waypoint_scan.frag", "text_alpha_mask.vert", "text_alpha_mask.frag"};
      f8000 = new String[]{"text_alpha_mask.vert", "text_alpha_mask.frag", "pos_color.vert", "pos_color.frag", "line.vert", "line.frag"};
      f41000 = new String[]{"blockesp_cube.vert", "pos_color.frag", "trajectory_grid.vert"};
      f56000 = new String[]{
         "trajectory_grid.frag",
         "kill_effect.vert",
         "kill_effect.frag",
         "particle_instanced.vert",
         "particle_instanced.frag",
         "arc_instanced.vert",
         "arc_instanced.frag",
         "font.vert"
      };
      f17000 = new String[]{"font.frag", "shaders/"};
   }

   private static void m34000() {
      f53000 = new byte[]{2, 30, 2, 3, 2, 3};
      f25000 = new byte[]{4, 5, 2, 3, 4, 5};
      f9000 = new byte[]{6, 2, 3};
      f32000 = new byte[]{5, 4, 5, 5};
      f37000 = new byte[]{10, 6, 10};
      f19000 = new byte[]{15, 15, 2, 3, 4, 5};
      f44000 = new byte[]{2, 3, 4, 5, 2};
      f42000 = new byte[]{3, 4, 2};
      f26000 = new byte[]{3, 4, 5, 6, 7, 4};
      f15000 = new byte[]{6, 2, 7, 7, 6, 2, 6, 2};
      f48000 = new byte[]{5, 2, 8};
   }

   private static void m68000() {
      f55000 = new float[]{3.0F, 1.0F, 1.0F, 0.0F, 0.0F};
      f27000 = new float[]{1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F};
      f30000 = new float[]{0.0F, 0.0F, 1.0F};
   }

   private static void m72000() {
      f45000 = new short[]{4, 0};
      f33000 = new short[]{1, 0, 2, 2, 2, 1, 6, 3};
   }

   private static float[] m74000(int var0) {
      int var1 = var0 - f39000[3];
      float var2 = Math.max(var1 / f55000[0], f55000[1]);
      float[] var3 = new float[f53000[1]];
      double var4 = f36000[0];

      for (int var6 = f39000[4]; var6 <= var1; var6++) {
         double var7 = Math.exp(-(var6 * var6) / (f36000[1] * var2 * var2));
         var3[var6] = (float)var7;
         var4 += var6 == 0 ? var7 : var7 * f36000[2];
      }

      for (int var9 = f39000[5]; var9 <= var1; var9++) {
         var3[var9] = (float)(var3[var9] / var4);
      }

      return var3;
   }

   public static C0091 m80000() {
      return C0816.m22000(f10000[4]);
   }

   private static OlpOtr m82000(boolean var0, boolean var1) {
      return m80000().m28000(f20000[0], f20000[1]).m38000(f20000[2], var1).m38000(f20000[3], var0).m26000();
   }

   private static OlpOtr m86000(String var0, boolean var1) {
      return m80000().m42000(var0).m38000(f10000[5], var1).m26000();
   }

   private static OlpOtr m92000(int var0, float var1, float var2) {
      C0820 var10000 = ((C0816)f49000[f33000[3]]).m26000().m24000(f38000[0], var0 - f39000[0]).m24000(f38000[1], m74000(var0));
      String var10001 = f38000[2];
      float[] var10002 = new float[f53000[0]];
      var10002[f39000[1]] = var1;
      var10002[f39000[2]] = var2;
      return var10000.m24000(var10001, var10002).m8000();
   }

   private static OlpOtr m94000(String var0, String var1, boolean var2) {
      return m80000().m28000(var0, var1).m38000(f10000[6], var2).m26000();
   }

   private static void m98000() {
      f11000 = new boolean[]{false, false, false, false};
      f39000 = new boolean[]{true, false, true, true, false, false, false};
      f1000 = new boolean[]{false, true};
      f2000 = new boolean[]{false, true, false};
      f34000 = new boolean[]{true, false, true, false, true};
      f22000 = new boolean[]{false, true, false};
      f24000 = new boolean[]{true, false, true};
      f31000 = new boolean[]{false, true, false, true};
      f18000 = new boolean[]{false, true, false, true};
      f54000 = new boolean[]{false, false, false, true, false, true, true, false};
      f47000 = new boolean[]{true, true, false, true, true};
   }
}
