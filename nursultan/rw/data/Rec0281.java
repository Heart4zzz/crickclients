package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0202;
import rw.api.Iface0656;
import rw.core.C0286;
import rw.core.C0287;
import rw.core.C1161;
import rw.setting.C0031;
import rw.setting.C0056;

public record Rec0281() implements Iface0656 {
   private static byte[] f1000;
   public static Object[] f2000;
   public String f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;

   private static void m4000() {
      f2000 = new Object[f1000[(0 | -0) >>> 31]];
      f2000[f6000[(1 | -1) >>> 31]] = Integer.valueOf(f1000[1]);
   }

   public Rec0281(String var1) {
      this.f3000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0281,"icon",Rec0281::f3000>(this, var1);
   }

   private static void m8000() {
      byte[] var128 = new byte[2];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 16;
   }

   private static void m12000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
   }

   private static void m16000() {
      boolean[] var128 = new boolean[2];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public String m20000() {
      return this.f3000;
   }

   public C0031 m24000(Iface0202 var1, C1161 var2) {
      String var3 = "notify-icon-" + var2.m56000();
      C0056 var4 = C0056.m130000().m78000(f4000[0], f4000[1]).m40000(var2.m14000().m2000());
      return C0287.m26000((C0056)f2000[f5000[0]], var3x -> {
         var3x.N(var3);
         var3x.L(var3xx -> ((C0286)var3xx.N(var3 + "-tex")).m2000(this.f3000).N(var4));
      });
   }

   private static void m30000() {
      float[] var128 = new float[2];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(1098907648);
      f4000[(1 | -1) >>> 31] = Float.intBitsToFloat(1098907648);
   }
}
