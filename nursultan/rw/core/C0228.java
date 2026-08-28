package rw.core;

import KDFzREm.NNNpr;
import java.util.Iterator;

class C0228 implements Iterator<T> {
   private int f1000;

   public C0228(NNNpr var1) {
      this.f2000 = var1;
      this.f1000 = var1.size() - 1;
   }

   public void m2000() {
      this.f2000.remove(this.f1000 + 1);
   }

   @Override
   public boolean hasNext() {
      return this.f1000 >= 0;
   }

   public T m4000() {
      return (T)this.f2000.get(this.f1000--);
   }
}
