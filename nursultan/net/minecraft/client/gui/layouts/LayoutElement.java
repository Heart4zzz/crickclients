package net.minecraft.client.gui.layouts;

import KDFzREm.NAN;
import KDFzREm.NEF;
import KDFzREm.NNBK;
import KDFzREm.NNBV;
import KDFzREm.NNNFO;
import KDFzREm.NNNFo;
import KDFzREm.NNdF;
import KDFzREm.NNda;
import org.jspecify.annotations.Nullable;

public class LayoutElement extends NNNFO {
   protected LayoutElement(int var1, int var2, NAN var3, int var4, int var5, NNNFo var6, NNda var7, @Nullable NAN var8, @Nullable NNdF var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void method_75752(NNBK var1, int var2, int var3, float var4) {
      this.method_75794(var1);
      int var5 = this.method_46426() + 2;
      int var6 = this.method_46426() + this.method_25368() - this.y - 4;
      int var7 = this.method_46426() + this.method_25368() / 2;
      NEF var8 = var1.N(this, NNBV.field_63850);
      var8.N(this.method_25369(), var7, var5, var6, this.method_46427(), this.method_46427() + this.method_25364());
      int var9 = this.method_46426() + this.method_25368() - this.y - 2;
      int var10 = this.method_46427() + this.method_25364() / 2 - this.L / 2;
      this.N(var1, var9, var10);
   }
}
