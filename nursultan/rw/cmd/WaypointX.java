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
import rw.core.WaypointXPart;

public class WaypointX implements ArgumentType<WaypointXPart> {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{"waypoint.not-found"};
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[]{null};
   }

   public static WaypointXPart m28000(CommandContext<?> var0, String var1) {
      return (WaypointXPart)var0.getArgument(var1, WaypointXPart.class);
   }

   public WaypointXPart m30000(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return NursultanClient.m96000()
         .m26000()
         .stream()
         .filter(var1x -> var2.equals(var1x.m18000()))
         .findFirst()
         .orElseThrow(() -> ((DynamicCommandExceptionType)f2000[0]).create(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m96000().m14000(), var2);
   }
}
