package rw.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import rw.data.Rec0246;
import rw.data.Rec0249;
import rw.gui.PdYp;

public class C1134 extends LinkedHashMap<Rec0249, List<Rec0246>> {
   public Object[] f1000;

   public C1134(PdYp var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.m8000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   @Override
   public boolean removeEldestEntry(Entry<Rec0249, List<Rec0246>> var1) {
      return (boolean)(this.size() > 512 ? 1 : 0);
   }
}
