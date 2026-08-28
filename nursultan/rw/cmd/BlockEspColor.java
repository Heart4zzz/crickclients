package rw.cmd;

import KDFzREm.NPh;
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
import java.util.regex.Pattern;

public class BlockEspColor implements ArgumentType<Integer> {
   public static Object[] f1000;
   private static String[] f2000;

   private static void m4000() {
      f1000 = new Object[]{null, null};
   }

   static {
      ntfClinit();
   }

   public Integer m24000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      if (((Pattern)f1000[0]).matcher(var2).matches()) {
         return 0xFF000000 | Integer.parseInt(var2, 16);
      } else {
         NPh var3 = NPh.y(var2);
         if (var3 != null && var3.u()) {
            return 0xFF000000 | var3.i();
         } else {
            throw ((DynamicCommandExceptionType)f1000[1]).create(var2);
         }
      }
   }

   private static void m30000() {
      f2000 = new String[]{"blockesp.color-invalid", "[0-9a-fA-F]{6}"};
   }

   public static int m32000(CommandContext<?> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(Arrays.stream(NPh.values()).filter(NPh::u).map(NPh::R), var2);
   }
}
