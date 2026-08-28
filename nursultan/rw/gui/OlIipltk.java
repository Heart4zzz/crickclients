package rw.gui;

import java.util.List;
import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.GuiWidget;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.Base0315;
import rw.core.C0076;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.data.Rec0125;
import rw.data.Rec0260;
import rw.defs.Enum0019;
import rw.defs.Enum0026;
import rw.defs.OlmmOsl;
import rw.setting.C0015;
import rw.setting.C0031;
import rw.setting.C0056;

public class OlIipltk {
   private static byte[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   public static Object[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;
   private static float[] f14000;
   private static byte[] f15000;
   private static boolean[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   private static float[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static int[] f22000;
   private static String[] f23000;
   private static float[] f24000;
   private static byte[] f25000;
   private static boolean[] f26000;
   private static byte[] f27000;
   private static float[] f28000;
   private static byte[] f29000;
   public static Object[] f30000;
   private static boolean[] f31000;
   private static boolean[] f32000;

   private static void m4000() {
      f5000 = new short[]{6, 1, 2, 4, 0, 5, 6, 7};
      f20000 = new short[]{1, 2, 3, 2, 5};
   }

   private static void m8000() {
      f22000 = new int[]{-7171438, -7171438, -7171438};
   }

   private OlIipltk() {
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      f9000 = new boolean[]{true, false, false, true};
      f18000 = new boolean[]{false, true, false, true};
      f26000 = new boolean[]{true, true, false, true, false, true, false, true};
      f32000 = new boolean[]{false, true};
      f13000 = new boolean[]{false, true, false, true, false, false};
      f16000 = new boolean[]{true, true, false, false, true};
      f12000 = new boolean[]{false, true, true, true, true};
      f31000 = new boolean[]{false, false, false, true};
      f11000 = new boolean[]{false, false, true, false, true, false, true};
      f21000 = new boolean[]{true, false, false, true, true, true};
   }

   private static void m20000() {
      f8000 = new Object[]{null, 1, 2, 12, 24, null, null};
      f30000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private static C0056 m28000(boolean var0) {
      C0056[] var10000 = new C0056[OlIipltk<"iswhcpkz",-228799326,-956765960,-956765955,-956765956,-228799326>()[1]];
      var10000[f26000[6]] = (C0056)f30000[f5000[3]];
      var10000[f26000[7]] = C0056.m130000().m50000(var0 ? f24000[0] : f24000[1]);
      return C0056.m120000(var10000);
   }

   private static void m30000() {
      f23000 = new String[]{"renderList", "animatingHeight", "baseIconVisible", "overlayIconVisible", "icon:menu/expand", "icon:menu/squeeze"};
   }

   public static int m34000(int var0, boolean var1) {
      int var2 = Math.max(f9000[1], var0);
      int var3 = var2 * f10000[0] + Math.max(f9000[2], var2 - f9000[3]);
      int var4 = var1 ? var3 : f10000[1];
      return f10000[2] + var4 + f10000[3];
   }

   public static int m38000(int var0) {
      return m34000(var0, f9000[0]);
   }

   private static void m48000() {
      f10000 = new byte[]{66, 12, 61, 2, 2};
      f1000 = new byte[]{2, 2, 3, 2};
      f3000 = new byte[]{22, 2, 2, 2, 5, 5};
      f25000 = new byte[]{5, 5, 5, 6, 5};
      f15000 = new byte[]{5, 2, 3, 3, 6};
      f29000 = new byte[]{4, 5, 6, 2, 6};
      f27000 = new byte[]{6, 7, 7};
      f2000 = new byte[]{2, 2, 3, 12, 4, 24, 8};
   }

   private static void m50000(C0288 var0, List<GuiWidget> var1, Iface0202 var2) {
      int var3 = var1.size();

      for (int var4 = f13000[4]; var4 < var3; var4++) {
         GuiWidget var5 = (GuiWidget)var1.get(var4);
         Object[] var10001 = new Object[f3000[3]];
         var10001[f13000[5]] = var2.m18000(var5.m42000(), (Iface0197<GuiWidget>)C0015.f6000[f20000[0]], var5);
         var10001[f16000[0]] = var4 == var3 - f16000[1] ? null : C0287.m28000((C0056)C0076.f5000[f20000[1]]);
         var0.N(var10001);
      }
   }

   private static C0056 m54000(int var0, boolean var1, boolean var2) {
      C0056[] var10000 = new C0056[f10000[4]];
      var10000[f26000[2]] = (C0056)f30000[f5000[1]];
      var10000[f26000[3]] = C0056.m130000().m90000(Rec0125.m24000(m34000(var0, var1)));
      C0056 var3 = C0056.m120000(var10000);
      C0056 var5;
      if (var2) {
         var10000 = new C0056[f1000[0]];
         var10000[f26000[4]] = var3;
         var10000[f26000[5]] = (C0056)f30000[f5000[2]];
         var5 = C0056.m120000(var10000);
      } else {
         var5 = var3;
      }

      return var5;
   }

   private static C0056 m56000(boolean var0) {
      C0056[] var10000 = new C0056[f3000[1]];
      var10000[f13000[0]] = (C0056)f30000[f5000[6]];
      var10000[f13000[1]] = C0056.m130000().m40000(f22000[1]).m194000(var0);
      return C0056.m120000(var10000);
   }

   private static C0056 m60000(boolean var0, OlIrtqjti var1) {
      int var2 = var0 ? var1.m6000() : f22000[0];
      C0056[] var10000 = new C0056[OlIipltk<"iswhcpkz",-228799326,-956765960,-956765955,-956765956,-228799326>()[2]];
      var10000[f32000[0]] = (C0056)f30000[f5000[4]];
      var10000[f32000[1]] = C0056.m130000().m40000(var2);
      var10000[f1000[3]] = rw.setting.C0017.m22000(f3000[0], (OlmmOsl)OlmmOsl.f7000[f5000[5]]);
      return C0056.m120000(var10000);
   }

   private C0031 m62000(Rec0260 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f5000[0]]);
      boolean var4 = var1.m2000().m2000();
      Iface0196 var5 = var2.m20000(f23000[0], var4);
      Iface0196 var6 = var2.m20000(f23000[1], f18000[0]);
      Iface0196 var7 = var2.m20000(f23000[2], !var4 ? f18000[1] : f18000[2]);
      Iface0196 var8 = var2.m20000(f23000[3], var4);
      if (var4) {
         if (!(Boolean)var5.m2000()) {
            var5.m6000(f18000[3]);
         }

         if (!(Boolean)var8.m2000()) {
            var8.m6000(f26000[0]);
         }
      } else if (!(Boolean)var7.m2000()) {
         var7.m6000(f26000[1]);
      }

      return C0287.m26000(m54000(var1.m8000().size(), var4, (Boolean)var6.m2000()), var8x -> {
         var8x.N("subcategoryCard" + var1.m6000().m64000().m10000());
         var8x.N(Enum0026.f2000, Base0315::m6000);
         var8x.N(Enum0026.f15000, var3xx -> {
            SelectItemModel$UnbakedSwitch var4xx = (SelectItemModel$UnbakedSwitch)var3xx;
            if (OlIipltk<"iswhcpkz",-228799322,-956766011,-956765963,-956766012,-228799322>(var4xx) == Enum0019.f18000) {
               var6.m6000(f31000[0]);
               if (!var1.m2000().m2000()) {
                  var5.m6000(f31000[1]);
               }
            }
         });
         var8x.N((C0056)f30000[f20000[2]], var7xx -> {
            ((C0288)var7xx).N(C1235.m40000(var1.m6000().m64000()), m60000(var4, var3));
            ((C0288)var7xx).N((C0056)f30000[f20000[4]], var7xxx -> {
               ((C0288)var7xxx).N(Enum0026.f2000, Base0315::m6000);
               ((C0288)var7xxx).N(var5xxxx -> {
                  boolean var6xxxx = !var1.m2000().m2000() ? f16000[4] : f12000[0];
                  var6.m6000(f12000[1]);
                  if (var6xxxx) {
                     var5.m6000(f12000[2]);
                     var8.m6000(f12000[3]);
                  } else {
                     var7.m6000(f12000[4]);
                  }

                  var1.m2000().m6000(var6xxxx);
               });
               ((C0288)var7xxx).L(var6xxxx -> {
                  ((C0286)var6xxxx).m2000(f23000[4]);
                  ((C0286)var6xxxx).N(m56000((Boolean)var7.m2000()));
                  var7xxx.L(var5xxxxx -> {
                     ((C0286)var5xxxxx).m2000(f23000[5]);
                     ((C0286)var5xxxxx).N(m70000(var4, (Boolean)var8.m2000(), var3));
                     ((C0286)var5xxxxx).N(Enum0026.f15000, var3xxxxxx -> {
                        SelectItemModel$UnbakedSwitch var4xxxxxx = (SelectItemModel$UnbakedSwitch)var3xxxxxx;
                        if (OlIipltk<"syzjpf",-228799322,-956766011,-956765963,-956766012,-1209681427>(var4xxxxxx) == Enum0019.f21000) {
                           if (var1.m2000().m2000()) {
                              var7.m6000(f16000[2]);
                           } else {
                              var8.m6000(f16000[3]);
                           }
                        }
                     });
                  });
               });
            });
         });
         var8x.y((C0056)C0076.f5000[f20000[3]]);
         if ((Boolean)var5.m2000()) {
            var8x.N(m28000(var4), var2xx -> m50000((C0288)var2xx, var1.m8000(), var2));
         }
      });
   }

   private static C0056 m70000(boolean var0, boolean var1, OlIrtqjti var2) {
      int var3 = var0 ? var2.m6000() : f22000[2];
      C0056[] var10000 = new C0056[f3000[2]];
      var10000[f13000[2]] = (C0056)f30000[f5000[7]];
      var10000[f13000[3]] = C0056.m130000().m40000(var3).m50000(var0 ? f24000[2] : f24000[3]).m194000(var1);
      return C0056.m120000(var10000);
   }

   private static void m72000() {
      f24000 = new float[]{1.0F, 0.0F, 1.0F, 0.0F, 260.0F};
      f17000 = new float[]{30.0F, 1.4F};
      f6000 = new float[]{0.2F, 4.0F, 0.008333334F};
      f14000 = new float[]{0.05F, 1.0F};
      f7000 = new float[]{100.0F, 12.0F, 1.0F, 100.0F, 60.0F};
      f4000 = new float[]{17.0F, 17.0F, 12.0F, 12.0F, 0.0F, 0.0F};
      f28000 = new float[]{100.0F, 18.0F, 18.0F, 24.0F};
      f19000 = new float[]{24.0F, 24.0F, 24.0F, 0.0F, 0.0F, 24.0F, 24.0F};
   }
}
