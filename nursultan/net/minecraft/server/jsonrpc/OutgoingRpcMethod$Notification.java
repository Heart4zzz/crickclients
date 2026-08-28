package net.minecraft.server.jsonrpc;

import KDFzREm.NuS;
import KDFzREm.NuX;
import KDFzREm.Nuf;
import KDFzREm.Nuq;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import org.jspecify.annotations.Nullable;

public record OutgoingRpcMethod$Notification<Params>() implements Nuq<Params, Void> {
   private final Nuf<Params, Void> y;
   private final NuX L;

   public OutgoingRpcMethod$Notification(Nuf<Params, Void> var1, NuX var2) {
      this.y = var1;
      this.L = var2;
   }

   public NuX y() {
      return this.L;
   }

   public Nuf<Params, Void> N() {
      return this.y;
   }

   @Nullable
   public JsonElement encodeParams(Params var1) {
      if (this.y.L().isEmpty()) {
         throw new IllegalStateException("Method defined as having no parameters");
      } else {
         return (JsonElement)((NuS)this.y.L().get()).L().z().encodeStart(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }
}
