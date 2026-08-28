package rw.core;

import KDFzREm.NNNbw;
import KDFzREm.NNdl;
import KDFzREm.NNdt;
import com.google.common.collect.AbstractIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;

class C0551 extends AbstractIterator<NNdt> {
   private Iterator<NNdt> f1000;

   C0551(NNdl var1, Iterator var2, Predicate var3) {
      this.f2000 = var2;
      this.f3000 = var3;
      this.f1000 = Collections.emptyIterator();
   }

   protected NNdt m2000() {
      while (!this.f1000.hasNext()) {
         if (!this.f2000.hasNext()) {
            return (NNdt)this.endOfData();
         }

         Entry var1 = (Entry)this.f2000.next();
         if (this.f3000.test((NNNbw)var1.getKey())) {
            this.f1000 = ((Set)var1.getValue()).iterator();
         }
      }

      return this.f1000.next();
   }
}
