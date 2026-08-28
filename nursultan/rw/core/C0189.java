package rw.core;

import KDFzREm.NNCG;
import KDFzREm.NNCl;
import KDFzREm.NNCs;
import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor;

class C0189 extends AbstractIterator<T> {
   Iterator<T> f1000;

   C0189(NNCl var1, ObjectIterator var2) {
      this.f2000 = var2;
   }

   protected T m2000() {
      if (this.f1000 != null && this.f1000.hasNext()) {
         return (T)((NNCs)this.f1000.next());
      } else {
         while (this.f2000.hasNext()) {
            NNCG var1 = (NNCG)this.f2000.next();
            if (var1.L().y() && !var1.N()) {
               this.f1000 = ((EntitySectionAccessor)var1).getCollection().iterator();
               if (this.f1000.hasNext()) {
                  return (T)((NNCs)this.f1000.next());
               }
            }
         }

         return (T)((NNCs)this.endOfData());
      }
   }
}
