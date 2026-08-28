package rw.core;

import KDFzREm.NNNNuS;
import KDFzREm.NNNNua;
import KDFzREm.NNNNuc;
import KDFzREm.NNNNud;
import KDFzREm.NNNbw;
import KDFzREm.Njs;
import KDFzREm.Njv;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class C0382 {
   private final Builder<NNNNuS> f1000 = ImmutableList.builder();

   C0382() {
   }

   public NNNNuc m2000() {
      return new NNNNuc(this.f1000.build());
   }

   public C0382 m4000(NNNbw<Njs> var1, Njv var2, NNNNud var3, NNNNua var4) {
      this.f1000.add(new NNNNuS(var1, var2, var3, var4));
      return this;
   }

   public C0382 m6000(NNNbw<Njs> var1, Njv var2, NNNNud var3) {
      this.f1000.add(new NNNNuS(var1, var2, var3));
      return this;
   }
}
