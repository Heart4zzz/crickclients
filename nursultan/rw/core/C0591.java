package rw.core;

import KDFzREm.Nog;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.cmd.OlrtpInt;

public class C0591 extends OlrtpInt {
   static {
      ntfClinit();
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Nog.y(NursultanClient.m88000().m68000().filter(var0 -> (boolean)(!var0.m54000().m14000() ? 1 : 0)).map(GuiWidget::m42000), var2);
   }
}
