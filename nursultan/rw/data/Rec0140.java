package rw.data;

import KDFzREm.NNAf;
import java.lang.runtime.ObjectMethods;

public record Rec0140() {
   private final NNAf f1000;
   private final int f2000;

   public Rec0140(NNAf var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0140,"contents;width",Rec0140::f1000,Rec0140::f2000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public NNAf m6000() {
      return this.f1000;
   }
}
