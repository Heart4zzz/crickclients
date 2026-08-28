package rw.core;

import rw.data.Rec0096;
import rw.data.Rec0118;
import rw.defs.Enum0047;
import rw.gui.C0019;

final class C0331 {
   private final C0377 f1000;

   private static boolean m2000(C0019 var0) {
      return C0248.m24000(var0.m96000());
   }

   C0331(C0377 var1) {
      this.f1000 = var1;
   }

   static boolean m4000(C0019 var0) {
      return var0.m26000() > 0.01F && var0.m84000() > 0.001F && C0248.m24000(var0.m56000());
   }

   static boolean m6000(C0019 var0) {
      return var0.m110000() > 0.01F && var0.m84000() > 0.001F;
   }

   private static boolean m8000(rw.setting.C0059 var0, Rec0118 var1) {
      if (var0.m42000().m18000() <= 0.0F || var0.m42000().m20000() <= 0.0F) {
         return false;
      } else if (var0.m120000() == Enum0047.f4000) {
         return !var0.m32000().isEmpty();
      } else if (var0.m120000() == Enum0047.f3000) {
         return !var1.m6000().L().isEmpty();
      } else {
         return var0.m120000() == Enum0047.f5000 ? !var0.m100000().isEmpty() : false;
      }
   }

   private static boolean m10000(rw.setting.C0059 var0) {
      return var0.m120000() == Enum0047.f2000 && var0.m94000() != null && var0.m42000().m48000() > 0.0F && var0.m42000().m22000() > 0.0F;
   }

   boolean m12000(rw.setting.C0059 var1, C0019 var2, Rec0096 var3, Rec0118 var4) {
      if (var1.m120000() != Enum0047.f2000) {
         if (m6000(var2)) {
            return true;
         } else if (m4000(var2)) {
            return true;
         } else if (m2000(var2)) {
            return true;
         } else if (var2.m92000() > 0.0F && C0248.m24000(var2.m58000())) {
            return true;
         } else if (m8000(var1, var4)) {
            return true;
         } else {
            return var4.m4000() ? true : this.f1000.m6000(var1, var2, var3);
         }
      } else {
         return m6000(var2) || m10000(var1);
      }
   }
}
