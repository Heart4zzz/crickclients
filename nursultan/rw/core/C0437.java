package rw.core;

import KDFzREm.NCa;
import KDFzREm.NNNTn;
import KDFzREm.NNNZg;
import KDFzREm.NNNvM;
import KDFzREm.NNNvY;
import KDFzREm.NNrm;
import KDFzREm.NNtJ;
import KDFzREm.NNuU;
import KDFzREm.NXr;
import KDFzREm.NcR;
import KDFzREm.NeX;
import KDFzREm.Ned;
import org.jspecify.annotations.Nullable;

public class C0437 implements NNNvY<NcR> {
   private final NNtJ f1000;

   public C0437(NNtJ var1) {
      this.f1000 = var1;
   }

   @Nullable
   public NNNvM m2000(NcR var1, NNNZg var2, double var3, double var5, double var7, double var9, double var11, double var13, NNrm var15) {
      NCa var16 = var1.N();
      if (!var16.P() && var16.b() == NXr.field_11455) {
         return null;
      } else {
         Ned var17 = Ned.method_49637(var3, var5, var7);
         int var18 = NNuU.Nq().d().N(var16, var2, var17);
         if (var16.i() instanceof NeX) {
            var18 = ((NeX)var16.i()).N(var16, var2, var17);
         }

         float var19 = (var18 >> 16 & 0xFF) / 255.0F;
         float var20 = (var18 >> 8 & 0xFF) / 255.0F;
         float var21 = (var18 & 0xFF) / 255.0F;
         return new NNNTn(var2, var3, var5, var7, var19, var20, var21, this.f1000);
      }
   }
}
