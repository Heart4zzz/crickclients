package net.minecraft.util.thread;

public record StrictQueue$RunnableWithPriority() implements Runnable {
   final int priority;
   private final Runnable task;

   public StrictQueue$RunnableWithPriority(int var1, Runnable var2) {
      this.priority = var1;
      this.task = var2;
   }

   @Override
   public void run() {
      this.task.run();
   }

   public int N() {
      return this.priority;
   }
}
