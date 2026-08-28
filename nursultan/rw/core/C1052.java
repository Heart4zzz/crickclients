package rw.core;

import java.util.function.Consumer;
import rw.api.Iface0202;
import rw.data.Rec0125;
import rw.data.Rec0130;
import rw.data.Rec0262;
import rw.defs.Enum0032;
import rw.defs.Enum0033;
import rw.defs.Enum0036;
import rw.defs.Enum0042;
import rw.setting.C0031;

public class C1052 {
   public static Object[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   private static int[] f5000;
   private static short[] f6000;
   private static byte[] f7000;
   private static boolean[] f8000;
   private static byte[] f9000;
   private static byte[] f10000;
   public static Object[] f11000;
   private static boolean[] f12000;
   private static byte[] f13000;
   private static short[] f14000;
   private static boolean[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;
   private static byte[] f18000;
   private static boolean[] f19000;
   private static String[] f20000;
   private static boolean[] f21000;
   public static Object[] f22000;
   private static boolean[] f23000;
   private static byte[] f24000;
   public static Object[] f25000;
   private static byte[] f26000;
   private static float[] f27000;
   private static float[] f28000;
   public static Object[] f29000;
   private static byte[] f30000;
   private static float[] f31000;
   private static byte[] f32000;
   private static boolean[] f33000;
   private static short[] f34000;
   private static boolean[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static float[] f38000;
   private static boolean[] f39000;

   private static rw.setting.C0056 m4000(boolean var0) {
      if (!var0) {
         return (rw.setting.C0056)f22000[f14000[0]];
      } else {
         rw.setting.C0056[] var10000 = new rw.setting.C0056[f26000[2]];
         var10000[f3000[2]] = (rw.setting.C0056)f22000[f14000[1]];
         var10000[f3000[3]] = rw.setting.C0056.m130000()
            .m90000(Rec0125.m32000(f28000[6], f28000[7]))
            .m156000(Enum0036.f3000)
            .m154000(Enum0042.f2000)
            .m152000(Enum0033.f3000)
            .m190000((Rec0130)C0076.f5000[f6000[0]]);
         return rw.setting.C0056.m120000(var10000);
      }
   }

   private static void m6000() {
      float[] var128 = new float[8];
      f28000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f28000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f28000[2] = Float.intBitsToFloat(1094713344);
      f28000[3] = Float.intBitsToFloat(0);
      f28000[4] = Float.intBitsToFloat(1103101952);
      f28000[5] = Float.intBitsToFloat(1094713344);
      f28000[6] = Float.intBitsToFloat(1106247680);
      f28000[7] = Float.intBitsToFloat(1132855296);
      float[] var129 = new float[3];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1088421888);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f4000[2] = Float.intBitsToFloat(0);
      float[] var130 = new float[5];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1082130432);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f2000[2] = Float.intBitsToFloat(1090519040);
      f2000[3] = Float.intBitsToFloat(1092616192);
      f2000[4] = Float.intBitsToFloat(1048576000);
      float[] var131 = new float[5];
      f31000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f31000[(1 | -1) >>> 31] = Float.intBitsToFloat(1106247680);
      f31000[2] = Float.intBitsToFloat(2139095040);
      f31000[3] = Float.intBitsToFloat(1082130432);
      f31000[4] = Float.intBitsToFloat(1124990976);
      float[] var132 = new float[3];
      f38000[(0 | -0) >>> 31] = Float.intBitsToFloat(2139095040);
      f38000[(1 | -1) >>> 31] = Float.intBitsToFloat(1106247680);
      f38000[2] = Float.intBitsToFloat(1086324736);
      float[] var133 = new float[8];
      f27000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f27000[(1 | -1) >>> 31] = Float.intBitsToFloat(1082130432);
      f27000[2] = Float.intBitsToFloat(1094713344);
      f27000[3] = Float.intBitsToFloat(1082130432);
      f27000[4] = Float.intBitsToFloat(1091567616);
      f27000[5] = Float.intBitsToFloat(1094713344);
      f27000[6] = Float.intBitsToFloat(1094713344);
      f27000[7] = Float.intBitsToFloat(1120403456);
   }

   private static void m12000() {
      byte[] var128 = new byte[5];
      f32000[(0 | -0) >>> 31] = 8;
      f32000[(1 | -1) >>> 31] = 2;
      f32000[2] = 2;
      f32000[3] = 2;
      f32000[4] = 2;
      byte[] var129 = new byte[4];
      f26000[(0 | -0) >>> 31] = 2;
      f26000[(1 | -1) >>> 31] = 2;
      f26000[2] = 2;
      f26000[3] = 2;
      byte[] var130 = new byte[6];
      f24000[(0 | -0) >>> 31] = 2;
      f24000[(1 | -1) >>> 31] = 3;
      f24000[2] = 4;
      f24000[3] = 5;
      f24000[4] = 2;
      f24000[5] = 3;
      byte[] var131 = new byte[8];
      f13000[(0 | -0) >>> 31] = 2;
      f13000[(1 | -1) >>> 31] = 14;
      f13000[2] = 3;
      f13000[3] = 2;
      f13000[4] = 3;
      f13000[5] = 2;
      f13000[6] = 14;
      f13000[7] = 3;
      byte[] var132 = new byte[3];
      f9000[(0 | -0) >>> 31] = 3;
      f9000[(1 | -1) >>> 31] = 4;
      f9000[2] = 5;
      byte[] var133 = new byte[6];
      f17000[(0 | -0) >>> 31] = 7;
      f17000[(1 | -1) >>> 31] = 30;
      f17000[2] = 2;
      f17000[3] = 4;
      f17000[4] = 3;
      f17000[5] = 4;
      byte[] var134 = new byte[5];
      f30000[(0 | -0) >>> 31] = 4;
      f30000[(1 | -1) >>> 31] = 5;
      f30000[2] = 8;
      f30000[3] = 6;
      f30000[4] = 8;
      byte[] var135 = new byte[5];
      f10000[(0 | -0) >>> 31] = 6;
      f10000[(1 | -1) >>> 31] = 4;
      f10000[2] = 3;
      f10000[3] = 2;
      f10000[4] = 7;
      byte[] var136 = new byte[8];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = 4;
      f7000[2] = 4;
      f7000[3] = 5;
      f7000[4] = 12;
      f7000[5] = 6;
      f7000[6] = 4;
      f7000[7] = 12;
      byte[] var137 = new byte[5];
      f18000[(0 | -0) >>> 31] = 2;
      f18000[(1 | -1) >>> 31] = 24;
      f18000[2] = 3;
      f18000[3] = 7;
      f18000[4] = 6;
   }

   private C1052() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f11000 = new Object[f17000[(0 | -0) >>> 31]];
      f11000[f35000[4]] = Integer.valueOf(f17000[1]);
      f11000[f17000[2]] = Integer.valueOf(f17000[3]);
      f11000[f17000[4]] = Integer.valueOf(f35000[5]);
      f11000[f17000[5]] = Integer.valueOf(f30000[0]);
      f11000[f30000[(1 | -1) >>> 31]] = Integer.valueOf(f30000[2]);
      f11000[f30000[3]] = Integer.valueOf(f30000[4]);
      f25000 = new Object[f10000[(0 | -0) >>> 31]];
      f25000[f35000[6]] = Integer.valueOf(f10000[1]);
      f25000[f23000[(0 | -0) >>> 31]] = Integer.valueOf(f10000[2]);
      f25000[f10000[3]] = Integer.valueOf(f10000[4]);
      f25000[f7000[(0 | -0) >>> 31]] = Integer.valueOf(f36000[0]);
      f25000[f7000[(1 | -1) >>> 31]] = Integer.valueOf(f7000[2]);
      f25000[f7000[3]] = Integer.valueOf(f7000[4]);
      f22000 = new Object[f7000[5]];
      f22000[f23000[(1 | -1) >>> 31]] = Integer.valueOf(f7000[6]);
      f22000[f23000[2]] = Integer.valueOf(f7000[7]);
      f22000[f18000[(0 | -0) >>> 31]] = Integer.valueOf(f18000[1]);
      f1000 = new Object[f18000[2]];
      f29000 = new Object[f18000[3]];
      f29000[f18000[4]] = f20000[4];
   }

   private static void m20000() {
      boolean[] var128 = new boolean[8];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[2] = (boolean)((1 | -1) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
      f12000[4] = (boolean)((0 | -0) >>> 31);
      f12000[5] = (boolean)((1 | -1) >>> 31);
      f12000[6] = (boolean)((0 | -0) >>> 31);
      f12000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[4];
      f21000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f21000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[2] = (boolean)((0 | -0) >>> 31);
      f21000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[2];
      f15000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f15000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[8];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      f3000[6] = (boolean)((0 | -0) >>> 31);
      f3000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var132 = new boolean[2];
      f39000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f39000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[7];
      f33000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f33000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f33000[2] = (boolean)((0 | -0) >>> 31);
      f33000[3] = (boolean)((0 | -0) >>> 31);
      f33000[4] = (boolean)((1 | -1) >>> 31);
      f33000[5] = (boolean)((1 | -1) >>> 31);
      f33000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[2];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[2];
      f16000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var136 = new boolean[4];
      f19000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[2] = (boolean)((1 | -1) >>> 31);
      f19000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var137 = new boolean[7];
      f35000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f35000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f35000[2] = (boolean)((1 | -1) >>> 31);
      f35000[3] = (boolean)((0 | -0) >>> 31);
      f35000[4] = (boolean)((1 | -1) >>> 31);
      f35000[5] = (boolean)((1 | -1) >>> 31);
      f35000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var138 = new boolean[3];
      f23000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f23000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f23000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static rw.setting.C0056 m30000(boolean var0) {
      if (!var0) {
         return (rw.setting.C0056)f22000[f6000[1]];
      } else {
         rw.setting.C0056[] var10000 = new rw.setting.C0056[f26000[3]];
         var10000[f3000[4]] = (rw.setting.C0056)f22000[f6000[2]];
         var10000[f3000[5]] = rw.setting.C0056.m130000().m42000(f4000[0]);
         return rw.setting.C0056.m120000(var10000);
      }
   }

   private static void m36000() {
      f20000 = new String[5];
      f20000[(0 | -0) >>> 31] = "icon:menu/check";
      f20000[(1 | -1) >>> 31] = "comboListMount";
      f20000[2] = "comboListCatcher";
      f20000[3] = "comboListPanel";
      f20000[4] = "comboListAnchor";
   }

   private static void m50000() {
      int[] var128 = new int[4];
      f5000[(0 | -0) >>> 31] = -15592942;
      f5000[(1 | -1) >>> 31] = -16119286;
      f5000[2] = -16777216;
      f5000[3] = -7171438;
   }

   private static void m52000(C0288 var0, C1013 var1, boolean var2, Consumer<C1013> var3) {
      String var4 = var1.m22000().m10000();
      var0.N(
         (rw.setting.C0056)f1000[f34000[2]],
         var4x -> {
            var4x.N(m56000(var1.m14000()), var1xx -> var1xx.L(var1xxx -> {
               var1xxx.N("check-" + var4);
               var1xxx.m2000(f20000[0]);
               var1xxx.N((rw.setting.C0056)f29000[f6000[5]]);
            }));
            var4x.N(
               m58000(var2, var1.m14000()),
               var1xx -> var1xx.N(C1235.m40000(var1.m22000()), var1.m14000() ? (rw.setting.C0056)f29000[f6000[3]] : (rw.setting.C0056)f29000[f6000[4]])
            );
            var4x.N(var2xx -> var3.accept(var1));
         }
      );
   }

   private C0031 m54000(Rec0262 var1, Iface0202 var2) {
      boolean var3 = var1.m2000().m2000();
      boolean var4 = var1.m8000().size() > f32000[0] ? f12000[0] : f12000[1];
      boolean var5 = var1.m8000().stream().anyMatch(C1013::m14000);
      String var6 = "comboListAnchor" + System.identityHashCode(var1.m2000());
      rw.setting.C0056 var7 = rw.setting.C0056.m130000().m160000(Enum0032.f2000).m66000(var1.m10000()).m78000(f28000[0], f28000[1]);
      boolean var8 = var1.m12000() != null ? f12000[2] : f12000[3];
      rw.setting.C0056 var12;
      if (var8) {
         rw.setting.C0056[] var10000 = new rw.setting.C0056[f32000[1]];
         var10000[f12000[4]] = (rw.setting.C0056)f22000[f37000[0]];
         var10000[f12000[5]] = rw.setting.C0056.m130000().m178000(Rec0125.m24000(var1.m12000()));
         var12 = rw.setting.C0056.m120000(var10000);
      } else {
         var12 = (rw.setting.C0056)f22000[f37000[1]];
      }

      rw.setting.C0056 var9 = var12;
      if (var8) {
         rw.setting.C0056[] var13 = new rw.setting.C0056[f32000[2]];
         var13[f12000[6]] = m4000(var4);
         var13[f12000[7]] = (rw.setting.C0056)f29000[f37000[2]];
         var12 = rw.setting.C0056.m120000(var13);
      } else {
         var12 = m4000(var4);
      }

      rw.setting.C0056 var10 = var12;
      if (var8) {
         rw.setting.C0056[] var15 = new rw.setting.C0056[f32000[3]];
         var15[f21000[0]] = m30000(var4);
         var15[f21000[1]] = (rw.setting.C0056)f29000[f34000[0]];
         var12 = rw.setting.C0056.m120000(var15);
      } else {
         var12 = m30000(var4);
      }

      rw.setting.C0056 var11 = var12;
      return C1063.m28000((rw.setting.C0056)f29000[f34000[1]], var8x -> {
         var8x.N(f20000[1]);
         var8x.N(var7, var1xx -> var1xx.N(var6));
         if (var3) {
            var8x.y(C1063.m24000(f20000[2], f6000[6], () -> var1.m2000().m6000(f39000[0])));
            rw.setting.C0056[] var10001 = new rw.setting.C0056[f24000[0]];
            var10001[f3000[6]] = var9;
            var10001[f3000[7]] = C1063.m30000(var6, f4000[1], f6000[7]);
            var8x.N(rw.setting.C0056.m120000(var10001), var4xx -> {
               var4xx.N(f20000[3]);
               var4xx.N(var10, var3xxx -> var3xxx.N(var11, var2xxxx -> {
                  for (C1013 var4xxx : var1.m8000()) {
                     m52000(var2xxxx, var4xxx, var5, var1.m6000());
                  }
               }));
            });
         }
      });
   }

   private static rw.setting.C0056 m56000(boolean var0) {
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f32000[4]];
      var10000[f21000[2]] = (rw.setting.C0056)f1000[f34000[3]];
      var10000[f21000[3]] = rw.setting.C0056.m130000().m178000(Rec0125.m24000(var0 ? f28000[2] : f28000[3]));
      return rw.setting.C0056.m120000(var10000);
   }

   private static rw.setting.C0056 m58000(boolean var0, boolean var1) {
      if (var1) {
         rw.setting.C0056[] var2 = new rw.setting.C0056[f26000[0]];
         var2[f15000[0]] = (rw.setting.C0056)f1000[f34000[4]];
         var2[f15000[1]] = rw.setting.C0056.m130000().m80000(f28000[4]);
         return rw.setting.C0056.m120000(var2);
      } else if (var0) {
         rw.setting.C0056[] var10000 = new rw.setting.C0056[f26000[1]];
         var10000[f3000[0]] = (rw.setting.C0056)f1000[f34000[5]];
         var10000[f3000[1]] = rw.setting.C0056.m130000().m80000(f28000[5]);
         return rw.setting.C0056.m120000(var10000);
      } else {
         return (rw.setting.C0056)f1000[f34000[6]];
      }
   }

   private static void m74000() {
      short[] var128 = new short[3];
      f37000[(0 | -0) >>> 31] = 3;
      f37000[(1 | -1) >>> 31] = 3;
      f37000[2] = 4;
      short[] var129 = new short[7];
      f34000[(0 | -0) >>> 31] = 4;
      f34000[(1 | -1) >>> 31] = 5;
      f34000[2] = (short)((0 | -0) >>> 31);
      f34000[3] = 2;
      f34000[4] = (short)((1 | -1) >>> 31);
      f34000[5] = (short)((1 | -1) >>> 31);
      f34000[6] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[2];
      f14000[(0 | -0) >>> 31] = 4;
      f14000[(1 | -1) >>> 31] = 4;
      short[] var131 = new short[8];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 5;
      f6000[2] = 5;
      f6000[3] = 3;
      f6000[4] = 2;
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = 2000;
      f6000[7] = 2001;
      short[] var132 = new short[(1 | -1) >>> 31];
      f36000[(0 | -0) >>> 31] = 268;
   }
}
