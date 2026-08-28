package rw.setting;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import rw.api.Iface0204;
import rw.data.Rec0098;

final class C0043 {
   private final Map<Iface0204, Runnable> f1000 = new IdentityHashMap<>();

   private C0043() {
   }

   void m4000(Iface0204 var1) {
      if (var1 != null) {
         this.f1000.remove(var1);
      }
   }

   Rec0098 m6000(float var1) {
      if (!(var1 <= 0.0F) && !this.f1000.isEmpty()) {
         boolean var2 = false;

         for (Entry var4 : this.f1000.entrySet()) {
            Iface0204 var5 = (Iface0204)var4.getKey();
            if (var5.m2000()) {
               var2 = true;
               if (var5.m4000(var1)) {
                  ((Runnable)var4.getValue()).run();
               }
            }
         }

         return var2 ? Rec0098.f3000 : Rec0098.f2000;
      } else {
         return Rec0098.f2000;
      }
   }

   static C0043 m8000(rw.gui.C0013 var0) {
      return var0.m10000(C0043.class).orElseGet(() -> {
         C0043 var1 = new C0043();
         var0.m12000(C0043.class, var1);
         return var1;
      });
   }

   void m10000(Iface0204 var1, Runnable var2) {
      this.f1000.put(Objects.requireNonNull(var1, "ticker"), Objects.requireNonNull(var2, "requestRender"));
   }
}
