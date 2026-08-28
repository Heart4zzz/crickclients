package rw.setting;

import java.util.Comparator;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.core.C0865;
import rw.core.C0882;
import rw.core.C0959;
import rw.core.C1002;
import rw.core.OlsmIikp;
import rw.data.ConfigFiles;
import rw.defs.Enum0065;

public class C0107 {
   public static Object[] f1000;
   private static String[] f2000;
   private static long[] f3000;

   private static void m8000() {
      f1000 = new Object[]{null, f2000[3]};
   }

   private C0107() {
      throw new UnsupportedOperationException(I1pmOklmm<"ssvz",1073471824,1487847943,1487847953,1487847988,305393879>()[2]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new String[]{"auto-save selected preset failed", "default", "This is a utility class and cannot be instantiated", "default"};
   }

   private static OlsmIikp m18000() {
      byte[] var0 = C0865.m14000(NursultanClient.m88000().m152000());
      OlsmIikp var1 = new OlsmIikp(
         C0882.m16000(),
         0L,
         f2000[1],
         ((C0959)NursultanClient.f13000[2]).m20000(),
         System.currentTimeMillis(),
         0L,
         0L,
         (Enum0065)Enum0065.f2000[2],
         1,
         true,
         var0
      );
      NursultanClient.m116000().m54000(var1);
      NursultanClient.m30000().m38000(var1);
      return var1;
   }

   public static void m26000() {
      C1002 var0 = NursultanClient.m10000().m62000(C1002.class);
      C0108 var1 = NursultanClient.m116000();
      UUID var2 = var0.m4000();
      if (var2 == null || !var1.m66000(var2).isPresent()) {
         OlsmIikp var3 = var1.m8000()
            .stream()
            .filter(var0x -> (boolean)(var0x.m8000() != (Enum0065)Enum0065.f2000[3] ? 1 : 0))
            .max(Comparator.comparingLong(OlsmIikp::m14000))
            .orElse(null);
         if (var3 == null) {
            var3 = m18000();
         }

         var0.m6000(var3.m32000());
         ConfigFiles.m54000(C1002.class);
      }
   }

   public static void m34000() {
      if (NursultanClient.m26000().m60000()) {
         C1002 var0 = NursultanClient.m10000().m62000(C1002.class);
         UUID var1 = var0.m4000();
         if (var1 != null) {
            OlsmIikp var2 = NursultanClient.m116000().m66000(var1).orElse(null);
            if (var2 != null) {
               try {
                  byte[] var3 = C0865.m14000(NursultanClient.m88000().m152000());
                  var2.m60000(var3);
                  var2.m52000((boolean)1);
                  var2.m54000(1);
                  var2.m58000(System.currentTimeMillis());
                  if (var2.m8000() == (Enum0065)Enum0065.f2000[0]) {
                     var2.m48000((Enum0065)Enum0065.f2000[1]);
                  }

                  NursultanClient.m116000().m54000(var2);
               } catch (Exception var4) {
                  ((Logger)f1000[0]).error(f2000[0], var4);
               }
            }
         }
      }
   }

   private static void m42000() {
      f3000 = new long[]{0L, 0L, 0L};
   }
}
