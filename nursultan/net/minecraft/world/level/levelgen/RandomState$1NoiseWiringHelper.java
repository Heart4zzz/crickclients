package net.minecraft.world.level.levelgen;

import KDFzREm.NNNG;
import KDFzREm.NNNPK;
import KDFzREm.NNNbw;
import KDFzREm.NNNjM;
import KDFzREm.NNNjN;
import KDFzREm.NNNjR;
import KDFzREm.NNNjs;
import KDFzREm.NNNnf;
import KDFzREm.NNXC;
import KDFzREm.NNXS;
import KDFzREm.NNpQ;
import KDFzREm.NNrj;
import KDFzREm.NNrm;
import KDFzREm.NNrs;
import java.util.HashMap;
import java.util.Map;

class RandomState$1NoiseWiringHelper implements NNNjR {
   private final Map<NNNjN, NNNjN> wrapped;

   RandomState$1NoiseWiringHelper(NNNnf var1, long var2, boolean var4) {
      this.L = var1;
      this.val$seed = var2;
      this.val$useLegacyInit = var4;
      this.wrapped = new HashMap<>();
   }

   public NNNjN apply(NNNjN var1) {
      return this.wrapped.computeIfAbsent(var1, this::N);
   }

   private NNrm N(long var1) {
      return new NNrs(this.val$seed + var1);
   }

   private NNNjN N(NNNjN var1) {
      if (var1 instanceof NNrj var2) {
         NNrm var3 = this.val$useLegacyInit ? this.N(0L) : this.L.N.N(NNNG.y("terrain"));
         return var2.N(var3);
      } else {
         return (NNNjN)(var1 instanceof NNNjs ? new NNNjs(this.val$seed) : var1);
      }
   }

   public NNNjM N(NNNjM var1) {
      NNNbw var2 = var1.y();
      if (this.val$useLegacyInit) {
         if (var2.N(NNNPK.N)) {
            NNXC var6 = NNXC.N(this.N(0L), new NNXS(-7, 1.0, new double[]{1.0}));
            return new NNNjM(var2, var6);
         }

         if (var2.N(NNNPK.y)) {
            NNXC var5 = NNXC.N(this.N(1L), new NNXS(-7, 1.0, new double[]{1.0}));
            return new NNNjM(var2, var5);
         }

         if (var2.N(NNNPK.z)) {
            NNXC var4 = NNXC.y(this.L.N.N(NNNPK.z.N()), new NNXS(0, 0.0, new double[0]));
            return new NNNjM(var2, var4);
         }
      }

      NNXC var3 = this.L.N((NNpQ)var2.i().orElseThrow());
      return new NNNjM(var2, var3);
   }
}
