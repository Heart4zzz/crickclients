package rw.cmd;

import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import rw.gui.PgUp;

public class C0003 implements ArgumentType<PgUp> {
   public static Object[] f1000;
   private static String[] f2000;

   static {
      ntfClinit();
   }

   private static void m16000() {
      f1000 = new Object[]{null};
   }

   private static void m20000() {
      f2000 = new String[]{" ", "_", " ", "_", "key.not-found"};
   }

   public static PgUp m34000(CommandContext<?> var0, String var1) {
      return (PgUp)var0.getArgument(var1, PgUp.class);
   }

   public PgUp m38000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return Arrays.stream(PgUp.m22000())
         .filter(var1x -> var2.equalsIgnoreCase(var1x.m68000().replace(f2000[0], f2000[1])))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)f1000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(Arrays.stream(PgUp.m22000()).map(var0 -> var0.m68000().replace(f2000[2], f2000[3])), var2);
   }
}
