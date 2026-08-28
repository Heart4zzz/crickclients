package rw.core;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import rw.NursultanClient;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0248;
import rw.setting.C0031;

public class C0080 {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static String[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
   }

   private C0080() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[3];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = (short)((1 | -1) >>> 31);
   }

   private static void m14000() {
      f1000 = new Object[f2000[3]];
   }

   private static void m16000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "accountsRevision";
   }

   private C0031 m24000(Void var1, Iface0202 var2) {
      C0690 var3 = NursultanClient.m48000();
      var2.m2000(f4000[0], var3::m30000);
      List var4 = var3.m16000()
         .stream()
         .sorted(
            Comparator.<Noqodls>comparingInt(var0 -> var0.m24000() ? f2000[0] : f2000[1]).thenComparing(Comparator.comparingLong(Noqodls::m6000).reversed())
         )
         .toList();
      rw.setting.C0150.m134000(var4.stream().map(Noqodls::m38000).collect(Collectors.toSet()));
      return C0287.m26000((rw.setting.C0056)C0083.f2000[f3000[0]], var2x -> var2x.N((rw.setting.C0056)C0083.f2000[f3000[1]], var2xx -> {
         for (Noqodls var4x : var4) {
            var2xx.y(var2.m18000("account:" + var4x.m38000(), (Iface0197<Rec0248>)rw.setting.C0150.f64000[f3000[2]], new Rec0248(var4x)));
         }
      }));
   }
}
