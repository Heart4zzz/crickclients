package rw.data;

import KDFzREm.NNNxM;
import KDFzREm.NNpQ;
import java.lang.runtime.ObjectMethods;

public record Rec0153() implements NNNxM {
   private final NNpQ<?> f1000;

   public Rec0153(NNpQ<?> var1) {
      this.f1000 = var1;
   }

   public String m2000() {
      return "{" + this.f1000.N() + "@" + this.f1000.y() + "}";
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0153,"id",Rec0153::f1000>(this, var1);
   }

   public NNpQ<?> m6000() {
      return this.f1000;
   }
}
