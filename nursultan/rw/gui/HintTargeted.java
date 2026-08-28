package rw.gui;

import java.util.List;
import org.joml.Vector4f;
import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.core.C0258;
import rw.core.C0287;
import rw.core.C0296;
import rw.core.C0297;
import rw.core.C1235;
import rw.core.LeAm;
import rw.core.OlIrtqjti;
import rw.data.Rec0076;
import rw.defs.StepStart;
import rw.setting.C0031;
import rw.setting.C0056;
import rw.setting.Rec0057;

public class HintTargeted {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   private static byte[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;
   private static float[] f7000;
   private static boolean[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static boolean[] f11000;
   private static short[] f12000;
   public static Object[] f13000;
   private static int[] f14000;
   public static Object[] f15000;
   public static Object[] f16000;
   private static boolean[] f17000;
   private static byte[] f18000;
   private static boolean[] f19000;
   private static short[] f20000;
   private static float[] f21000;
   private static byte[] f22000;
   private static String[] f23000;
   private static byte[] f24000;
   private static boolean[] f25000;
   private static float[] f26000;
   private static float[] f27000;
   private static float[] f28000;
   private static byte[] f29000;
   private static boolean[] f30000;
   private static boolean[] f31000;
   private static boolean[] f32000;
   private static boolean[] f33000;
   private static boolean[] f34000;
   private static boolean[] f35000;
   private static float[] f36000;
   private static short[] f37000;
   private static byte[] f38000;
   public static Object[] f39000;

   private static void m4000() {
      short[] var128 = new short[7];
      f37000[(0 | -0) >>> 31] = 6;
      f37000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f37000[2] = 2;
      f37000[3] = 3;
      f37000[4] = 4;
      f37000[5] = 5;
      f37000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[3];
      f12000[(0 | -0) >>> 31] = 7;
      f12000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f12000[2] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[8];
      f20000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f20000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f20000[2] = (short)((1 | -1) >>> 31);
      f20000[3] = (short)((1 | -1) >>> 31);
      f20000[4] = (short)((0 | -0) >>> 31);
      f20000[5] = 7;
      f20000[6] = 6;
      f20000[7] = 3;
   }

   private static void m8000() {
      float[] var128 = new float[2];
      f9000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f9000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      float[] var129 = new float[4];
      f26000[(0 | -0) >>> 31] = Float.intBitsToFloat(1090519040);
      f26000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f26000[2] = Float.intBitsToFloat(1088421888);
      f26000[3] = Float.intBitsToFloat(1088421888);
      float[] var130 = new float[4];
      f21000[(0 | -0) >>> 31] = Float.intBitsToFloat(1088421888);
      f21000[(1 | -1) >>> 31] = Float.intBitsToFloat(1088421888);
      f21000[2] = Float.intBitsToFloat(1073741824);
      f21000[3] = Float.intBitsToFloat(1073741824);
      float[] var131 = new float[4];
      f36000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f36000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f36000[2] = Float.intBitsToFloat(1043878380);
      f36000[3] = Float.intBitsToFloat(1034147594);
      float[] var132 = new float[6];
      f27000[(0 | -0) >>> 31] = Float.intBitsToFloat(1041462460);
      f27000[(1 | -1) >>> 31] = Float.intBitsToFloat(1030053954);
      f27000[2] = Float.intBitsToFloat(1065353216);
      f27000[3] = Float.intBitsToFloat(0);
      f27000[4] = Float.intBitsToFloat(0);
      f27000[5] = Float.intBitsToFloat(1084227584);
      float[] var133 = new float[3];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1063256064);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(1069547520);
      f7000[2] = Float.intBitsToFloat(1097859072);
      float[] var134 = new float[5];
      f28000[(0 | -0) >>> 31] = Float.intBitsToFloat(1077936128);
      f28000[(1 | -1) >>> 31] = Float.intBitsToFloat(1077936128);
      f28000[2] = Float.intBitsToFloat(1069547520);
      f28000[3] = Float.intBitsToFloat(1077936128);
      f28000[4] = Float.intBitsToFloat(1088421888);
      float[] var135 = new float[8];
      f10000[(0 | -0) >>> 31] = Float.intBitsToFloat(1084227584);
      f10000[(1 | -1) >>> 31] = Float.intBitsToFloat(1090519040);
      f10000[2] = Float.intBitsToFloat(1073741824);
      f10000[3] = Float.intBitsToFloat(0);
      f10000[4] = Float.intBitsToFloat(1043878380);
      f10000[5] = Float.intBitsToFloat(1034147594);
      f10000[6] = Float.intBitsToFloat(1041462460);
      f10000[7] = Float.intBitsToFloat(1030053954);
   }

   private HintTargeted() {
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      int[] var128 = new int[2];
      f14000[(0 | -0) >>> 31] = -1778384896;
      f14000[(1 | -1) >>> 31] = -1778384896;
   }

   private static void m22000() {
      f23000 = new String[6];
      f23000[(0 | -0) >>> 31] = "hud.hint.move.key";
      f23000[(1 | -1) >>> 31] = "hud.hint.move.text";
      f23000[2] = "hud.hint.snap.key";
      f23000[3] = "hud.hint.snap.text";
      f23000[4] = "hud.hint.reset.key";
      f23000[5] = "hud.hint.reset.text";
   }

   private static void m24000() {
      f39000 = new Object[f18000[(1 | -1) >>> 31]];
      f39000[f32000[3]] = Integer.valueOf(f32000[4]);
      f39000[f38000[(0 | -0) >>> 31]] = Integer.valueOf(f38000[(1 | -1) >>> 31]);
      f39000[f38000[2]] = f28000[3];
      f39000[f38000[3]] = f28000[4];
      f39000[f38000[4]] = f10000[(0 | -0) >>> 31];
      f15000 = new Object[f38000[5]];
      f15000[f32000[5]] = f10000[(1 | -1) >>> 31];
      f15000[f31000[(0 | -0) >>> 31]] = f10000[2];
      f16000 = new Object[f4000[(0 | -0) >>> 31]];
      f16000[f31000[(1 | -1) >>> 31]] = f10000[3];
      f16000[f31000[2]] = f10000[4];
      f16000[f4000[(1 | -1) >>> 31]] = f10000[5];
      f16000[f4000[2]] = f10000[6];
      f16000[f4000[3]] = f10000[7];
      f13000 = new Object[f4000[4]];
   }

   private static C0056[] m30000(boolean var0, boolean var1) {
      C0056[] var2 = new C0056[f39000[f12000[1]]];

      for (int var3 = f30000[2]; var3 < f39000[f12000[2]]; var3++) {
         int var4 = var1 ? (Integer)f39000[f20000[0]] - f30000[3] - var3 : var3;
         Rec0076 var5 = var0
            ? new Rec0076(f36000[2], StepStart.f4000, var4 * f36000[3])
            : new Rec0076(f27000[0], StepStart.f4000, ((Integer)f39000[f20000[1]] - f19000[0] - var4) * f27000[1]);
         C0056[] var10002 = new C0056[f29000[1]];
         var10002[f19000[1]] = (C0056)f13000[f20000[2]];
         byte var10004 = f19000[2];
         C0056 var10005 = C0056.m130000().m50000(var0 ? f27000[2] : f27000[3]).m56000(var0 ? f27000[4] : (var1 ? f27000[5] : f7000[0]));
         Rec0057[] var10006 = new Rec0057[f3000[0]];
         var10006[f19000[3]] = Rec0057.m18000(var5);
         var10006[f11000[0]] = Rec0057.m14000(var5);
         var10002[var10004] = var10005.m186000(C0258.m10000(var10006));
         var2[var3] = C0056.m120000(var10002);
      }

      return var2;
   }

   private static boolean m32000(DragOffset var0, float var1, float var2, float var3, float var4) {
      if (!(var3 <= f36000[0]) && !(var4 <= f36000[1])) {
         for (DragOffset var6 : (List)LeAm.f5000[f12000[0]]) {
            if (var6 != var0) {
               Vector4f var7 = var6.m76000();
               if (var7 != null && var1 < var7.x + var7.z && var1 + var3 > var7.x && var2 < var7.y + var7.w && var2 + var4 > var7.y) {
                  return f30000[0];
               }
            }
         }

         return f30000[1];
      } else {
         return f6000[5];
      }
   }

   private static void m40000() {
      boolean[] var128 = new boolean[6];
      f33000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f33000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f33000[2] = (boolean)((1 | -1) >>> 31);
      f33000[3] = (boolean)((0 | -0) >>> 31);
      f33000[4] = (boolean)((0 | -0) >>> 31);
      f33000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[6];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((1 | -1) >>> 31);
      f6000[4] = (boolean)((0 | -0) >>> 31);
      f6000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[4];
      f30000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f30000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f30000[2] = (boolean)((0 | -0) >>> 31);
      f30000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var131 = new boolean[4];
      f19000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f19000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f19000[2] = (boolean)((1 | -1) >>> 31);
      f19000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var132 = new boolean[7];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((1 | -1) >>> 31);
      f11000[3] = (boolean)((0 | -0) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((1 | -1) >>> 31);
      f11000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var133 = new boolean[5];
      f17000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f17000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f17000[2] = (boolean)((1 | -1) >>> 31);
      f17000[3] = (boolean)((0 | -0) >>> 31);
      f17000[4] = (boolean)((1 | -1) >>> 31);
      boolean[] var134 = new boolean[7];
      f35000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f35000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f35000[2] = (boolean)((0 | -0) >>> 31);
      f35000[3] = (boolean)((0 | -0) >>> 31);
      f35000[4] = (boolean)((1 | -1) >>> 31);
      f35000[5] = (boolean)((1 | -1) >>> 31);
      f35000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var135 = new boolean[2];
      f34000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f34000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var136 = new boolean[3];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var137 = new boolean[6];
      f25000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f25000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f25000[2] = (boolean)((1 | -1) >>> 31);
      f25000[3] = (boolean)((0 | -0) >>> 31);
      f25000[4] = (boolean)((0 | -0) >>> 31);
      f25000[5] = (boolean)((1 | -1) >>> 31);
      boolean[] var138 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var139 = new boolean[6];
      f32000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f32000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f32000[2] = (boolean)((1 | -1) >>> 31);
      f32000[3] = (boolean)((1 | -1) >>> 31);
      f32000[4] = (boolean)((0 | -0) >>> 31);
      f32000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var140 = new boolean[3];
      f31000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f31000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f31000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static boolean m48000(DragOffset var0, Vector4f var1, float var2, float var3, float var4) {
      if (var1 == null) {
         return f6000[0];
      } else {
         float var5 = var1.y - f21000[0] - var4;
         float var6 = var1.y + var1.w + f21000[1];
         if (var5 < f21000[2]) {
            return f6000[1];
         } else if (var6 + var4 > DragOffset.m42000() - f21000[3]) {
            return f6000[2];
         } else {
            float var7 = var1.x + var2;
            return m32000(var0, var7, var5, var3, var4) && !m32000(var0, var7, var6, var3, var4) ? f6000[4] : f6000[3];
         }
      }
   }

   public static C0031 m52000(Iface0202 var0, DragOffset var1) {
      String var2 = var1.m52000();
      OlIrtqjti var3 = var0.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f37000[0]]);
      boolean var4 = var0.m2000(var2 + "HintTargeted", var1::m72000);
      Vector4f var5 = var1.m76000();
      Iface0212 var6 = var1.m18000().m2000();
      boolean var7 = var6 != null && var6.m10000() != null ? f33000[0] : f33000[1];
      float var8 = var7 ? var6.m18000().m10000() : (Float)f16000[f37000[1]];
      float var9 = var7 ? var6.m18000().m12000() : f9000[0];
      boolean var10 = var5 != null && var9 > f9000[1] && var5.x + var9 > DragOffset.m12000() - f26000[0] ? f33000[2] : f33000[3];
      float var11 = var10 ? var5.z - var9 : f26000[1];
      boolean var12 = m48000(var1, var5, var11, var9, var8);
      float var13 = var12 ? -(var8 + f26000[2]) : var5.w + f26000[3];
      C0056[] var14 = var4
         ? (var12 ? (C0056[])f13000[f37000[2]] : (C0056[])f13000[f37000[3]])
         : (var12 ? (C0056[])f13000[f37000[4]] : (C0056[])f13000[f37000[5]]);
      C0056[] var10000 = new C0056[f29000[0]];
      var10000[f33000[4]] = (C0056)f13000[f37000[6]];
      var10000[f33000[5]] = C0056.m130000().m66000(var11).m104000(var13);
      C0056 var15 = C0056.m120000(var10000);
      return C0287.m26000(var15, var4x -> {
         var4x.N(var2 + "Hints");
         var4x.N(var1.m18000());

         for (int var5x = f11000[1]; var5x < f39000[f20000[3]]; var5x++) {
            String var6x = var2 + "Hint" + var5x;
            String[] var7x = ((String[][])f39000[f20000[4]])[var5x];
            C0056 var8x = var14[var5x];
            var4x.N(var8x, var3xx -> {
               var3xx.N(var6x);
               var3xx.y(var3xxx -> ((C0296)var3xxx.N(var6x + "Key")).m2000(C1235.m36000(var7x[f11000[3]])).N(((rw.core.C0097)f13000[f20000[6]]).m8000(var3)));
               var3xx.y(var2xxx -> ((C0296)var2xxx.N(var6x + "Body")).m2000(" — " + C1235.m36000(var7x[f11000[2]])).N((C0056)f13000[f20000[5]]));
            });
         }
      });
   }

   private static void m54000() {
      byte[] var128 = new byte[2];
      f29000[(0 | -0) >>> 31] = 2;
      f29000[(1 | -1) >>> 31] = 2;
      byte[] var129 = new byte[2];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 2;
      byte[] var130 = new byte[3];
      f1000[(0 | -0) >>> 31] = 12;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 2;
      byte[] var131 = new byte[3];
      f22000[(0 | -0) >>> 31] = 2;
      f22000[(1 | -1) >>> 31] = 2;
      f22000[2] = 2;
      byte[] var132 = new byte[5];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 3;
      f5000[2] = 4;
      f5000[3] = 5;
      f5000[4] = 6;
      byte[] var133 = new byte[3];
      f24000[(0 | -0) >>> 31] = 2;
      f24000[(1 | -1) >>> 31] = 12;
      f24000[2] = 3;
      byte[] var134 = new byte[2];
      f18000[(0 | -0) >>> 31] = 7;
      f18000[(1 | -1) >>> 31] = 6;
      byte[] var135 = new byte[6];
      f38000[(0 | -0) >>> 31] = 2;
      f38000[(1 | -1) >>> 31] = 12;
      f38000[2] = 3;
      f38000[3] = 4;
      f38000[4] = 5;
      f38000[5] = 2;
      byte[] var136 = new byte[5];
      f4000[(0 | -0) >>> 31] = 5;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = 4;
      f4000[4] = 8;
   }
}
