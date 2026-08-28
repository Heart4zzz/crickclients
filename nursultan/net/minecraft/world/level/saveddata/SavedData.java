package net.minecraft.world.level.saveddata;

import KDFzREm.NNNEO;
import KDFzREm.NNNaD;
import KDFzREm.NNrm;

class SavedData implements NNrm {
   private final NNrm L;

   public NNNEO L() {
      this.y.method_80();
      return this.L.L();
   }

   public int M() {
      this.y.method_80();
      return this.L.M();
   }

   SavedData(NNNaD var1, NNrm var2) {
      this.y = var1;
      this.L = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof SavedData var2 ? this.L.equals(var2.L) : false;
      }
   }

   public long B() {
      this.y.method_80();
      return this.L.B();
   }

   public boolean isDirty() {
      this.y.method_80();
      return this.L.Z();
   }

   public double U() {
      this.y.method_80();
      return this.L.U();
   }

   public float z() {
      this.y.method_80();
      return this.L.z();
   }

   public NNrm y() {
      this.y.method_80();
      return this.L.y();
   }

   public int y(int var1) {
      this.y.method_80();
      return this.L.y(var1);
   }

   public double E() {
      this.y.method_80();
      return this.L.E();
   }

   public void N(long var1) {
      this.y.method_80();
      this.L.N(var1);
   }
}
