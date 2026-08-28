package net.minecraft.world.level.levelgen;

import KDFzREm.NNNmf;
import KDFzREm.NrY;
import KDFzREm.NxC;
import rw.core.Base0428;

class Heightmap$Types extends Base0428 {
   Heightmap$Types(NNNmf var1) {
      super(var1);
   }

   protected boolean N() {
      int var1 = this.L.z & 15;
      int var2 = this.L.U & 15;
      int var3 = Math.max(var2 - 1, 0);
      int var4 = Math.min(var2 + 1, 15);
      NxC var5 = this.L.M;
      int var6 = var5.N(NrY.field_13194, var1, var3);
      int var7 = var5.N(NrY.field_13194, var1, var4);
      if (var7 >= var6 + 4) {
         return true;
      } else {
         int var8 = Math.max(var1 - 1, 0);
         int var9 = Math.min(var1 + 1, 15);
         int var10 = var5.N(NrY.field_13194, var8, var2);
         int var11 = var5.N(NrY.field_13194, var9, var2);
         return var10 >= var11 + 4;
      }
   }
}
