package net.minecraft.world.item;

import KDFzREm.NNNNNA;
import KDFzREm.NNNNZV;
import KDFzREm.NNNbF;
import KDFzREm.NNNrD;
import KDFzREm.NQo;
import io.netty.handler.codec.DecoderException;

class ItemStack$3 implements NNNNNA<NNNrD, NQo> {
   ItemStack$3(NNNNNA var1) {
      this.N = var1;
   }

   public NQo N(NNNrD var1) {
      NQo var2 = (NQo)this.N.decode(var1);
      if (!var2.R()) {
         NNNbF var3 = var1.J().N(NNNNZV.N);
         NQo.y.encodeStart(var3, var2).getOrThrow(DecoderException::new);
      }

      return var2;
   }

   public void N(NNNrD var1, NQo var2) {
      this.N.encode(var1, var2);
   }
}
