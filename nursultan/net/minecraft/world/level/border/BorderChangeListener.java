package net.minecraft.world.level.border;

import KDFzREm.NNBS;
import KDFzREm.NNNNB;
import KDFzREm.NNNNM;
import KDFzREm.NNNNU;
import KDFzREm.NNNNZ;
import KDFzREm.NNNNz;
import KDFzREm.NNRq;
import KDFzREm.NxI;
import KDFzREm.NxK;

class BorderChangeListener implements NxI {
   BorderChangeListener(NNBS var1, NNRq var2) {
      this.y = var1;
      this.N = var2;
   }

   public void method_11931(NxK var1, double var2, double var4, long var6, long var8) {
      this.y.N(new NNNNB(var1), this.N.method_27983());
   }

   public void method_11935(NxK var1, double var2) {
   }

   public void method_11932(NxK var1, int var2) {
      this.y.N(new NNNNz(var1), this.N.method_27983());
   }

   public void method_11933(NxK var1, int var2) {
      this.y.N(new NNNNU(var1), this.N.method_27983());
   }

   public void method_11929(NxK var1, double var2) {
   }

   public void method_11934(NxK var1, double var2) {
      this.y.N(new NNNNZ(var1), this.N.method_27983());
   }

   public void method_11930(NxK var1, double var2, double var4) {
      this.y.N(new NNNNM(var1), this.N.method_27983());
   }
}
