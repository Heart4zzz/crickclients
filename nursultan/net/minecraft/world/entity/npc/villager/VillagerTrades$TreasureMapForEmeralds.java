package net.minecraft.world.entity.npc.villager;

import KDFzREm.NAN;
import KDFzREm.NNNNBt;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNiG;
import KDFzREm.NNNbR;
import KDFzREm.NNNbw;
import KDFzREm.NNRE;
import KDFzREm.NNRq;
import KDFzREm.NNjj;
import KDFzREm.NNrm;
import KDFzREm.NQA;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbK;
import KDFzREm.Ned;
import KDFzREm.Ngt;
import KDFzREm.NqL;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class VillagerTrades$TreasureMapForEmeralds implements NNjj {
   private final int N;
   private final NNNbR<NNRE> y;
   private final String displayName;
   private final NNNbw<NNNNBt> u;
   private final int i;
   private final int R;

   public VillagerTrades$TreasureMapForEmeralds(int var1, NNNbR<NNRE> var2, String var3, NNNbw<NNNNBt> var4, int var5, int var6) {
      this.N = var1;
      this.y = var2;
      this.displayName = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
   }

   @Nullable
   public Ngt N(NNRq var1, NbK var2, NNrm var3) {
      Ned var4 = var1.method_8487(this.y, var2.method_24515(), 100, true);
      if (var4 != null) {
         NQo var5 = NQA.N(var1, var4.method_10263(), var4.method_10260(), (byte)2, true, true);
         NQA.N(var1, var5);
         NqL.N(var5, var4, "+", this.u);
         var5.N(NNNNRZ.U, NAN.L(this.displayName));
         return new Ngt(new NNNNiG(NQa.Ty, this.N), Optional.of(new NNNNiG(NQa.jJ)), var5, this.i, this.R, 0.2F);
      } else {
         return null;
      }
   }
}
