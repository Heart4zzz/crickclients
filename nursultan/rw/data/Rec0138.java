package rw.data;

import KDFzREm.NAN;
import KDFzREm.NFc;
import KDFzREm.NNNQW;
import KDFzREm.NNNkL;
import KDFzREm.NNRc;
import java.lang.runtime.ObjectMethods;

public record Rec0138() implements NNNQW {
   private final NNNkL f1000;

   public Rec0138(NNNkL var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0138,"message",Rec0138::f1000>(this, var1);
   }

   public NNNkL m4000() {
      return this.f1000;
   }

   public void m6000(NNRc var1, boolean var2, NFc var3) {
      NNNkL var4 = this.f1000.N(var2);
      if (!var4.z()) {
         var1.field_13987.method_45170(var4, var3);
      }
   }

   public NAN m8000() {
      return this.f1000.u();
   }
}
