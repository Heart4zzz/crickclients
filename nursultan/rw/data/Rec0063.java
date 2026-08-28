package rw.data;

import KDFzREm.NLz;
import KDFzREm.NNNG;
import java.lang.runtime.ObjectMethods;

public record Rec0063() implements NLz {
   private final NNNG f1000;
   private final NNNG f2000;

   public Rec0063(NNNG var1, NNNG var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0063,"atlasId;spriteId",Rec0063::f1000,Rec0063::f2000>(this, var1);
   }

   public NNNG m4000() {
      return this.f2000;
   }

   public NNNG m6000() {
      return this.f1000;
   }
}
