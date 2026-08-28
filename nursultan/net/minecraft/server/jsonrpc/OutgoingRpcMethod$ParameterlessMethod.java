package net.minecraft.server.jsonrpc;

import KDFzREm.NuX;
import KDFzREm.Nuf;
import KDFzREm.Nuq;
import KDFzREm.Nur;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;

public record OutgoingRpcMethod$ParameterlessMethod<Result>() implements Nuq<Void, Result> {
   private final Nuf<Void, Result> y;
   private final NuX L;

   public OutgoingRpcMethod$ParameterlessMethod(Nuf<Void, Result> var1, NuX var2) {
      this.y = var1;
      this.L = var2;
   }

   public NuX y() {
      return this.L;
   }

   public Nuf<Void, Result> N() {
      return this.y;
   }

   public Result info(JsonElement var1) {
      if (this.y.u().isEmpty()) {
         throw new IllegalStateException("Method defined as having no result");
      } else {
         return (Result)((Nur)this.y.u().get()).L().z().parse(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }
}
