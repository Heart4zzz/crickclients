package net.minecraft.util.thread;

import KDFzREm.OD;
import java.util.concurrent.Executor;

class TaskScheduler$1 implements OD<Runnable> {
   TaskScheduler$1(String var1, Executor var2) {
      this.val$name = var1;
      this.val$executor = var2;
   }

   @Override
   public String toString() {
      return this.val$name;
   }

   public Runnable wrapRunnable(Runnable var1) {
      return var1;
   }

   public void schedule(Runnable var1) {
      this.val$executor.execute(var1);
   }

   public String as_() {
      return this.val$name;
   }
}
