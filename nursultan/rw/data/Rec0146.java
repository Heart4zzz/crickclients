package rw.data;

import KDFzREm.NCa;
import KDFzREm.NKi;
import KDFzREm.NNNNmJ;
import KDFzREm.NNNts;
import KDFzREm.Ned;
import KDFzREm.NgS;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import rw.api.Iface0364;

record Rec0146() implements Iface0364 {
   private final Ned f1000;
   private final NKi f2000;
   @Nullable
   private final NNNNmJ f3000;

   @Nullable
   public NNNNmJ m2000() {
      return this.f3000;
   }

   Rec0146(Ned var1, NKi var2, @Nullable NNNNmJ var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0146,"pos;block;orientation",Rec0146::f1000,Rec0146::f2000,Rec0146::f3000>(this, var1);
   }

   public NKi m6000() {
      return this.f2000;
   }

   public void m8000(Consumer<Ned> var1) {
      var1.accept(this.f1000);
   }

   public boolean m10000(NgS var1) {
      NCa var2 = var1.method_8320(this.f1000);
      NNNts.N(var1, var2, this.f1000, this.f2000, this.f3000, false);
      return false;
   }

   public Ned m12000() {
      return this.f1000;
   }
}
