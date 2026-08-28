package rw.cmd;

import KDFzREm.NKj;
import KDFzREm.NKu;
import KDFzREm.NKv;
import KDFzREm.NNNGO;
import KDFzREm.NNNGg;
import KDFzREm.NNNqi;
import KDFzREm.NNNtM;
import KDFzREm.Nog;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class C0025 implements ArgumentType<NKu> {
   public Object[] f1000;

   public C0025(NNNtM var1) {
      this.m8000();
      NNNGg var6 = var1.y(NNNqi.Z);
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public NKu m14000(StringReader var1) throws CommandSyntaxException {
      NKv var2 = NKj.N((NNNGO)this.f1000[0], var1, true);
      return new NKu(var2.N(), var2.y().keySet(), var2.L());
   }

   public static NKu m16000(CommandContext<Nog> var0, String var1) {
      return (NKu)var0.getArgument(var1, NKu.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return NKj.N((NNNGO)this.f1000[0], var2, false, true);
   }
}
