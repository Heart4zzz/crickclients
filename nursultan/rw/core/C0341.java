package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.api.Iface0216;
import rw.data.Rec0120;
import rw.defs.Enum0012;
import rw.setting.Rec0047;

final class C0341 {
   private static void m2000(rw.setting.C0059 var0, List<Iface0216> var1, float var2, float var3) {
      float var4 = var0.m42000().m58000() + var2;
      float var5 = var0.m42000().m8000() + var3;
      float var6 = var0.m42000().m48000();
      float var7 = var0.m42000().m22000();
      if (!(var6 <= 1.0F) && !(var7 <= 1.0F)) {
         int var8 = m4000(var0.m154000());
         m6000(var1, var4, var5, var6, var7, var8);
      }
   }

   private static int m4000(String var0) {
      int var1 = var0 == null ? 0 : var0.hashCode();
      int var2 = 64 + (var1 >>> 16 & 127);
      int var3 = 64 + (var1 >>> 8 & 127);
      int var4 = 64 + (var1 & 127);
      return 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   private static void m6000(List<Iface0216> var0, float var1, float var2, float var3, float var4, int var5) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         float var6 = Math.min(2.0F, Math.min(var3, var4));
         var0.add(new Rec0047(new Rec0120(var1, var2, var3, var4, C0326.f1000, C0248.m16000(var5, Enum0012.f1000, 34), var5, var6, 0, 0.0F)));
      }
   }

   List<Iface0216> m8000(rw.setting.C0059 var1) {
      ArrayList var2 = new ArrayList();
      if (var1 != null) {
         m10000(var1, var2, 0.0F, 0.0F);
      }

      return var2;
   }

   private static void m10000(rw.setting.C0059 var0, List<Iface0216> var1, float var2, float var3) {
      float var4 = var2;
      float var5 = var3;
      m2000(var0, var1, var2, var3);
      float var6 = C0338.m20000(var0);

      for (rw.setting.C0059 var8 : C0404.m6000(var0)) {
         if (C0385.m6000(var8)) {
            m10000(var8, var1, 0.0F, 0.0F);
         } else {
            float var9 = var5;
            if (var6 > 0.0F && C0385.m4000(var8)) {
               var9 = var5 - var6;
            }

            m10000(var8, var1, var4, var9);
         }
      }
   }
}
