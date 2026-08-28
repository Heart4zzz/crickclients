package net.minecraft.util.thread;

import KDFzREm.NNjz;
import java.util.Queue;
import org.jspecify.annotations.Nullable;

public final class StrictQueue$QueueStrictQueue implements NNjz<Runnable> {
   private final Queue<Runnable> queue;

   public int size() {
      return this.queue.size();
   }

   public StrictQueue$QueueStrictQueue(Queue<Runnable> var1) {
      this.queue = var1;
   }

   public boolean isEmpty() {
      return this.queue.isEmpty();
   }

   @Nullable
   public Runnable push() {
      return this.queue.poll();
   }

   public boolean push(Runnable var1) {
      return this.queue.add(var1);
   }
}
