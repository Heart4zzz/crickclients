package rw.core;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class C0394 extends LinkedHashMap<rw.setting.C0059, C0411> {
   C0394(rw.setting.C0063 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.f1000 = var1;
   }

   @Override
   protected boolean removeEldestEntry(Entry<rw.setting.C0059, C0411> var1) {
      return this.size() > 8192;
   }
}
