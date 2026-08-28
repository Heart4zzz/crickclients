package rw.core;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class C1081 {
   public Object[] f1000;

   public C1081() {
      this.m4000();
      LinkedHashMap var5 = new LinkedHashMap();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public Collection<C0073> m10000() {
      return ((Map)this.f1000[0]).values();
   }

   public Optional<C0073> m12000(String var1) {
      return Optional.ofNullable((C0073)((Map)this.f1000[0]).get(var1));
   }

   public void m14000(C0073 var1) {
      if (var1.m2000() != null) {
         ((Map)this.f1000[0]).put(var1.m2000(), var1);
      }
   }
}
