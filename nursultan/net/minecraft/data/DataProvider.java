package net.minecraft.data;

import KDFzREm.NNNII;
import KDFzREm.NNNIJ;
import KDFzREm.NNNIo;
import KDFzREm.NNNwy;
import KDFzREm.NNeQ;
import KDFzREm.NNeT;
import KDFzREm.NNeY;
import KDFzREm.NNek;
import KDFzREm.NNel;
import KDFzREm.Ncw;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.impl.datagen.client.FabricItemAssetDefinitions;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class DataProvider implements Ncw {
   private final NNNIJ field_39375;
   private final NNNIJ field_55247;
   private final NNNIJ field_39376;
   private FabricDataOutput fabricDataOutput;

   public DataProvider(NNNII var1) {
      this.field_39375 = var1.method_45973(NNNIo.field_39368, "blockstates");
      this.field_55247 = var1.method_45973(NNNIo.field_39368, "items");
      this.field_39376 = var1.method_45973(NNNIo.field_39368, "models");
      this.handler$zdn000$fabric-data-generation-api-v1$init(var1, null);
   }

   public String getName() {
      return "Model Definitions";
   }

   public CompletableFuture<?> method_10319(NNNwy var1) {
      NNeY var2 = new NNeY();
      NNek var3 = new NNek();
      NNeQ var4 = new NNeQ();
      NNeT var10000 = new NNeT(var3, var2, var4);
      this.handler$zdn000$fabric-data-generation-api-v1$setFabricDataOutput(var1, null, var3, var2);
      NNeT var5 = var10000;
      this.wrapOperation$zdn000$fabric-data-generation-api-v1$registerBlockStateModels(var5, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4910]");
         ((NNeT)var0[0]).L();
         return (Void)null;
      });
      NNel var6 = new NNel(var2, var4);
      this.wrapOperation$zdn000$fabric-data-generation-api-v1$registerItemModels(var6, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4915]");
         ((NNel)var0[0]).N();
         return (Void)null;
      });
      var3.N();
      var2.N();
      return CompletableFuture.allOf(var3.N(var1, this.field_39375), var4.N(var1, this.field_39376), var2.N(var1, this.field_55247));
   }

   private void wrapOperation$zdn000$fabric_data_generation_api_v1$registerItemModels/* $VF was: wrapOperation$zdn000$fabric-data-generation-api-v1$registerItemModels*/(
      NNel var1, Operation var2
   ) {
      if (this instanceof FabricModelProvider var3) {
         var3.generateItemModels(var1);
      } else {
         var2.call(new Object[]{var1});
      }
   }

   public void handler$zdn000$fabric_data_generation_api_v1$init/* $VF was: handler$zdn000$fabric-data-generation-api-v1$init*/(NNNII var1, CallbackInfo var2) {
      if (var1 instanceof FabricDataOutput var3) {
         this.fabricDataOutput = var3;
      }
   }

   private void wrapOperation$zdn000$fabric_data_generation_api_v1$registerBlockStateModels/* $VF was: wrapOperation$zdn000$fabric-data-generation-api-v1$registerBlockStateModels*/(
      NNeT var1, Operation var2
   ) {
      if (this instanceof FabricModelProvider var3) {
         var3.generateBlockStateModels(var1);
      } else {
         var2.call(new Object[]{var1});
      }
   }

   private void handler$zdn000$fabric_data_generation_api_v1$setFabricDataOutput/* $VF was: handler$zdn000$fabric-data-generation-api-v1$setFabricDataOutput*/(
      NNNwy var1, CallbackInfoReturnable var2, NNek var3, NNeY var4
   ) {
      ((FabricModelProviderDefinitions)var3).setFabricDataOutput(this.fabricDataOutput);
      ((FabricModelProviderDefinitions)var4).setFabricDataOutput(this.fabricDataOutput);
      ((FabricItemAssetDefinitions)var4).fabric_setProcessedBlocks(var3.N.keySet());
   }
}
