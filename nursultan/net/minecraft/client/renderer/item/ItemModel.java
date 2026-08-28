package net.minecraft.client.renderer.item;

import KDFzREm.NNNZg;
import KDFzREm.NNNeG;
import KDFzREm.NQo;
import KDFzREm.qE;
import KDFzREm.qR;
import KDFzREm.qz;
import KDFzREm.rR;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ItemModel implements qR {
   private final List<qR> N;

   public ItemModel(List<qR> var1) {
      this.N = var1;
   }

   public void method_65584(qE var1, NQo var2, qz var3, NNNeG var4, @Nullable NNNZg var5, @Nullable rR var6, int var7) {
      var1.N(this);
      var1.N(this.N.size());

      for (qR var9 : this.N) {
         var9.method_65584(var1, var2, var3, var4, var5, var6, var7);
      }
   }
}
