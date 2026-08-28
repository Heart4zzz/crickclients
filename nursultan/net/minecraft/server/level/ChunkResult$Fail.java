package net.minecraft.server.level;

import KDFzREm.NNNNuM;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public record ChunkResult$Fail<T>() implements NNNNuM<T> {
   private final Supplier<String> error;

   public ChunkResult$Fail(Supplier<String> var1) {
      this.error = var1;
   }

   public <E extends Throwable> T orElse(Supplier<E> var1) throws E {
      throw (Throwable)var1.get();
   }

   public String y() {
      return this.error.get();
   }

   @Nullable
   public T orElse(@Nullable T var1) {
      return (T)var1;
   }

   public <R> NNNNuM<R> N(Function<T, R> var1) {
      return new ChunkResult$Fail(this.error);
   }

   public boolean isSuccess() {
      return false;
   }

   public NNNNuM<T> N(Consumer<T> var1) {
      return this;
   }
}
