package net.minecraft.resources;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

public class DelegatingOps$DelegateListBuilder implements ListBuilder<T> {
   private final ListBuilder<T> original;

   protected DelegatingOps$DelegateListBuilder(ListBuilder<T> var1, ListBuilder var2) {
      this.N = var1;
      this.original = var2;
   }

   public ListBuilder<T> add(T var1) {
      this.original.add(var1);
      return this;
   }

   public ListBuilder<T> add(DataResult<T> var1) {
      this.original.add(var1);
      return this;
   }

   public <E> ListBuilder<T> add(E var1, Encoder<E> var2) {
      this.original.add(var2.encodeStart(this.ops(), var1));
      return this;
   }

   public <E> ListBuilder<T> addAll(Iterable<E> var1, Encoder<E> var2) {
      var1.forEach(var2x -> this.original.add(var2.encode(var2x, this.ops(), this.ops().empty())));
      return this;
   }

   public DataResult<T> build(T var1) {
      return this.original.build(var1);
   }

   public DataResult<T> build(DataResult<T> var1) {
      return this.original.build(var1);
   }

   public DynamicOps<T> ops() {
      return this.N;
   }

   public ListBuilder<T> withErrorsFrom(DataResult<?> var1) {
      this.original.withErrorsFrom(var1);
      return this;
   }

   public ListBuilder<T> mapError(UnaryOperator<String> var1) {
      this.original.mapError(var1);
      return this;
   }
}
