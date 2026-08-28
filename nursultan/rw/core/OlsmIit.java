package rw.core;

import KDFzREm.NNuU;
import KDFzREm.Nog;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import rw.NursultanClient;

public class OlsmIit extends rw.cmd.C0030 {
   static {
      ntfClinit();
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NNuU.Nq().NE().Z().stream().map(var0 -> var0.N().name()).filter(var0 -> (boolean)(!NursultanClient.m68000().m2000(var0) ? 1 : 0)), var2);
   }
}
