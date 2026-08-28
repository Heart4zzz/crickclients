package rw.data;

import KDFzREm.NAN;
import KDFzREm.NFc;
import KDFzREm.NNNQW;
import KDFzREm.NNRc;
import java.lang.runtime.ObjectMethods;

public record Rec0139() implements NNNQW {
   private final NAN f1000;

   public Rec0139(NAN var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0139,"content",Rec0139::f1000>(this, var1);
   }

   public NAN m4000() {
      return this.f1000;
   }

   public void m6000(NNRc var1, boolean var2, NFc var3) {
      var1.field_13987.method_45168(this.f1000, var3);
   }
}
