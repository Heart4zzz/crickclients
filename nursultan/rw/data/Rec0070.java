package rw.data;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import rw.api.Iface0192;
import rw.defs.Enum0019;

public record Rec0070() {
   private final Map<Enum0019, Iface0192> f1000;
   public static final Rec0070 f2000;

   public Rec0070(Map<Enum0019, Iface0192> var1) {
      EnumMap var2 = new EnumMap<>(Enum0019.class);
      if (var1 != null) {
         for (Entry var4 : var1.entrySet()) {
            Enum0019 var5 = (Enum0019)var4.getKey();
            if (var5 != null) {
               Iface0192 var6 = var4.getValue() == null ? Iface0192.m2000() : (Iface0192)var4.getValue();
               if (var6.m4000()) {
                  var5.m16000(var6);
                  var2.put(var5, var6);
               }
            }
         }
      }

      this.f1000 = Collections.unmodifiableMap(var2);
   }

   public boolean m2000(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof Rec0070 var3) {
         Rec0070 var10000 = var3;

         try {
            var6 = var10000.m4000();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         Map var4 = var6;
         return this.f1000.equals(var4);
      } else {
         return false;
      }
   }

   public Map<Enum0019, Iface0192> m4000() {
      return this.f1000;
   }

   public Iface0192 m6000(Enum0019 var1) {
      return var1 == null ? Iface0192.m2000() : this.f1000.getOrDefault(var1, Iface0192.m2000());
   }

   public boolean m8000() {
      return this.f1000.isEmpty();
   }
}
