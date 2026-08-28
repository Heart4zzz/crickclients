package rw.core;

import rw.api.Iface0192;
import rw.data.Rec0125;
import rw.setting.Rec0057;

public class C1126 {
   private static short[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   private static boolean[] f5000;
   public static Object[] f6000;
   private static boolean[] f7000;
   private static byte[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   private static byte[] f11000;
   public static Object[] f12000;
   private static byte[] f13000;
   private static boolean[] f14000;
   private static float[] f15000;
   private static byte[] f16000;
   private static boolean[] f17000;
   public static Object[] f18000;
   private static float[] f19000;
   private static boolean[] f20000;
   private static byte[] f21000;
   private static boolean[] f22000;
   private static byte[] f23000;

   private static void m2000() {
      f6000 = new Object[]{4, 10, 1, 12, 10};
      f12000 = new Object[]{32, null, null};
      f18000 = new Object[]{null, null, null, null, null, null};
   }

   private C1126() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f19000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f10000 = new float[]{0.0F, 0.0F, 0.0F, 4.0F, 10.0F, 1.0F, 12.0F};
      f15000 = new float[]{100.0F, 0.0F};
      f2000 = new float[]{32.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m10000() {
      f11000 = new byte[]{2, 2, 5, 4, 3, 2};
      f4000 = new byte[]{2, 2, 2};
      f13000 = new byte[]{2, 2, 2, 2, 3, 2, 2, 4};
      f8000 = new byte[]{2, 2, 5};
      f21000 = new byte[]{5, 4};
      f23000 = new byte[]{10, 2, 3, 12, 4, 10};
      f16000 = new byte[]{3, 32, 6};
   }

   private static void m18000() {
      f1000 = new short[]{3, 4, 1, 2};
   }

   public static rw.setting.C0056 m22000(boolean var0, boolean var1) {
      if (var1) {
         return var0 ? (rw.setting.C0056)f18000[f1000[0]] : (rw.setting.C0056)f18000[f1000[1]];
      } else {
         return var0 ? (rw.setting.C0056)f18000[f1000[2]] : (rw.setting.C0056)f18000[f1000[3]];
      }
   }

   public static rw.setting.C0056 m24000(rw.setting.C0056 var0, float var1, float var2) {
      float var3 = Math.max(var2, (float)Math.ceil(var1));
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f11000[1]];
      var10000[f3000[4]] = var0;
      var10000[f3000[5]] = rw.setting.C0056.m130000().m178000(Rec0125.m24000(var3));
      return rw.setting.C0056.m120000(var10000);
   }

   public static rw.setting.C0056 m28000(rw.setting.C0056 var0, float var1, float var2, Iface0192 var3) {
      rw.setting.C0056[] var10000 = new rw.setting.C0056[f11000[0]];
      var10000[f3000[0]] = m24000(var0, var1, var2);
      byte var10002 = f3000[1];
      rw.setting.C0056 var10003 = rw.setting.C0056.m130000();
      Rec0057[] var10004 = new Rec0057[f3000[2]];
      var10004[f3000[3]] = Rec0057.m32000(var3);
      var10000[var10002] = var10003.m186000(C0258.m10000(var10004));
      return rw.setting.C0056.m120000(var10000);
   }

   private static void m30000() {
      f3000 = new boolean[]{false, true, true, false, false, true, true, true};
      f7000 = new boolean[]{false, false};
      f20000 = new boolean[]{true, false, false};
      f9000 = new boolean[]{false, false, true, true};
      f17000 = new boolean[]{false, true};
      f22000 = new boolean[]{false, true, true};
      f14000 = new boolean[]{false, false};
      f5000 = new boolean[]{true, false, false, true, false, true, true, false};
   }
}
