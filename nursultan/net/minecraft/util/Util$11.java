package net.minecraft.util;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NDe;
import KDFzREm.NKL;
import KDFzREm.NNPy;
import KDFzREm.NNgC;
import KDFzREm.NNnC;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NXi;
import KDFzREm.Ned;
import KDFzREm.NgI;
import KDFzREm.NxC;
import java.util.function.BiFunction;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

class Util$11 implements BiFunction<NNnf, Ned, NNty> {
   int N;
   int y;
   NxC L;
   final boolean u;

   Util$11(NgI var1, NNnf var2) {
      this.R = var1;
      this.i = var2;
      this.N = Integer.MIN_VALUE;
      this.y = Integer.MIN_VALUE;
      this.L = null;
      this.u = ((ClipContextAccessor)this.i).getFluidHandling() != NNnC.field_1348;
   }

   public NNty N(NNnf var1, Ned var2) {
      NCa var3 = this.N((NNgC)this.R, var2);
      NXi var4 = var1.y();
      NXi var5 = var1.N();
      NCU var6 = var1.N(var3, this.R, var2);
      NNty var7 = this.R.N(var4, var5, var2, var6, var3);
      double var8 = var7 == null ? Double.MAX_VALUE : var1.y().M(var7.y());
      double var10 = Double.MAX_VALUE;
      NNty var12 = null;
      if (this.u) {
         NNPy var13 = var3.Y();
         NCU var14 = var1.N(var13, this.R, var2);
         var12 = var14.method_1092(var4, var5, var2);
         var10 = var12 == null ? Double.MAX_VALUE : var1.y().M(var12.y());
      }

      return var8 <= var10 ? var7 : var12;
   }

   private NCa N(NNgC var1, Ned var2) {
      if (var1.method_31601(var2.method_10264())) {
         return NKL.mh.W();
      } else {
         int var3 = ChunkCoord.fromBlockCoord(var2.method_10263());
         int var4 = ChunkCoord.fromBlockCoord(var2.method_10260());
         if (this.N != var3 || this.y != var4) {
            this.L = var1.method_8392(var3, var4);
            this.N = var3;
            this.y = var4;
         }

         NxC var5 = this.L;
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
