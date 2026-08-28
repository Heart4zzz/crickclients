package net.minecraft.util.thread;

import KDFzREm.NNjz;
import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;

public final class StrictQueue$FixedPriorityQueue implements NNjz<StrictQueue$RunnableWithPriority> {
   private final Queue<Runnable>[] queues;
   private final AtomicInteger size = new AtomicInteger();

   public int size() {
      return this.size.get();
   }

   public StrictQueue$FixedPriorityQueue(int var1) {
      this.queues = new Queue[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         this.queues[var2] = Queues.newConcurrentLinkedQueue();
      }
   }

   public boolean isEmpty() {
      return this.size.get() == 0;
   }

   public boolean N(StrictQueue$RunnableWithPriority var1) {
      int var2 = var1.priority;
      if (var2 < this.queues.length && var2 >= 0) {
         this.queues[var2].add(var1);
         this.size.incrementAndGet();
         return true;
      } else {
         throw new IndexOutOfBoundsException(String.format(Locale.ROOT, "Priority %d not supported. Expected range [0-%d]", var2, this.queues.length - 1));
      }
   }

   @Nullable
   public Runnable push() {
      for (Queue var4 : this.queues) {
         Runnable var5 = (Runnable)var4.poll();
         if (var5 != null) {
            this.size.decrementAndGet();
            return var5;
         }
      }

      return null;
   }
}
