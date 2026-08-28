package rw.core;

import java.util.Objects;
import rw.setting.C0031;

final class C0295 {
   private C0295() {
   }

   private static String m2000(rw.setting.C0059 var0) {
      return var0 == null ? null : m10000(var0.m154000());
   }

   private static String m4000(C0031 var0) {
      return var0 == null ? null : m10000(var0.m30000());
   }

   private static boolean m6000(String var0) {
      return var0 != null && !var0.isBlank();
   }

   static boolean m8000(rw.setting.C0059 var0, C0031 var1) {
      return var0 != null && var1 != null && var0.m120000() == var1.m20000() ? Objects.equals(m2000(var0), m4000(var1)) : false;
   }

   private static String m10000(String var0) {
      return m6000(var0) ? var0 : null;
   }

   static String m12000(rw.setting.C0059 var0) {
      return var0 == null ? null : m2000(var0);
   }

   static String m14000(C0031 var0) {
      return var0 == null ? null : m4000(var0);
   }
}
