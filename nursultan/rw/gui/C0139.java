package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.core.C0076;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C0959;
import rw.core.C1181;
import rw.core.OlIrtqjti;
import rw.data.Rec0066;
import rw.defs.Enum0078;
import rw.setting.C0031;
import rw.setting.C0056;
import rw.setting.C0160;

@Iface0639(
   u = "logo",
   i = 10.0F,
   N = 10.0F,
   y = Enum0078.NONE
)
public class C0139 extends DragOffset {
   private static boolean[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   private static String[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   public static Object[] f8000;
   private static boolean[] f9000;
   private static short[] f10000;
   private static String[] f11000;
   private static byte[] f12000;
   private static byte[] f13000;
   private static float[] f14000;
   private static short[] f15000;
   private static byte[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   private static byte[] f19000;
   private static String[] f20000;
   private static String[] f21000;
   private static short[] f22000;
   private static byte[] f23000;
   private static String[] f24000;
   private static String[] f25000;
   private static short[] f26000;
   private static boolean[] f27000;
   private static byte[] f28000;
   public static Object[] f29000;
   private static short[] f30000;
   private static boolean[] f31000;
   private static boolean[] f32000;
   private static String[] f33000;
   private static String[] f34000;
   private static short[] f35000;
   private static boolean[] f36000;
   private static boolean[] f37000;
   private static boolean[] f38000;
   public static Object[] f39000;
   private static byte[] f40000;
   public static Object[] f41000;
   private static boolean[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   private static String[] f45000;

   private static String m2000() {
      String var0 = ((C0959)NursultanClient.f13000[f15000[4]]).m20000();
      return var0 == null ? f24000[0] : var0;
   }

   private static C0031 m6000(Coordinates var0, OlIrtqjti var1) {
      return C0287.m26000((C0056)f41000[f3000[1]], var2 -> {
         var2.N(f11000[2]);
         boolean[] var10000 = new boolean[f18000[1]];
         var10000[f18000[2]] = f18000[3];
         boolean[] var3 = var10000;
         if (var0.m32000().m14000()) {
            m132000(var2, var1);
            var3[f18000[4]] = f31000[0];
         }

         if (var0.m4000().m14000()) {
            if (var3[f31000[1]]) {
               m104000(var2, f11000[3]);
            }

            m122000(var2, f11000[4], f11000[5], m146000(), f11000[6], var1);
            var3[f31000[2]] = f31000[3];
         }

         if (var0.m18000().m14000()) {
            if (var3[f1000[0]]) {
               m104000(var2, f25000[0]);
            }

            m122000(var2, f25000[1], f25000[2], Float.toString(NursultanClient.m78000().m24000()), f25000[3], var1);
         }
      });
   }

   private static void m26000() {
      f26000 = new short[]{6, 0};
      f43000 = new short[]{3, 2, 0, 1};
      f3000 = new short[]{1, 1};
      f15000 = new short[]{2, 2, 3, 2, 2, 0, 4, 0};
      f30000 = new short[]{4, 0, 4, 0};
      f22000 = new short[]{4, 0, 4, 0, 4, 3, 4};
      f44000 = new short[]{5, 2, 1};
      f10000 = new short[]{2, 5, 4};
      f35000 = new short[]{1, 0, 1, 0, 2, 2, 4, 1};
   }

   public C0139() {
      super(C0139::m22000);
   }

   static {
      ntfClinit();
   }

   private static int m38000() {
      return (NNNwS)((NNuU)f39000[f22000[3]]).T[f22000[4]] == null ? f7000[1] : Math.round(C1181.m44000() * f2000[2]);
   }

   private static void m6000() {
      f2000 = new float[]{20.0F, -100.0F, 10.0F, 16.0F, 16.0F};
      f14000 = new float[]{8.0F, 8.0F, 37.0F, 37.0F, 10.0F, 4.0F};
      f17000 = new float[]{37.0F, 37.0F, 1.0F, 4.0F, 72.0F};
   }

   private static void m58000() {
      f32000 = new boolean[]{true, false, true, false, true, false, true, false};
      f7000 = new boolean[]{false, false, false, true};
      f36000 = new boolean[]{false, false, true, true};
      f18000 = new boolean[]{true, true, false, false, false};
      f31000 = new boolean[]{true, false, false, true};
      f1000 = new boolean[]{false, true, false, false, false};
      f9000 = new boolean[]{true, false, false, true, false, false, true};
      f42000 = new boolean[]{false, true, false, false, true, false, true, false};
      f38000 = new boolean[]{false, true, true, true, false};
      f27000 = new boolean[]{true, false, true, false, false, true, false};
      f37000 = new boolean[]{true, false, true};
   }

   private static boolean m60000() {
      Coordinates var0 = NursultanClient.m88000().m206000();
      return var0.m6000().i() == var0.m24000() ? f32000[4] : f32000[5];
   }

   private static void m8000() {
      f28000 = new byte[]{2, 4, 8};
      f4000 = new byte[]{16, 32, 64, 2};
      f13000 = new byte[]{2, 2, 2, 2, 3, 2};
      f23000 = new byte[]{2, 2, 2, 2};
      f40000 = new byte[]{3, 2, 14, 4, 4};
      f19000 = new byte[]{2, -1, 14, 4};
      f16000 = new byte[]{5, 5, 2, 8, 3, 4, 4, 16};
      f12000 = new byte[]{4, 10, 37, 3, 6};
   }

   public C0056 m10000() {
      return !m60000() ? C0056.f1000 : C0056.m130000().m144000(Rec0066.m14000(B() - f2000[0], f2000[1]));
   }

   private static boolean m74000(Coordinates var0) {
      return !var0.m32000().m14000() && !var0.m4000().m14000() && !var0.m18000().m14000() ? f32000[3] : f32000[2];
   }

   private static String m82000(int var0) {
      return Integer.toString(m18000(var0));
   }

   public boolean m16000() {
      return NursultanClient.m88000().m206000().U();
   }

   private static boolean m84000(Coordinates var0) {
      return !var0.m28000().m14000() && !var0.m16000().m14000() && !var0.m14000().m14000() && !var0.m30000().m14000() ? f32000[1] : f32000[0];
   }

   private static C0031 m88000(Coordinates var0, OlIrtqjti var1) {
      return C0287.m26000((C0056)f41000[f43000[2]], var2 -> {
         var2.N(f34000[1]);
         var2.y(m94000(var1));
         if (m84000(var0)) {
            var2.y(m114000(var0, var1));
         }
      });
   }

   private static C0031 m94000(OlIrtqjti var0) {
      return C0287.m26000((C0056)f41000[f43000[3]], var1 -> {
         var1.N(f45000[3]);
         var1.N((C0056)f29000[f35000[3]], var1x -> {
            var1x.N(f20000[5]);
            var1x.L(var1xx -> ((C0286)var1xx.N(f20000[6])).m2000(f34000[0]).N(((rw.core.C0097)f29000[f35000[7]]).m8000(var0)));
         });
         m104000(var1, f20000[0]);
         var1.N((C0056)f41000[f35000[4]], var0xx -> {
            var0xx.N(f20000[1]);
            var0xx.N((C0056)f29000[f35000[5]], var0xxx -> {
               var0xxx.N(f20000[2]);
               var0xxx.y(var0xxxx -> ((C0296)var0xxxx.N(f20000[3])).m2000(f20000[4]).N((C0056)f29000[f35000[6]]));
            });
         });
      });
   }

   private static void m104000(C0288 var0, String var1) {
      var0.N(var1x -> ((C0288)var1x.N(var1)).N((C0056)C0076.f5000[f22000[5]]));
   }

   private static void m106000(C0288 var0, String var1, String var2, String var3, boolean var4) {
      C0056 var5 = var4 ? (C0056)f29000[f15000[2]] : (C0056)f29000[f15000[3]];
      var0.N(var5, var3x -> {
         var3x.N(var1);
         var3x.y(var2xx -> ((C0296)var2xx.N(var1 + "-label")).m2000(var2).N((C0056)f29000[f44000[0]]));
         var3x.y(var2xx -> ((C0296)var2xx.N(var1 + "-value")).m2000(var3).N((C0056)f29000[f22000[6]]));
      });
   }

   private static int m18000(int var0) {
      if ((NNNwS)((NNuU)f39000[f15000[7]]).T[f30000[0]] == null) {
         return f7000[0];
      } else {
         double var1 = switch (var0) {
            case 0 -> ((NNNwS)((NNuU)f39000[f30000[1]]).T[f30000[2]]).method_23317();
            case 1 -> ((NNNwS)((NNuU)f39000[f30000[3]]).T[f22000[0]]).method_23318();
            default -> ((NNNwS)((NNuU)f39000[f22000[1]]).T[f22000[2]]).method_23321();
         };
         return (int)Math.floor(var1);
      }
   }

   private static C0031 m114000(Coordinates var0, OlIrtqjti var1) {
      return C0287.m26000((C0056)f41000[f3000[0]], var2 -> {
         var2.N(f5000[0]);
         boolean[] var10000 = new boolean[f1000[1]];
         var10000[f1000[2]] = f1000[3];
         boolean[] var3 = var10000;
         if (var0.m28000().m14000()) {
            m122000(var2, f5000[1], f5000[2], m2000(), null, var1);
            var3[f1000[4]] = f9000[0];
         }

         if (var0.m16000().m14000()) {
            if (var3[f9000[1]]) {
               m104000(var2, f21000[0]);
            }

            m122000(var2, f21000[1], f21000[2], Integer.toString(((NNuU)f39000[f35000[1]]).Nx()), f21000[3], var1);
            var3[f9000[2]] = f9000[3];
         }

         if (var0.m14000().m14000()) {
            if (var3[f9000[4]]) {
               m104000(var2, f21000[4]);
            }

            m122000(var2, f21000[5], f21000[6], Integer.toString(C0160.m52000()), f21000[7], var1);
            var3[f9000[5]] = f9000[6];
         }

         if (var0.m30000().m14000()) {
            if (var3[f42000[0]]) {
               m104000(var2, f45000[0]);
            }

            m122000(var2, f45000[1], f45000[2], LocalTime.now().format((DateTimeFormatter)f39000[f35000[2]]), null, var1);
         }
      });
   }

   private static void m122000(C0288 var0, String var1, String var2, String var3, String var4, OlIrtqjti var5) {
      var0.N((C0056)f41000[f15000[0]], var5x -> {
         var5x.N(var1);
         var5x.L(var3xx -> ((C0286)var3xx.N(var1 + "-icon")).m2000("icon:hud/" + var2).N(((rw.core.C0097)f29000[f35000[0]]).m8000(var5)));
         var5x.N((C0056)f29000[f10000[0]], var3xx -> {
            var3xx.N(var1 + "-text");
            var3xx.y(var2xxx -> ((C0296)var2xxx.N(var1 + "-value")).m2000(var3).N((C0056)f29000[f10000[2]]));
            if (var4 != null) {
               var3xx.y(var2xxx -> ((C0296)var2xxx.N(var1 + "-suffix")).m2000(var4).N((C0056)f29000[f10000[1]]));
            }
         });
      });
   }

   private static void m132000(C0288 var0, OlIrtqjti var1) {
      String var2 = f33000[4];
      var0.N((C0056)f41000[f15000[1]], var2x -> {
         var2x.N(var2);
         var2x.L(var2xx -> ((C0286)var2xx.N(var2 + "-icon")).m2000(f11000[1]).N(((rw.core.C0097)f29000[f44000[2]]).m8000(var1)));
         var2x.N((C0056)f29000[f44000[1]], var1xx -> {
            var1xx.N(var2 + "-text");
            m106000(var1xx, var2 + "-x", f24000[3], m82000(f36000[0]), f36000[1]);
            m106000(var1xx, var2 + "-y", f24000[4], m82000(f36000[2]), f36000[3]);
            m106000(var1xx, var2 + "-z", f11000[0], m82000(f4000[3]), f18000[0]);
         });
      });
   }

   private static C0031 m22000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f26000[0]]);
      Coordinates var3 = NursultanClient.m88000().m206000();
      var1.m2000(f6000[0], () -> m138000(var3));
      var1.m2000(f6000[1], () -> m18000(f42000[2]));
      var1.m2000(f6000[2], () -> m18000(f42000[1]));
      var1.m2000(f6000[3], () -> m18000(f13000[0]));
      var1.m2000(f6000[4], C0139::m38000);
      var1.m2000(f33000[0], ((NNuU)f39000[f26000[1]])::Nx);
      var1.m2000(f33000[1], C0160::m52000);
      var1.m2000(f33000[2], () -> LocalTime.now().toSecondOfDay());
      var1.m2000(f33000[3], C0139::m60000);
      return C0287.m26000(m60000() ? (C0056)f8000[f43000[0]] : (C0056)f8000[f43000[1]], var2x -> {
         var2x.N(f34000[2]);
         var2x.y(m88000(var3, var2));
         if (m74000(var3)) {
            var2x.y(m6000(var3, var2));
         }
      });
   }

   private static int m138000(Coordinates var0) {
      byte var1 = f7000[2];
      if (var0.m28000().m14000()) {
         var1 |= f7000[3];
      }

      if (var0.m16000().m14000()) {
         var1 |= f28000[0];
      }

      if (var0.m14000().m14000()) {
         var1 |= f28000[1];
      }

      if (var0.m30000().m14000()) {
         var1 |= f28000[2];
      }

      if (var0.m32000().m14000()) {
         var1 |= f4000[0];
      }

      if (var0.m4000().m14000()) {
         var1 |= f4000[1];
      }

      if (var0.m18000().m14000()) {
         var1 |= f4000[2];
      }

      return var1;
   }

   private static String m146000() {
      if ((NNNwS)((NNuU)f39000[f15000[5]]).T[f15000[6]] == null) {
         return f24000[1];
      } else {
         Locale var10000 = Locale.ROOT;
         String var10001 = f24000[2];
         Object[] var10002 = new Object[f32000[6]];
         var10002[f32000[7]] = C1181.m44000();
         return String.format(var10000, var10001, var10002);
      }
   }

   private static void m148000() {
      f39000 = new Object[]{null, null, 8, 4, 16};
      f8000 = new Object[]{10, 37, null, null};
      f41000 = new Object[]{null, null, null};
      f29000 = new Object[]{null, null, null, null, null, null};
   }

   private static void m152000() {
      f6000 = new String[]{"logoSelection", "logoX", "logoY", "logoZ", "logoMotion"};
      f33000 = new String[]{"logoFps", "logoPing", "logoTime", "logoAlign", "logoItemCoords"};
      f24000 = new String[]{"", "0.0", "%.1f", "x", "y"};
      f11000 = new String[]{"z", "icon:hud/coordinates", "logoBottomPill", "logoDivAfterCoords", "logoItemBps", "bps", "bps"};
      f25000 = new String[]{"logoDivAfterBps", "logoItemTps", "tps", "tps"};
      f5000 = new String[]{"logoDetailsPill", "logoItemLogin", "player"};
      f21000 = new String[]{"logoDivAfterLogin", "logoItemFps", "fps", "fps", "logoDivAfterFps", "logoItemPing", "ping", "ms"};
      f45000 = new String[]{"logoDivAfterPing", "logoItemTime", "time", "logoPill"};
      f20000 = new String[]{"logoPillDivider", "logoPillTextItem", "logoPillText", "logoPillText-value", "Nursultan", "logoPillIconItem", "logoPillIcon"};
      f34000 = new String[]{"icon:hud/nursultan", "logoTopRow", "logoRoot", "HH:mm:ss"};
   }
}
