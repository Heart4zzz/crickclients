package rw.core;

import KDFzREm.NDZ;
import KDFzREm.NNNNsj;
import KDFzREm.NNRq;
import KDFzREm.NNpQ;
import KDFzREm.NNvn;
import KDFzREm.NgS;
import KDFzREm.Ngq;
import KDFzREm.ho;
import org.jspecify.annotations.Nullable;

class C0357 implements ho {
   @Nullable
   private NNvn f1000;
   private int f2000;
   private int f3000;

   C0357(NNNNsj var1, int var2) {
      this.f5000 = var1;
      this.f4000 = var2;
   }

   public int m2000() {
      return this.f4000;
   }

   @Nullable
   public NDZ m4000(int var1, int var2) {
      return this.f1000 == null ? null : this.f1000.L(Ngq.u(var1 + this.f2000 - this.f4000, var2 + this.f3000 - this.f4000));
   }

   public void m6000(NNpQ<NgS> var1, Ngq var2) {
      NNRq var3 = this.f5000.N(var1);
      this.f1000 = var3 != null ? var3.method_14178().L : null;
      this.f2000 = var2.B;
      this.f3000 = var2.Z;
   }
}
