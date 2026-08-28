package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0656;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C0288;
import rw.core.C1161;
import rw.setting.C0031;
import rw.setting.C0056;

public record Rec0276() implements Iface0656 {
   public NQo f1000;
   public static Object[] f2000;
   private static float[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;

   private static void m2000() {
      f2000 = new Object[f5000[(1 | -1) >>> 31]];
      f2000[f6000[3]] = Integer.valueOf(f5000[2]);
   }

   public Rec0276(NQo var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0276,"stack",Rec0276::f1000>(this, var1);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[4];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
   }

   private static void m14000() {
      float[] var128 = new float[2];
      f3000[(0 | -0) >>> 31] = Float.intBitsToFloat(1098907648);
      f3000[(1 | -1) >>> 31] = Float.intBitsToFloat(1098907648);
   }

   private static void m18000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
   }

   public NQo m20000() {
      return this.f1000;
   }

   public C0031 m24000(Iface0202 var1, C1161 var2) {
      String var3 = "notify-item-" + var2.m56000();
      Oljjtpnom var4 = NursultanClient.m66000().m70000(this.f1000);
      if (!var4.m4000()) {
         return C0287.m24000(var1x -> ((C0288)var1x.N(var3)).N((C0056)f2000[f4000[1]]));
      } else {
         C0056[] var10000 = new C0056[f5000[0]];
         var10000[f6000[0]] = (C0056)f2000[f4000[0]];
         var10000[f6000[1]] = C0056.m130000().m114000(var4.m22000(), var4.m28000(), var4.m30000(), var4.m14000());
         C0056 var5 = C0056.m120000(var10000);
         return ((C0286)((C0286)C0287.m10000(NursultanClient.m66000().m42000()).N(var3)).N(var5)).m2000();
      }
   }

   private static void m28000() {
      byte[] var128 = new byte[3];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 16;
   }
}
