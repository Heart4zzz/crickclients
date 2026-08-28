package rw.gui;

import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.C0287;
import rw.core.C0297;
import rw.core.C0308;
import rw.core.C0310;
import rw.core.C0318;
import rw.core.C1045;
import rw.core.C1183;
import rw.core.OlIrtqjti;
import rw.data.Rec0125;
import rw.data.Rec0257;
import rw.defs.Enum0026;
import rw.setting.C0031;
import rw.setting.C0056;

public class C0126 {
   private static float[] f1000;
   private static byte[] f2000;
   private static float[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static float[] f12000;
   public static Object[] f13000;
   private static boolean[] f14000;
   private static byte[] f15000;
   private static float[] f16000;
   public static Object[] f17000;
   private static boolean[] f18000;
   private static int[] f19000;
   private static byte[] f20000;
   private static byte[] f21000;
   private static byte[] f22000;
   private static boolean[] f23000;
   private static float[] f24000;
   private static boolean[] f25000;
   private static short[] f26000;
   private static boolean[] f27000;
   private static boolean[] f28000;
   private static float[] f29000;
   private static byte[] f30000;
   private static String[] f31000;
   private static boolean[] f32000;
   private static byte[] f33000;
   public static Object[] f34000;

   private static void m2000() {
      f31000 = new String[6];
      f31000[(0 | -0) >>> 31] = "sliderDrag";
      f31000[(1 | -1) >>> 31] = "sliderValue";
      f31000[2] = "sliderDragOffset";
      f31000[3] = "sliderClickAnimating";
      f31000[4] = "sliderInputText";
      f31000[5] = m4000("");
   }

   private static void m10000() {
      short[] var128 = new short[5];
      f26000[(0 | -0) >>> 31] = 6;
      f26000[(1 | -1) >>> 31] = 2;
      f26000[2] = 3;
      f26000[3] = 7;
      f26000[4] = 6;
      short[] var129 = new short[7];
      f9000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f9000[2] = 3;
      f9000[3] = 4;
      f9000[4] = 5;
      f9000[5] = (short)((0 | -0) >>> 31);
      f9000[6] = 999;
   }

   private C0126() {
   }

   static {
      ntfClinit();
   }

   private static void m18000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f19000[(0 | -0) >>> 31] = -16777216;
   }

   private static void m22000() {
      f13000 = new Object[f30000[(0 | -0) >>> 31]];
      f13000[f32000[5]] = f1000[(1 | -1) >>> 31];
      f13000[f30000[(1 | -1) >>> 31]] = f1000[2];
      f13000[f30000[2]] = Integer.valueOf(f30000[3]);
      f13000[f30000[4]] = Integer.valueOf(f30000[5]);
      f13000[f30000[6]] = f1000[3];
      f13000[f30000[7]] = f1000[4];
      f13000[f2000[(0 | -0) >>> 31]] = f1000[5];
      f34000 = new Object[f2000[(1 | -1) >>> 31]];
      f34000[f32000[6]] = f1000[6];
      f34000[f32000[7]] = Integer.valueOf(f9000[6]);
      f17000 = new Object[f2000[2]];
   }

   private static void m26000() {
      boolean[] var128 = new boolean[5];
      f23000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f23000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f23000[2] = (boolean)((1 | -1) >>> 31);
      f23000[3] = (boolean)((0 | -0) >>> 31);
      f23000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f18000[2] = (boolean)((0 | -0) >>> 31);
      f18000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[2];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[2];
      f27000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[7];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((1 | -1) >>> 31);
      f11000[3] = (boolean)((0 | -0) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((0 | -0) >>> 31);
      f11000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var133 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
      f4000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[6];
      f14000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[2] = (boolean)((0 | -0) >>> 31);
      f14000[3] = (boolean)((1 | -1) >>> 31);
      f14000[4] = (boolean)((1 | -1) >>> 31);
      f14000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[5];
      f25000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f25000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f25000[2] = (boolean)((0 | -0) >>> 31);
      f25000[3] = (boolean)((1 | -1) >>> 31);
      f25000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var136 = new boolean[2];
      f28000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f28000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var137 = new boolean[8];
      f32000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f32000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f32000[2] = (boolean)((0 | -0) >>> 31);
      f32000[3] = (boolean)((1 | -1) >>> 31);
      f32000[4] = (boolean)((0 | -0) >>> 31);
      f32000[5] = (boolean)((1 | -1) >>> 31);
      f32000[6] = (boolean)((0 | -0) >>> 31);
      f32000[7] = (boolean)((1 | -1) >>> 31);
   }

   private boolean m36000(float var1, float var2) {
      float var3 = var2 * f29000[3] + f29000[4];
      float var4 = var3 + f29000[5];
      return var1 >= var3 && var1 <= var4 ? f23000[2] : f23000[3];
   }

   private float m52000(float var1, Rec0257 var2) {
      return Math.clamp(C1183.m32000(var1 * var2.m2000() + var2.m12000(), var2.m16000()), var2.m12000(), var2.m20000());
   }

   private static void m58000() {
      byte[] var128 = new byte[4];
      f21000[(0 | -0) >>> 31] = 2;
      f21000[(1 | -1) >>> 31] = 2;
      f21000[2] = 3;
      f21000[3] = 2;
      byte[] var129 = new byte[4];
      f22000[(0 | -0) >>> 31] = 2;
      f22000[(1 | -1) >>> 31] = 3;
      f22000[2] = 2;
      f22000[3] = 2;
      byte[] var130 = new byte[3];
      f20000[(0 | -0) >>> 31] = 3;
      f20000[(1 | -1) >>> 31] = 4;
      f20000[2] = 3;
      byte[] var131 = new byte[8];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = 2;
      f15000[2] = 2;
      f15000[3] = 2;
      f15000[4] = 5;
      f15000[5] = 2;
      f15000[6] = 4;
      f15000[7] = 14;
      byte[] var132 = new byte[5];
      f33000[(0 | -0) >>> 31] = 3;
      f33000[(1 | -1) >>> 31] = 6;
      f33000[2] = 2;
      f33000[3] = 6;
      f33000[4] = 7;
      byte[] var133 = new byte[8];
      f30000[(0 | -0) >>> 31] = 8;
      f30000[(1 | -1) >>> 31] = 2;
      f30000[2] = 3;
      f30000[3] = 16;
      f30000[4] = 4;
      f30000[5] = 10;
      f30000[6] = 5;
      f30000[7] = 6;
      byte[] var134 = new byte[3];
      f2000[(0 | -0) >>> 31] = 7;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = 8;
   }

   private void m60000(Iface0196<Float> var1, Rec0257 var2, float var3, float var4, float var5, boolean var6) {
      float var7 = Math.clamp((var3 - var5) / var4, f29000[1], f29000[2]);
      if (var6) {
         var1.m6000((C1183.m32000(var7 * var2.m2000() + var2.m12000(), var2.m16000()) - var2.m12000()) / var2.m2000());
      } else {
         var1.m6000(var7);
      }
   }

   private C0031 m66000(Rec0257 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f26000[0]]);
      Iface0196 var4 = var2.m20000(f31000[0], f23000[0]);
      Iface0196 var5 = var2.m20000(f31000[1], var1.m18000());
      Iface0196 var6 = var2.m20000(f31000[2], f29000[0]);
      Iface0196 var7 = var2.m20000(f31000[3], f23000[1]);
      Iface0196 var8 = var2.m20000(f31000[4], (String)null);
      return C0287.m26000(
         (C0056)f34000[f26000[1]],
         var8x -> {
            var8x.N((C0056)f34000[f26000[2]], var7xx -> {
               var7xx.N(Enum0026.f2000, var6xxx -> {
                  C0318 var7xxx = (C0318)var6xxx;
                  if (var7xxx.m2000() == 0) {
                     var4.m6000(f4000[4]);
                     Iface0212 var8xx = var7xxx.z();
                     float var9 = var7xxx.m8000() - var8xx.m18000().m14000();
                     float var10 = var1.m18000() * f12000[5];
                     if (this.m36000(var9, var1.m18000())) {
                        var7.m6000(f4000[5]);
                        var6.m6000(var9 - var10);
                     } else {
                        var7.m6000(f4000[6]);
                        var1.m4000().m6000(f4000[7]);
                        var6.m6000(f3000[0]);
                        this.m60000(var5, var1, var9, var8xx.m18000().m12000(), f3000[1], f14000[0]);
                        var1.m10000().accept(this.m52000((Float)var5.m2000(), var1));
                     }
                  }
               });
               var7xx.N(Enum0026.f3000, var6xxx -> {
                  C0318 var7xxx = (C0318)var6xxx;
                  if (var7xxx.m2000() == 0) {
                     var4.m6000(f4000[0]);
                     if (var1.m4000().m2000()) {
                        Iface0212 var8xx = var7xxx.z();
                        float var9 = var7xxx.m8000() - var8xx.m18000().m14000();
                        this.m60000(var5, var1, var9, var8xx.m18000().m12000(), (Float)var6.m2000(), f4000[1]);
                        var1.m10000().accept(this.m52000((Float)var5.m2000(), var1));
                     }

                     var1.m4000().m6000(f4000[2]);
                     var6.m6000(f12000[4]);
                     var7.m6000(f4000[3]);
                  }
               });
               var7xx.N(Enum0026.f1000, var6xxx -> {
                  if ((Boolean)var4.m2000()) {
                     C0318 var7xxx = (C0318)var6xxx;
                     Iface0212 var8xx = var7xxx.z();
                     float var9 = var7xxx.m8000() - var8xx.m18000().m14000();
                     if ((Boolean)var7.m2000() && this.m70000(var8xx, var9)) {
                        var7.m6000(f11000[4]);
                     }

                     this.m60000(var5, var1, var9, var8xx.m18000().m12000(), (Float)var6.m2000(), f11000[5]);
                     var1.m10000().accept(this.m52000((Float)var5.m2000(), var1));
                     if (!(Boolean)var7.m2000()) {
                        var1.m4000().m6000(f11000[6]);
                     }
                  }
               });
               var7xx.N(((rw.core.C0097)f17000[f9000[0]]).m8000(var3), var5xxx -> {
                  C0056[] var10000 = new C0056[f21000[0]];
                  var10000[f18000[3]] = ((rw.core.C0097)f17000[f9000[1]]).m8000(var3);
                  var10000[f10000[0]] = C0056.m130000().m178000(Rec0125.m28000((var4.m2000() ? (Float)var5.m2000() : var1.m18000()) * f7000[2]));
                  C0056 var6xxx = C0056.m120000(var10000);
                  boolean var7xxx = !var7.m2000() && var1.m4000().m2000() ? f27000[0] : f10000[1];
                  if (var7xxx) {
                     var10000 = new C0056[f21000[1]];
                     var10000[f27000[1]] = var6xxx;
                     var10000[f11000[0]] = (C0056)f17000[f9000[2]];
                     var6xxx = C0056.m120000(var10000);
                  }

                  var5xxx.N(var6xxx, var1xxxx -> var1xxxx.N(Enum0026.f15000, var1xxxxx -> {
                     SelectItemModel$UnbakedSwitch var2xxxx = (SelectItemModel$UnbakedSwitch)var1xxxxx;
                     if (OOIIllnqO<"osaptogf",-1705598892,489368286,489368139,489368162,450945472>(var2xxxx)) {
                        var7.m6000(f11000[3]);
                     }
                  }));
                  var10000 = new C0056[f21000[2]];
                  var10000[f11000[1]] = ((rw.core.C0097)f17000[f9000[3]]).m8000(var3);
                  var10000[f11000[2]] = C0056.m130000().m78000(f12000[0], f12000[1]).m170000(f12000[2], f12000[3]);
                  var10000[f21000[3]] = (C0056)f17000[f9000[4]];
                  C0056 var9 = C0056.m120000(var10000);
                  var5xxx.N(var1xxxx -> var1xxxx.y(var9));
               });
            });
            var8x.u(
               var5xx -> {
                  String var6xx = this.m78000(var1);
                  var5xx.m2000(
                     var8.m2000() != null ? (String)var8.m2000() : C1045.m16000(var4.m2000() ? this.m52000((Float)var5.m2000(), var1) : var1.m8000(), var6xx)
                  );
                  var5xx.N(var1.m4000().m2000() ? (C0056)f17000[f26000[3]] : (C0056)f17000[f26000[4]]);
                  var5xx.N(Enum0026.f9000, var2xxx -> {
                     C0310 var3xxx = (C0310)var2xxx;
                     String var4xxx = var3xxx.m2000();
                     var8.m6000(var4xxx);
                     String var5xxx = C1045.m22000(var4xxx, var6xx);
                     if (!C1045.m18000(var5xxx)) {
                        try {
                           Float.parseFloat(var5xxx);
                        } catch (NumberFormatException var7xx) {
                           var8.m6000(var3xxx.m4000());
                           var3xxx.b();
                           var3xxx.j();
                           var2xxx.m26000().m42000(var3xxx.m4000());
                        }
                     }
                  });
                  var5xx.N(Enum0026.f12000, var4xxx -> {
                     String var5xxx = C1045.m22000(var4xxx.m26000().m12000(), var6xx);
                     var8.m6000(null);
                     if (!var5xxx.isBlank() && !C1045.m18000(var5xxx)) {
                        try {
                           float var6xxx = Float.parseFloat(var5xxx);
                           float var7xx = Math.clamp(C1183.m32000(var6xxx, var1.m16000()), var1.m12000(), var1.m20000());
                           var1.m10000().accept(var7xx);
                           var5.m6000((var7xx - var1.m12000()) / var1.m2000());
                        } catch (NumberFormatException var8xx) {
                        }
                     } else {
                        var1.m10000().accept(var1.m12000());
                        var5.m6000(f7000[1]);
                     }
                  });
                  var5xx.N(
                     Enum0026.f5000,
                     var3xxx -> {
                        if (var3xxx.m26000().m44000()) {
                           C0308 var4xxx = (C0308)var3xxx;
                           var3xxx.m6000();
                           var3xxx.m22000();
                           float var5xxx = Math.clamp(
                              C1183.m32000(var1.m8000() + Math.signum(var4xxx.m2000()) * var1.m16000(), var1.m16000()), var1.m12000(), var1.m20000()
                           );
                           var1.m10000().accept(var5xxx);
                           var5.m6000((var5xxx - var1.m12000()) / var1.m2000());
                           var8.m6000(null);
                        }
                     }
                  );
               }
            );
         }
      );
   }

   private boolean m70000(Iface0212 var1, float var2) {
      if (var1.m4000().isEmpty()) {
         return f23000[4];
      } else {
         Iface0212 var3 = var1.m4000().getFirst();
         if (var3.m4000().isEmpty()) {
            return f18000[0];
         } else {
            Iface0212 var4 = var3.m4000().getFirst();
            float var5 = var3.m18000().m14000() - var1.m18000().m14000();
            float var6 = var5 + var4.m18000().m12000();
            return Math.abs(var2 - var6) <= f7000[0] ? f18000[1] : f18000[2];
         }
      }
   }

   private String m78000(Rec0257 var1) {
      String var2 = var1.m14000().get();
      return var2 == null ? f31000[5] : var2;
   }

   private static void m82000() {
      float[] var128 = new float[6];
      f29000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f29000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f29000[2] = Float.intBitsToFloat(1065353216);
      f29000[3] = Float.intBitsToFloat(1120927744);
      f29000[4] = Float.intBitsToFloat(-1056964608);
      f29000[5] = Float.intBitsToFloat(1098907648);
      float[] var129 = new float[3];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1082130432);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f7000[2] = Float.intBitsToFloat(1120403456);
      float[] var130 = new float[6];
      f12000[(0 | -0) >>> 31] = Float.intBitsToFloat(1098907648);
      f12000[(1 | -1) >>> 31] = Float.intBitsToFloat(1092616192);
      f12000[2] = Float.intBitsToFloat(-1056964608);
      f12000[3] = Float.intBitsToFloat(-1073741824);
      f12000[4] = Float.intBitsToFloat(0);
      f12000[5] = Float.intBitsToFloat(1120927744);
      float[] var131 = new float[3];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f3000[2] = Float.intBitsToFloat(1098907648);
      float[] var132 = new float[7];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(1092616192);
      f6000[(1 | -1) >>> 31] = Float.intBitsToFloat(1148829696);
      f6000[2] = Float.intBitsToFloat(1090519040);
      f6000[3] = Float.intBitsToFloat(1045220557);
      f6000[4] = Float.intBitsToFloat(-1056964608);
      f6000[5] = Float.intBitsToFloat(-1073741824);
      f6000[6] = Float.intBitsToFloat(1086324736);
      float[] var133 = new float[5];
      f24000[(0 | -0) >>> 31] = Float.intBitsToFloat(1148829696);
      f24000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120927744);
      f24000[2] = Float.intBitsToFloat(1086324736);
      f24000[3] = Float.intBitsToFloat(1148829696);
      f24000[4] = Float.intBitsToFloat(1094713344);
      float[] var134 = new float[6];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1104150528);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(1104150528);
      f5000[2] = Float.intBitsToFloat(1135869952);
      f5000[3] = Float.intBitsToFloat(1104674816);
      f5000[4] = Float.intBitsToFloat(1065353216);
      f5000[5] = Float.intBitsToFloat(1036831949);
      float[] var135 = new float[2];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(1073741824);
      f8000[(1 | -1) >>> 31] = Float.intBitsToFloat(1007192201);
      float[] var136 = new float[5];
      f16000[(0 | -0) >>> 31] = Float.intBitsToFloat(1109393408);
      f16000[(1 | -1) >>> 31] = Float.intBitsToFloat(1104150528);
      f16000[2] = Float.intBitsToFloat(1065353216);
      f16000[3] = Float.intBitsToFloat(1073741824);
      f16000[4] = Float.intBitsToFloat(1073741824);
      float[] var137 = new float[7];
      f1000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f1000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120927744);
      f1000[2] = Float.intBitsToFloat(1086324736);
      f1000[3] = Float.intBitsToFloat(-1056964608);
      f1000[4] = Float.intBitsToFloat(-1073741824);
      f1000[5] = Float.intBitsToFloat(1077936128);
      f1000[6] = Float.intBitsToFloat(1082130432);
   }
}
