package rw.core;

import java.util.ArrayList;
import java.util.IdentityHashMap;

public class C0823 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   C0823() {
      this.m2000();
      IdentityHashMap var5 = new IdentityHashMap();
      this.f1000[0] = var5;
      ArrayList var6 = new ArrayList();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   C0012[] m8000() {
      return ((ArrayList)this.f1000[1]).toArray(new C0012[0]);
   }

   int m18000(C0012 var1) {
      Integer var2 = (Integer)((IdentityHashMap)this.f1000[0]).get(var1);
      if (var2 != null) {
         return var2;
      } else {
         int var3 = ((ArrayList)this.f1000[1]).size();
         ((IdentityHashMap)this.f1000[0]).put(var1, var3);
         ((ArrayList)this.f1000[1]).add(var1);
         return var3;
      }
   }
}
