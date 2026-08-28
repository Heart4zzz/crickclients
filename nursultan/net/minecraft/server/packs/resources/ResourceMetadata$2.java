package net.minecraft.server.packs.resources;

import KDFzREm.NNNOQ;
import KDFzREm.NNNdk;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.util.Optional;

class ResourceMetadata$2 implements NNNdk {
   ResourceMetadata$2(JsonObject var1) {
      this.val$metadata = var1;
   }

   public <T> Optional<T> N(NNNOQ<T> var1) {
      String var2 = var1.N();
      if (this.val$metadata.has(var2)) {
         Object var3 = var1.y().parse(JsonOps.INSTANCE, this.val$metadata.get(var2)).getOrThrow(JsonParseException::new);
         return Optional.of((T)var3);
      } else {
         return Optional.empty();
      }
   }
}
