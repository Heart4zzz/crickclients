package rw.cmd;

import KDFzREm.NKi;
import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import rw.NursultanClient;

public class NukerHandler implements ArgumentType<NKi> {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   private static void m16000() {
      f1000 = new String[]{"block.minecraft.", "", "block.minecraft.", "", "nuker.not-found"};
   }

   public static NKi m24000(CommandContext<?> var0, String var1) {
      return (NKi)var0.getArgument(var1, NKi.class);
   }

   private static void m30000() {
      f2000 = new Object[]{null};
   }

   public NKi m36000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return NursultanClient.m88000()
         .m50000()
         .m4000()
         .stream()
         .filter(var1x -> var1x.w().replace(f1000[0], f1000[1]).equals(var2))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)f2000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m88000().m50000().m4000().stream().map(var0 -> var0.w().replace(f1000[2], f1000[3])), var2);
   }
}
