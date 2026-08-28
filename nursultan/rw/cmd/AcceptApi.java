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

public class AcceptApi implements ArgumentType<String> {
   private static String[] f1000;

   private static void m2000() {
      f1000 = new String[]{"@"};
   }

   static {
      ntfClinit();
   }

   public String m20000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return var2;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      String var3 = var2.getRemaining();
      int var4 = var3.lastIndexOf(f1000[0]);
      if (var4 == -1) {
         return var2.buildFuture();
      } else {
         if (var3.charAt(var3.length() - 1) == '@') {
            NursultanClient.m82000().m56000(new AcceptApiPart());
         }

         String var5 = var3.substring(var4 + 1);
         return NursultanClient.m82000().m50000().stream().anyMatch(var1x -> var1x.startsWith(var5))
            ? Nog.y(NursultanClient.m82000().m50000(), var2.createOffset(var2.getStart() + var4 + 1))
            : var2.buildFuture();
      }
   }
}
