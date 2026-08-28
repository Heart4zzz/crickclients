package rw.core;

import KDFzREm.NNNNim;
import KDFzREm.NNNoH;
import KDFzREm.NNNoe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class C0305 extends NNNoH<C0305> {
   private final Builder<NNNoe> f1000 = ImmutableList.builder();

   public C0305 m4000(NNNoH<?> var1) {
      this.f1000.add(var1.y());
      return this;
   }

   public C0305(NNNoH<?>... var1) {
      for (NNNoH var5 : var1) {
         this.f1000.add(var5.y());
      }
   }

   public NNNoe m6000() {
      return new NNNNim(this.f1000.build(), this.i());
   }

   protected C0305 m8000() {
      return this;
   }
}
