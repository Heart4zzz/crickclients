package net.minecraft.server.level;

import KDFzREm.NNNNuM;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public record ChunkResult$Success<T>() implements NNNNuM<T> {
   private final T value;

   public ChunkResult$Success(T var1) {
      this.value = (T)var1;
   }

   public <E extends Throwable> T orElse(Supplier<E> var1) throws E {
      return this.value;
   }

   @Nullable
   public String y() {
      return null;
   }

   public T orElse(@Nullable T var1) {
      return this.value;
   }

   public <R> NNNNuM<R> N(Function<T, R> var1) {
      return (NNNNuM<R>)(new ChunkResult$Success<>(var1.apply(this.value)));
   }

   public boolean ifSuccess() {
      return true;
   }

   public NNNNuM<T> N(Consumer<T> var1) {
      var1.accept(this.value);
      return this;
   }
}
