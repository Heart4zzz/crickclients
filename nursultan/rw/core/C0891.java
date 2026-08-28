package rw.core;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;

public class C0891<T> extends ObjectArraySet<T> {
   static {
      ntfClinit();
   }

   public boolean m2000(T var1) {
      boolean var2 = super.add(var1);
      if (!var2) {
         this.m8000((T)var1);
         var2 = super.add(var1);
      }

      return var2;
   }

   public boolean addAll(Collection<? extends T> var1) {
      byte var2 = 0;

      for (Object var4 : var1) {
         boolean var5 = super.add(var4);
         if (!var5) {
            this.m8000((T)var4);
            var5 = super.add(var4);
         }

         if (var5) {
            var2 = 1;
         }
      }

      return (boolean)var2;
   }

   public void m8000(T var1) {
      this.remove(var1);
   }
}
