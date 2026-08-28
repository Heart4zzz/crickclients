package rw.gui;

import java.util.List;
import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.Base0315;
import rw.core.C0076;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C0297;
import rw.core.C1235;
import rw.core.OlIrtqjti;
import rw.data.Rec0125;
import rw.data.Rec0269;
import rw.defs.Enum0019;
import rw.defs.Enum0026;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;
import rw.setting.C0156;

public class C0007 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;
   private static byte[] f11000;
   private static byte[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static int[] f15000;
   private static boolean[] f16000;
   public static Object[] f17000;
   public static Object[] f18000;
   private static boolean[] f19000;
   private static byte[] f20000;
   private static byte[] f21000;
   private static byte[] f22000;
   private static float[] f23000;
   private static String[] f24000;
   private static float[] f25000;
   private static short[] f26000;
   private static boolean[] f27000;
   private static boolean[] f28000;
   private static boolean[] f29000;
   public static Object[] f30000;
   private static float[] f31000;
   private static boolean[] f32000;

   private static void m6000() {
      byte[] var128 = new byte[7];
      f20000[(0 | -0) >>> 31] = 66;
      f20000[(1 | -1) >>> 31] = 12;
      f20000[2] = 61;
      f20000[3] = 2;
      f20000[4] = 2;
      f20000[5] = 2;
      f20000[6] = 2;
      byte[] var129 = new byte[4];
      f10000[(0 | -0) >>> 31] = 3;
      f10000[(1 | -1) >>> 31] = 2;
      f10000[2] = 22;
      f10000[3] = 2;
      byte[] var130 = new byte[6];
      f12000[(0 | -0) >>> 31] = 2;
      f12000[(1 | -1) >>> 31] = 2;
      f12000[2] = 2;
      f12000[3] = 2;
      f12000[4] = 2;
      f12000[5] = 2;
      byte[] var131 = new byte[7];
      f21000[(0 | -0) >>> 31] = 2;
      f21000[(1 | -1) >>> 31] = 2;
      f21000[2] = 2;
      f21000[3] = 2;
      f21000[4] = 3;
      f21000[5] = 3;
      f21000[6] = 4;
      byte[] var132 = new byte[4];
      f22000[(0 | -0) >>> 31] = 2;
      f22000[(1 | -1) >>> 31] = 2;
      f22000[2] = 3;
      f22000[3] = 3;
      byte[] var133 = new byte[7];
      f11000[(0 | -0) >>> 31] = 2;
      f11000[(1 | -1) >>> 31] = 2;
      f11000[2] = 3;
      f11000[3] = 12;
      f11000[4] = 24;
      f11000[5] = 5;
      f11000[6] = 4;
   }

   private static void m10000() {
      int[] var128 = new int[3];
      f15000[(0 | -0) >>> 31] = -7171438;
      f15000[(1 | -1) >>> 31] = -7171438;
      f15000[2] = -7171438;
   }

   private C0007() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      short[] var128 = new short[2];
      f7000[(0 | -0) >>> 31] = 6;
      f7000[(1 | -1) >>> 31] = 2;
      short[] var129 = new short[4];
      f26000[(0 | -0) >>> 31] = 3;
      f26000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f26000[2] = (short)((1 | -1) >>> 31);
      f26000[3] = 5;
      short[] var130 = new short[7];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = 3;
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = 2;
      f8000[4] = 4;
      f8000[5] = 2;
      f8000[6] = (short)((1 | -1) >>> 31);
   }

   private static void m20000() {
      f17000 = new Object[f22000[3]];
      f17000[f4000[2]] = Integer.valueOf(f4000[3]);
      f17000[f11000[(0 | -0) >>> 31]] = Integer.valueOf(f11000[1]);
      f30000 = new Object[f11000[2]];
      f30000[f4000[4]] = Integer.valueOf(f11000[3]);
      f30000[f4000[5]] = Integer.valueOf(f11000[4]);
      f2000 = new Object[f11000[5]];
      f18000 = new Object[f11000[6]];
   }

   private static C0056 m26000(boolean var0) {
      C0056[] var10000 = new C0056[f20000[6]];
      var10000[f16000[0]] = (C0056)f18000[f26000[1]];
      var10000[f16000[1]] = C0056.m130000().m50000(var0 ? f25000[0] : f25000[1]);
      return C0056.m120000(var10000);
   }

   private static void m32000() {
      boolean[] var128 = new boolean[6];
      f29000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f29000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f29000[2] = (boolean)((0 | -0) >>> 31);
      f29000[3] = (boolean)((1 | -1) >>> 31);
      f29000[4] = (boolean)((0 | -0) >>> 31);
      f29000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[8];
      f32000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f32000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f32000[2] = (boolean)((1 | -1) >>> 31);
      f32000[3] = (boolean)((1 | -1) >>> 31);
      f32000[4] = (boolean)((0 | -0) >>> 31);
      f32000[5] = (boolean)((1 | -1) >>> 31);
      f32000[6] = (boolean)((0 | -0) >>> 31);
      f32000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[8];
      f16000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
      f16000[3] = (boolean)((1 | -1) >>> 31);
      f16000[4] = (boolean)((0 | -0) >>> 31);
      f16000[5] = (boolean)((1 | -1) >>> 31);
      f16000[6] = (boolean)((0 | -0) >>> 31);
      f16000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[5];
      f19000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[2] = (boolean)((1 | -1) >>> 31);
      f19000[3] = (boolean)((1 | -1) >>> 31);
      f19000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[6];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[5];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      f9000[3] = (boolean)((0 | -0) >>> 31);
      f9000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[7];
      f28000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f28000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f28000[2] = (boolean)((1 | -1) >>> 31);
      f28000[3] = (boolean)((1 | -1) >>> 31);
      f28000[4] = (boolean)((0 | -0) >>> 31);
      f28000[5] = (boolean)((1 | -1) >>> 31);
      f28000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[7];
      f27000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[2] = (boolean)((0 | -0) >>> 31);
      f27000[3] = (boolean)((0 | -0) >>> 31);
      f27000[4] = (boolean)((1 | -1) >>> 31);
      f27000[5] = (boolean)((0 | -0) >>> 31);
      f27000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var136 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m38000(C0288 var0, List<C0156> var1, Iface0202 var2) {
      int var3 = var1.size();

      for (int var4 = f19000[0]; var4 < var3; var4++) {
         C0156 var5 = (C0156)var1.get(var4);
         Object[] var10001 = new Object[f12000[1]];
         var10001[f19000[1]] = var2.m18000(var5.m4000().m10000(), (Iface0197<C0156>)rw.setting.C0019.f26000[f8000[2]], var5);
         var10001[f19000[2]] = var4 == var3 - f19000[3] ? null : C0287.m28000((C0056)C0076.f5000[f8000[3]]);
         var0.N(var10001);
      }
   }

   public static int m40000(int var0) {
      return m62000(var0, f29000[0]);
   }

   private static C0056 m48000(boolean var0, boolean var1, OlIrtqjti var2) {
      int var3 = var0 ? var2.m6000() : f15000[2];
      C0056[] var10000 = new C0056[f12000[0]];
      var10000[f16000[6]] = (C0056)f18000[f8000[1]];
      var10000[f16000[7]] = C0056.m130000().m40000(var3).m50000(var0 ? f6000[0] : f6000[1]).m194000(var1);
      return C0056.m120000(var10000);
   }

   private C0031 m50000(Rec0269 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f7000[0]]);
      boolean var4 = var1.m2000().m2000();
      Iface0196 var5 = var2.m20000(f24000[0], var4);
      Iface0196 var6 = var2.m20000(f24000[1], f29000[4]);
      Iface0196 var7 = var2.m20000(f24000[2], !var4 ? f29000[5] : f32000[0]);
      Iface0196 var8 = var2.m20000(f24000[3], var4);
      if (var4) {
         if (!(Boolean)var5.m2000()) {
            var5.m6000(f32000[1]);
         }

         if (!(Boolean)var8.m2000()) {
            var8.m6000(f32000[2]);
         }
      } else if (!(Boolean)var7.m2000()) {
         var7.m6000(f32000[3]);
      }

      return C0287.m26000(m64000(var1.m8000().size(), var4, (Boolean)var6.m2000()), var8x -> {
         var8x.N("autoBuyCategoryCard" + var1.m6000().name());
         var8x.N(Enum0026.f2000, Base0315::m6000);
         var8x.N(Enum0026.f15000, var3xx -> {
            SelectItemModel$UnbakedSwitch var4xx = (SelectItemModel$UnbakedSwitch)var3xx;
            if (l1smsn<"zghzqekp",-616650226,1685597755,1685597754,1685597753,-2065638339>(var4xx) == Enum0019.f18000) {
               var6.m6000(f9000[1]);
               if (!var1.m2000().m2000()) {
                  var5.m6000(f9000[2]);
               }
            }
         });
         var8x.N((C0056)f2000[f8000[4]], var7xx -> {
            var7xx.N(C1235.m36000(var1.m6000().m54000()), m70000(var4, var3));
            var7xx.N((C0056)f18000[f8000[6]], var7xxx -> {
               var7xxx.N(Enum0026.f2000, Base0315::m6000);
               var7xxx.N(var5xxxx -> {
                  boolean var6xxxx = !var1.m2000().m2000() ? f1000[1] : f1000[2];
                  var6.m6000(f1000[3]);
                  if (var6xxxx) {
                     var5.m6000(f1000[4]);
                     var8.m6000(f1000[5]);
                  } else {
                     var7.m6000(f9000[0]);
                  }

                  var1.m2000().m6000(var6xxxx);
               });
               var7xxx.L(var6xxxx -> {
                  var6xxxx.m2000(f24000[4]);
                  var6xxxx.N(m52000((Boolean)var7.m2000()));
                  var7xxx.L(var5xxxxx -> {
                     var5xxxxx.m2000(f24000[5]);
                     var5xxxxx.N(m48000(var4, (Boolean)var8.m2000(), var3));
                     var5xxxxx.N(Enum0026.f15000, var3xxxxxx -> {
                        SelectItemModel$UnbakedSwitch var4xxxxxx = (SelectItemModel$UnbakedSwitch)var3xxxxxx;
                        if (l1smsn<"atoeoto",-616650226,1685597755,1685597754,1685597753,-2065638339>(var4xxxxxx) == Enum0019.f21000) {
                           if (var1.m2000().m2000()) {
                              var7.m6000(f19000[4]);
                           } else {
                              var8.m6000(f1000[0]);
                           }
                        }
                     });
                  });
               });
            });
         });
         var8x.y((C0056)C0076.f5000[f8000[5]]);
         if ((Boolean)var5.m2000()) {
            var8x.N(m26000(var4), var2xx -> m38000(var2xx, var1.m8000(), var2));
         }
      });
   }

   private static C0056 m52000(boolean var0) {
      C0056[] var10000 = new C0056[f10000[3]];
      var10000[f16000[4]] = (C0056)f18000[f8000[0]];
      var10000[f16000[5]] = C0056.m130000().m40000(f15000[1]).m194000(var0);
      return C0056.m120000(var10000);
   }

   private static void m54000() {
      float[] var128 = new float[2];
      f25000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f25000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      float[] var129 = new float[4];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f6000[2] = Float.intBitsToFloat(1132593152);
      f6000[3] = Float.intBitsToFloat(1106247680);
      float[] var130 = new float[8];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(1068708659);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1045220557);
      f3000[2] = Float.intBitsToFloat(1082130432);
      f3000[3] = Float.intBitsToFloat(1007192201);
      f3000[4] = Float.intBitsToFloat(1028443341);
      f3000[5] = Float.intBitsToFloat(1065353216);
      f3000[6] = Float.intBitsToFloat(1120403456);
      f3000[7] = Float.intBitsToFloat(1094713344);
      float[] var131 = new float[3];
      f13000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f13000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120403456);
      f13000[2] = Float.intBitsToFloat(1114636288);
      float[] var132 = new float[3];
      f14000[(0 | -0) >>> 31] = Float.intBitsToFloat(1099431936);
      f14000[(1 | -1) >>> 31] = Float.intBitsToFloat(1099431936);
      f14000[2] = Float.intBitsToFloat(1094713344);
      float[] var133 = new float[3];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f5000[2] = Float.intBitsToFloat(0);
      float[] var134 = new float[8];
      f23000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f23000[(1 | -1) >>> 31] = Float.intBitsToFloat(1099956224);
      f23000[2] = Float.intBitsToFloat(1099956224);
      f23000[3] = Float.intBitsToFloat(1103101952);
      f23000[4] = Float.intBitsToFloat(1103101952);
      f23000[5] = Float.intBitsToFloat(1103101952);
      f23000[6] = Float.intBitsToFloat(1103101952);
      f23000[7] = Float.intBitsToFloat(0);
      float[] var135 = new float[3];
      f31000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f31000[(1 | -1) >>> 31] = Float.intBitsToFloat(1103101952);
      f31000[2] = Float.intBitsToFloat(1103101952);
   }

   public static int m62000(int var0, boolean var1) {
      int var2 = Math.max(f29000[1], var0);
      int var3 = var2 * f20000[0] + Math.max(f29000[2], var2 - f29000[3]);
      int var4 = var1 ? var3 : f20000[1];
      return f20000[2] + var4 + f20000[3];
   }

   private static C0056 m64000(int var0, boolean var1, boolean var2) {
      C0056[] var10000 = new C0056[f20000[4]];
      var10000[f32000[4]] = (C0056)f2000[f7000[1]];
      var10000[f32000[5]] = C0056.m130000().m90000(Rec0125.m24000(m62000(var0, var1)));
      C0056 var3 = C0056.m120000(var10000);
      C0056 var5;
      if (var2) {
         var10000 = new C0056[f20000[5]];
         var10000[f32000[6]] = var3;
         var10000[f32000[7]] = (C0056)f2000[f26000[0]];
         var5 = C0056.m120000(var10000);
      } else {
         var5 = var3;
      }

      return var5;
   }

   private static C0056 m70000(boolean var0, OlIrtqjti var1) {
      int var2 = var0 ? var1.m6000() : f15000[0];
      C0056[] var10000 = new C0056[f10000[0]];
      var10000[f16000[2]] = (C0056)f2000[f26000[2]];
      var10000[f16000[3]] = C0056.m130000().m40000(var2);
      var10000[f10000[1]] = rw.setting.C0017.m22000(f10000[2], (OlmmOsl)OlmmOsl.f7000[f26000[3]]);
      return C0056.m120000(var10000);
   }

   private static void m74000() {
      f24000 = new String[6];
      f24000[(0 | -0) >>> 31] = "renderList";
      f24000[(1 | -1) >>> 31] = "animatingHeight";
      f24000[2] = "baseIconVisible";
      f24000[3] = "overlayIconVisible";
      f24000[4] = "icon:menu/expand";
      f24000[5] = "icon:menu/squeeze";
   }
}
