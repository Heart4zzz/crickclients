package net.minecraft.util;

import KDFzREm.NNNQg;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

class TaskChainer$1 implements NNNQg {
   TaskChainer$1(Executor var1) {
      this.val$executor = var1;
   }

   public <T> void append(CompletableFuture<T> var1, Consumer<T> var2) {
      var1.thenAcceptAsync(var2, this.val$executor).exceptionally(var0 -> {
         N.error("Task failed", var0);
         return null;
      });
   }
}
