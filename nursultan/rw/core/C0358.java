package rw.core;

import java.util.ArrayList;
import java.util.List;

public final class C0358 {
   private C0358() {
   }

   public static List<C0368> m2000(List<C0368> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var1 = new ArrayList(var0.size());

         for (C0368 var3 : var0) {
            if (var3 != null && !m4000(var1, var3)) {
               var1.add(var3);
            }
         }

         return var1.isEmpty() ? List.of() : List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   public static boolean m4000(List<C0368> var0, C0368 var1) {
      for (C0368 var3 : var0) {
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }
}
