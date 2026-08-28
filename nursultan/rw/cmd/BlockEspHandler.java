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
import rw.data.Rec0182;

public class BlockEspHandler implements ArgumentType<NKi> {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m6000() {
      f2000 = new Object[]{null};
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f1000 = new String[]{"block.minecraft.", "", "blockesp.not-found"};
   }

   public static NKi m22000(CommandContext<?> var0, String var1) {
      return (NKi)var0.getArgument(var1, NKi.class);
   }

   public NKi m24000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return NursultanClient.m88000()
         .m110000()
         .m12000()
         .stream()
         .map(Rec0182::m6000)
         .filter(var1x -> m38000(var1x).equals(var2))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)f2000[0]).create(var2));
   }

   public static String m38000(NKi var0) {
      return var0.w().replace(f1000[0], f1000[1]);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m88000().m110000().m12000().stream().map(var0 -> m38000(var0.m6000())), var2);
   }
}
