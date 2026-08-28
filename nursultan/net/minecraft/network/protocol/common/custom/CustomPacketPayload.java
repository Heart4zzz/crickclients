package net.minecraft.network.protocol.common.custom;

import KDFzREm.NFv;
import KDFzREm.NNNAJ;
import KDFzREm.NNNAg;
import KDFzREm.NNNAo;
import KDFzREm.NNNAq;
import KDFzREm.NNNG;
import KDFzREm.NNNNNA;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Map;
import net.fabricmc.fabric.impl.networking.CustomPayloadTypeProvider;
import net.fabricmc.fabric.impl.networking.FabricCustomPayloadPacketCodec;

class CustomPacketPayload implements NNNNNA<B, NNNAg>, FabricCustomPayloadPacketCodec {
   private CustomPayloadTypeProvider L;

   CustomPacketPayload(Map var1, NNNAJ var2) {
      this.N = var1;
      this.y = var2;
   }

   public void N(B var1, NNNAg var2) {
      this.N(var1, var2.method_56479(), var2);
   }

   private NNNNNA N(NNNNNA var1, NNNG var2, Operation var3, NFv var4) {
      if (this.L != null) {
         NNNAq var5 = this.L.get(var4, var2);
         if (var5 != null) {
            return var5.y();
         }
      }

      return (NNNNNA)var3.call(new Object[]{var1, var2});
   }

   public NNNAg N(B var1) {
      NNNG var2 = var1.T();
      return (NNNAg)this.N(this, var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_8710$1, net.minecraft.class_2960]");
         return ((CustomPacketPayload)var0[0]).N((NNNG)var0[1]);
      }, var1).decode(var1);
   }

   private <T extends NNNAg> void N(B var1, NNNAo<T> var2, NNNAg var3) {
      var1.N(var2.N());
      NNNG var6 = var2.N;
      NNNNNA var4 = this.N(this, var6, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_8710$1, net.minecraft.class_2960]");
         return ((CustomPacketPayload)var0[0]).N((NNNG)var0[1]);
      }, var1);
      var4.encode(var1, var3);
   }

   private NNNNNA<? super B, ? extends NNNAg> N(NNNG var1) {
      NNNNNA var2 = (NNNNNA)this.N.get(var1);
      return var2 != null ? var2 : this.y.create(var1);
   }

   public void fabric_setPacketCodecProvider(CustomPayloadTypeProvider var1) {
      if (this.L != null) {
         throw new IllegalStateException("Payload codec provider is already set!");
      } else {
         this.L = var1;
      }
   }
}
