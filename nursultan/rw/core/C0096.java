package rw.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import rw.GuiWidget;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.OlilOllt;
import rw.data.Rec0223;
import rw.data.Rec0263;
import rw.defs.Enum0026;
import rw.defs.Enum0086;
import rw.setting.C0019;
import rw.setting.C0031;

public class C0096 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   private static byte[] f9000;
   private static int[] f10000;
   private static float[] f11000;
   private static byte[] f12000;
   public static Object[] f13000;
   private static String[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   public static Object[] f19000;
   private static float[] f20000;

   private static void m2000() {
      byte[] var128 = new byte[3];
      f7000[(0 | -0) >>> 31] = 4;
      f7000[(1 | -1) >>> 31] = 8;
      f7000[2] = 16;
      byte[] var129 = new byte[2];
      f9000[(0 | -0) >>> 31] = 3;
      f9000[(1 | -1) >>> 31] = 2;
      byte[] var130 = new byte[7];
      f12000[(0 | -0) >>> 31] = 18;
      f12000[(1 | -1) >>> 31] = 2;
      f12000[2] = 3;
      f12000[3] = 3;
      f12000[4] = 2;
      f12000[5] = 3;
      f12000[6] = 2;
      byte[] var131 = new byte[5];
      f6000[(0 | -0) >>> 31] = 18;
      f6000[(1 | -1) >>> 31] = 3;
      f6000[2] = 4;
      f6000[3] = 4;
      f6000[4] = 5;
   }

   private static void m10000() {
      float[] var128 = new float[5];
      f11000[(0 | -0) >>> 31] = Float.intBitsToFloat(1120403456);
      f11000[(1 | -1) >>> 31] = Float.intBitsToFloat(1101004800);
      f11000[2] = Float.intBitsToFloat(1101004800);
      f11000[3] = Float.intBitsToFloat(1101004800);
      f11000[4] = Float.intBitsToFloat(1120403456);
      float[] var129 = new float[4];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(1094713344);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1065353216);
      f3000[2] = Float.intBitsToFloat(1065353216);
      f3000[3] = Float.intBitsToFloat(1120403456);
      float[] var130 = new float[2];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1114636288);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(1099431936);
      float[] var131 = new float[4];
      f20000[(0 | -0) >>> 31] = Float.intBitsToFloat(1099431936);
      f20000[(1 | -1) >>> 31] = Float.intBitsToFloat(1094713344);
      f20000[2] = Float.intBitsToFloat(1094713344);
      f20000[3] = Float.intBitsToFloat(0);
      float[] var132 = new float[6];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1120403456);
      f4000[2] = Float.intBitsToFloat(1099956224);
      f4000[3] = Float.intBitsToFloat(1099956224);
      f4000[4] = Float.intBitsToFloat(1120403456);
      f4000[5] = Float.intBitsToFloat(1114636288);
   }

   private C0096() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f14000 = new String[4];
      f14000[(0 | -0) >>> 31] = "settingUpdater";
      f14000[(1 | -1) >>> 31] = " » ";
      f14000[2] = "search.nothing-found";
      f14000[3] = " » ";
   }

   private static void m18000() {
      f13000 = new Object[f6000[3]];
      f13000[f18000[5]] = f14000[3];
      f19000 = new Object[f6000[4]];
   }

   private static void m26000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[3];
      f17000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[6];
      f18000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((1 | -1) >>> 31);
      f18000[3] = (boolean)((0 | -0) >>> 31);
      f18000[4] = (boolean)((1 | -1) >>> 31);
      f18000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static int m34000(Enum0086 var0) {
      if (var0 == (Enum0086)Enum0086.f1000[f2000[4]]) {
         return f7000[0];
      } else if (var0 == (Enum0086)Enum0086.f1000[f2000[5]]) {
         return f7000[1];
      } else if (var0 == (Enum0086)Enum0086.f4000[f2000[6]]) {
         return f7000[2];
      } else {
         return var0.m38000() != null ? f9000[0] : f1000[2];
      }
   }

   private static int m38000(Entry<String, List<Rec0223>> var0) {
      int var1 = f10000[0];

      for (Rec0223 var3 : (List)var0.getValue()) {
         var1 = Math.max(var1, var3.m2000());
      }

      return var1;
   }

   private static List<Entry<String, List<Rec0223>>> m44000(OlilOllt var0) {
      List var1 = OlnpItr.m16000(var0.m6000(), m34000(var0.m4000()));
      LinkedHashMap var2 = new LinkedHashMap();

      for (Rec0223 var4 : var1) {
         if (var4.m8000() instanceof GuiWidget
            || var4.m8000() instanceof Base1014
            || var4.m8000() instanceof OlsmIikp
            || var4.m8000() instanceof rw.setting.C0156
            || var4.m8000() instanceof Noqodls) {
            var2.computeIfAbsent(String.join(f14000[1], var4.m6000()), var0x -> new ArrayList<>()).add(var4);
         }
      }

      ArrayList var6 = new ArrayList(var2.entrySet());

      for (Entry var5 : var6) {
         ((List)var5.getValue()).sort(Comparator.comparingInt(Rec0223::m2000).reversed());
      }

      var6.sort(Comparator.comparingInt(C0096::m38000).reversed());
      return var6;
   }

   private C0031 m46000(OlilOllt var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f8000[0]]);
      Iface0196 var4 = var2.m24000(f14000[0], null);
      List var5 = m44000(var1);
      if (var5.isEmpty()) {
         return C0287.m26000(
            (rw.setting.C0056)f13000[f8000[1]],
            var0 -> var0.N((rw.setting.C0056)f19000[f16000[4]], var0x -> var0x.N(C1235.m36000(f14000[2]), (rw.setting.C0056)f19000[f16000[5]]))
         );
      } else {
         rw.setting.C0056 var6 = ((C0097)f19000[f8000[2]]).m8000(var3);
         return C0287.m26000((rw.setting.C0056)f13000[f15000[0]], var4x -> {
            for (Entry var6x : var5) {
               String var7 = (String)var6x.getKey();
               List var8 = (List)var6x.getValue();
               var4x.N((rw.setting.C0056)f13000[f16000[0]], var5x -> {
                  var5x.N("searchGroup:" + var7);
                  var5x.N(Enum0026.f2000, Base0315::m6000);
                  var5x.N((rw.setting.C0056)f19000[f16000[1]], var2xxx -> var2xxx.N(var7, var6));
                  var5x.y((rw.setting.C0056)C0076.f5000[f16000[2]]);
                  var5x.N((rw.setting.C0056)f19000[f16000[3]], var3xxx -> m56000(var3xxx, var8, var4, var2));
               });
            }
         });
      }
   }

   private static void m48000() {
      short[] var128 = new short[3];
      f8000[(0 | -0) >>> 31] = 6;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[3];
      f15000[(0 | -0) >>> 31] = 2;
      f15000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f15000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[7];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = 2;
      f2000[4] = 5;
      f2000[5] = 6;
      f2000[6] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[7];
      f16000[(0 | -0) >>> 31] = 3;
      f16000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f16000[2] = 2;
      f16000[3] = 2;
      f16000[4] = 3;
      f16000[5] = 4;
      f16000[6] = 5;
   }

   private static void m56000(C0288 var0, List<Rec0223> var1, Iface0196<Void> var2, Iface0202 var3) {
      for (int var4 = f1000[0]; var4 < var1.size(); var4++) {
         Object var5 = ((Rec0223)var1.get(var4)).m8000();
         if (var5 instanceof GuiWidget var6) {
            var0.y(var3.m18000("moduleHit:" + var6.m42000(), (Iface0197<GuiWidget>)rw.setting.C0015.f6000[f15000[1]], var6));
         } else if (var5 instanceof Base1014 var7) {
            var0.y(var3.m18000("settingHit:" + var7.m6000().m10000(), (Iface0197<Rec0263>)C0093.f1000[f15000[2]], new Rec0263(var7, var2)));
         } else if (var5 instanceof OlsmIikp var8) {
            var0.y(var3.m18000("presetHit:" + var8.m32000(), (Iface0197<OlsmIikp>)rw.setting.C0004.f13000[f2000[0]], var8));
         } else if (var5 instanceof rw.setting.C0156 var9) {
            var0.y(var3.m18000("autoBuyHit:" + var9.m4000().m10000(), (Iface0197<rw.setting.C0156>)C0019.f26000[f2000[1]], var9));
         } else if (var5 instanceof Noqodls var10) {
            var0.y(var3.m18000("accountHit:" + var10.m38000(), (Iface0197<Noqodls>)rw.setting.C0150.f34000[f2000[2]], var10));
         }

         if (var4 < var1.size() - f1000[1]) {
            var0.y((rw.setting.C0056)C0076.f5000[f2000[3]]);
         }
      }
   }

   private static void m62000() {
      int[] var128 = new int[2];
      f10000[(0 | -0) >>> 31] = Integer.MIN_VALUE;
      f10000[(1 | -1) >>> 31] = -7171438;
   }
}
