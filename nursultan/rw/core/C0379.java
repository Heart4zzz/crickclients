package rw.core;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import rw.defs.Enum0037;

public final class C0379 {
   public static final C0379 f1000;
   private final Map<Enum0037, C0373> f2000;

   public C0379(Map<Enum0037, C0373> var1) {
      EnumMap var2 = new EnumMap<>(Enum0037.class);
      if (var1 != null) {
         for (Entry var4 : var1.entrySet()) {
            Enum0037 var5 = (Enum0037)var4.getKey();
            C0373 var6 = (C0373)var4.getValue();
            if (var5 != null && var6 != null && !var6.m74000()) {
               var2.put(var5, var6);
            }
         }
      }

      this.f2000 = Collections.unmodifiableMap(var2);
   }

   public Map<Enum0037, C0373> m2000() {
      return this.f2000;
   }

   public C0379 m4000(C0379 var1) {
      if (var1 != null && var1 != f1000 && !var1.m6000()) {
         EnumMap var2 = new EnumMap<>(Enum0037.class);
         var2.putAll(this.f2000);

         for (Entry var4 : var1.f2000.entrySet()) {
            Enum0037 var5 = (Enum0037)var4.getKey();
            C0373 var6 = (C0373)var4.getValue();
            C0373 var7 = this.m8000(var5).m78000(var6);
            if (var7.m74000()) {
               var2.remove(var5);
            } else {
               var2.put(var5, var7);
            }
         }

         return new C0379(var2);
      } else {
         return this;
      }
   }

   public boolean m6000() {
      return this.f2000.isEmpty();
   }

   public C0373 m8000(Enum0037 var1) {
      return var1 == null ? C0373.f1000 : this.f2000.getOrDefault(var1, C0373.f1000);
   }

   public C0379 m10000(Enum0037 var1, C0373 var2) {
      if (var1 == null) {
         return this;
      } else {
         EnumMap var3 = new EnumMap<>(Enum0037.class);
         var3.putAll(this.f2000);
         if (var2 != null && !var2.m74000()) {
            var3.put(var1, var2);
         } else {
            var3.remove(var1);
         }

         return new C0379(var3);
      }
   }

   public C0373 m12000(boolean var1, boolean var2, boolean var3) {
      C0373 var4 = C0373.f1000;
      if (var1) {
         var4 = var4.m78000(this.m8000(Enum0037.f1000));
      }

      if (var2) {
         var4 = var4.m78000(this.m8000(Enum0037.f2000));
      }

      if (var3) {
         var4 = var4.m78000(this.m8000(Enum0037.f3000));
      }

      return var4;
   }
}
