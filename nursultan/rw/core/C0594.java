package rw.core;

import KDFzREm.NWS;
import KDFzREm.NWf;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;

public class C0594 {
   final Reference2ObjectMap<NWf<?>, Object> f1000 = new Reference2ObjectOpenHashMap();

   public <T> C0594 m2000(NWf<T> var1, T var2) {
      this.f1000.put(var1, var2);
      return this;
   }

   public NWS m4000() {
      return new NWS(this.f1000);
   }
}
