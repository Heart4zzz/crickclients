package rw.core;

import rw.api.Iface0202;
import rw.api.Iface0212;
import rw.data.Rec0268;
import rw.defs.Enum0026;
import rw.setting.C0031;

public class C1065 {
   public static Object[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static float[] f4000;
   private static short[] f5000;

   private static void m2000() {
      short[] var128 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private C1065() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      float[] var128 = new float[5];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1125515264);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1106247680);
      f4000[2] = Float.intBitsToFloat(1065353216);
      f4000[3] = Float.intBitsToFloat(1090519040);
      f4000[4] = Float.intBitsToFloat(1090519040);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[8];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      f3000[6] = (boolean)((1 | -1) >>> 31);
      f3000[7] = (boolean)((1 | -1) >>> 31);
   }

   private static void m18000() {
      byte[] var128 = new byte[5];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = 14;
      f2000[3] = 3;
      f2000[4] = 2;
   }

   private C0031 m28000(Rec0268 var1, Iface0202 var2) {
      return ((C0300)((C0300)((C0300)((C0300)((C0300)C0287.m6000().N(var1.m8000())).m2000(var1.m6000()).N((rw.setting.C0056)f1000[f5000[0]]))
                  .m6000(C1235.m36000(var1.m8000()))
                  .N(Enum0026.f11000, var1x -> var1.m2000().m6000(f3000[1])))
               .N(Enum0026.f12000, var1x -> {
                  var1.m2000().m6000(f3000[0]);
                  Iface0212 var2x = var1x.m26000();
                  if (var1.m10000() != null && !var1.m10000().matcher(var2x.m12000()).matches()) {
                     var2x.m42000(var1.m6000());
                  }
               }))
            .N(Enum0026.f9000, var1x -> {
               C0310 var2x = (C0310)var1x;
               String var3 = var2x.m2000();
               if (var1.m10000() == null || var1.m10000().matcher(var3).matches()) {
                  var1.m12000().accept(var3);
               } else if (!var3.isEmpty()) {
                  var1x.m26000().m42000(var2x.m4000());
               }
            }))
         .m2000();
   }

   private static void m30000() {
      f1000 = new Object[f2000[4]];
   }
}
