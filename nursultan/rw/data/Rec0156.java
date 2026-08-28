package rw.data;

import KDFzREm.NNNxM;
import java.lang.runtime.ObjectMethods;

public record Rec0156() implements NNNxM {
   private final String f1000;

   public Rec0156(String var1) {
      this.f1000 = var1;
   }

   public String m2000() {
      return this.f1000;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0156,"name",Rec0156::f1000>(this, var1);
   }

   public String m6000() {
      return this.f1000;
   }
}
