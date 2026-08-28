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
import rw.defs.BootstrapMethods;

public class C0034 implements ArgumentType<BootstrapMethods> {
   public static Object[] f1000;
   private static String[] f2000;

   private static void m2000() {
      f1000 = new Object[]{null};
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new String[]{"bind.not-found"};
   }

   public static BootstrapMethods m16000(CommandContext<?> var0, String var1) {
      return (BootstrapMethods)var0.getArgument(var1, BootstrapMethods.class);
   }

   public BootstrapMethods m22000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      BootstrapMethods var3 = BootstrapMethods.m34000(var2);
      if (var3 == null) {
         throw ((DynamicCommandExceptionType)f1000[0]).create(var2);
      } else {
         return var3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(Arrays.stream(BootstrapMethods.m10000()).map(var0 -> var0.m38000().toUpperCase()), var2);
   }
}
