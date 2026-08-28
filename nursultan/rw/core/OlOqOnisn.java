package rw.core;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class OlOqOnisn {
   public Object[] f1000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public OlOqOnisn() {
      this.m4000();
      Int2ObjectOpenHashMap var5 = new Int2ObjectOpenHashMap();
      this.f1000[0] = var5;
      this.m14000(0, new C0937());
   }

   static {
      ntfClinit();
   }

   public Base0943 m12000(int var1) {
      return (Base0943)((Int2ObjectOpenHashMap)this.f1000[0]).get(var1);
   }

   public void m14000(int var1, Base0943 var2) {
      ((Int2ObjectOpenHashMap)this.f1000[0]).put(var1, var2);
   }
}
