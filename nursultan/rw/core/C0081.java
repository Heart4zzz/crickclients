package rw.core;

import rw.api.Iface0202;
import rw.data.Rec0282;
import rw.setting.C0031;

public class C0081 {
   private static byte[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static int[] f7000;
   private static String[] f8000;
   private static byte[] f9000;

   private static void m2000() {
      f2000 = new float[]{100.0F, 66.0F, 14.0F, 12.0F, 40.0F, 40.0F, 20.0F, 2.0F};
      f5000 = new float[]{16.0F, 12.0F};
   }

   private static void m8000() {
      f6000 = new short[]{1, 2, 3, 4, 5};
   }

   private C0081() {
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f8000 = new String[]{"tab.till"};
   }

   private static void m16000() {
      f4000 = new boolean[]{false, true, false, true, false, true};
   }

   private static void m22000() {
      f3000 = new Object[]{null, null, null, null, null, null};
   }

   private C0031 m24000(Rec0282 var1, Iface0202 var2) {
      return C0287.m26000((rw.setting.C0056)f3000[f6000[0]], var1x -> {
         Object[] var10001 = new Object[f1000[0]];
         var10001[f4000[0]] = C0287.m12000(var1.m12000(), (rw.setting.C0056)f3000[f6000[1]]);
         var10001[f4000[1]] = C0287.m26000((rw.setting.C0056)f3000[f6000[2]], var1xx -> {
            Object[] var10001x = new Object[f1000[1]];
            var10001x[f4000[2]] = C0287.m30000(var1.m2000(), (rw.setting.C0056)f3000[f6000[3]]);
            var10001x[f4000[3]] = C0287.m30000(C1235.m36000(f8000[0]) + var1.m20000(), (rw.setting.C0056)f3000[f6000[4]]);
            var1xx.N(var10001x);
         });
         var1x.N(var10001);
      });
   }

   private static void m26000() {
      f7000 = new int[]{-855305, 1593835519};
   }

   private static void m36000() {
      f1000 = new byte[]{2, 2};
      f9000 = new byte[]{2, 3, 4, 4, 3, 5, 6};
   }
}
