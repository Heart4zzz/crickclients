package rw.core;

import java.util.EnumMap;
import java.util.Map;
import rw.api.Iface0033;
import rw.defs.IlmOnqm;

public class C1215 {
   public Object[] f1000;

   C1215() {
      this.m10000();
      EnumMap var5 = new EnumMap<>(IlmOnqm.class);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public <T extends Iface0033> C1215 m8000(IlmOnqm var1, OljltOqi<T> var2) {
      ((Map)this.f1000[0]).put(var1, var2);
      return this;
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }
}
