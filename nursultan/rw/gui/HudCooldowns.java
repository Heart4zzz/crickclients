package rw.gui;

import KDFzREm.NNNG;
import KDFzREm.NNNZg;
import KDFzREm.NNNqL;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQI;
import KDFzREm.NQa;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.Nww;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0639;
import rw.core.C0076;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C1073;
import rw.core.C1116;
import rw.core.C1126;
import rw.core.LeAm;
import rw.core.OlIrtqjti;
import rw.data.Oljjtpnom;
import rw.data.Rec0076;
import rw.data.Rec0161;
import rw.data.Rec0247;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;

@Iface0639(
   u = "cooldowns",
   i = 100.0F,
   N = 380.0F,
   L = true
)
public class HudCooldowns extends DragOffset {
   private static boolean[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   public static Object[] f5000;
   public static Object[] f6000;
   private static float[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static short[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static byte[] f14000;
   private static short[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static boolean[] f18000;
   private static byte[] f19000;
   public static Object[] f20000;
   private static short[] f21000;
   private static boolean[] f22000;
   private static short[] f23000;
   private static String[] f24000;
   private static short[] f25000;
   private static boolean[] f26000;
   private static byte[] f27000;
   private static String[] f28000;
   private static byte[] f29000;
   private static float[] f30000;
   private static short[] f31000;
   private static byte[] f32000;
   public Object[] f33000;
   private static short[] f34000;
   private static boolean[] f35000;
   private static boolean[] f36000;

   private static void m4000() {
      f24000 = new String[]{
         "cooldownsTicker", "cooldownsDurations", "cooldownsContentBox", "cooldownsWindow", "cooldownsDivider", "cooldownsIconArea", "hud-cooldowns"
      };
      f28000 = new String[]{"icon:hud/cooldowns", "nursultan_example_ender_pearl"};
   }

   public HudCooldowns() {
      super(HudCooldowns::m24000);
      this.m10000();
      C1116 var5 = new C1116(f7000[0]);
      this.f33000[f25000[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static String m14000(int var0) {
      float var1 = (NNNZg)((NNuU)f4000[f31000[1]]).T[f17000[0]] != null ? ((NNNZg)((NNuU)f4000[f17000[1]]).T[f13000[0]]).method_54719().R() : f30000[2];
      int var2 = Math.max(f26000[5], (int)Math.ceil(var0 / Math.max(f30000[3], var1)));
      int var3 = var2 / f3000[2];
      int var4 = var2 % f3000[3];
      return var3 + ":" + (var4 < f3000[4] ? "0" + var4 : Integer.toString(var4));
   }

   private static List<Rec0247> m16000() {
      if ((NNNwS)((NNuU)f4000[f10000[3]]).T[f10000[4]] == null) {
         return List.of();
      } else {
         NQI var0 = ((NNNwS)((NNuU)f4000[f10000[5]]).T[f10000[6]]).method_7357();
         Set var1 = NursultanClient.m88000().m136000().m4000() ? m60000(var0) : null;
         int var2 = var0.y;
         ArrayList var3 = new ArrayList();

         for (Entry var5 : var0.N.entrySet()) {
            int var6 = ((Rec0161)var5.getValue()).f2000 - var2;
            if (var6 > 0 && (var1 == null || var1.contains(var5.getKey()))) {
               NQl var7 = (NQl)NNNqL.B.N((NNNG)var5.getKey());
               if (var7 != NQa.N) {
                  var3.add(new Rec0247((NNNG)var5.getKey(), var7.E(), var6));
               }
            }
         }

         return var3;
      }
   }

   private static void m6000() {
      f3000 = new byte[]{58, 45, 60, 60, 10, 2, 2};
      f29000 = new byte[]{14, 3, 2};
      f19000 = new byte[]{2, 3, 4, 2};
      f27000 = new byte[]{14, 3, 5, 6, 7, 8};
      f32000 = new byte[]{2, 4, 10, 5, 16, 6, 120, 7};
      f14000 = new byte[]{14, 2, 4, 20, 2, 45, 8};
   }

   private static void m8000() {
      f7000 = new float[]{120.0F, 120.0F, 120.0F, 0.0F, 14.0F, 45.0F};
      f30000 = new float[]{14.0F, 59.0F, 20.0F, 1.0F, 16.0F};
      f16000 = new float[]{16.0F, 1.0F, 100.0F, 11.0F};
      f2000 = new float[]{11.0F, 38.0F, Float.POSITIVE_INFINITY, 10.0F, 9.0F};
      f11000 = new float[]{9.0F, 0.0F, Float.POSITIVE_INFINITY, 4.0F, 16.0F, 16.0F, 45.0F, Float.POSITIVE_INFINITY};
   }

   private static void m18000() {
      f4000 = new Object[]{null, null, 600, null, 10, 16, 120, 14};
      f20000 = new Object[]{4, 20};
      f5000 = new Object[]{45, null};
      f6000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private void m10000() {
      if (this.f33000 == null) {
         this.f33000 = new Object[f18000[6]];
         Object[] var1 = this.f33000;
      }
   }

   private static void m12000() {
      f26000 = new boolean[]{true, false, true, false, false, false};
      f9000 = new boolean[]{false, true, true, false};
      f1000 = new boolean[]{true, false, false};
      f36000 = new boolean[]{true, false, true};
      f35000 = new boolean[]{false, true, true};
      f18000 = new boolean[]{true, false, true, false, false, true, true};
      f22000 = new boolean[]{false, true, false};
   }

   private static List<String> m20000() {
      return m16000().stream().map(var0 -> var0.f2000 + " " + m14000(var0.f3000)).toList();
   }

   public boolean m16000() {
      return NursultanClient.m88000().m136000().U();
   }

   private static float m28000(String var0, String var1) {
      Huddumped var2 = NursultanClient.m42000();
      float var3 = var2.m80000(var0, f7000[4], (OlmmOsl)OlmmOsl.f7000[f34000[1]]);
      float var4 = Math.max(f7000[5], var2.m80000(var1, f30000[0], (OlmmOsl)OlmmOsl.f7000[f34000[2]]));
      return f30000[1] + var3 + var4;
   }

   private static C0031 m32000(String var0, NQo var1) {
      Oljjtpnom var2 = NursultanClient.m66000().m70000(var1);
      return C0287.m26000((C0056)f6000[f15000[1]], var2x -> {
         var2x.N(var0 + "-iconSlot");
         if (var2.m4000()) {
            C0056[] var10000 = new C0056[f3000[5]];
            var10000[f9000[0]] = (C0056)f6000[f13000[2]];
            var10000[f9000[1]] = C0056.m130000().m114000(var2.m22000(), var2.m28000(), var2.m30000(), var2.m14000());
            C0056 var3 = C0056.m120000(var10000);
            var2x.L(var2xx -> ((C0286)var2xx.N(var0 + "-icon")).m2000(NursultanClient.m66000().m42000()).N(var3));
         }
      });
   }

   private static C0031 m34000(String var0, String var1, OlIrtqjti var2) {
      return C0287.m26000((C0056)f6000[f31000[0]], var3 -> {
         var3.N(var0 + "-durationBox");
         var3.y(var3x -> ((C0296)var3x.N(var0 + "-duration")).m2000(var1).N(((rw.core.C0097)f6000[f13000[1]]).m8000(var2)));
      });
   }

   private static C0031 m24000(Void var0, Iface0202 var1) {
      OlIrtqjti var2 = var1.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f25000[1]]);
      HudCooldowns var3 = (HudCooldowns)LeAm.f5000[f25000[2]];
      var1.m4000(f24000[0], () -> (C1116)var3.f33000[f12000[0]]);
      var1.m2000(f24000[1], HudCooldowns::m20000);
      List var4 = ((C1116)var3.f33000[f23000[0]]).m30000(m16000(), Rec0247::m6000);
      boolean var5 = Huddumped.m40000();
      boolean var6 = var4.isEmpty() && !var5 ? f26000[3] : f26000[2];
      boolean var7 = ((C1116)var3.f33000[f23000[1]]).m22000(var6);
      float var8 = ((C1116)var3.f33000[f23000[2]]).m26000(var6, m54000(var4, var5));
      return C0287.m26000((C0056)f5000[f23000[3]], var5x -> {
         var5x.N(f24000[3]);
         var5x.N((C0056)f6000[f8000[3]], var1xx -> {
            var1xx.N(f24000[5]);
            var1xx.L(var1xxx -> ((C0286)var1xxx.N(f24000[6])).m2000(f28000[0]).N(((rw.core.C0097)f6000[f8000[5]]).m8000(var2)));
         });
         var5x.N(var0xx -> ((C0288)var0xx.N(f24000[4])).N((C0056)C0076.f5000[f8000[4]]));
         var5x.y(m50000(var4, var5, var2, var7, var8));
      });
   }

   public boolean m26000() {
      return m16000().isEmpty() && !Huddumped.m40000() ? f26000[1] : f26000[0];
   }

   private static String m46000(NNNG var0) {
      return "cooldownRow-" + var0.toString().replace((char)f3000[0], (char)f3000[1]);
   }

   private static C0031 m50000(List<Rec0247> var0, boolean var1, OlIrtqjti var2, boolean var3, float var4) {
      C0056 var5 = var3
         ? C1126.m28000((C0056)f6000[f10000[0]], var4, f7000[1], (Rec0076)C1073.f1000[f10000[1]])
         : C1126.m24000((C0056)f6000[f10000[2]], var4, f7000[2]);
      return C0287.m26000(
         var5,
         var4x -> {
            var4x.N(f24000[2]);
            if (var0.isEmpty() && var1) {
               String var10 = m46000((NNNG)f4000[f13000[4]]);
               var4x.N(C1126.m22000(f9000[2], var3), var2xx -> {
                  var2xx.N(var10);
                  var2xx.y(m62000(var10, (NQo)f4000[f8000[0]], ((NQo)f4000[f8000[1]]).d().getString()));
                  var2xx.y(m34000(var10, m14000(f8000[2]), var2));
               });
            } else {
               int var5x = f9000[3];

               for (Rec0247 var7 : var0) {
                  String var8 = m46000(var7.f2000);
                  C0056 var9 = ((C1116)((HudCooldowns)LeAm.f5000[f13000[5]]).f33000[f13000[6]]).m24000(var7.f2000)
                     ? (C0056)C1126.f18000[f13000[7]]
                     : C1126.m22000(var5x++ == 0 ? f1000[0] : f1000[1], var3);
                  var4x.N(var9, var3xx -> {
                     var3xx.N(var8);
                     var3xx.y(m62000(var8, var7.f1000, var7.f1000.d().getString()));
                     var3xx.y(m34000(var8, m14000(var7.f3000), var2));
                  });
               }
            }
         }
      );
   }

   private static float m54000(List<Rec0247> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return m28000(((NQo)f4000[f21000[2]]).d().getString(), m14000(f34000[0]));
      } else {
         float var2 = f7000[3];

         for (Rec0247 var4 : var0) {
            var2 = Math.max(var2, m28000(var4.f1000.d().getString(), m14000(var4.f3000)));
         }

         return var2;
      }
   }

   private static Set<NNNG> m60000(NQI var0) {
      HashSet var1 = new HashSet();
      Nww var2 = ((NNNwS)((NNuU)f4000[f21000[0]]).T[f21000[1]]).method_31548();

      for (int var3 = f26000[4]; var3 < var2.method_5439(); var3++) {
         NQo var4 = var2.method_5438(var3);
         if (!var4.R()) {
            NNNG var5 = var0.y(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }
      }

      return var1;
   }

   private static C0031 m62000(String var0, NQo var1, String var2) {
      return C0287.m26000((C0056)f6000[f15000[0]], var3 -> {
         var3.N(var0 + "-left");
         var3.y(m32000(var0, var1));
         var3.y(var2xx -> ((C0296)var2xx.N(var0 + "-name")).m2000(var2).N((C0056)f6000[f13000[3]]));
      });
   }

   private static void m74000() {
      f25000 = new short[]{0, 6, 5};
      f23000 = new short[]{0, 0, 0, 1};
      f10000 = new short[]{2, 0, 2, 0, 4, 0, 4};
      f21000 = new short[]{0, 4, 1};
      f34000 = new short[]{600, 3, 4};
      f15000 = new short[]{3, 4};
      f31000 = new short[]{7, 0};
      f17000 = new short[]{3, 0};
      f13000 = new short[]{3, 6, 4, 5, 3, 5, 0, 5};
      f8000 = new short[]{1, 1, 600, 0, 3, 1};
      f12000 = new short[]{0, 4, 600};
   }
}
