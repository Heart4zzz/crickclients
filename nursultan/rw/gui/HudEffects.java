package rw.gui;

import KDFzREm.NNNG;
import KDFzREm.NNNZg;
import KDFzREm.NNNbw;
import KDFzREm.NNNwS;
import KDFzREm.NNWd;
import KDFzREm.NNoh;
import KDFzREm.NNpQ;
import KDFzREm.NNuU;
import KDFzREm.NbI;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.Vx;
import KDFzREm.XB;
import KDFzREm.qe;
import java.util.List;
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
import rw.core.C0722;
import rw.core.C1073;
import rw.core.C1116;
import rw.core.C1126;
import rw.core.C1235;
import rw.core.LeAm;
import rw.core.OlIrtqjti;
import rw.data.Rec0076;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "effects",
   i = 100.0F,
   N = 270.0F,
   L = true
)
public class HudEffects extends DragOffset {
   private static byte[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static boolean[] f10000;
   public Object[] f11000;
   private static short[] f12000;
   private static byte[] f13000;
   public static Object[] f14000;
   private static short[] f15000;
   public static Object[] f16000;
   private static short[] f17000;
   private static float[] f18000;
   public static Object[] f19000;
   private static boolean[] f20000;
   private static float[] f21000;
   private static short[] f22000;
   private static boolean[] f23000;
   private static boolean[] f24000;
   private static boolean[] f25000;
   private static String[] f26000;
   private static short[] f27000;
   private static boolean[] f28000;
   private static boolean[] f29000;
   private static String[] f30000;
   private static String[] f31000;
   private static float[] f32000;
   public static Object[] f33000;
   private static byte[] f34000;
   private static byte[] f35000;
   private static int[] f36000;
   private static float[] f37000;
   private static float[] f38000;
   public static Object[] f39000;
   private static float[] f40000;
   private static byte[] f41000;
   private static short[] f42000;
   public static Object[] f43000;
   private static byte[] f44000;
   private static boolean[] f45000;
   private static short[] f46000;

   private static void m2000() {
      f9000 = new short[]{0, 6, 0, 0, 0, 0, 4};
      f27000 = new short[]{0, 0, 0, 3, 3, 4, 1};
      f15000 = new short[]{0, 1, 2, 2, 3, 1};
      f46000 = new short[]{0, 7, 0, 4, 0};
      f17000 = new short[]{4, 0, 3, 0, 3, 5, 4};
      f22000 = new short[]{0, 0};
      f12000 = new short[]{5, 1};
      f42000 = new short[]{5, 3, 6, 0, 6, 6, 4, 999};
   }

   private static String m6000(NbQ var0) {
      int var1 = Byte.toUnsignedInt((byte)var0.i()) + f7000[4];
      return var1 <= f24000[0] ? f6000[0] : Integer.toString(var1);
   }

   private static String m10000(NNNbw<Nbw> var0) {
      return var0.i().map(var0x -> var0x.N().toString()).orElse(f31000[5]);
   }

   private static boolean m12000(NbQ var0) {
      return var0 != null && !((Nbw)var0.L().N()).z() ? f7000[1] : f7000[2];
   }

   private static List<NbQ> m22000() {
      return (NNNwS)((NNuU)f43000[f46000[2]]).T[f46000[3]] == null
         ? List.of()
         : ((NNNwS)((NNuU)f43000[f46000[4]]).T[f17000[0]]).method_6026().stream().filter(var0 -> !((Nbw)var0.L().N()).N() ? f24000[1] : f24000[2]).toList();
   }

   public HudEffects() {
      super(HudEffects::m32000);
      this.m6000();
      C1116 var5 = new C1116(f37000[0]);
      this.f11000[f9000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static String m30000(NbQ var0) {
      return m108000(var0.L());
   }

   private void m6000() {
      if (this.f11000 == null) {
         this.f11000 = new Object[f10000[3]];
         Object[] var1 = this.f11000;
      }
   }

   private static void m8000() {
      f43000 = new Object[]{null, null};
      f33000 = new Object[]{f30000[7], null, 10};
      f39000 = new Object[]{20, 18, 120, 14};
      f16000 = new Object[]{12, 4, 45, -1191182337, null, null, null};
      f14000 = new Object[]{null, null, null, null, null, null, null, null};
      f19000 = new Object[]{null, null};
   }

   private static void m10000() {
      f31000 = new String[]{"effectsTicker", "effectsDurations", "hud.example", "2", "9:41", "unknown"};
      f6000 = new String[]{"", "**:**"};
      f26000 = new String[]{"mob_effect/", "mcatlas:textures/atlas/gui.png", "effectsContentBox", "effectRow-example", "2"};
      f30000 = new String[]{
         "9:41",
         "effectsWindow",
         "effectsDivider",
         "effectsIconArea",
         "hud-effects",
         "icon:hud/potions",
         "textures/atlas/gui.png",
         "mcatlas:textures/atlas/gui.png"
      };
   }

   private static String m38000() {
      return C1235.m36000(f31000[2]);
   }

   private static void m42000() {
      f3000 = new byte[]{4, 2, 2, 2, 2};
      f44000 = new byte[]{14, -1, 3, 2, 4, 5, 6, 2};
      f35000 = new byte[]{3, 2, 14, 3};
      f13000 = new byte[]{4, 2, 3, 12};
      f1000 = new byte[]{3, 5, 6, 7, 2, 3};
      f34000 = new byte[]{2, 10, 4, 20, 18, 2, 120};
      f41000 = new byte[]{3, 14};
      f2000 = new byte[]{7, 12, 4, 2, 45, 3, 8, 2};
   }

   private static List<String> m44000() {
      return m22000().stream().map(HudEffects::m98000).toList();
   }

   private static void m12000() {
      f29000 = new boolean[]{true, false, true, false, false, false};
      f7000 = new boolean[]{true, true, false, false, true};
      f24000 = new boolean[]{true, true, false, true};
      f23000 = new boolean[]{false, true, false, false, true, false};
      f45000 = new boolean[]{true, false, true, false, true, true, false};
      f4000 = new boolean[]{true, true, false};
      f20000 = new boolean[]{true, false, false};
      f28000 = new boolean[]{true, false};
      f10000 = new boolean[]{true, false, true, true, false, false};
      f25000 = new boolean[]{true, false, true, false};
   }

   private static void m14000() {
      f36000 = new int[]{-35981};
   }

   private static String m58000(NbQ var0) {
      return XB.N(var0.z(), new Object[f7000[3]]);
   }

   private static float m60000(String var0, String var1, String var2) {
      Huddumped var3 = NursultanClient.m42000();
      float var4 = var3.m80000(var0, f37000[4], (OlmmOsl)OlmmOsl.f7000[f27000[3]]);
      float var5 = var3.m80000(var1, f37000[5], (OlmmOsl)OlmmOsl.f7000[f27000[4]]);
      float var6 = Math.max(f21000[0], var3.m80000(var2, f21000[1], (OlmmOsl)OlmmOsl.f7000[f27000[5]]));
      return f21000[2] + var4 + ((var5 > f21000[3] ? f3000[0] : f29000[4]) + var5) + f21000[4] + var6;
   }

   public boolean m18000() {
      return NursultanClient.m88000().m144000().U();
   }

   private static NNNG m62000(NNNbw<Nbw> var0) {
      return var0.i().<NNNG>map(NNpQ::N).map(var0x -> var0x.R(f26000[0])).orElseGet(qe::L);
   }

   public boolean m26000() {
      return m22000().isEmpty() && !Huddumped.m40000() ? f29000[1] : f29000[0];
   }

   private static C0031 m84000(String var0, String var1, String var2) {
      return C0287.m26000((C0056)f14000[f15000[4]], var3 -> {
         var3.N(var0 + "-nameBox");
         var3.y(var2xx -> ((C0296)var2xx.N(var0 + "-name")).m2000(var1).N((C0056)f14000[f17000[6]]));
         if (!var2.isEmpty()) {
            var3.y(var2xx -> ((C0296)var2xx.N(var0 + "-level")).m2000(var2).N((C0056)f14000[f17000[5]]));
         }
      });
   }

   private static C0031 m88000(String var0, NNNbw<Nbw> var1) {
      Vx var2 = ((NNuU)f43000[f15000[0]]).yW().N(new NNoh((NNNG)f33000[f15000[1]], m62000(var1)));
      C0056[] var10000 = new C0056[f3000[1]];
      var10000[f29000[5]] = (C0056)f14000[f15000[2]];
      var10000[f7000[0]] = C0056.m130000().m114000(var2.method_4594(), var2.method_4593(), var2.method_4577(), var2.method_4575());
      C0056 var3 = C0056.m120000(var10000);
      return C0287.m26000((C0056)f14000[f15000[3]], var2x -> {
         var2x.N(var0 + "-iconSlot");
         var2x.L(var2xx -> ((C0286)var2xx.N(var0 + "-icon")).m2000(f26000[1]).N(var3));
      });
   }

   private static C0031 m94000(List<NbQ> var0, boolean var1, OlIrtqjti var2, boolean var3, float var4) {
      C0056 var5 = var3
         ? C1126.m28000((C0056)f14000[f27000[0]], var4, f37000[1], (Rec0076)C1073.f1000[f27000[1]])
         : C1126.m24000((C0056)f14000[f27000[2]], var4, f37000[2]);
      return C0287.m26000(
         var5,
         var4x -> {
            var4x.N(f26000[2]);
            if (var0.isEmpty() && var1) {
               String var10 = f26000[3];
               var4x.N(C1126.m22000(f24000[3], var3), var2xx -> {
                  var2xx.N(var10);
                  var2xx.y(m118000(var10, NbI.N, m38000(), f26000[4], (NbQ)f43000[f12000[1]]));
                  var2xx.y(m96000(var10, f30000[0], null, var2));
               });
            } else {
               int var5x = f23000[0];

               for (NbQ var7 : var0) {
                  String var8 = m30000(var7);
                  C0056 var9 = ((C1116)((HudEffects)LeAm.f5000[f22000[0]]).f11000[f22000[1]]).m24000(m10000(var7.L()))
                     ? (C0056)C1126.f18000[f12000[0]]
                     : C1126.m22000(var5x++ == 0 ? f23000[1] : f23000[2], var3);
                  var4x.N(var9, var3xx -> {
                     var3xx.N(var8);
                     var3xx.y(m118000(var8, var7.L(), m58000(var7), m6000(var7), var7));
                     var3xx.y(m96000(var8, m98000(var7), var7, var2));
                  });
               }
            }
         }
      );
   }

   private static C0031 m96000(String var0, String var1, NbQ var2, OlIrtqjti var3) {
      C0056 var4 = m12000(var2) ? ((rw.core.C0097)f19000[f15000[5]]).m8000(var3) : ((rw.core.C0097)f19000[f46000[0]]).m8000(var3);
      return C0287.m26000((C0056)f14000[f46000[1]], var3x -> {
         var3x.N(var0 + "-durationBox");
         var3x.y(var3xx -> ((C0296)var3xx.N(var0 + "-duration")).m2000(var1).N(var4));
      });
   }

   private static String m98000(NbQ var0) {
      if (var0.y()) {
         return f6000[1];
      } else {
         float var1 = (NNNZg)((NNuU)f43000[f17000[1]]).T[f17000[2]] != null ? ((NNNZg)((NNuU)f43000[f17000[3]]).T[f17000[4]]).method_54719().R() : f18000[0];
         return NNWd.N(var0.u(), var1);
      }
   }

   private static String m108000(NNNbw<Nbw> var0) {
      return "effectRow-" + m10000(var0);
   }

   private static C0031 m32000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f9000[1]]);
      HudEffects var3 = (HudEffects)LeAm.f5000[f9000[2]];
      var1.m4000(f31000[0], () -> (C1116)var3.f11000[f42000[3]]);
      var1.m2000(f31000[1], HudEffects::m44000);
      List var4 = ((C1116)var3.f11000[f9000[3]]).m30000(m22000(), var0x -> m10000(var0x.L()));
      boolean var5 = Huddumped.m40000();
      boolean var6 = var4.isEmpty() && !var5 ? f29000[3] : f29000[2];
      boolean var7 = ((C1116)var3.f11000[f9000[4]]).m22000(var6);
      float var8 = ((C1116)var3.f11000[f9000[5]]).m26000(var6, m120000(var4, var5));
      return C0287.m26000((C0056)f16000[f9000[6]], var5x -> {
         var5x.N(f30000[1]);
         var5x.N((C0056)f16000[f42000[0]], var1xx -> {
            var1xx.N(f30000[3]);
            var1xx.L(var1xxx -> ((C0286)var1xxx.N(f30000[4])).m2000(f30000[5]).N(((rw.core.C0097)f16000[f42000[2]]).m8000(var2)));
         });
         var5x.N(var0xx -> ((C0288)var0xx.N(f30000[2])).N((C0056)C0076.f5000[f42000[1]]));
         var5x.y(m94000(var4, var5, var2, var7, var8));
      });
   }

   private static C0031 m118000(String var0, NNNbw<Nbw> var1, String var2, String var3, NbQ var4) {
      return C0287.m26000((C0056)f14000[f27000[6]], var4x -> {
         var4x.N(var0 + "-left");
         var4x.y(m88000(var0, var1));
         var4x.y(m84000(var0, var2, var3));
      });
   }

   private static float m120000(List<NbQ> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return m60000(m38000(), f31000[3], f31000[4]);
      } else {
         float var2 = f37000[3];

         for (NbQ var4 : var0) {
            var2 = Math.max(var2, m60000(m58000(var4), m6000(var4), m98000(var4)));
         }

         return var2;
      }
   }

   @Iface0642
   public void m122000(C0722 var1) {
      NursultanClient.m42000().m64000();
   }

   private static void m130000() {
      f37000 = new float[]{120.0F, 120.0F, 120.0F, 0.0F, 14.0F, 12.0F};
      f21000 = new float[]{45.0F, 14.0F, 41.0F, 0.0F, 20.0F};
      f18000 = new float[]{20.0F, 1.0F, 1.0F};
      f40000 = new float[]{16.0F, 16.0F, 72.0F, 1.0F, 100.0F, 11.0F};
      f38000 = new float[]{11.0F, 38.0F, Float.POSITIVE_INFINITY};
      f32000 = new float[]{10.0F, 9.0F, 9.0F};
      f8000 = new float[]{0.0F, Float.POSITIVE_INFINITY};
      f5000 = new float[]{4.0F, 18.0F, 18.0F, 4.0F, 1.0F, 45.0F, Float.POSITIVE_INFINITY};
   }
}
