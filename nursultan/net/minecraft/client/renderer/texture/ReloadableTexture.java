package net.minecraft.client.renderer.texture;

import KDFzREm.NNBt;
import KDFzREm.NNNNv;
import KDFzREm.NNuU;
import KDFzREm.NNwe;
import KDFzREm.NWn;
import KDFzREm.Qp;
import KDFzREm.VP;
import KDFzREm.VW;
import KDFzREm.aI;
import java.io.IOException;
import java.io.InputStream;

class ReloadableTexture extends VW {
   public ReloadableTexture() {
      super(NNwe.N);
   }

   public VP method_65809(NNBt var1) throws IOException {
      NNNNv var2 = NNuU.Nq().x().y();

      VP var4;
      try (InputStream var3 = var2.u(NNwe.N)) {
         var4 = new VP(Qp.N(var3), new aI(true, true, NWn.field_64077, 0.0F));
      }

      return var4;
   }
}
