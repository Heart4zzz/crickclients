package rw.data;

import KDFzREm.NNNkL;
import KDFzREm.NNNwJ;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public record Rec0150() implements NNNwJ {
   private final Map<String, NNNkL> f1000;

   public Rec0150(Map<String, NNNkL> var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0150,"arguments",Rec0150::f1000>(this, var1);
   }

   @Nullable
   public NNNkL m4000(String var1) {
      return this.f1000.get(var1);
   }

   public Map<String, NNNkL> m6000() {
      return this.f1000;
   }
}
