package rw.core;

import KDFzREm.NNNNNA;
import KDFzREm.NNNNRR;
import KDFzREm.NNNNiC;
import KDFzREm.NNNNih;
import KDFzREm.NNNrD;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.Optional;

class C0303 implements NNNNNA<NNNrD, NNNNiC> {
   C0303(NNNNih var1) {
      this.f1000 = var1;
   }

   private <T> void m6000(NNNrD var1, NNNNRR<T> var2, Object var3) {
      this.f1000.N(var2).encode(var1, var3);
   }

   public void m8000(NNNrD var1, NNNNiC var2) {
      if (var2.u()) {
         var1.L(0);
         var1.L(0);
      } else {
         int var3 = 0;
         int var4 = 0;
         ObjectIterator var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            if (((Optional)var6.getValue()).isPresent()) {
               var3++;
            } else {
               var4++;
            }
         }

         var1.L(var3);
         var1.L(var4);
         var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var11 = (Entry)var5.next();
            Optional var7 = (Optional)var11.getValue();
            if (var7.isPresent()) {
               NNNNRR var8 = (NNNNRR)var11.getKey();
               NNNNRR.y.encode(var1, var8);
               this.m6000(var1, var8, var7.get());
            }
         }

         var5 = Reference2ObjectMaps.fastIterable(var2.i).iterator();

         while (var5.hasNext()) {
            Entry var12 = (Entry)var5.next();
            if (((Optional)var12.getValue()).isEmpty()) {
               NNNNRR var13 = (NNNNRR)var12.getKey();
               NNNNRR.y.encode(var1, var13);
            }
         }
      }
   }

   public NNNNiC m10000(NNNrD var1) {
      int var2 = var1.E();
      int var3 = var1.E();
      if (var2 == 0 && var3 == 0) {
         return NNNNiC.N;
      } else {
         int var4 = var2 + var3;
         Reference2ObjectArrayMap var5 = new Reference2ObjectArrayMap(Math.min(var4, 65536));

         for (int var6 = 0; var6 < var2; var6++) {
            NNNNRR var7 = (NNNNRR)NNNNRR.y.decode(var1);
            Object var8 = this.f1000.N(var7).decode(var1);
            var5.put(var7, Optional.of(var8));
         }

         for (int var9 = 0; var9 < var3; var9++) {
            NNNNRR var10 = (NNNNRR)NNNNRR.y.decode(var1);
            var5.put(var10, Optional.empty());
         }

         return new NNNNiC(var5);
      }
   }
}
