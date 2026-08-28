package rw.setting;

import rw.NursultanClient;
import rw.api.Iface0196;
import rw.api.Iface0202;
import rw.core.C0287;
import rw.core.C0318;
import rw.core.C0899;
import rw.core.C1231;
import rw.data.Rec0270;
import rw.defs.Enum0026;
import rw.gui.PgUp;

public class C0134 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   private static int[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static byte[] f8000;
   public static Object[] f9000;

   private static void m4000() {
      short[] var128 = new short[3];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = 5;
      f7000[2] = 4;
   }

   private static void m8000() {
      f9000 = new Object[f8000[2]];
      f9000[f1000[7]] = f3000[3];
      f9000[f8000[3]] = f3000[4];
   }

   private C0134() {
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((1 | -1) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      f1000[7] = (boolean)((1 | -1) >>> 31);
   }

   private static void m18000() {
      float[] var128 = new float[7];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(1117782016);
      f2000[(1 | -1) >>> 31] = Float.intBitsToFloat(1124204544);
      f2000[2] = Float.intBitsToFloat(1106247680);
      f2000[3] = Float.intBitsToFloat(1092616192);
      f2000[4] = Float.intBitsToFloat(1092616192);
      f2000[5] = Float.intBitsToFloat(1065353216);
      f2000[6] = Float.intBitsToFloat(1090519040);
   }

   private static void m24000() {
      f3000 = new String[5];
      f3000[(0 | -0) >>> 31] = "listener";
      f3000[(1 | -1) >>> 31] = "—";
      f3000[2] = "...";
      f3000[3] = "—";
      f3000[4] = "...";
   }

   private static void m30000(Iface0196<C0899> var0, Iface0196<Boolean> var1) {
      C0899 var2 = (C0899)var0.m2000();
      if (var2 != null) {
         NursultanClient.m8000().m66000(var2);
         var0.m6000(null);
         var1.m6000(f4000[1]);
      }
   }

   private static void m32000(Rec0270 var0, Iface0196<C0899> var1) {
      m30000(var1, var0.m6000());
      C0899 var2 = new C0899((var2x, var3) -> {
         var0.m10000().accept(var2x, var3);
         m30000(var1, var0.m6000());
      });
      var1.m6000(var2);
      NursultanClient.m8000().m32000(var2);
      var0.m6000().m6000(f4000[0]);
   }

   private static void m38000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = -7171438;
   }

   private static String m40000(PgUp var0, int var1) {
      return var0 != null && !var0.m80000() ? C1231.m32000(var0, var1) : f3000[1];
   }

   private C0031 m50000(Rec0270 var1, Iface0202 var2) {
      Iface0196 var3 = var2.m20000(f3000[0], (C0899)null);
      return C0287.m26000((C0056)f9000[f7000[0]], var2x -> {
         boolean var3x = var1.m6000().m2000();
         var2x.N(var3x ? f3000[2] : m40000(var1.m8000(), var1.m2000()), var3x ? (C0056)f9000[f7000[1]] : (C0056)f9000[f7000[2]]);
         var2x.N(Enum0026.f2000, var2xx -> {
            C0318 var3xx = (C0318)var2xx;
            if (var3xx.m2000() == 0 && var3.m2000() == null) {
               m32000(var1, var3);
            }
         });
         var2x.N(Enum0026.f11000, var2xx -> m32000(var1, var3));
      });
   }

   private static void m52000() {
      byte[] var128 = new byte[6];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 14;
      f6000[3] = 3;
      f6000[4] = 4;
      f6000[5] = 2;
      byte[] var129 = new byte[4];
      f8000[(0 | -0) >>> 31] = 4;
      f8000[(1 | -1) >>> 31] = 5;
      f8000[2] = 6;
      f8000[3] = 2;
   }
}
