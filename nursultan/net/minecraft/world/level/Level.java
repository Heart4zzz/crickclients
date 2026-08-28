package net.minecraft.world.level;

import KDFzREm.NKL;
import KDFzREm.NNDz;
import KDFzREm.NNET;
import KDFzREm.NNNNRZ;
import KDFzREm.NNRq;
import KDFzREm.NNUU;
import KDFzREm.NNUW;
import KDFzREm.NOY;
import KDFzREm.NOl;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NVA;
import KDFzREm.NcT;
import KDFzREm.Nea;
import KDFzREm.Ned;
import KDFzREm.Nee;
import KDFzREm.Nef;

class Level extends Nea {
   private final Nea N = new Nea();

   public NQo N(Nee var1, NQo var2) {
      NOl var3 = (NOl)var2.a_(NNNNRZ.h, NOl.N);
      if (!var3.N(NOY.N)) {
         return this.N.dispense(var1, var2);
      } else {
         NNRq var4 = var1.y();
         Ned var5 = var1.L();
         Ned var6 = var1.L().method_10093((Nef)var1.u().L(NVA.y));
         if (!var4.method_8320(var6).N(NNET.Lw)) {
            return this.N.dispense(var1, var2);
         } else {
            if (!var4.method_8608()) {
               for (int var7 = 0; var7 < 5; var7++) {
                  var4.method_65096(
                     NcT.NT,
                     var5.method_10263() + var4.field_9229.U(),
                     var5.method_10264() + 1,
                     var5.method_10260() + var4.field_9229.U(),
                     1,
                     0.0,
                     0.0,
                     0.0,
                     1.0
                  );
               }
            }

            var4.method_8396(null, var5, NNUU.Lc, NNUW.field_15245, 1.0F, 1.0F);
            var4.N(null, NNDz.w, var5);
            var4.method_8501(var6, NKL.nB.W());
            return this.N(var1, var2, new NQo(NQa.nP));
         }
      }
   }
}
