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

record Rec0148() implements Iface0364 {
   private final NCa f1000;
   private final Ned f2000;
   private final NKi f3000;
   @Nullable
   private final NNNNmJ f4000;
   private final boolean f5000;

   public NKi m2000() {
      return this.f3000;
   }

   Rec0148(NCa var1, Ned var2, NKi var3, @Nullable NNNNmJ var4, boolean var5) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0148,"state;pos;block;orientation;movedByPiston",Rec0148::f1000,Rec0148::f2000,Rec0148::f3000,Rec0148::f4000,Rec0148::f5000>(
         this, var1
      );
   }

   public boolean m6000() {
      return this.f5000;
   }

   @Nullable
   public NNNNmJ m8000() {
      return this.f4000;
   }

   public Ned m10000() {
      return this.f2000;
   }

   public NCa m12000() {
      return this.f1000;
   }

   public boolean m14000(NgS var1) {
      NNNts.N(var1, this.f1000, this.f2000, this.f3000, this.f4000, this.f5000);
      return false;
   }

   public void m16000(Consumer<Ned> var1) {
      var1.accept(this.f2000);
   }
}
