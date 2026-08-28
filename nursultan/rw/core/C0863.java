package rw.core;

import KDFzREm.NQo;
import java.util.Optional;
import rw.NursultanClient;

public class C0863 {
   private static String[] f1000;

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new String[]{"^[\\s\\S]{3,16}$"};
   }

   public Optional<rw.setting.C0156> m6000(NQo var1, String var2, long var3) {
      if (!var2.matches(f1000[0])) {
         return Optional.empty();
      } else {
         for (rw.setting.C0156 var6 : NursultanClient.m52000().m76000().values()) {
            if (var6.m6000()
               && !((float)var3 / var1.c() > (float)Long.parseLong(var6.m24000().m4000()))
               && var1.c() >= var6.m66000()
               && !(C1193.m10000(var1) < var6.m74000())
               && var6.m62000(var1)) {
               return Optional.of(var6);
            }
         }

         return Optional.empty();
      }
   }
}
