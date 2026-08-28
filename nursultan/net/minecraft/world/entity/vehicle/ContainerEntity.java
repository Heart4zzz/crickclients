package net.minecraft.world.entity.vehicle;

import KDFzREm.NCa;
import KDFzREm.NDe;
import KDFzREm.NKL;
import KDFzREm.NNgC;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NbK;
import KDFzREm.Ned;
import KDFzREm.NgS;
import KDFzREm.NxC;
import java.util.function.BiFunction;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;

class ContainerEntity implements BiFunction<NNnf, Ned, NNty> {
   final NgS N;
   int y;
   int L;
   NxC u;

   ContainerEntity(NbK var1) {
      this.i = var1;
      this.N = this.i.method_73183();
      this.y = Integer.MIN_VALUE;
      this.L = Integer.MIN_VALUE;
      this.u = null;
   }

   public NNty N(NNnf var1, Ned var2) {
      NCa var3 = this.N(this.N, var2);
      return var3.y(this.N, var2, ((ClipContextAccess)var1).lithium$getCollisionContext()).method_1092(var1.y(), var1.N(), var2);
   }

   private NCa N(NNgC var1, Ned var2) {
      if (var1.method_31601(var2.method_10264())) {
         return NKL.mh.W();
      } else {
         int var3 = ChunkCoord.fromBlockCoord(var2.method_10263());
         int var4 = ChunkCoord.fromBlockCoord(var2.method_10260());
         if (this.y != var3 || this.L != var4) {
            this.u = var1.method_8392(var3, var4);
            this.y = var3;
            this.L = var4;
         }

         NxC var5 = this.u;
         if (var5 != null) {
            NDe var6 = var5.u()[SectionYIndex.fromBlockCoord(var5, var2.method_10264())];
            if (var6 != null && !var6.L()) {
               return var6.N(var2.method_10263() & 15, var2.method_10264() & 15, var2.method_10260() & 15);
            }
         }

         return NKL.N.W();
      }
   }
}
