package rw.gui;

import java.util.function.Consumer;
import net.minecraft.client.renderer.item.SelectItemModel$UnbakedSwitch;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.C0287;
import rw.core.C0297;
import rw.core.C0300;
import rw.core.C0308;
import rw.core.C0310;
import rw.core.C0318;
import rw.core.C0979;
import rw.core.C1045;
import rw.core.C1183;
import rw.core.OlIrtqjti;
import rw.data.Rec0125;
import rw.data.Rec0278;
import rw.defs.Enum0026;
import rw.defs.OlipnnIii;
import rw.setting.C0031;
import rw.setting.C0056;

public class C0127 {
   private static String[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static boolean[] f6000;
   private static float[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static float[] f13000;
   public static Object[] f14000;
   private static float[] f15000;
   private static float[] f16000;
   public static Object[] f17000;
   private static short[] f18000;
   private static byte[] f19000;
   private static boolean[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static short[] f23000;
   private static boolean[] f24000;
   private static float[] f25000;
   public static Object[] f26000;
   private static boolean[] f27000;
   private static float[] f28000;
   private static float[] f29000;
   private static byte[] f30000;
   private static boolean[] f31000;
   private static short[] f32000;
   private static String[] f33000;
   private static float[] f34000;
   private static short[] f35000;
   private static float[] f36000;
   private static float[] f37000;
   public static Object[] f38000;

   private static void m6000() {
      f38000 = new Object[f2000[2]];
      f38000[f9000[4]] = f7000[(1 | -1) >>> 31];
      f38000[f2000[3]] = f7000[2];
      f38000[f2000[4]] = Integer.valueOf(f2000[5]);
      f38000[f2000[6]] = Integer.valueOf(f2000[7]);
      f3000 = new Object[f19000[(0 | -0) >>> 31]];
      f3000[f4000[(0 | -0) >>> 31]] = f7000[3];
      f3000[f4000[(1 | -1) >>> 31]] = f7000[4];
      f17000 = new Object[f19000[(1 | -1) >>> 31]];
      f17000[f4000[2]] = f7000[5];
      f17000[f4000[3]] = Integer.valueOf(f35000[7]);
      f26000 = new Object[f19000[2]];
      f26000[f4000[4]] = f7000[6];
      f14000 = new Object[f19000[3]];
   }

   private C0127() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      float[] var128 = new float[4];
      f25000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f25000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f25000[2] = Float.intBitsToFloat(0);
      f25000[3] = Float.intBitsToFloat(1065353216);
      float[] var129 = new float[2];
      f15000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f15000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      float[] var130 = new float[8];
      f28000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f28000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f28000[2] = Float.intBitsToFloat(953267991);
      f28000[3] = Float.intBitsToFloat(1120927744);
      f28000[4] = Float.intBitsToFloat(1120927744);
      f28000[5] = Float.intBitsToFloat(1120927744);
      f28000[6] = Float.intBitsToFloat(-1056964608);
      f28000[7] = Float.intBitsToFloat(1098907648);
      float[] var131 = new float[6];
      f34000[(0 | -0) >>> 31] = Float.intBitsToFloat(1082130432);
      f34000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f34000[2] = Float.intBitsToFloat(1065353216);
      f34000[3] = Float.intBitsToFloat(0);
      f34000[4] = Float.intBitsToFloat(1065353216);
      f34000[5] = Float.intBitsToFloat(1120927744);
      float[] var132 = new float[4];
      f37000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120927744);
      f37000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f37000[2] = Float.intBitsToFloat(1065353216);
      f37000[3] = Float.intBitsToFloat(1120927744);
      float[] var133 = new float[7];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1056964608);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f5000[2] = Float.intBitsToFloat(0);
      f5000[3] = Float.intBitsToFloat(0);
      f5000[4] = Float.intBitsToFloat(0);
      f5000[5] = Float.intBitsToFloat(1120927744);
      f5000[6] = Float.intBitsToFloat(0);
      float[] var134 = new float[7];
      f29000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f29000[(1 | -1) >>> 31] = Float.intBitsToFloat(1098907648);
      f29000[2] = Float.intBitsToFloat(1092616192);
      f29000[3] = Float.intBitsToFloat(1148829696);
      f29000[4] = Float.intBitsToFloat(-1056964608);
      f29000[5] = Float.intBitsToFloat(-1073741824);
      f29000[6] = Float.intBitsToFloat(1086324736);
      float[] var135 = new float[3];
      f36000[(0 | -0) >>> 31] = Float.intBitsToFloat(1148829696);
      f36000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f36000[2] = Float.intBitsToFloat(1120927744);
      float[] var136 = new float[8];
      f13000[(0 | -0) >>> 31] = Float.intBitsToFloat(1086324736);
      f13000[(1 | -1) >>> 31] = Float.intBitsToFloat(1148829696);
      f13000[2] = Float.intBitsToFloat(1135869952);
      f13000[3] = Float.intBitsToFloat(1104674816);
      f13000[4] = Float.intBitsToFloat(1065353216);
      f13000[5] = Float.intBitsToFloat(1036831949);
      f13000[6] = Float.intBitsToFloat(1073741824);
      f13000[7] = Float.intBitsToFloat(1007192201);
      float[] var137 = new float[8];
      f16000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f16000[(1 | -1) >>> 31] = Float.intBitsToFloat(1104150528);
      f16000[2] = Float.intBitsToFloat(1104150528);
      f16000[3] = Float.intBitsToFloat(1109393408);
      f16000[4] = Float.intBitsToFloat(1104150528);
      f16000[5] = Float.intBitsToFloat(1065353216);
      f16000[6] = Float.intBitsToFloat(1073741824);
      f16000[7] = Float.intBitsToFloat(1073741824);
      float[] var138 = new float[7];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120927744);
      f7000[2] = Float.intBitsToFloat(1086324736);
      f7000[3] = Float.intBitsToFloat(-1056964608);
      f7000[4] = Float.intBitsToFloat(-1073741824);
      f7000[5] = Float.intBitsToFloat(1082130432);
      f7000[6] = Float.intBitsToFloat(953267991);
   }

   private static void m24000() {
      boolean[] var128 = new boolean[2];
      f27000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[7];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f12000[2] = (boolean)((1 | -1) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
      f12000[4] = (boolean)((0 | -0) >>> 31);
      f12000[5] = (boolean)((0 | -0) >>> 31);
      f12000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[8];
      f22000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f22000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f22000[2] = (boolean)((0 | -0) >>> 31);
      f22000[3] = (boolean)((0 | -0) >>> 31);
      f22000[4] = (boolean)((1 | -1) >>> 31);
      f22000[5] = (boolean)((0 | -0) >>> 31);
      f22000[6] = (boolean)((1 | -1) >>> 31);
      f22000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var131 = new boolean[7];
      f24000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f24000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f24000[2] = (boolean)((1 | -1) >>> 31);
      f24000[3] = (boolean)((1 | -1) >>> 31);
      f24000[4] = (boolean)((0 | -0) >>> 31);
      f24000[5] = (boolean)((1 | -1) >>> 31);
      f24000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[7];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((0 | -0) >>> 31);
      f11000[3] = (boolean)((1 | -1) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((1 | -1) >>> 31);
      f11000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[3];
      f31000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f31000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f31000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var134 = new boolean[5];
      f8000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[2] = (boolean)((0 | -0) >>> 31);
      f8000[3] = (boolean)((1 | -1) >>> 31);
      f8000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var135 = new boolean[6];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var136 = new boolean[7];
      f20000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f20000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f20000[2] = (boolean)((1 | -1) >>> 31);
      f20000[3] = (boolean)((1 | -1) >>> 31);
      f20000[4] = (boolean)((1 | -1) >>> 31);
      f20000[5] = (boolean)((0 | -0) >>> 31);
      f20000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var137 = new boolean[5];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((1 | -1) >>> 31);
      f9000[3] = (boolean)((0 | -0) >>> 31);
      f9000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var138 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
   }

   private static void m32000() {
      f33000 = new String[5];
      f33000[(0 | -0) >>> 31] = "rangeSliderDrag";
      f33000[(1 | -1) >>> 31] = "rangeSliderMinValue";
      f33000[2] = "rangeSliderMaxValue";
      f33000[3] = "rangeSliderActiveThumb";
      f33000[4] = "rangeSliderPointerDownX";
      f1000 = new String[5];
      f1000[(0 | -0) >>> 31] = "rangeSliderDragOffset";
      f1000[(1 | -1) >>> 31] = "rangeSliderClickAnimating";
      f1000[2] = "rangeSliderMinInputText";
      f1000[3] = "rangeSliderMaxInputText";
      f1000[4] = m18000("");
   }

   private float m34000(float var1, Rec0278 var2) {
      return Math.clamp((var1 - var2.m18000()) / var2.m2000(), f28000[0], f28000[1]);
   }

   private float m40000(float var1, float var2) {
      return Math.clamp(var1 / var2, f15000[0], f15000[1]);
   }

   private C0056 m46000(OlIrtqjti var1, float var2, float var3, boolean var4) {
      float var5 = Math.clamp(Math.min(var2, var3), f34000[1], f34000[2]);
      float var6 = Math.clamp(Math.max(var2, var3), f34000[3], f34000[4]);
      C0056[] var10000 = new C0056[f10000[0]];
      var10000[f22000[3]] = ((rw.core.C0097)f14000[f32000[4]]).m8000(var1);
      var10000[f22000[4]] = C0056.m130000().m178000(Rec0125.m24000((var6 - var5) * f34000[5])).m66000(var5 * f37000[0]);
      C0056 var7 = C0056.m120000(var10000);
      if (!var4) {
         var10000 = new C0056[f10000[1]];
         var10000[f22000[5]] = var7;
         var10000[f22000[6]] = (C0056)f14000[f32000[5]];
         var7 = C0056.m120000(var10000);
      }

      return var7;
   }

   private void m48000(
      Consumer<Consumer<C0300>> var1,
      Rec0278 var2,
      Iface0196<Boolean> var3,
      Iface0196<Float> var4,
      Iface0196<Float> var5,
      Iface0196<OlipnnIii> var6,
      Iface0196<String> var7,
      boolean var8
   ) {
      var1.accept(
         var8x -> {
            String var9 = this.m100000(var2);
            OlipnnIii var10 = var8 ? (OlipnnIii)OlipnnIii.f4000[f18000[1]] : (OlipnnIii)OlipnnIii.f4000[f18000[2]];
            float var11 = var3.m2000()
               ? this.m70000(var8 ? (Float)var4.m2000() : (Float)var5.m2000(), var2)
               : (var8 ? var2.m8000().m32000() : var2.m8000().m2000());
            var8x.m2000(var7.m2000() != null ? (String)var7.m2000() : C1045.m16000(var11, var9));
            var8x.N(var2.m12000().m2000() && var6.m2000() == var10 ? (C0056)f14000[f18000[3]] : (C0056)f14000[f35000[0]]);
            var8x.N(Enum0026.f9000, var2xx -> {
               C0310 var3xx = (C0310)var2xx;
               String var4xx = var3xx.m2000();
               var7.m6000(var4xx);
               String var5xx = C1045.m22000(var4xx, var9);
               if (!C1045.m18000(var5xx)) {
                  try {
                     Float.parseFloat(var5xx);
                  } catch (NumberFormatException var7xx) {
                     var7.m6000(var3xx.m4000());
                     var3xx.b();
                     var3xx.j();
                     var2xx.m26000().m42000(var3xx.m4000());
                  }
               }
            });
            var8x.N(Enum0026.f12000, var7xx -> {
               String var8xx = C1045.m22000(var7xx.m26000().m12000(), var9);
               var7.m6000(null);
               if (!var8xx.isBlank() && !C1045.m18000(var8xx)) {
                  try {
                     this.m98000(Float.parseFloat(var8xx), var2, var4, var5, var8);
                  } catch (NumberFormatException var10x) {
                  }
               } else {
                  this.m98000(var8 ? var2.m18000() : var2.m22000(), var2, var4, var5, var8);
               }
            });
            var8x.N(Enum0026.f5000, var6xx -> {
               if (var6xx.m26000().m44000()) {
                  C0308 var7xx = (C0308)var6xx;
                  var6xx.m6000();
                  var6xx.m22000();
                  float var8xx = this.m70000(var8 ? (Float)var4.m2000() : (Float)var5.m2000(), var2);
                  this.m98000(var8xx + Math.signum(var7xx.m2000()) * var2.m4000(), var2, var4, var5, var8);
                  var7.m6000(null);
               }
            });
         }
      );
   }

   private OlipnnIii m56000(float var1, Iface0196<Float> var2, Iface0196<Float> var3) {
      float var4 = Math.abs(var1 - (Float)var2.m2000());
      float var5 = Math.abs(var1 - (Float)var3.m2000());
      return var4 <= var5 ? (OlipnnIii)OlipnnIii.f4000[f23000[4]] : (OlipnnIii)OlipnnIii.f4000[f23000[5]];
   }

   private boolean m58000(Iface0212 var1, float var2, OlipnnIii var3) {
      if (var3 != null && !var1.m4000().isEmpty()) {
         Iface0212 var4 = var1.m4000().get(f12000[5]);
         if (var4.m4000().isEmpty()) {
            return f12000[6];
         } else {
            Iface0212 var5 = var4.m4000().get(f22000[0]);
            float var6 = var4.m18000().m14000() - var1.m18000().m14000();
            float var7 = var5.m18000().m14000() - var1.m18000().m14000();
            float var8 = var3 == (OlipnnIii)OlipnnIii.f4000[f32000[3]] ? var7 : var7 + var5.m18000().m12000();
            if (!Float.isFinite(var8)) {
               var8 = var6;
            }

            return Math.abs(var2 - var8) <= f34000[0] ? f22000[1] : f22000[2];
         }
      } else {
         return f12000[4];
      }
   }

   private C0056 m62000(OlIrtqjti var1, float var2, boolean var3) {
      C0056[] var10000 = new C0056[f10000[2]];
      var10000[f22000[7]] = ((rw.core.C0097)f14000[f32000[6]]).m8000(var1);
      var10000[f24000[0]] = C0056.m130000().m66000(Math.clamp(var2, f37000[1], f37000[2]) * f37000[3] + f5000[0]);
      C0056 var4 = C0056.m120000(var10000);
      if (!var3) {
         var10000 = new C0056[f10000[3]];
         var10000[f24000[1]] = var4;
         var10000[f24000[2]] = (C0056)f14000[f18000[0]];
         var4 = C0056.m120000(var10000);
      }

      return var4;
   }

   private static void m64000() {
      short[] var128 = new short[7];
      f23000[(0 | -0) >>> 31] = 6;
      f23000[(1 | -1) >>> 31] = 2;
      f23000[2] = (short)((0 | -0) >>> 31);
      f23000[3] = (short)((1 | -1) >>> 31);
      f23000[4] = (short)((0 | -0) >>> 31);
      f23000[5] = (short)((1 | -1) >>> 31);
      f23000[6] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[7];
      f32000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f32000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f32000[2] = (short)((0 | -0) >>> 31);
      f32000[3] = (short)((0 | -0) >>> 31);
      f32000[4] = (short)((1 | -1) >>> 31);
      f32000[5] = 2;
      f32000[6] = 3;
      short[] var130 = new short[4];
      f18000[(0 | -0) >>> 31] = 2;
      f18000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f18000[2] = (short)((1 | -1) >>> 31);
      f18000[3] = 5;
      short[] var131 = new short[8];
      f35000[(0 | -0) >>> 31] = 4;
      f35000[(1 | -1) >>> 31] = 3;
      f35000[2] = (short)((0 | -0) >>> 31);
      f35000[3] = (short)((1 | -1) >>> 31);
      f35000[4] = (short)((0 | -0) >>> 31);
      f35000[5] = (short)((0 | -0) >>> 31);
      f35000[6] = (short)((0 | -0) >>> 31);
      f35000[7] = 999;
   }

   private float m70000(float var1, Rec0278 var2) {
      return Math.clamp(C1183.m32000(var1 * var2.m2000() + var2.m18000(), var2.m4000()), var2.m18000(), var2.m22000());
   }

   private void m78000(Iface0196<Float> var1, Iface0196<Float> var2, Rec0278 var3, float var4, float var5, float var6, OlipnnIii var7, boolean var8) {
      float var9 = Math.clamp((var4 - var6) / var5, f25000[2], f25000[3]);
      if (var7 == (OlipnnIii)OlipnnIii.f4000[f23000[2]]) {
         var9 = Math.min(var9, (Float)var2.m2000());
         var1.m6000(var8 ? this.m34000(this.m70000(var9, var3), var3) : var9);
      } else if (var7 == (OlipnnIii)OlipnnIii.f4000[f23000[3]]) {
         var9 = Math.max(var9, (Float)var1.m2000());
         var2.m6000(var8 ? this.m34000(this.m70000(var9, var3), var3) : var9);
      }
   }

   private C0979 m80000(Iface0196<Float> var1, Iface0196<Float> var2, Rec0278 var3) {
      float var4 = this.m70000(Math.min((Float)var1.m2000(), (Float)var2.m2000()), var3);
      float var5 = this.m70000(Math.max((Float)var1.m2000(), (Float)var2.m2000()), var3);
      return new C0979(var4, var5);
   }

   private boolean m86000(float var1, float var2) {
      float var3 = var2 * f28000[5] + f28000[6];
      float var4 = var3 + f28000[7];
      return var1 >= var3 && var1 <= var4 ? f12000[2] : f12000[3];
   }

   private C0031 m92000(Rec0278 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f23000[0]]);
      Iface0196 var4 = var2.m20000(f33000[0], f27000[0]);
      Iface0196 var5 = var2.m20000(f33000[1], var1.m14000());
      Iface0196 var6 = var2.m20000(f33000[2], var1.m20000());
      Iface0196 var7 = var2.m20000(f33000[3], (OlipnnIii)null);
      Iface0196 var8 = var2.m20000(f33000[4], f25000[0]);
      Iface0196 var9 = var2.m20000(f1000[0], f25000[1]);
      Iface0196 var10 = var2.m20000(f1000[1], f27000[1]);
      Iface0196 var11 = var2.m20000(f1000[2], (String)null);
      Iface0196 var12 = var2.m20000(f1000[3], (String)null);
      return C0287.m26000((C0056)f26000[f23000[1]], var12x -> {
         this.m48000(var12x::m14000, var1, var4, var5, var6, var7, var11, f24000[3]);
         var12x.N((C0056)f26000[f35000[1]], var10xx -> {
            var10xx.N(Enum0026.f2000, var9xxx -> {
               C0318 var10xxx = (C0318)var9xxx;
               if (var10xxx.m2000() == 0) {
                  var4.m6000(f31000[1]);
                  var8.m6000(var10xxx.m8000());
                  Iface0212 var11xx = var10xxx.z();
                  float var12xx = var10xxx.m8000() - var11xx.m18000().m14000();
                  boolean var13 = this.m102000(var5, var6);
                  OlipnnIii var14 = var13 ? null : this.m96000(var12xx, (Float)var5.m2000(), (Float)var6.m2000());
                  if (var14 != null) {
                     var7.m6000(var14);
                     var10.m6000(f31000[2]);
                     float var15 = var14 == (OlipnnIii)OlipnnIii.f4000[f35000[5]] ? (Float)var5.m2000() : (Float)var6.m2000() * f5000[5];
                     var9.m6000(var12xx - var15);
                  } else {
                     var9.m6000(f5000[6]);
                     if (var13) {
                        var7.m6000(null);
                        var10.m6000(f8000[0]);
                     } else {
                        OlipnnIii var16 = this.m56000(this.m40000(var12xx, var11xx.m18000().m12000()), var5, var6);
                        var7.m6000(var16);
                        var10.m6000(f8000[1]);
                        var1.m12000().m6000(f8000[2]);
                        this.m78000(var5, var6, var1, var12xx, var11xx.m18000().m12000(), f29000[0], var16, f8000[3]);
                        var1.m24000().accept(this.m80000(var5, var6, var1));
                     }
                  }
               }
            });
            var10xx.N(Enum0026.f3000, var8xxx -> {
               C0318 var9xxx = (C0318)var8xxx;
               if (var9xxx.m2000() == 0) {
                  var4.m6000(f11000[4]);
                  if (var1.m12000().m2000() && var7.m2000() != null) {
                     Iface0212 var10xxx = var9xxx.z();
                     float var11xx = var9xxx.m8000() - var10xxx.m18000().m14000();
                     this.m78000(var5, var6, var1, var11xx, var10xxx.m18000().m12000(), (Float)var9.m2000(), (OlipnnIii)var7.m2000(), f11000[5]);
                     var1.m24000().accept(this.m80000(var5, var6, var1));
                  }

                  var7.m6000(null);
                  var1.m12000().m6000(f11000[6]);
                  var9.m6000(f5000[4]);
                  var10.m6000(f31000[0]);
               }
            });
            var10xx.N(Enum0026.f1000, var9xxx -> {
               if ((Boolean)var4.m2000()) {
                  C0318 var10xxx = (C0318)var9xxx;
                  Iface0212 var11xx = var10xxx.z();
                  float var12xx = var10xxx.m8000() - var11xx.m18000().m14000();
                  if (var7.m2000() == null) {
                     float var13 = var10xxx.m8000() - (Float)var8.m2000();
                     if (var13 > f5000[1]) {
                        var7.m6000((OlipnnIii)OlipnnIii.f4000[f35000[3]]);
                     } else {
                        if (!(var13 < f5000[2])) {
                           return;
                        }

                        var7.m6000((OlipnnIii)OlipnnIii.f4000[f35000[4]]);
                     }

                     var9.m6000(f5000[3]);
                  }

                  if ((Boolean)var10.m2000() && this.m58000(var11xx, var12xx, (OlipnnIii)var7.m2000())) {
                     var10.m6000(f11000[1]);
                  }

                  this.m78000(var5, var6, var1, var12xx, var11xx.m18000().m12000(), (Float)var9.m2000(), (OlipnnIii)var7.m2000(), f11000[2]);
                  var1.m24000().accept(this.m80000(var5, var6, var1));
                  if (!(Boolean)var10.m2000()) {
                     var1.m12000().m6000(f11000[3]);
                  }
               }
            });
            var10xx.N(((rw.core.C0097)f14000[f35000[2]]).m8000(var3), var7xxx -> {
               float var8xxx = var4.m2000() ? (Float)var5.m2000() : var1.m14000();
               float var9xxx = var4.m2000() ? (Float)var6.m2000() : var1.m20000();
               boolean var10xxx = var1.m12000().m2000() && !var10.m2000() ? f24000[5] : f24000[6];
               var7xxx.N(this.m46000(var3, var8xxx, var9xxx, var10xxx), var1xxxx -> var1xxxx.N(Enum0026.f15000, var1xxxxx -> {
                  SelectItemModel$UnbakedSwitch var2xxxx = (SelectItemModel$UnbakedSwitch)var1xxxxx;
                  if (lOkljr0I<"nqeoli",-184101994,-1975562486,-1975562485,-1975562476,1191957309,-783366809>(var2xxxx)) {
                     var10.m6000(f11000[0]);
                  }
               }));
               var7xxx.y(this.m62000(var3, var8xxx, var10xxx));
               var7xxx.y(this.m62000(var3, var9xxx, var10xxx));
            });
         });
         this.m48000(var12x::m14000, var1, var4, var5, var6, var7, var12, f24000[4]);
      });
   }

   private OlipnnIii m96000(float var1, float var2, float var3) {
      boolean var4 = this.m86000(var1, var3);
      boolean var5 = this.m86000(var1, var2);
      if (var4 && var5) {
         float var6 = var3 * f28000[3];
         float var7 = var2 * f28000[4];
         return Math.abs(var1 - var6) <= Math.abs(var1 - var7) ? (OlipnnIii)OlipnnIii.f4000[f23000[6]] : (OlipnnIii)OlipnnIii.f4000[f32000[0]];
      } else if (var4) {
         return (OlipnnIii)OlipnnIii.f4000[f32000[1]];
      } else {
         return var5 ? (OlipnnIii)OlipnnIii.f4000[f32000[2]] : null;
      }
   }

   private void m98000(float var1, Rec0278 var2, Iface0196<Float> var3, Iface0196<Float> var4, boolean var5) {
      float var6 = Math.clamp(C1183.m32000(var1, var2.m4000()), var2.m18000(), var2.m22000());
      if (var5) {
         var6 = Math.min(var6, this.m70000((Float)var4.m2000(), var2));
         var3.m6000(this.m34000(var6, var2));
      } else {
         var6 = Math.max(var6, this.m70000((Float)var3.m2000(), var2));
         var4.m6000(this.m34000(var6, var2));
      }

      var2.m24000().accept(this.m80000(var3, var4, var2));
   }

   private String m100000(Rec0278 var1) {
      String var2 = var1.m10000().get();
      return var2 == null ? f1000[4] : var2;
   }

   private boolean m102000(Iface0196<Float> var1, Iface0196<Float> var2) {
      return Math.abs((Float)var1.m2000() - (Float)var2.m2000()) < f28000[2] ? f12000[0] : f12000[1];
   }

   private static void m104000() {
      byte[] var128 = new byte[5];
      f10000[(0 | -0) >>> 31] = 2;
      f10000[(1 | -1) >>> 31] = 2;
      f10000[2] = 2;
      f10000[3] = 2;
      f10000[4] = 2;
      byte[] var129 = new byte[4];
      f21000[(0 | -0) >>> 31] = 3;
      f21000[(1 | -1) >>> 31] = 2;
      f21000[2] = 2;
      f21000[3] = 3;
      byte[] var130 = new byte[6];
      f30000[(0 | -0) >>> 31] = 2;
      f30000[(1 | -1) >>> 31] = 4;
      f30000[2] = 14;
      f30000[3] = 3;
      f30000[4] = 4;
      f30000[5] = 2;
      byte[] var131 = new byte[8];
      f2000[(0 | -0) >>> 31] = 4;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = 5;
      f2000[3] = 2;
      f2000[4] = 3;
      f2000[5] = 16;
      f2000[6] = 4;
      f2000[7] = 10;
      byte[] var132 = new byte[4];
      f19000[(0 | -0) >>> 31] = 2;
      f19000[(1 | -1) >>> 31] = 2;
      f19000[2] = 4;
      f19000[3] = 6;
   }
}
