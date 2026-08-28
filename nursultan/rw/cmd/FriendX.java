package rw.cmd;

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
import rw.data.OliOkkns;

public class FriendX implements ArgumentType<OliOkkns> {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[]{null};
   }

   private static void m18000() {
      f1000 = new String[]{"friend.not-found"};
   }

   public static OliOkkns m22000(CommandContext<?> var0, String var1) {
      return (OliOkkns)var0.getArgument(var1, OliOkkns.class);
   }

   public OliOkkns m28000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return NursultanClient.m68000().m16000(var2).orElseThrow(() -> ((DynamicCommandExceptionType)f2000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m68000().m4000(), var2);
   }
}
