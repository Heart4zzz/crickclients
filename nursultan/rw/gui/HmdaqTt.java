package rw.gui;

import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.api.Iface0642;
import rw.core.C0076;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C1073;
import rw.core.C1116;
import rw.core.C1126;
import rw.core.C1235;
import rw.core.LeAm;
import rw.core.OlIrtqjti;
import rw.data.Rec0076;
import rw.data.Rec0216;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "hotkeys",
   i = 100.0F,
   N = 220.0F,
   L = true
)
public class HmdaqTt extends DragOffset {
   public static Object[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   public Object[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public static Object[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static byte[] f17000;
   private static byte[] f18000;
   private static boolean[] f19000;
   private static float[] f20000;
   private static boolean[] f21000;
   private static boolean[] f22000;
   private static short[] f23000;

   private static void m4000() {
      f11000 = new Object[]{10, 120, 14, 20, 16, null, null, null};
      f1000 = new Object[]{null, null, null, null};
   }

   public HmdaqTt() {
      super(HmdaqTt::m30000);
      this.m12000();
      C1116 var5 = new C1116(f20000[0]);
      this.f6000[f10000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f10000 = new short[]{0, 6, 1, 0};
      f23000 = new short[]{0, 0, 5};
      f16000 = new short[]{0, 0, 0, 3, 4};
      f9000 = new short[]{1, 0};
      f15000 = new short[]{5, 3, 2, 1, 3, 2, 1};
      f14000 = new short[]{6, 3, 7, 0, 4};
   }

   private static void m10000() {
      f20000 = new float[]{120.0F, 120.0F, 120.0F, 0.0F, 14.0F, 16.0F, 14.0F};
      f7000 = new float[]{19.0F, 20.0F, 16.0F, 16.0F, 1.0F, 100.0F, 11.0F, 11.0F};
      f8000 = new float[]{38.0F, Float.POSITIVE_INFINITY, 10.0F, 9.0F, 9.0F, 16.0F, Float.POSITIVE_INFINITY, 100.0F};
   }

   private static void m12000() {
      f3000 = new String[]{"module/", "hotkeysTicker", "hud.example", "None", "hotkeysContentBox"};
      f2000 = new String[]{"hotkey-row-example", "None", "hotkeysWindow", "hotkeysDivider", "hotkeysIconArea", "hud-hotkeys", "icon:hud/hotkeys"};
   }

   private void m12000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f12000[5]];
         Object[] var1 = this.f6000;
      }
   }

   private static List<GuiWidget> m14000() {
      return NursultanClient.m88000().m68000().filter(HmdaqTt::m66000).toList();
   }

   private static void m14000() {
      f22000 = new boolean[]{true, false, true};
      f13000 = new boolean[]{false, true, false, true};
      f21000 = new boolean[]{false, true};
      f19000 = new boolean[]{false, false, true};
      f4000 = new boolean[]{false, true, true};
      f12000 = new boolean[]{false, false, false, true, true, true, false, true};
   }

   private static String m16000() {
      return C1235.m36000(f3000[2]);
   }

   public boolean m20000() {
      return NursultanClient.m88000().m38000().U();
   }

   private static float m38000(String var0, String var1) {
      Huddumped var2 = NursultanClient.m42000();
      float var3 = var2.m80000(var0, f20000[4], (OlmmOsl)OlmmOsl.f7000[f16000[3]]);
      float var4 = Math.max(f20000[5], var2.m80000(var1, f20000[6], (OlmmOsl)OlmmOsl.f7000[f16000[4]]));
      return f7000[0] + var3 + f7000[1] + var4;
   }

   private static float m40000(List<GuiWidget> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return m38000(m16000(), f3000[3]);
      } else {
         float var2 = f20000[3];

         for (GuiWidget var4 : var0) {
            var2 = Math.max(var2, m38000(var4.m2000(), var4.m54000().m28000()));
         }

         return var2;
      }
   }

   public boolean m26000() {
      return !Huddumped.m40000() && !NursultanClient.m88000().m68000().anyMatch(HmdaqTt::m66000) ? f22000[1] : f22000[0];
   }

   private static C0031 m48000(List<GuiWidget> var0, boolean var1, OlIrtqjti var2, boolean var3, float var4) {
      C0056 var5 = var3
         ? C1126.m28000((C0056)f1000[f16000[0]], var4, f20000[1], (Rec0076)C1073.f1000[f16000[1]])
         : C1126.m24000((C0056)f1000[f16000[2]], var4, f20000[2]);
      return C0287.m26000(
         var5,
         var4x -> {
            var4x.N(f3000[4]);
            if (var0.isEmpty() && var1) {
               String var10 = f2000[0];
               var4x.N(C1126.m22000(f13000[3], var3), var2xx -> {
                  var2xx.N(var10);
                  var2xx.y(var1xxx -> ((C0296)var1xxx.N(var10 + "-name")).m2000(m16000()).N((C0056)f1000[f15000[6]]));
                  var2xx.N((C0056)f1000[f15000[4]], var2xxx -> {
                     var2xxx.N(var10 + "-bind-box");
                     var2xxx.y(var2xxxx -> ((C0296)var2xxxx.N(var10 + "-bind")).m2000(f2000[1]).N(((rw.core.C0097)f1000[f15000[5]]).m8000(var2)));
                  });
               });
            } else {
               int var5x = f21000[0];

               for (GuiWidget var7 : var0) {
                  String var8 = "hotkey-" + var7.m42000();
                  C0056 var9 = ((C1116)((HmdaqTt)LeAm.f5000[f9000[0]]).f6000[f9000[1]]).m24000(var7)
                     ? (C0056)C1126.f18000[f15000[0]]
                     : C1126.m22000(var5x++ == 0 ? f21000[1] : f19000[0], var3);
                  var4x.N(var9, var3xx -> {
                     var3xx.N(var8);
                     var3xx.y(var2xxx -> ((C0296)var2xxx.N(var8 + "-name")).m2000(var7.m2000()).N((C0056)f1000[f15000[3]]));
                     var3xx.N((C0056)f1000[f15000[1]], var3xxx -> {
                        var3xxx.N(var8 + "-bind-box");
                        var3xxx.y(
                           var3xxxx -> ((C0296)var3xxxx.N(var8 + "-bind")).m2000(var7.m54000().m28000()).N(((rw.core.C0097)f1000[f15000[2]]).m8000(var2))
                        );
                     });
                  });
               }
            }
         }
      );
   }

   @Iface0642
   public void m50000(Rec0216 var1) {
      String var2 = var1.m4000().m2000();
      if (var2 != null && var2.startsWith(f3000[0])) {
         NursultanClient.m42000().m64000();
      }
   }

   private static C0031 m30000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f10000[1]]);
      HmdaqTt var3 = (HmdaqTt)LeAm.f5000[f10000[2]];
      var1.m4000(f3000[1], () -> (C1116)var3.f6000[f14000[3]]);
      List var4 = ((C1116)var3.f6000[f10000[3]]).m30000(m14000(), var0x -> var0x);
      boolean var5 = Huddumped.m40000();
      boolean var6 = var4.isEmpty() && !var5 ? f13000[0] : f22000[2];
      boolean var7 = ((C1116)var3.f6000[f23000[0]]).m22000(var6);
      float var8 = ((C1116)var3.f6000[f23000[1]]).m26000(var6, m40000(var4, var5));
      return C0287.m26000((C0056)f11000[f23000[2]], var5x -> {
         var5x.N(f2000[2]);
         var5x.N((C0056)f11000[f14000[0]], var1xx -> {
            var1xx.N(f2000[4]);
            var1xx.L(var1xxx -> ((C0286)var1xxx.N(f2000[5])).m2000(f2000[6]).N(((rw.core.C0097)f11000[f14000[2]]).m8000(var2)));
         });
         var5x.N(var0xx -> ((C0288)var0xx.N(f2000[3])).N((C0056)C0076.f5000[f14000[1]]));
         var5x.y(m48000(var4, var5, var2, var7, var8));
      });
   }

   private static boolean m66000(GuiWidget var0) {
      return var0.m30000() && var0.m54000().m54000() && !var0.m54000().m14000() ? f13000[1] : f13000[2];
   }

   private static void m70000() {
      f5000 = new byte[]{2, 14, 2, 5, 6, 7, 2, 14};
      f17000 = new byte[]{3, 2, 3, 8, 10};
      f18000 = new byte[]{120, 2, 14, 3, 20, 4, 16, 4};
   }
}
