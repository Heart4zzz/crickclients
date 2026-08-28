package rw.core;

import rw.api.Iface0202;
import rw.data.IlpimlpIt;
import rw.setting.C0031;

public class C1059 {
   private static boolean[] f1000;
   private static float[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static int[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   public static Object[] f11000;
   private static short[] f12000;

   private static void m2000() {
      f12000 = new short[]{6, 2, 4, 5, 3, 6, 7};
   }

   private C1059() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f11000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private static void m10000() {
      f8000 = new float[]{22.0F, 500.0F, 34.0F, 1.0F, 0.5F, 2.0F, 0.008333334F, 52.0F};
      f10000 = new float[]{24.0F, 9999.0F, 1.0F, 28.0F};
      f2000 = new float[]{20.0F, 2.0F, 2.0F, 5.0F, 0.15F, 9999.0F};
   }

   private static void m16000() {
      f1000 = new boolean[]{false, true};
      f7000 = new boolean[]{false, true, true, false, false, true, false};
      f9000 = new boolean[]{true, true, true, false, true, true, true};
      f4000 = new boolean[]{false, true};
   }

   private C0031 m22000(IlpimlpIt var1, Iface0202 var2) {
      OlIrtqjti var3 = var2.m28000((C0297<OlIrtqjti>)OlIrtqjti.f4000[f12000[0]]);
      boolean var4 = var1.m6000();
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f5000[0]];
      var10000[f1000[0]] = (rw.setting.C0056)f11000[f12000[1]];
      var10000[f1000[1]] = var4 ? ((C0097)f11000[f12000[2]]).m8000(var3) : (rw.setting.C0056)f11000[f12000[3]];
      rw.setting.C0056 var5 = rw.setting.C0056.m120000(var10000);
      var10000 = new rw.setting.C0056[f5000[1]];
      var10000[f7000[0]] = (rw.setting.C0056)f11000[f12000[4]];
      var10000[f7000[1]] = var4 ? ((C0097)f11000[f12000[5]]).m8000(var3) : (rw.setting.C0056)f11000[f12000[6]];
      rw.setting.C0056 var6 = rw.setting.C0056.m120000(var10000);
      return C0287.m26000(var5, var3x -> {
         var3x.N(var2xx -> var1.m4000().accept(!var4 ? f7000[2] : f7000[3]));
         var3x.y(var6);
      });
   }

   private static void m24000() {
      f5000 = new byte[]{2, 2, 2, 2, 2, 3};
      f3000 = new byte[]{4, 5, 6, 7, 8};
   }

   private static void m32000() {
      f6000 = new int[]{-16777216, -14869219};
   }
}
