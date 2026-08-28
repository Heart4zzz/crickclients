package net.minecraft.client.particle;

import KDFzREm.NNNZg;
import KDFzREm.NNNmO;
import KDFzREm.NNNvM;
import KDFzREm.NNNvY;
import KDFzREm.NNrm;
import KDFzREm.NNtJ;
import KDFzREm.Ncv;

public class ParticleProvider implements NNNvY<Ncv> {
   private final NNtJ N;

   public ParticleProvider(NNtJ var1) {
      this.N = var1;
   }

   public NNNvM N(Ncv var1, NNNZg var2, double var3, double var5, double var7, double var9, double var11, double var13, NNrm var15) {
      return new NNNmO(var2, var3, var5, var7, var9, var11, var13, this.N.method_18139(var15));
   }
}
