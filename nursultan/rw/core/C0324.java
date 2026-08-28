package rw.core;

import KDFzREm.NNNGO;
import KDFzREm.NNNGo;
import KDFzREm.NNNNmk;
import KDFzREm.NNNbR;
import KDFzREm.NNNbw;
import KDFzREm.NNNgN;
import KDFzREm.NNNqi;
import KDFzREm.NQl;
import KDFzREm.Ngf;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;

public class C0324 {
   private final NNNGO<NQl> f1000;
   private final NNNgN f2000;
   private final Object2IntSortedMap<NQl> f3000 = new Object2IntLinkedOpenHashMap();

   public C0324(NNNGo var1, NNNgN var2) {
      this.f1000 = var1.y(NNNqi.F);
      this.f2000 = var2;
   }

   public C0324 m2000(Ngf var1, int var2) {
      NQl var3 = var1.B();
      this.m4000(var2, var3);
      return this;
   }

   private void m4000(int var1, NQl var2) {
      if (var2.N(this.f2000)) {
         this.f3000.put(var2, var1);
      }
   }

   public C0324 m10000(NNNbR<NQl> var1, int var2) {
      this.f1000.N(var1).ifPresent(var2x -> {
         for (NNNbw var4 : var2x) {
            this.m4000(var2, (NQl)var4.N());
         }
      });
      return this;
   }

   public C0324 m12000(NNNbR<NQl> var1) {
      this.f3000.keySet().removeIf(var1x -> var1x.i().N(var1));
      return this;
   }

   public NNNNmk m14000() {
      return new NNNNmk(this.f3000);
   }
}
