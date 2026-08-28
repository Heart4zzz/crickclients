package rw.core;

import rw.api.Iface0202;
import rw.data.Rec0261;
import rw.defs.Enum0026;
import rw.defs.OlmmOsl;
import rw.setting.C0031;

public class C0092 {
   private static boolean[] f1000;
   private static int[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static float[] f8000;
   private static boolean[] f9000;
   private static byte[] f10000;
   public static Object[] f11000;
   private static byte[] f12000;
   private static boolean[] f13000;
   private static boolean[] f14000;

   private static void m2000() {
      f14000 = new boolean[]{true, false, false, true};
      f13000 = new boolean[]{false, true, false};
      f6000 = new boolean[]{true, false, false, false};
      f1000 = new boolean[]{true, false};
      f9000 = new boolean[]{true, true, false, false, false, true, true};
   }

   private C0092() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f8000 = new float[]{76.0F, 12.0F, 1.0F, 229.0F, 50.0F, 20.0F};
      f3000 = new float[]{20.0F, 12.0F, 0.0F, 0.0F, 1.0F, 24.0F, 24.0F};
   }

   private static void m10000() {
      f2000 = new int[]{14606046, 10205439, 4362239};
   }

   private static void m14000() {
      f12000 = new byte[]{3, 2, 20};
      f4000 = new byte[]{3, 2, 3};
      f10000 = new byte[]{2, 2, 2, 2, 3, 4, 5, 6};
   }

   private C0031 m18000(Rec0261 var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f7000[0]]);
      boolean var4 = var1.m10000() == var1.m8000().m2000() ? f14000[0] : f14000[1];
      rw.setting.C0056 var5 = rw.setting.C0056.m130000().m40000(var4 ? var3.m6000() : C0876.m2000(f2000[0], f8000[0]));
      return C0287.m26000(var4 ? ((C0097)f11000[f7000[1]]).m8000(var3) : (rw.setting.C0056)f11000[f7000[2]], var2x -> {
         var2x.N("tab" + var1.m10000().name());
         var2x.N(Enum0026.f2000, Base0315::m6000);
         var2x.N(var1xx -> var1.m8000().m6000(var1.m10000()));
         var2x.L(var2xx -> {
            C0286 var10000 = ((C0286)((C0286)var2xx).N("texture" + var1.m6000())).m2000("icon:menu/" + var1.m6000());
            rw.setting.C0056[] var10001 = new rw.setting.C0056[f4000[0]];
            var10001[f13000[0]] = var5;
            var10001[f13000[1]] = (rw.setting.C0056)f11000[f5000[1]];
            var10001[f4000[1]] = (rw.setting.C0056)f11000[f5000[2]];
            var10000.N(rw.setting.C0056.m120000(var10001));
         });
         var2x.y(var2xx -> {
            C0296 var10000 = ((C0296)((C0296)var2xx).N("text" + var1.m10000().name())).m2000(C1235.m36000(var1.m2000()));
            rw.setting.C0056[] var10001 = new rw.setting.C0056[f12000[0]];
            var10001[f14000[2]] = var5;
            var10001[f14000[3]] = (rw.setting.C0056)f11000[f7000[3]];
            var10001[f12000[1]] = rw.setting.C0017.m22000(f12000[2], (OlmmOsl)OlmmOsl.f7000[f5000[0]]);
            var10000.N(rw.setting.C0056.m120000(var10001));
         });
      });
   }

   private static void m32000() {
      f7000 = new short[]{6, 4, 3, 2};
      f5000 = new short[]{3, 2, 5, 3, 1};
   }

   private static void m34000() {
      f11000 = new Object[]{null, null, null, null, null, null};
   }
}
