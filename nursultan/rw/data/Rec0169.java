package rw.data;

import KDFzREm.NNNNBt;
import KDFzREm.NNNbw;
import java.lang.runtime.ObjectMethods;

record Rec0169() {
   private final NNNbw<NNNNBt> f1000;
   private final byte f2000;
   private final byte f3000;
   private final byte f4000;

   public byte m2000() {
      return this.f3000;
   }

   Rec0169(NNNbw<NNNNBt> var1, byte var2, byte var3, byte var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0169,"type;x;y;rot",Rec0169::f1000,Rec0169::f2000,Rec0169::f3000,Rec0169::f4000>(this, var1);
   }

   public byte m6000() {
      return this.f4000;
   }

   public byte m8000() {
      return this.f2000;
   }

   public NNNbw<NNNNBt> m10000() {
      return this.f1000;
   }
}
