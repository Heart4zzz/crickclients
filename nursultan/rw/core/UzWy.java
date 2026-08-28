package rw.core;

import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0279;
import rw.setting.C0031;
import rw.setting.EyEa;

public class UzWy {
   private static String[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static float[] f5000;
   private static byte[] f6000;

   private static void m2000() {
      float[] var128 = new float[4];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1103101952);
      f5000[(1 | -1) >>> 31] = Float.intBitsToFloat(1103101952);
      f5000[2] = Float.intBitsToFloat(1065353216);
      f5000[3] = Float.intBitsToFloat(1176255488);
   }

   private UzWy() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[3];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 2;
   }

   private static void m12000() {
      f4000 = new Object[f6000[2]];
   }

   private static void m16000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "colorPickerModal";
   }

   private C0031 m24000(Rec0279 var1, Iface0202 var2) {
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f6000[0]];
      var10000[f2000[0]] = (rw.setting.C0056)f4000[f3000[0]];
      var10000[f2000[1]] = rw.setting.C0056.m130000().m86000(var1.m10000());
      return C0287.m26000(rw.setting.C0056.m120000(var10000), var2x -> {
         var2x.N(var1xx -> var1.m12000().m6000(f2000[2]));
         var2x.y(var2.m18000(f1000[0], (Iface0197<Rec0279>)EyEa.f13000[f3000[1]], var1));
      });
   }

   private static void m28000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m32000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
   }
}
