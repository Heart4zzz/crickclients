package rw.core;

import rw.api.Iface0202;
import rw.data.OlkIrprsq;
import rw.data.Rec0125;
import rw.defs.Enum0032;
import rw.setting.C0031;

public class C1058 {
   private static String[] f1000;
   private static byte[] f2000;
   private static float[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   public static Object[] f6000;
   private static byte[] f7000;
   public static Object[] f8000;
   private static int[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static float[] f12000;
   private static byte[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;

   private static void m4000() {
      byte[] var128 = new byte[8];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 2;
      f7000[3] = 2;
      f7000[4] = 2;
      f7000[5] = 14;
      f7000[6] = 3;
      f7000[7] = 3;
      byte[] var129 = new byte[6];
      f13000[(0 | -0) >>> 31] = 2;
      f13000[(1 | -1) >>> 31] = 14;
      f13000[2] = 3;
      f13000[3] = 4;
      f13000[4] = 5;
      f13000[5] = 5;
      byte[] var130 = new byte[8];
      f2000[(0 | -0) >>> 31] = 30;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 4;
      f2000[3] = 3;
      f2000[4] = 4;
      f2000[5] = 4;
      f2000[6] = 7;
      f2000[7] = 6;
   }

   private static void m8000() {
      f6000 = new Object[f13000[5]];
      f6000[f4000[4]] = Integer.valueOf(f2000[0]);
      f6000[f2000[(1 | -1) >>> 31]] = Integer.valueOf(f2000[2]);
      f6000[f2000[3]] = Integer.valueOf(f4000[5]);
      f6000[f2000[4]] = Integer.valueOf(f2000[5]);
      f8000 = new Object[f2000[6]];
      f8000[f2000[7]] = f1000[3];
   }

   private C1058() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      boolean[] var128 = new boolean[5];
      f16000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
      f16000[3] = (boolean)((1 | -1) >>> 31);
      f16000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[2];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[8];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
      f10000[3] = (boolean)((1 | -1) >>> 31);
      f10000[4] = (boolean)((0 | -0) >>> 31);
      f10000[5] = (boolean)((1 | -1) >>> 31);
      f10000[6] = (boolean)((1 | -1) >>> 31);
      f10000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m20000() {
      float[] var128 = new float[8];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f3000[2] = Float.intBitsToFloat(0);
      f3000[3] = Float.intBitsToFloat(0);
      f3000[4] = Float.intBitsToFloat(1106247680);
      f3000[5] = Float.intBitsToFloat(2139095040);
      f3000[6] = Float.intBitsToFloat(1082130432);
      f3000[7] = Float.intBitsToFloat(1065353216);
      float[] var129 = new float[3];
      f12000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f12000[(1 | -1) >>> 31] = Float.intBitsToFloat(1082130432);
      f12000[2] = Float.intBitsToFloat(1092616192);
      float[] var130 = new float[7];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1048576000);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f5000[2] = Float.intBitsToFloat(1124990976);
      f5000[3] = Float.intBitsToFloat(2139095040);
      f5000[4] = Float.intBitsToFloat(1106247680);
      f5000[5] = Float.intBitsToFloat(1082130432);
      f5000[6] = Float.intBitsToFloat(1086324736);
   }

   private static void m28000() {
      f1000 = new String[4];
      f1000[(0 | -0) >>> 31] = "entryListMount";
      f1000[(1 | -1) >>> 31] = "entryListCatcher";
      f1000[2] = "entryListPanel";
      f1000[3] = "entryListAnchor";
   }

   private C0031 m30000(OlkIrprsq var1, Iface0202 var2) {
      boolean var3 = var1.m14000().m2000();
      String var4 = "entryListAnchor" + System.identityHashCode(var1.m14000());
      rw.setting.C0056 var5 = rw.setting.C0056.m130000().m160000(Enum0032.f2000).m66000(var1.m10000()).m78000(f3000[0], f3000[1]);
      rw.setting.C0056 var7;
      if (var1.m2000() != null) {
         rw.setting.C0056[] var10000 = new rw.setting.C0056[f7000[0]];
         var10000[f16000[0]] = (rw.setting.C0056)f8000[f14000[0]];
         var10000[f16000[1]] = rw.setting.C0056.m130000().m178000(Rec0125.m24000(var1.m2000()));
         var7 = rw.setting.C0056.m120000(var10000);
      } else {
         var7 = (rw.setting.C0056)f8000[f14000[1]];
      }

      rw.setting.C0056 var6 = var7;
      return C1063.m28000((rw.setting.C0056)f8000[f15000[0]], var5x -> {
         var5x.N(f1000[0]);
         var5x.N(var5, var1xx -> var1xx.N(var4));
         if (var3) {
            var5x.y(C1063.m24000(f1000[1], f15000[1], () -> var1.m14000().m6000(f11000[0])));
            rw.setting.C0056[] var10001 = new rw.setting.C0056[f7000[1]];
            var10001[f16000[2]] = var6;
            var10001[f16000[3]] = C1063.m30000(var4, f3000[2], f15000[2]);
            var5x.N(rw.setting.C0056.m120000(var10001), var1xx -> {
               var1xx.N(f1000[2]);

               for (C1013 var3xx : var1.m6000()) {
                  var1xx.N(var3xx.m14000() ? (rw.setting.C0056)f8000[f15000[3]] : (rw.setting.C0056)f8000[f15000[4]], var2xx -> {
                     var2xx.N(C1235.m40000(var3xx.m22000()), var3xx.m14000() ? (rw.setting.C0056)f8000[f15000[5]] : (rw.setting.C0056)f8000[f15000[6]]);
                     var2xx.N(var2xxx -> {
                        var1.m8000().accept(var3xx);
                        var1.m14000().m6000(f16000[4]);
                     });
                  });
               }
            });
         }
      });
   }

   private static void m42000() {
      int[] var128 = new int[5];
      f9000[(0 | -0) >>> 31] = -15592942;
      f9000[(1 | -1) >>> 31] = -16119286;
      f9000[2] = -16777216;
      f9000[3] = -15592942;
      f9000[4] = -7171438;
   }

   private static void m52000() {
      short[] var128 = new short[2];
      f14000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[7];
      f15000[(0 | -0) >>> 31] = 5;
      f15000[(1 | -1) >>> 31] = 2000;
      f15000[2] = 2001;
      f15000[3] = 2;
      f15000[4] = (short)((1 | -1) >>> 31);
      f15000[5] = 4;
      f15000[6] = 3;
   }
}
