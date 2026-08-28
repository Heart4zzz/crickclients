package rw.core;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import java.util.Comparator;
import java.util.Iterator;

public class C0041<T> extends AbstractIterator<T> {
   private final PeekingIterator<T> f1000;
   private final PeekingIterator<T> f2000;
   private final Comparator<T> f3000;

   public C0041(Iterator<T> var1, Iterator<T> var2, Comparator<T> var3) {
      this.f1000 = Iterators.peekingIterator(var1);
      this.f2000 = Iterators.peekingIterator(var2);
      this.f3000 = var3;
   }

   protected T computeNext() {
      boolean var1 = !this.f1000.hasNext();
      boolean var2 = !this.f2000.hasNext();
      if (var1 && var2) {
         return (T)this.endOfData();
      } else if (var1) {
         return (T)this.f2000.next();
      } else if (var2) {
         return (T)this.f1000.next();
      } else {
         int var3 = this.f3000.compare((T)this.f1000.peek(), (T)this.f2000.peek());
         if (var3 == 0) {
            this.f2000.next();
         }

         return (T)(var3 <= 0 ? this.f1000.next() : this.f2000.next());
      }
   }
}
