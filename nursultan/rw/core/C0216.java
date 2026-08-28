package rw.core;

import KDFzREm.NNNCB;
import KDFzREm.NNNCd;
import KDFzREm.NNNCj;
import KDFzREm.NNNCv;
import KDFzREm.NNNSC;
import KDFzREm.NNNSf;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class C0216<T extends NNNCB<T>> extends NNNCd<T> implements NNNCj<T> {
   private final T f1000;

   public C0216(String var1, ContextChain<T> var2, T var3) {
      super(var1, var2);
      this.f1000 = (T)var3;
   }

   public void m2000(NNNCv<T> var1, NNNSC var2) {
      this.N(var1, var2);
      this.N(this.f1000, List.of(this.f1000), var1, var2, NNNSf.N);
   }
}
