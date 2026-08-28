package net.minecraft.client.gui.components.tabs;

import KDFzREm.NAN;
import KDFzREm.NNEV;
import KDFzREm.NNNVR;
import KDFzREm.NNNVx;

class Tab extends NNNVx {
   protected final NNEV<?> N;

   public void method_48611(NNNVR var1) {
      this.N.method_57714(this.y.field_22789, this.y.M.u(), this.y.M.L());
      super.method_48611(var1);
   }

   public Tab(NAN var1, NNEV<?> var2, NNEV var3) {
      super(var2);
      this.y = var1;
      this.Z.N(var3, 1, 1);
      this.N = var3;
   }
}
