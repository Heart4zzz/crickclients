package rw.core;

import KDFzREm.NQo;
import KDFzREm.NTS;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class C0592 implements Iterator<NQo> {
   private final NTS f1000;
   private int f2000;
   private final int f3000;

   public C0592(NTS var1) {
      this.f1000 = var1;
      this.f3000 = var1.method_5439();
   }

   @Override
   public boolean hasNext() {
      return this.f2000 < this.f3000;
   }

   public NQo m4000() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return this.f1000.method_5438(this.f2000++);
      }
   }
}
