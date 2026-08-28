package rw.data;

import KDFzREm.NNNbw;
import KDFzREm.NOc;
import java.lang.runtime.ObjectMethods;

public record Rec0160<T>() {
   final NNNbw<T> f1000;
   final NOc f2000;
   final NNNbw<T> f3000;

   public NNNbw<T> m2000() {
      return this.f3000;
   }

   public Rec0160(NNNbw<T> var1, NOc var2, NNNbw<T> var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0160,"from;ingredient;to",Rec0160::f1000,Rec0160::f2000,Rec0160::f3000>(this, var1);
   }

   public NOc m6000() {
      return this.f2000;
   }

   public NNNbw<T> m8000() {
      return this.f1000;
   }
}
