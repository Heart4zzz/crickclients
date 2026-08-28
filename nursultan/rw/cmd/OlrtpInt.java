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
import rw.GuiWidget;
import rw.NursultanClient;

public class OlrtpInt implements ArgumentType<GuiWidget> {
   public static Object[] f1000;
   private static String[] f2000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[]{"module.not-found"};
   }

   private static void m16000() {
      f1000 = new Object[]{null};
   }

   public static GuiWidget m24000(CommandContext<?> var0, String var1) {
      return (GuiWidget)var0.getArgument(var1, GuiWidget.class);
   }

   public GuiWidget m26000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      return NursultanClient.m88000().m106000(var2).orElseThrow(() -> ((DynamicCommandExceptionType)f1000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m88000().m78000(), var2);
   }
}
