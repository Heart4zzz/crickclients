package rw.core;

import KDFzREm.NCa;
import KDFzREm.NKi;
import KDFzREm.NNNNmJ;
import KDFzREm.NNNNmg;
import KDFzREm.NNNgu;
import KDFzREm.NNNts;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.NgS;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import rw.api.Iface0364;

final class C0499 implements Iface0364 {
   private final Ned f1000;
   private final NKi f2000;
   @Nullable
   private NNNNmJ f3000;
   @Nullable
   private final Nef f4000;
   private int f5000 = 0;

   C0499(Ned var1, NKi var2, @Nullable NNNNmJ var3, @Nullable Nef var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      if (NNNts.N[this.f5000] == var4) {
         this.f5000++;
      }
   }

   @Override
   public boolean m2000(NgS var1) {
      Nef var2 = NNNts.N[this.f5000++];
      Ned var3 = this.f1000.method_10093(var2);
      NCa var4 = var1.method_8320(var3);
      NNNNmJ var5 = null;
      if (var1.method_45162().y(NNNgu.L)) {
         if (this.f3000 == null) {
            this.f3000 = NNNNmg.N(var1, this.f4000 == null ? null : this.f4000.b(), null);
         }

         var5 = this.f3000.y(var2);
      }

      NNNts.N(var1, var4, var3, this.f2000, var5, false);
      if (this.f5000 < NNNts.N.length && NNNts.N[this.f5000] == this.f4000) {
         this.f5000++;
      }

      return this.f5000 < NNNts.N.length;
   }

   @Override
   public void m4000(Consumer<Ned> var1) {
      for (Nef var5 : NNNts.N) {
         if (var5 != this.f4000) {
            Ned var6 = this.f1000.method_10093(var5);
            var1.accept(var6);
         }
      }
   }
}
