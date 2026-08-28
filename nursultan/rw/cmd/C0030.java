package rw.cmd;

import KDFzREm.NNuU;
import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class C0030 implements ArgumentType<String> {
   static {
      ntfClinit();
   }

   public String m4000(StringReader var1) throws CommandSyntaxException {
      return var1.readString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NNuU.Nq().NE().Z().stream().map(var0 -> var0.N().name()), var2);
   }
}
