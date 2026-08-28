package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEO;
import KDFzREm.NNWE;
import KDFzREm.NNrm;
import KDFzREm.NNrs;

public class LegacyRandomSource$LegacyPositionalRandomFactory implements NNNEO {
   private final long seed;

   public LegacyRandomSource$LegacyPositionalRandomFactory(long var1) {
      this.seed = var1;
   }

   public void parityConfigString(StringBuilder var1) {
      var1.append("LegacyPositionalRandomFactory{").append(this.seed).append("}");
   }

   public NNrm N(long var1) {
      return new NNrs(var1);
   }

   public NNrm N(String var1) {
      int var2 = var1.hashCode();
      return new NNrs(var2 ^ this.seed);
   }

   public NNrm N(int var1, int var2, int var3) {
      long var4 = NNWE.y(var1, var2, var3);
      long var6 = var4 ^ this.seed;
      return new NNrs(var6);
   }
}
