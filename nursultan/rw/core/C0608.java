package rw.core;

import KDFzREm.Nag;
import KDFzREm.NpC;
import java.util.Iterator;
import java.util.NoSuchElementException;

class C0608 implements Iterator<NpC> {
   private int f1000;

   C0608(Nag var1) {
      this.f2000 = var1;
   }

   @Override
   public boolean hasNext() {
      return this.f1000 < this.f2000.size();
   }

   public NpC m4000() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.f2000.L(this.f1000++);
      }
   }
}
