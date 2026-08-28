package rw.core;

import KDFzREm.NNNCB;
import KDFzREm.NNNCd;
import KDFzREm.NNNCj;
import KDFzREm.NNNCv;
import KDFzREm.NNNSC;
import KDFzREm.NNNSf;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class C0217<T extends NNNCB<T>> extends NNNCd<T> implements NNNCj<T> {
   private final NNNSf f1000;
   private final T f2000;
   private final List<T> f3000;

   public C0217(String var1, ContextChain<T> var2, NNNSf var3, T var4, List<T> var5) {
      super(var1, var2);
      this.f2000 = (T)var4;
      this.f3000 = var5;
      this.f1000 = var3;
   }

   public void m2000(NNNCv<T> var1, NNNSC var2) {
      this.N(this.f2000, this.f3000, var1, var2, this.f1000);
   }
}
