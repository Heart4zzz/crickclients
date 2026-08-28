package rw.core;

import java.util.List;
import rw.api.Iface0213;
import rw.api.Iface0216;
import rw.setting.Rec0045;
import rw.setting.Rec0046;
import rw.setting.Rec0047;
import rw.setting.Rec0048;
import rw.setting.Rec0050;
import rw.setting.Rec0051;

public final class C0340 {
   private C0340() {
   }

   public static void m2000(List<Iface0216> var0, Iface0213 var1) {
      int var2 = 0;

      for (int var3 = var0.size(); var2 < var3; var2++) {
         m4000((Iface0216)var0.get(var2), var1);
      }
   }

   private static void m4000(Iface0216 var0, Iface0213 var1) {
      switch (var0) {
         case Rec0047 var4:
            var1.m16000(var4.m4000());
            break;
         case Rec0048 var5:
            var1.m14000(var5.m16000(), var5.m12000(), var5.m2000(), var5.m10000(), var5.m8000(), var5.m18000());
            m2000(var5.m4000(), var1);
            var1.m22000();
            break;
         case Rec0046 var6:
            var1.m18000(var6.m12000(), var6.m10000(), var6.m2000(), var6.m8000());
            m2000(var6.m6000(), var1);
            var1.m2000();
            break;
         case Rec0051 var7:
            var1.m20000(var7.m6000());
            m2000(var7.m4000(), var1);
            var1.m6000();
            break;
         case Rec0050 var8:
            if (var1.m12000(var8.m8000(), var8.m6000())) {
               m2000(var8.m2000(), var1);
               var1.m8000(var8.m6000());
            }
            break;
         case Rec0045 var9:
            var1.m10000(var9.m6000());
            m2000(var9.m4000(), var1);
            var1.m4000();
            break;
         default:
            throw new MatchException(null, null);
      }
   }
}
