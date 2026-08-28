package net.minecraft.core;

import KDFzREm.NNNG;
import KDFzREm.NNNJH;
import KDFzREm.NNNbR;
import KDFzREm.NNNbY;
import KDFzREm.NNNbw;
import KDFzREm.NNpQ;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public record Holder$Direct<T>() implements NNNbw<T> {
   private final T value;

   public Stream<NNNbR<T>> tags() {
      return Stream.of();
   }

   public Holder$Direct(T var1) {
      this.value = (T)var1;
   }

   @Override
   public String toString() {
      return "Direct{" + this.value + "}";
   }

   public Optional<NNpQ<T>> unwrapKey() {
      return Optional.empty();
   }

   public Either<NNpQ<T>, T> unwrap() {
      return Either.right(this.value);
   }

   public boolean isBound() {
      return true;
   }

   public boolean N(NNpQ<T> var1) {
      return false;
   }

   public boolean N(NNNJH<T> var1) {
      return true;
   }

   public boolean N(NNNG var1) {
      return false;
   }

   public T is() {
      return this.value;
   }

   public boolean is(Predicate<NNpQ<T>> var1) {
      return false;
   }

   public boolean N(NNNbw<T> var1) {
      return this.value.equals(var1.N());
   }

   public boolean N(NNNbR<T> var1) {
      return false;
   }

   public NNNbY R() {
      return NNNbY.field_36447;
   }
}
