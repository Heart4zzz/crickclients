package rw.gui;

import java.util.List;
import org.joml.Vector2f;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.api.Iface0656;
import rw.api.Iface0657;
import rw.core.C0076;
import rw.core.C0259;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C1073;
import rw.core.C1126;
import rw.core.C1130;
import rw.core.C1161;
import rw.core.C1235;
import rw.core.OlOqjil;
import rw.data.Rec0066;
import rw.data.Rec0076;
import rw.data.Rec0267;
import rw.defs.Enum0078;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "notify",
   i = 0.0F,
   N = 200.0F,
   y = Enum0078.VERTICAL
)
public class C0147 extends DragOffset {
   private static float[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   public static Object[] f6000;
   private static boolean[] f7000;
   private static byte[] f8000;
   private static String[] f9000;
   public static Object[] f10000;
   private static boolean[] f11000;
   private static byte[] f12000;
   private static long[] f13000;
   private static float[] f14000;
   private static byte[] f15000;
   private static float[] f16000;
   private static float[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static byte[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static int[] f23000;
   private static boolean[] f24000;
   private static byte[] f25000;
   private static float[] f26000;
   private static boolean[] f27000;
   public static Object[] f28000;
   private static boolean[] f29000;
   private static boolean[] f30000;
   private static short[] f31000;

   private static void m2000() {
      f11000 = new boolean[]{true, false, true, false, false, false, true, true};
      f29000 = new boolean[]{true, false, false};
      f30000 = new boolean[]{true, true, false};
      f24000 = new boolean[]{false, true, false};
      f3000 = new boolean[]{false, false, false, false, true, true, false, false};
      f27000 = new boolean[]{true, false, false, true, true, true};
      f22000 = new boolean[]{false, true, false, true, false, false, true, false};
      f7000 = new boolean[]{true, false, false};
   }

   private static void m4000() {
      f9000 = new String[]{"notifyRevision", "notifyTicker", "notifyExampleStage", "hud.example.notify", "notifyStack"};
   }

   public C0147() {
      super(C0147::m32000);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{0.0F, 0.6F, 2.0F, -50.0F, 1.0F, 100.0F};
      f26000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f14000 = new float[]{0.0F, 0.0F, 0.0F, 12.0F, 0.0F};
      f17000 = new float[]{64.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 9.0F};
      f4000 = new float[]{10.0F, 10.0F, 0.0F, Float.POSITIVE_INFINITY, 10.0F, 4.0F};
      f16000 = new float[]{100.0F, 999.0F, 999.0F, 0.6F, 4.0F};
   }

   private static void m10000() {
      f15000 = new byte[]{-1, 2, 6, 7, 3, 2};
      f12000 = new byte[]{2, 2, 2, 2, 2, 2, 3, 4};
      f8000 = new byte[]{6, 5, 3, -1, 4, 8, 10, 2};
      f21000 = new byte[]{8, 3, 9};
      f25000 = new byte[]{4, 64, 5, 6, 2, 6};
      f20000 = new byte[]{6, 2, 4};
   }

   private static void m18000() {
      f2000 = new Object[]{0.6F, 10, 8, 9, 64, 4.0F, 536870911, null};
      f6000 = new Object[]{null, null};
      f28000 = new Object[]{null, null, null, null, null, null};
      f10000 = new Object[]{null, null, 5000L, null, -1, null};
   }

   private static boolean m20000() {
      return NursultanClient.m70000().m46000().stream().anyMatch(C1161::m58000);
   }

   private static void m12000() {
      f23000 = new int[]{16777215};
   }

   private static void m14000() {
      f13000 = new long[]{5000L, 5000L, 5000L, 5000L, 0L, 0L, 5000L};
   }

   private static void m16000() {
      f5000 = new short[]{7, 3, 5, 4, 5};
      f31000 = new short[]{4, 3, 5, 5, 1};
      f19000 = new short[]{0, 0, 1, 4, 5, 1, 2, 3};
      f18000 = new short[]{0, 3};
   }

   public Vector2f m18000() {
      return new Vector2f(f1000[0], u() * f1000[1]);
   }

   public C0056 m20000() {
      return C0056.m130000().m144000(Rec0066.m14000(B() / f1000[2], f1000[3]));
   }

   private static C1161 m22000(int var0) {
      if ((C1161)f10000[f5000[2]] == null || (Integer)f10000[f5000[3]] != var0 || !((C1161)f10000[f5000[4]]).m42000()) {
         Integer var9 = var0;
         f10000[f31000[0]] = var9;
         long var1 = System.currentTimeMillis();
         long var3 = var1 - var1 % f13000[1] + f13000[2];
         C1161 var10 = NursultanClient.m70000()
            .m18000()
            .m26000()
            .m46000((Iface0656)((List)f10000[f31000[1]]).get(var0))
            .m34000(new Rec0267(C1235.m36000(f9000[3])))
            .m38000(f13000[3])
            .m14000()
            .m46000(var3);
         f10000[f31000[2]] = var10;
      }

      return (C1161)f10000[f31000[3]];
   }

   @Override
   public boolean m22000() {
      return !NursultanClient.m88000().m174000().U() && !m20000() ? f11000[1] : f11000[0];
   }

   private static Rec0066 m34000(C1161 var0) {
      long var1 = var0.m8000();
      if (var1 <= f13000[4]) {
         return Rec0066.f3000;
      } else {
         float var3 = (float)(var0.m16000() - System.currentTimeMillis());
         float var4 = C0259.m4000(var3 / (float)var1);
         return Rec0066.m12000((f1000[4] - var4) * f1000[5]);
      }
   }

   private static C0031 m48000(C1161 var0, boolean var1, Iface0202 var2) {
      String var3 = "notify-" + var0.m56000();
      return C0287.m26000(var0.m42000() ? (var1 ? (C0056)f6000[f31000[4]] : (C0056)f6000[f19000[0]]) : (C0056)f28000[f19000[1]], var3x -> {
         var3x.N(var3);
         var3x.N((C0056)f28000[f19000[5]], var3xx -> {
            var3xx.N(var3 + "-card");
            Iface0656 var4 = var0.m6000();
            if (var4 != null) {
               var3xx.N((C0056)f28000[f19000[6]], var4x -> {
                  var4x.N(var3 + "-thumbnail");
                  var4x.y(var4.m2000(var2, var0));
               });
               var3xx.N(var1xxx -> ((C0288)var1xxx.N(var3 + "-divider")).N((C0056)C0076.f5000[f18000[1]]));
            }

            Iface0657 var5 = var0.m38000();
            if (var5 != null) {
               C0056 var6 = C1126.m28000((C0056)f28000[f19000[7]], var5.m4000(), f26000[0], (Rec0076)C1073.f1000[f18000[0]]);
               var3xx.N(var6, var4x -> {
                  var4x.N(var3 + "-content");
                  var4x.y(var5.m2000(var2, var0));
               });
            }

            if (var0.m8000() > f13000[5]) {
               var3xx.y(m52000(var3, var0));
            }
         });
      });
   }

   private static C0031 m32000(Void var0, Iface0202 var1) {
      OlOqjil var2 = NursultanClient.m70000();
      var1.m2000(f9000[0], var2::m28000);
      var1.m4000(f9000[1], C1130::new);
      List var3 = var2.m46000();
      if (!NursultanClient.m88000().m174000().U()) {
         var3 = var3.stream().filter(C1161::m58000).toList();
      }

      List var4 = var3.isEmpty() && Huddumped.m40000() ? List.of(m22000(var1.m2000(f9000[2], C0147::m54000))) : var3;
      int var5 = f15000[0];

      for (int var6 = f11000[4]; var6 < var4.size(); var6++) {
         if (((C1161)var4.get(var6)).m42000()) {
            var5 = var6;
            break;
         }
      }

      int var7 = var5;
      return C0287.m26000((C0056)f2000[f5000[0]], var3x -> {
         var3x.N(f9000[4]);

         for (int var4x = var4.size() - f11000[7]; var4x >= 0; var4x--) {
            var3x.y(m48000((C1161)var4.get(var4x), var4x == var7 ? f29000[0] : f29000[1], var1));
         }
      });
   }

   private static C0031 m52000(String var0, C1161 var1) {
      C0056[] var10000 = new C0056[f15000[1]];
      var10000[f11000[5]] = (C0056)f10000[f19000[2]];
      var10000[f11000[6]] = C0056.m130000().m86000(var1.m14000().m2000()).m98000(m34000(var1));
      C0056 var2 = C0056.m120000(var10000);
      return C0287.m26000((C0056)f28000[f19000[3]], var2x -> {
         var2x.N(var0 + "-timeZone");
         var2x.N((C0056)f28000[f19000[4]], var2xx -> {
            var2xx.N(var0 + "-timeTrack");
            var2xx.N(var2xxx -> ((C0288)var2xxx.N(var0 + "-timeFill")).N(var2));
         });
      });
   }

   public boolean m34000() {
      return NursultanClient.m70000().m46000().isEmpty() && !Huddumped.m40000() ? f11000[3] : f11000[2];
   }

   private static int m54000() {
      return (int)(System.currentTimeMillis() / f13000[0] % ((List)f10000[f5000[1]]).size());
   }
}
