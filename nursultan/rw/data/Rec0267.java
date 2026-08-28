package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.NursultanClient;
import rw.api.Iface0202;
import rw.api.Iface0657;
import rw.core.C0077;
import rw.core.C0287;
import rw.core.C0296;
import rw.core.C0876;
import rw.core.C1161;
import rw.core.C1169;
import rw.defs.OlmmOsl;
import rw.setting.C0031;
import rw.setting.C0056;

public record Rec0267() implements Iface0657 {
   private static boolean[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static byte[] f5000;
   private static long[] f6000;
   public String f7000;
   private static float[] f8000;
   public static Object[] f9000;
   private static boolean[] f10000;

   private static void m2000() {
      f3000 = new byte[]{2, 2, 2, 2, 14, 3, 3};
      f5000 = new byte[]{4, 5, 6, 14};
   }

   private static void m6000() {
      f9000 = new Object[]{14, 14.0F, null, null, null, null};
   }

   public Rec0267(String var1) {
      this.f7000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0267,"text",Rec0267::f7000>(this, var1);
   }

   private static void m10000() {
      f1000 = new boolean[]{false, true, false, true, false, false};
      f10000 = new boolean[]{true, false, true};
   }

   private static void m14000() {
      f6000 = new long[]{180L};
   }

   private static void m18000() {
      f8000 = new float[]{14.0F, 1.0F, -14.0F, 14.0F};
      f4000 = new float[]{1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 14.0F};
   }

   public String m22000() {
      return this.f7000;
   }

   public C0031 m32000(Iface0202 var1, C1161 var2) {
      String var3 = "notifyText-" + var2.m56000();
      C1169 var4 = var1.m4000(var3 + "-slide", C1169::new);
      var4.m30000(this.f7000);
      float var5 = var4.m12000();
      boolean var6 = var4.m6000();
      return C0287.m26000((C0056)f9000[f2000[0]], var5x -> {
         var5x.N(var3 + "-clip");
         if (var6) {
            C0056[] var10000 = new C0056[f3000[1]];
            var10000[f1000[2]] = (C0056)f9000[f2000[5]];
            var10000[f1000[3]] = C0056.m130000().m56000(f8000[2] * var5);
            C0056 var6x = C0056.m120000(var10000);
            var5x.N(var6x, var3xx -> {
               var3xx.N(var3 + "-old");
               var3xx.y(var3xxx -> ((C0296)var3xxx.N(var3 + "-oldText")).m2000(var4.m18000()).N(m42000(f4000[2] - var5)));
            });
         }

         C0056 var7 = var6 ? C0056.m130000().m56000(f8000[3] * (f4000[0] - var5)) : C0056.m130000();
         var5x.N(var7, var4xx -> {
            var4xx.N(var3 + "-current");
            var4xx.y(var4xxx -> ((C0296)var4xxx.N(var3 + "-currentText")).m2000(this.f7000).N(m42000(var6 ? var5 : f4000[1])));
         });
      });
   }

   public float m38000() {
      return NursultanClient.m42000().m80000(this.f7000, f8000[0], (OlmmOsl)OlmmOsl.f7000[f2000[1]]);
   }

   private static C0056 m42000(float var0) {
      if (var0 >= f8000[1]) {
         return (C0056)f9000[f2000[2]];
      } else {
         C0056[] var10000 = new C0056[f3000[0]];
         var10000[f1000[0]] = (C0056)f9000[f2000[3]];
         var10000[f1000[1]] = C0056.m130000().m40000(C0876.m30000((Integer)C0077.f1000[f2000[4]], var0));
         return C0056.m120000(var10000);
      }
   }

   private static void m46000() {
      f2000 = new short[]{4, 3, 3, 3, 0, 5};
   }
}
