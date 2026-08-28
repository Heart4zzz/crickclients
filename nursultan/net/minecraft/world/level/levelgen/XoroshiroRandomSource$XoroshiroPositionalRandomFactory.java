package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEO;
import KDFzREm.NNNmd;
import KDFzREm.NNNmk;
import KDFzREm.NNNml;
import KDFzREm.NNWE;
import KDFzREm.NNrm;

public class XoroshiroRandomSource$XoroshiroPositionalRandomFactory implements NNNEO {
   private final long N;
   private final long y;

   public XoroshiroRandomSource$XoroshiroPositionalRandomFactory(long var1, long var3) {
      this.N = var1;
      this.y = var3;
   }

   public void parityConfigString(StringBuilder var1) {
      var1.append("seedLo: ").append(this.N).append(", seedHi: ").append(this.y);
   }

   public NNrm N(long var1) {
      return new NNNmk(var1 ^ this.N, var1 ^ this.y);
   }

   public NNrm N(String var1) {
      NNNmd var2 = NNNml.N(var1);
      return new NNNmk(var2.N(this.N, this.y));
   }

   public NNrm N(int var1, int var2, int var3) {
      long var4 = NNWE.y(var1, var2, var3);
      long var6 = var4 ^ this.N;
      return new NNNmk(var6, this.y);
   }
}
