package rw.setting;

import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.C0097;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0297;
import rw.core.C0318;
import rw.core.C0999;
import rw.core.C1059;
import rw.core.OlIrtqjti;
import rw.data.ConfigFiles;
import rw.data.IlpimlpIt;
import rw.data.Oljjtpnom;
import rw.data.Rec0272;
import rw.defs.Enum0026;

public class C0019 {
   private static float[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static String[] f6000;
   private static byte[] f7000;
   public static Object[] f8000;
   private static byte[] f9000;
   private static short[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   private static byte[] f13000;
   private static byte[] f14000;
   private static byte[] f15000;
   private static byte[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static boolean[] f19000;
   private static float[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static boolean[] f23000;
   public static Object[] f24000;
   private static byte[] f25000;
   public static Object[] f26000;
   private static boolean[] f27000;
   private static int[] f28000;
   public static Object[] f29000;

   private static void m2000() {
      f26000 = new Object[f21000[4]];
      f26000[f23000[6]] = Integer.valueOf(f21000[5]);
      f26000[f15000[(0 | -0) >>> 31]] = Integer.valueOf(f15000[1]);
      f26000[f15000[2]] = Integer.valueOf(f9000[0]);
      f26000[f9000[(1 | -1) >>> 31]] = Integer.valueOf(f9000[2]);
      f26000[f9000[3]] = Integer.valueOf(f9000[4]);
      f5000 = new Object[f9000[5]];
      f8000 = new Object[f9000[6]];
      f24000 = new Object[f9000[7]];
      f29000 = new Object[f23000[7]];
   }

   private static void m10000() {
      int[] var128 = new int[2];
      f28000[(0 | -0) >>> 31] = -7171438;
      f28000[(1 | -1) >>> 31] = -7171438;
   }

   private C0019() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      float[] var128 = new float[4];
      f20000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f20000[(1 | -1) >>> 31] = Float.intBitsToFloat(1115947008);
      f20000[2] = Float.intBitsToFloat(0);
      f20000[3] = Float.intBitsToFloat(2139095040);
      float[] var129 = new float[5];
      f11000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f11000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f11000[2] = Float.intBitsToFloat(1101004800);
      f11000[3] = Float.intBitsToFloat(1107296256);
      f11000[4] = Float.intBitsToFloat(1107296256);
      float[] var130 = new float[6];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(2139095040);
      f1000[2] = Float.intBitsToFloat(1101004800);
      f1000[3] = Float.intBitsToFloat(1120403456);
      f1000[4] = Float.intBitsToFloat(1103101952);
      f1000[5] = Float.intBitsToFloat(1103101952);
   }

   private static void m20000() {
      short[] var128 = new short[7];
      f10000[(0 | -0) >>> 31] = 6;
      f10000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f10000[2] = (short)((0 | -0) >>> 31);
      f10000[3] = 7;
      f10000[4] = (short)((0 | -0) >>> 31);
      f10000[5] = 6;
      f10000[6] = 7;
      short[] var129 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = 5;
      f4000[3] = 3;
      f4000[4] = 4;
      f4000[5] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[4];
      f12000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f12000[2] = (short)((1 | -1) >>> 31);
      f12000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m22000() {
      byte[] var128 = new byte[3];
      f25000[(0 | -0) >>> 31] = 2;
      f25000[(1 | -1) >>> 31] = 2;
      f25000[2] = 2;
      byte[] var129 = new byte[5];
      f13000[(0 | -0) >>> 31] = 6;
      f13000[(1 | -1) >>> 31] = 7;
      f13000[2] = 4;
      f13000[3] = 6;
      f13000[4] = 2;
      byte[] var130 = new byte[7];
      f16000[(0 | -0) >>> 31] = 3;
      f16000[(1 | -1) >>> 31] = 20;
      f16000[2] = 3;
      f16000[3] = 4;
      f16000[4] = 6;
      f16000[5] = 2;
      f16000[6] = 3;
      byte[] var131 = new byte[7];
      f7000[(0 | -0) >>> 31] = 20;
      f7000[(1 | -1) >>> 31] = 3;
      f7000[2] = 2;
      f7000[3] = 2;
      f7000[4] = 2;
      f7000[5] = 2;
      f7000[6] = 3;
      byte[] var132 = new byte[2];
      f14000[(0 | -0) >>> 31] = 2;
      f14000[(1 | -1) >>> 31] = 2;
      byte[] var133 = new byte[6];
      f21000[(0 | -0) >>> 31] = 4;
      f21000[(1 | -1) >>> 31] = 5;
      f21000[2] = 6;
      f21000[3] = 7;
      f21000[4] = 8;
      f21000[5] = 20;
      byte[] var134 = new byte[3];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 24;
      f15000[2] = 3;
      byte[] var135 = new byte[8];
      f9000[(0 | -0) >>> 31] = 24;
      f9000[(1 | -1) >>> 31] = 4;
      f9000[2] = 32;
      f9000[3] = 5;
      f9000[4] = 8;
      f9000[5] = 2;
      f9000[6] = 2;
      f9000[7] = 8;
   }

   private C0031 m36000(C0156 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f10000[0]]);
      Iface0196 var4 = var2.m20000(f6000[0], f18000[0]);
      Iface0196 var5 = var2.m24000(f6000[1], null);
      boolean var6 = var2.m2000("itemEnabled:" + var1.m4000().m10000(), var1::m6000);
      C0056 var7 = var6 ? (C0056)f8000[f10000[1]] : (C0056)f24000[f10000[2]];
      return C0287.m26000((C0056)f26000[f10000[3]], var7x -> {
         var7x.N("ab" + var1.m4000().m10000());
         var7x.N(Enum0026.f2000, var2xx -> {
            C0318 var3xx = (C0318)var2xx;
            if (var3xx.m2000() == f17000[3] && !var1.w().isEmpty()) {
               var4.m6000(f27000[0]);
            }
         });
         var7x.N((C0056)f5000[f10000[4]], var2xx -> {
            var2xx.N("abName" + var1.m4000().m10000());
            Oljjtpnom var3xx = NursultanClient.m66000().m70000(var1.m46000());
            if (var3xx.m4000()) {
               C0056[] var10000 = new C0056[f25000[1]];
               var10000[f17000[1]] = (C0056)f5000[f12000[0]];
               var10000[f17000[2]] = C0056.m130000().m114000(var3xx.m22000(), var3xx.m28000(), var3xx.m30000(), var3xx.m14000());
               C0056 var4xx = C0056.m120000(var10000);
               var2xx.L(var2xxx -> ((C0286)var2xxx.N("abIcon" + var1.m4000().m10000())).m2000(NursultanClient.m66000().m42000()).N(var4xx));
            } else {
               var2xx.y((C0056)f5000[f12000[1]]);
            }

            var2xx.N(var1.m64000(), var7);
         });
         var7x.N((C0056)f24000[f10000[5]], var6xx -> {
            if (!var1.w().isEmpty()) {
               var6xx.N((C0056)f24000[f10000[6]], var5xxx -> {
                  var5xxx.N(var1xxxx -> var4.m6000(f17000[0]));
                  var5xxx.L(var4xxxx -> {
                     var4xxxx.N("abDots" + var1.m4000().m10000());
                     var4xxxx.m2000(f6000[3]);
                     C0056 var5xxxx = var4.m2000() ? ((C0097)f24000[f4000[2]]).m8000(var3) : (var6 ? (C0056)f24000[f4000[3]] : (C0056)f24000[f4000[4]]);
                     C0056[] var10001 = new C0056[f25000[0]];
                     var10001[f18000[1]] = var5xxxx;
                     var10001[f18000[2]] = (C0056)f29000[f4000[5]];
                     var4xxxx.N(C0056.m120000(var10001));
                  });
                  var5xxx.y(var2.m18000("abModal" + var1.m4000().m10000(), (Iface0197<Rec0272>)C0009.f7000[f4000[1]], new Rec0272(var1, var4)));
               });
            }

            var6xx.y(var2.m18000(f6000[2], (Iface0197<IlpimlpIt>)C1059.f11000[f4000[0]], new IlpimlpIt(var1.m6000(), var2xxx -> {
               var1.m68000(var2xxx);
               ConfigFiles.m54000(C0999.class);
               var5.m4000();
            })));
         });
      });
   }

   private static void m46000() {
      boolean[] var128 = new boolean[3];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[4];
      f17000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[2] = (boolean)((1 | -1) >>> 31);
      f17000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[6];
      f27000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[2] = (boolean)((1 | -1) >>> 31);
      f27000[3] = (boolean)((0 | -0) >>> 31);
      f27000[4] = (boolean)((1 | -1) >>> 31);
      f27000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[5];
      f22000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f22000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f22000[2] = (boolean)((1 | -1) >>> 31);
      f22000[3] = (boolean)((0 | -0) >>> 31);
      f22000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[5];
      f19000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[2] = (boolean)((0 | -0) >>> 31);
      f19000[3] = (boolean)((1 | -1) >>> 31);
      f19000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var134 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var135 = new boolean[8];
      f23000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f23000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f23000[2] = (boolean)((0 | -0) >>> 31);
      f23000[3] = (boolean)((0 | -0) >>> 31);
      f23000[4] = (boolean)((1 | -1) >>> 31);
      f23000[5] = (boolean)((0 | -0) >>> 31);
      f23000[6] = (boolean)((1 | -1) >>> 31);
      f23000[7] = (boolean)((1 | -1) >>> 31);
   }

   private static void m60000() {
      f6000 = new String[4];
      f6000[(0 | -0) >>> 31] = "opened";
      f6000[(1 | -1) >>> 31] = "updater";
      f6000[2] = "switch";
      f6000[3] = "icon:menu/dots";
   }
}
