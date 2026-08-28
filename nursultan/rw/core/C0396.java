package rw.core;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import rw.data.Rec0132;

class C0396 extends LinkedHashMap<Integer, Rec0132> {
   C0396(C0411 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.f1000 = var1;
   }

   @Override
   protected boolean removeEldestEntry(Entry<Integer, Rec0132> var1) {
      return this.size() > 8;
   }
}
