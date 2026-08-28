package net.minecraft.world.item;

import KDFzREm.NNNgN;
import KDFzREm.NNNgZ;
import KDFzREm.NNNqL;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NYC;
import KDFzREm.NYF;
import KDFzREm.NYf;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.features.item.filter_creative_tabs.VersionedRegistries;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import java.util.Collection;
import java.util.Set;

public class CreativeModeTab$Output implements NYf {
   public final Collection<NQo> N = NNNgZ.N();
   public final Set<NQo> y = NNNgZ.N();
   private final NYF L;
   private final NNNgN u;

   public CreativeModeTab$Output(NYF var1, NNNgN var2) {
      this.L = var1;
      this.u = var2;
   }

   private boolean N(NQl var1, NNNgN var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (NQo)var4.get());
   }

   private boolean N(NQl var1, NNNgN var2, Operation var3, NQo var4) {
      boolean var5 = (Boolean)var3.call(new Object[]{var1, var2});
      int var6 = GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex();
      if (var6 != 2 && !NNuU.Nq().q()) {
         return var6 == 1 && !NNNqL.Nz.y(this.L).y().equals("minecraft") ? var5 : VersionedRegistries.keepItem(var4) && var5;
      } else {
         return var5;
      }
   }

   // $VF: Unable to simplify switch-on-enum, as the enum class was not able to be found.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_45417(NQo var1, NYC var2) {
      if (var1.c() != 1) {
         throw new IllegalArgumentException("Stack size must be exactly 1");
      } else {
         boolean var3 = this.N.contains(var1) && var2 != NYC.field_40193;
         if (var3) {
            throw new IllegalStateException(
               "Accidentally adding the same item stack twice " + var1.V().getString() + " to a Creative Mode Tab: " + this.L.N().getString()
            );
         } else {
            NQl var10000 = var1.B();
            NNNgN var5 = this.u;
            NQl var4 = var10000;
            Operation var10003 = var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1792, net.minecraft.class_7699]");
               return ((NQl)var0[0]).N((NNNgN)var0[1]);
            };
            LocalRefImpl var6 = new LocalRefImpl();
            var6.init(var1);
            boolean var8 = this.N(var4, var5, var10003, var6);
            var1 = (NQo)var6.dispose();
            if (var8) {
               switch (var2.ordinal()) {
                  case 0:
                     this.N.add(var1);
                     this.y.add(var1);
                     break;
                  case 1:
                     this.N.add(var1);
                     break;
                  case 2:
                     this.y.add(var1);
               }
            }
         }
      }
   }
}
