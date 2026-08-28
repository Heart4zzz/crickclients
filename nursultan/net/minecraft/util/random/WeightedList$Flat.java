package net.minecraft.util.random;

import KDFzREm.NNNyC;
import KDFzREm.NNNyr;
import java.util.Arrays;
import java.util.List;

class WeightedList$Flat<E> implements NNNyr<E> {
   private final Object[] entries;

   WeightedList$Flat(List<NNNyC<E>> var1, int var2) {
      this.entries = new Object[var2];
      int var3 = 0;

      for (NNNyC var5 : var1) {
         int var6 = var5.y();
         Arrays.fill(this.entries, var3, var3 + var6, var5.N());
         var3 += var6;
      }
   }

   public E entries(int var1) {
      return (E)this.entries[var1];
   }
}
