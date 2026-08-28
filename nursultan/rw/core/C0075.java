package rw.core;

import java.util.ArrayList;
import java.util.stream.Collectors;
import rw.NursultanClient;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.data.Rec0035;
import rw.defs.Enum0065;
import rw.setting.C0031;

public class C0075 {
   public static Object[] f1000;
   private static short[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((1 | -1) >>> 31);
   }

   private C0075() {
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "presetsRevision";
   }

   private static void m14000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m16000() {
      f1000 = new Object[f4000[5]];
   }

   private C0031 m20000(Void var1, Iface0202 var2) {
      var2.m2000(f3000[0], NursultanClient.m116000()::m62000);
      ArrayList var3 = new ArrayList();

      for (OlsmIikp var5 : NursultanClient.m116000().m8000()) {
         if (var5.m8000() != (Enum0065)Enum0065.f2000[f2000[0]]) {
            var3.add(var5);
         }
      }

      var3.sort((var0, var1x) -> Long.compare(var1x.m14000(), var0.m14000()));
      rw.setting.C0004.m138000(var3.stream().map(OlsmIikp::m32000).collect(Collectors.toSet()));
      return C0287.m26000(
         (rw.setting.C0056)C0083.f2000[f2000[1]],
         var2x -> var2x.N(
            (rw.setting.C0056)C0083.f2000[f2000[2]],
            var2xx -> {
               for (int var3x = f4000[0]; var3x < var3.size(); var3x++) {
                  OlsmIikp var4 = (OlsmIikp)var3.get(var3x);
                  var2xx.y(
                     var2.m18000(
                        "preset:" + var4.m32000(),
                        (Iface0197<Rec0035>)rw.setting.C0004.f13000[f2000[3]],
                        new Rec0035(var4, var3x == var3.size() - f4000[1] ? f4000[2] : f4000[3])
                     )
                  );
               }
            }
         )
      );
   }
}
