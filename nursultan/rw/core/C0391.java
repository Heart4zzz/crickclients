package rw.core;

final class C0391 {
   private C0391() {
   }

   static String m2000(String var0) {
      return var0 != null && !var0.isEmpty() ? var0.replace("\r\n", " ").replace('\r', ' ').replace('\n', ' ') : "";
   }

   static String m4000(String var0, int var1, int var2, String var3) {
      String var4 = var0 == null ? "" : var0;
      int var5 = C0414.m12000(var4, var1, var2);
      int var6 = C0414.m8000(var4, var1, var2);
      String var7 = var3 == null ? "" : var3;
      return var4.substring(0, var5) + var7 + var4.substring(var6);
   }
}
