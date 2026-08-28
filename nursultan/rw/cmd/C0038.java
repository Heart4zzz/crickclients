package rw.cmd;

import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import rw.NursultanClient;
import rw.core.AcceptApiPart;

public class C0038 implements ArgumentType<String> {
   static {
      ntfClinit();
   }

   public String m4000(StringReader var1) throws CommandSyntaxException {
      return var1.readString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var2.getRemaining().isEmpty()) {
         NursultanClient.m82000().m56000(new AcceptApiPart());
      }

      return Nog.y(NursultanClient.m82000().m50000().stream(), var2);
   }
}
