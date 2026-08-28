package rw.core;

import KDFzREm.NNNGm;
import KDFzREm.NNNoH;
import KDFzREm.NNNoe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class C0230 extends NNNoH<C0230> {
   private final Builder<NNNoe> f1000 = ImmutableList.builder();

   public C0230(NNNoH<?>... var1) {
      for (NNNoH var5 : var1) {
         this.f1000.add(var5.y());
      }
   }

   public NNNoe m4000() {
      return new NNNGm(this.f1000.build(), this.i());
   }

   public C0230 m6000(NNNoH<?> var1) {
      this.f1000.add(var1.y());
      return this;
   }

   protected C0230 m8000() {
      return this;
   }
}
