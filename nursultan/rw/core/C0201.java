package rw.core;

import KDFzREm.NNGD;
import com.google.common.collect.AbstractIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior;
import org.jspecify.annotations.Nullable;

class C0201 extends AbstractIterator<E> {
   C0201(NNGD var1, Iterator var2) {
      this.f1000 = var2;
   }

   @Nullable
   protected E m2000() {
      while (this.f1000.hasNext()) {
         Pair var1 = (Pair)this.f1000.next();
         if (var1.getSecond() != LithiumEmptyBehavior.EMPTY_BEHAVIOR_SENTINEL) {
            return (E)var1;
         }
      }

      return (E)((Pair)this.endOfData());
   }
}
