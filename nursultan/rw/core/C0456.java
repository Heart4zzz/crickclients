package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNBK;
import KDFzREm.NNNAB;
import KDFzREm.NNNYL;
import KDFzREm.NNNYi;
import KDFzREm.NNNYy;
import KDFzREm.NNNkS;
import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class C0456 extends NNNYi {
   private static final int f1000 = 12;
   private static final int f2000 = 4;
   private final NAN f3000;
   private final Supplier<NNNAB> f4000;
   private final boolean f5000;

   public C0456(NNNYL var1, GameProfile var2, NAN var3, boolean var4) {
      this.f6000 = var1;
      this.f3000 = var3;
      this.f5000 = var4;
      this.f4000 = NNNYL.N(var1).yP().N(var2, true);
   }

   public void method_25343(NNBK var1, int var2, int var3, boolean var4, float var5) {
      int var6 = this.method_73380() - 12 + 4;
      int var7 = this.method_73382() + (this.method_73384() - 12) / 2;
      NNNkS.N(var1, this.f4000.get(), var6, var7, 12);
      int var8 = this.method_73382() + 1 + (this.method_73384() - 9) / 2;
      var1.y(NNNYy.z(this.f6000.y), this.f3000, var6 + 12 + 4, var8, this.f5000 ? -1 : -1593835521);
   }
}
