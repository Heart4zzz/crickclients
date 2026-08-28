package rw.core;

final class C0313 {
   private C0313() {
   }

   static String m2000(String var0, String var1) {
      if (var0 != null && !var0.isBlank()) {
         return var0.trim();
      } else {
         throw new IllegalArgumentException(var1 + " must not be blank");
      }
   }
}
