package rw.core;

import KDFzREm.NCa;
import KDFzREm.NNNER;
import KDFzREm.NNNPY;
import KDFzREm.NNfp;
import KDFzREm.Neo;
import KDFzREm.Ngq;
import KDFzREm.NxC;

class ChunkBlockColumn implements NNNER {
   ChunkBlockColumn(NNNPY var1, NxC var2, Neo var3, Ngq var4) {
      this.f1000 = var2;
      this.f2000 = var3;
      this.f3000 = var4;
   }

   @Override
   public String toString() {
      return "ChunkBlockColumn " + this.f3000;
   }

   public NCa m2000(int var1) {
      return this.f1000.method_8320(this.f2000.y(var1));
   }

   public void m4000(int var1, NCa var2) {
      NNfp var3 = this.f1000.w();
      if (var3.L(var1)) {
         this.f1000.N(this.f2000.y(var1), var2);
         if (!var2.Y().W()) {
            this.f1000.u(this.f2000);
         }
      }
   }
}
