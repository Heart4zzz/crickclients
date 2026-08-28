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
import rw.data.Rec0305;

public class C0026 implements ArgumentType<Rec0305> {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[]{null};
   }

   public static Rec0305 m18000(CommandContext<?> var0, String var1) {
      return (Rec0305)var0.getArgument(var1, Rec0305.class);
   }

   private static void m22000() {
      f1000 = new String[]{"macros.not-found"};
   }

   public Rec0305 m26000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return NursultanClient.m90000().m6000(var2).orElseThrow(() -> ((DynamicCommandExceptionType)f2000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m90000().m20000(), var2);
   }
}
