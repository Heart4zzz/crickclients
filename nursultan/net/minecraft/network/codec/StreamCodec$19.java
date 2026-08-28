package net.minecraft.network.codec;

import KDFzREm.NNNNNA;
import com.google.common.base.Suppliers;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class StreamCodec$19 implements NNNNNA<B, T> {
   private final Supplier<NNNNNA<B, T>> inner;

   StreamCodec$19(UnaryOperator var1) {
      this.val$factory = var1;
      this.inner = Suppliers.memoize(() -> var1x.apply(this));
   }

   public T decode(B var1) {
      return (T)((NNNNNA)this.inner.get()).decode(var1);
   }

   public void encode(B var1, T var2) {
      ((NNNNNA)this.inner.get()).encode(var1, var2);
   }
}
